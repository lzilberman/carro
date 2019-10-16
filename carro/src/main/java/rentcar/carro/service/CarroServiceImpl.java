package rentcar.carro.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
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
	public Car updateCar(UpdateCarDto dto) {
		if(dto == null) return null;
		Car car = mongoOperations.findById(dto.getRegNumber(), Car.class);
		if(car == null) return null;
		
		String newHostCity = dto.getHostCity();
		Location newLocation = dto.getLocation();
		String [] newFeatures = dto.getFeatures();
		Integer newDayPrice = dto.getDayPrice();
		Double newDistanceIncluded = dto.getDistanceIncluded();
		String [] newImageUrl = dto.getImageUrl();
		
		if(newHostCity != null) car.setHostCity(newHostCity);
		if(newLocation != null) car.setLocation(newLocation);
		if(newFeatures != null) car.setFeatures(newFeatures);
		if(newDayPrice != null) car.setDayPrice(newDayPrice);
		if(newDistanceIncluded != null) car.setDistanceIncluded(newDistanceIncluded);
		if(newImageUrl != null) car.setImageUrl(newImageUrl);
		
		return mongoOperations.save(car);
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
