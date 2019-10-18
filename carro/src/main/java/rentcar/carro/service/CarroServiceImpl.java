package rentcar.carro.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Sort;
import org.springframework.data.mongodb.core.FindAndModifyOptions;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;

import rentcar.carro.dto.*;
import rentcar.carro.entities.*;

import java.util.List;
import java.util.Objects;

@Service
public class CarroServiceImpl implements ICarroService {
//	@Autowired
//	CarroRepository carroRepository;
	@Autowired
	MongoOperations mongoOperations;
	
	@Override
	public Car addCar(CarDto carDto) {
		return mongoOperations.save(new Car(carDto));
	}

	@Override
	public Car updateCar(UpdateCarDto updateData) {
		Query query = new Query();
		query.addCriteria(Criteria.where("regNumber").is(updateData.getRegNumber()));
		
		Update update = new Update();
		update = updateData.getHostCity() == null? update : 
			update.set("hostCity", updateData.getHostCity() ); 
		
		update = updateData.getLocation() == null? update : 
			update.set("location", updateData.getLocation() ); 
//=================================
//		update = updateData.getLocation().getPoint() == null? update : 
//			update.set("location.point", updateData.getLocation().getPoint() ); 		
//=================================		
		update = updateData.getFeatures() == null? update : 
			update.set("features", updateData.getFeatures() ); 
		
		update = updateData.getDayPrice() == null? update : 
			update.set("dayPrice", updateData.getDayPrice() ); 
		
		update = updateData.getDistanceIncluded() == null? update : 
			update.set("distanceIncluded", updateData.getDistanceIncluded() ); 
		
		update = updateData.getImageUrl() == null? update : 
			update.set("imageUrl", updateData.getImageUrl() ); 
		
		mongoOperations.upsert(query, update, Car.class);	
		return mongoOperations.findById(updateData.getRegNumber(), Car.class);
	}

	@Override
	public void deleteCar(String regNumber) {
		Car car = mongoOperations.findById(regNumber, Car.class);
		if(car == null) return;
		mongoOperations.remove(car);
	}

	@Override
	public Car getCar(String regNumber) {
		return mongoOperations.findById(regNumber, Car.class);
	}
	
	@Override
	public List<Booking> getCarBookings(String regNumber) {
		return getCar(regNumber).getBookings();
	}
	// https://www.baeldung.com/spring-boot-mongodb-auto-generated-field
	private long generateSequence(String seqName) {

		Query query = new Query();
		query.addCriteria(Criteria.where("_id").is(seqName));
		Update update = new Update();
		update.inc("seq",1);
		FindAndModifyOptions options = new FindAndModifyOptions();
		options.returnNew(true).upsert(true);
		
	    DatabaseSequence counter = mongoOperations.findAndModify(query, update, options, DatabaseSequence.class);
	    return !Objects.isNull(counter) ? counter.getSeq() : 1;
	}
	
	@Override
	public BookingResultDto makeReservation(BookingDataDto dto) {
		Car car = getCar(dto.getCarNumber());
		if(car == null) return null;
		
		Booking booking = new Booking(dto);
		if(!car.canBook(booking)) return null;
		booking.setOrderNumber(generateSequence(booking.SEQUENCE_NAME));
		car.addBooking(booking);
		
		car = mongoOperations.save(car);
		return car.getBookingResult(booking);
	}

	@Override
	public void confirmPayment(ConfirmPaymentDto dto) {
		Car car = getCar(dto.getCarNumber());
		car.confirmPaymemt(dto);
		mongoOperations.save(car);
	}

	@Override
	public List<Car> findBy(SearchCriteriaDto searchData) {		
        Query query = new Query();
        
        query = searchData.getCity() == null? query : 
        	query.addCriteria(Criteria.where("hostCity").is(searchData.getCity())); 
        
        query = searchData.getMinPrice() == null? query : 
        	query.addCriteria(Criteria.where("dayPrice").lte(searchData.getMaxPrice()).gte(searchData.getMinPrice())); 
        
        query = searchData.getSortByPriceDirection() == null? query : 
        	query.with(new Sort(searchData.getSortByPriceDirection(), "dayPrice")); 

        query = searchData.getMake() == null? query : 
        	query.addCriteria(Criteria.where("make").is(searchData.getMake())); 
        
        query = searchData.getModel() == null? query : 
        	query.addCriteria(Criteria.where("model").is(searchData.getModel())); 
        
        query = searchData.getMinYear() == null? query : 
        	query.addCriteria(Criteria.where("year").lte(searchData.getMaxYear()).gte(searchData.getMinYear())); 
        
        query = searchData.getMinEngineVolume() == null? query : 
        	query.addCriteria(Criteria.where("engine").lte(searchData.getMaxEngineVolume()).gte(searchData.getMinEngineVolume())); 
        
        query = searchData.getFuel() == null? query : 
        	query.addCriteria(Criteria.where("fuel").is(searchData.getFuel())); 
        
        query = searchData.getTransmission() == null? query : 
        	query.addCriteria(Criteria.where("transmission").is(searchData.getTransmission())); 
        
        query = searchData.getWheelsDrive() == null? query : 
        	query.addCriteria(Criteria.where("wheelsDrive").is(searchData.getWheelsDrive())); 
        
        query = searchData.getMinFuelConsumption() == null? query : 
        	query.addCriteria(Criteria.where("fuelConsumption").lte(searchData.getMaxFuelConsumption()).gte(searchData.getMinFuelConsumption())); 
        
//        query = searchData.getCity() == null? query : query.addCriteria(Criteria.where("hostCity").is(searchData.getCity())); 
        
        return mongoOperations.find(query, Car.class);
	}
	
	@Override
	public List<String> getMakeModels(String make) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public void addCarComment(Comment comment) {
		Car car = getCar(comment.getCarNumber());
		if(car == null) return;
		car.addComment(comment);
		mongoOperations.save(car);		
	}

	@Override
	public List<Comment> getCarComments(String regNumber) {
		return getCar(regNumber).getComments();
	}

	@Override
	public CarRatingDto getCarRating(String regNumber) {
		return getCar(regNumber).getCarRating();
	}

}
