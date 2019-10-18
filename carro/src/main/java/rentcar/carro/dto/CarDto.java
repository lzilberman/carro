package rentcar.carro.dto;

import org.springframework.data.annotation.Id;

import lombok.*;

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
	  Double engine;
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
