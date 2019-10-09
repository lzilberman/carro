package rentcar.carro.dto;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class ConfirmPaymentRequestDto {

    String order_number;
    String confirmation_code;

}
