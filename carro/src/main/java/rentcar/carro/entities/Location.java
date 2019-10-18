package rentcar.carro.entities;

import org.springframework.data.geo.Point;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
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
	
	Double latitude;
	Double longitude;
	Point point;  // [ longitude, latitude ]
}
