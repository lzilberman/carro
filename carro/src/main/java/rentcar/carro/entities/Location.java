package rentcar.carro.entities;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Builder
@ToString
public class Location {
	public Location(String city, String street, Integer building) {
		this.city = city;
		this.street = street;
		this.building = building;
	}
	String country;
	String region;
	String city;
	String street;
	Integer building;
	Integer apartment;
	Integer zipcode;
	
}
