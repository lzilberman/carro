package rentcar.carro.dto;


import org.springframework.data.annotation.Id;

import lombok.*;
import rentcar.carro.entities.Location;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
@ToString
public class UpdateCarDto {
	
	  public UpdateCarDto(String regNumber, String hostCity) {
		this.regNumber = regNumber;
		this.hostCity = hostCity;
	}

	@Id
	  String regNumber;
//	  String owner; //email OR User owner
	  
	  // Location
	  String hostCity;
	  Location location;
	  	  
	  // Feachers&Price&Images
	  String [] features;
	  
	  Integer dayPrice;	  
	  Double distanceIncluded;
	  
	  String [] imageUrl;
	  
}
