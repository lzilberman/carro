package rentcar.carro.dto;

import lombok.*;
import org.springframework.data.domain.Sort.Direction;;

@NoArgsConstructor
@Setter
@Getter
@ToString
public class SearchCriteriaDto {
	public SearchCriteriaDto(String city, Long startDateTime, Long endDateTime) {
		this.city = city;
		    // range
		this.startDateTime = startDateTime;
		this.endDateTime = endDateTime;
	}
		
	// required
	String city;
	Long   startDateTime;
	Long   endDateTime;
	// often
	String country;
	    //range
	Integer minPrice;
	Integer maxPrice;
	Direction sortByPriceDirection;
	    
	// optional
	String  make;
	String  model;
	    //range
	Integer minYear;
	Integer maxYear;
	    //range
	Double  minEngineVolume;
	Double  maxEngineVolume;
	    //
	String  fuel;
	String  transmission;
	String  wheelsDrive;
	    //range
	Double minFuelConsumption;
	Double maxFuelConsumption;
}
