///*
package rentcar.carro;

import java.sql.Timestamp;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
import java.lang.Boolean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.domain.Sort;
import org.springframework.data.geo.Point;

import rentcar.carro.dto.*;
import rentcar.carro.service.ICarroService;
import rentcar.carro.entities.*;

@SpringBootApplication
public class CarroApplication implements CommandLineRunner  {
    @Autowired
    ICarroService carroService;

	public static void main(String[] args) {
		SpringApplication.run(CarroApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

//=============================================================		
//		SearchCriteriaDto sdata = new SearchCriteriaDto("city6", null, null);
//		SearchCriteriaDto sdata = new SearchCriteriaDto(null, null, null);
		
//		sdata.setMinPrice(35);
//		sdata.setMaxPrice(50);
//		sdata.setSortByPriceDirection(Sort.Direction.DESC);
//		sdata.setMake("maker6");	
//		sdata.setMinYear(2000);
//		sdata.setMaxYear(2018);
//		sdata.setMinEngineVolume(1.8);
//		sdata.setMaxEngineVolume(2.0);
//		sdata.setMinFuelConsumption(10.0);
//		sdata.setMaxFuelConsumption(14.0);
		
//		List<Car> cars = carroService.findBy(sdata);
//		cars.forEach(System.out::println);
//=============================================================		
//		Location location6 = new Location("city6", "street6", 6);
//		location6.setCountry("Israel");
//		location6.setLatitude(31.912363);
//		location6.setLongitude(34.8047923);
		//===============
		//Location location62 = new Location();
		//location62.setPoint(new Point(34.798892, 31.957992));
		//================
//		Location location7 = new Location("city7", "street7", 7);
//		location7.setCountry("Israel");
//		location7.setLatitude(31.961308);
//		location7.setLongitude(34.801483);
		
//		String[] features6 = {"Reverse Camera", "Touch Screen Menu", "Side Camera"}; 
//		String[] features7 = {"Super", "Puper", "Features"}; 
//		String[] features6 = {"Automatic transmission", "Audio input", "Bluetooth"}; 
//		String[] features7 = {"GPS", "Must be 25+ to book", "Heated seats"}; 

//		UpdateCarDto updateData6 = new UpdateCarDto("66-666-66", "city6");
//		updateData6.setLocation(location6);
//		updateData6.setFeatures(features6);
		//=======================
		//UpdateCarDto updateData62 = new UpdateCarDto("62-666-62", "city6");
		//updateData62.setLocation(location62);
		//=======================
//		UpdateCarDto updateData7 = new UpdateCarDto("77-777-77", "city7");
//		updateData7.setLocation(location7);
//		updateData7.setFeatures(features7);
		
//		Car car6 = carroService.updateCar(updateData6);
//		System.out.println(car6);
//		Car car7 = carroService.updateCar(updateData7);
//		System.out.println(car7);	
		//====================
		//Car car62 = carroService.updateCar(updateData62);
		//System.out.println(car62);
		//====================
//=============================================================		
//		System.out.println(carroService.getCarRating("66-666-66")); 	
//=============================================================		
//		carroService.getCarComments("66-666-66")
//		.forEach(System.out::println);
//==============================================================		
		
//		Comment comment1 = Comment.builder()
//				.carNumber("66-666-66")
//				.firstName("aaa6")
//				.lastName("bbb6")
//				.postDate(LocalDate.of(2019, 11, 5))
//				.post("I've rented from Nikola several times now. "
//					+ "Car is always clean and ready to go. Pick and "
//					+ "up drop off is always a breeze. Will definitely "
//					+ "be renting from Nikola again!")
//				.rating(4)
//				.build();
//		
//		carroService.addCarComment(comment1);	
//		Comment comment2 = Comment.builder()
//				.carNumber("66-666-66")
//				.firstName("ccc6")
//				.lastName("ddd6")
//				.postDate(LocalDate.of(2019, 10, 5))
//				.post("The car was not clean at all. Girlfriend and I went on a trip "
//						+ "and the car had dog hair in it and she’s allergic.")
//				.rating(3)
//				.build();
//		
//		carroService.addCarComment(comment2);
//		
//		Comment comment3 = Comment.builder()
//				.carNumber("66-666-66")
//				.firstName("eee6")
//				.lastName("fff6")
//				.postDate(LocalDate.of(2019, 9, 5))
//				.post("I have now rented from Nikola 3 times, "
//						+ "and every time has been an absolute pleasure.")
//				.rating(5)
//				.build();
//		
//		carroService.addCarComment(comment3);
//========================================================		
//		ConfirmPaymentDto dto = new ConfirmPaymentDto("66-666-66", 6L, true);
//		carroService.confirmPayment(dto);
//==============================================================				
//		carroService.getCarBookings("66-666-66")
//		.forEach(System.out::println);
//==============================================================		
//		LocalDateTime da1 = LocalDateTime.of(2019, 11, 1, 11, 10);
//		LocalDateTime da2 = LocalDateTime.of(2019, 11, 5, 11, 10);
//		Long ta1 = Timestamp.valueOf(da1).getTime();
//		Long ta2 = Timestamp.valueOf(da2).getTime();
		
	//			BookingDataDto bookingData6 = BookingDataDto.builder()
	//					.carNumber("66-666-66")
	//					.startDateTime(ta1)
	//					.endDateTime(ta2)
	//					.user("666@gmail.com")
	//					.build();

//		BookingDataDto bookingData7 = BookingDataDto.builder()
//				.carNumber("77-777-77")
//				.startDateTime(ta1)
//				.endDateTime(ta2)
//				.user("777@gmail.com")
//				.build();

		
	//			BookingResultDto res = carroService.makeReservation(bookingData6);
	//			if (res == null) System.out.println("cannot book reservation");
	//			else System.out.println("reservation: " + res);

//		BookingResultDto res7 = carroService.makeReservation(bookingData7);
//		if (res7 == null) System.out.println("cannot book reservation");
//		else System.out.println("reservation: " + res7);
		
		//============================================================
		
//		LocalDateTime db1 = LocalDateTime.of(2019, 11, 8, 11, 10); // (2019, 11, 4, 11, 10);
//		LocalDateTime db2 = LocalDateTime.of(2019, 11, 12, 11, 10); // (2019, 11, 8, 11, 10);
//		Long tb1 = Timestamp.valueOf(db1).getTime();
//		Long tb2 = Timestamp.valueOf(db2).getTime();
//		
//		BookingDataDto bookingData62 = BookingDataDto.builder()
//				.carNumber("66-666-66")
//				.startDateTime(tb1)
//				.endDateTime(tb2)
//				.user("666@gmail.com")
//				.build();
//
//		BookingResultDto res62 = carroService.makeReservation(bookingData62);
//		if (res62 == null) System.out.println("cannot book reservation for user 666@gmail.com");
//		else System.out.println("reservation: " + res62);
		
	}
}
//*/
//====================================================================================================================
/*
package rentcar.carro;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import rentcar.carro.dto.CarDto;
import rentcar.carro.entities.*;
import rentcar.carro.service.ICarroService;

@SpringBootApplication
public class CarroApplication implements CommandLineRunner  {
    @Autowired
    ICarroService carroService;

	public static void main(String[] args) {
		SpringApplication.run(CarroApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		Location location6 = new Location("city6", "street6", 6);
		Location location7 = new Location("city7", "street7", 7);
		Location location62 = new Location("city6", "street62", 62);
		Location location72 = new Location("city7", "street72", 72);
		
		String[] image6 = new String[] {
				"https://d1zgdcrdir5wgt.cloudfront.net/media/vehicle/images/b0r3mfIkQlGJwrSJabE8cg.1440x700.jpg",
				"https://d1zgdcrdir5wgt.cloudfront.net/media/vehicle/images/IkG7bVDbR9-rv13KbsUG-g.1440x700.jpg"
				};
		String[] image7 = new String[] {
				"https://d1zgdcrdir5wgt.cloudfront.net/media/vehicle/images/rRas_v7uQwqRfqhT8LTpKw.1440x700.jpg",
				"https://d1zgdcrdir5wgt.cloudfront.net/media/vehicle/images/UD6wK_r_Tz2-EhgRzsgVqw.1440x700.jpg"
				};
		
		String[] features6 = {"Reverse Camera", "Touch Screen Menu", "Side Camera"}; 
		String[] features7 = {"Super", "Puper", "Features"}; 

//		CarDto car6 = CarDto.builder()
		CarDto car62 = CarDto.builder()
				.regNumber("62-666-62")  
				.owner("6262@gmail.com")  
				.hostCity("city6")       
				.location(location62)     
				.make("maker6")          
				.model("model62")         
				.year(2011)               
				.engine("1.6L")
				.fuel("gas")
				.transmission("Manual")
				.wheelsDrive("TWD")
				.doors(4)
				.seats(5)
				.carClass("B")
				.fuelConsumption(12.5)
				.features(features6)         
				.dayPrice(32)               
				.distanceIncluded(0.45)
				.imageUrl(image6)			
				.build();
		
//		CarDto car7 = CarDto.builder()
		CarDto car72 = CarDto.builder()
				.regNumber("72-777-72")  
				.owner("7272@gmail.com")  
				.hostCity("city7")       
				.location(location72)     
				.make("maker7")          
				.model("model72")         
				.year(2011)               
				.engine("1.6L")
				.fuel("gas")
				.transmission("Manual")
				.wheelsDrive("TWD")
				.doors(4)
				.seats(5)
				.carClass("C")
				.fuelConsumption(12.5)
				.features(features7)         
				.dayPrice(54)               
				.distanceIncluded(0.45)
				.imageUrl(image7)			
				.build();
		
//		UpdateCarDto car = UpdateCarDto.builder()
//				.regNumber("00-000-00")  // .regNumber("66-666-66")
//				.hostCity("city66")
//				.location(location66)
//				.features(features2)
//				.imageUrl(image66)
//				.dayPrice(66)
//				.build();
		
		Car res = carroService.addCar(car62);	
		System.out.println(res);
		
		res = carroService.addCar(car72);	
		System.out.println(res);
		
//		Car res = carroService.updateCar(car);	
//		carroService.deleteCar("11-111-11");	
		
//		Car res = carroService.getCar("66-666-66");	
//		System.out.println(res);
//		Car res2 = carroService.getCar("00-000-00");	
//		System.out.println(res2);		
	}
}

*/


