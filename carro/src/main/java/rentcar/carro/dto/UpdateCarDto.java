package rentcar.carro.dto;


import org.springframework.data.annotation.Id;

import lombok.*;
import rentcar.carro.entities.Location;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Builder
@ToString
public class UpdateCarDto {
	
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
