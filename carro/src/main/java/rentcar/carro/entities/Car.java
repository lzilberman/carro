package rentcar.carro.entities;

import org.springframework.data.annotation.Id;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Builder
@ToString
public class Car {
	
	  public Car(String regNumber, String owner, String hostCity, Location location, String make, String model, Integer year,
			String engine, String fuel, String transmission, String wheelsDrive, Integer doors, Integer seats,
			String carClass, Double fuelConsumption, String[] features, Integer dayPrice) {
		this.regNumber = regNumber;
		this.owner = owner;
		this.hostCity = hostCity;
		this.location = location;
		this.make = make;
		this.model = model;
		this.year = year;
		this.engine = engine;
		this.fuel = fuel;
		this.transmission = transmission;
		this.wheelsDrive = wheelsDrive;
		this.doors = doors;
		this.seats = seats;
		this.carClass = carClass;
		this.fuelConsumption = fuelConsumption;
		this.features = features;
		this.dayPrice = dayPrice;
	}
	  @Id
	  String regNumber;
	  String owner; //email OR User owner
	  
	  // Location
	  String hostCity;
	  Location location;
	  
	  // Car details	  
	  String make;
	  String model;
	  Integer year;
	  String engine;
	  String fuel;
	  String transmission;
	  String wheelsDrive;
	  Integer doors;
	  Integer seats;
	  String carClass;
	  Double fuelConsumption;
	  
	  // Feachers&Price&Images
	  String [] features;
	  Integer dayPrice;
	  
	  Integer distanceIncluded;
	  String [] imageUrl;
	  
	  // Bookings
	  Booking [] bookings;
	  // Comments
	  Comment [] comments;
	  
//	  Integer getRatingValue();
//    Integer getRatingsCount();	  
}
