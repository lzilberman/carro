package rentcar.carro.dto;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
public class BookingResultDto {
	// make reservetion
	String carNumber;
	String orderNumber;
	Long bookingDateTime;
	Double amount;
}
