package rentcar.carro.dto;

import lombok.*;

import java.util.Date;
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class MakeReservationResponcetDto {
    String order_number;
    Double amount;
      //    TODO DateFormat
    Date booking_date;

}
