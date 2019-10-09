package rentcar.carro.dto;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
public class BookingDataDto {
	// makeReservation
	String carNumber;
	
	Long startDateTime;
	Long endDateTime;
	Long bookingDateTime;
	String user; // User user	
}
