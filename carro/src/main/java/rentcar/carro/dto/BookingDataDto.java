package rentcar.carro.dto;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
@Builder
public class BookingDataDto {
	String carNumber;
	Long startDateTime;
	Long endDateTime;
	
	String user; 
}
