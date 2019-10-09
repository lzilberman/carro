package rentcar.carro.dto;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
public class ConfirmPaymentDto {
	String carNumber;
	String orderNumber;
	Boolean paymentConfirmed;
}
