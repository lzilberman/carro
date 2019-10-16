package rentcar.carro.dto;

import org.springframework.data.annotation.Id;

import lombok.*;

import rentcar.carro.entities.Booking;
import rentcar.carro.entities.Comment;
import rentcar.carro.entities.Location;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Builder
@ToString
public class CarDto {
	
	  public CarDto(String regNumber, String owner) {
		this.regNumber = regNumber;
		this.owner = owner;
	}
	public CarDto(String regNumber, String owner, String hostCity, Location location, 
			        String make, String model, Integer year, String engine, 
			        String fuel, String transmission, String wheelsDrive, Integer doors, 
			        Integer seats, String carClass, Double fuelConsumption, String[] features, 
			        Integer dayPrice, Double distanceIncluded, String [] imageUrl) {
		  
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
		this.distanceIncluded = distanceIncluded;
		this.imageUrl = imageUrl;		
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
	  
	  Double distanceIncluded;
	  String [] imageUrl;
	  	  
}
