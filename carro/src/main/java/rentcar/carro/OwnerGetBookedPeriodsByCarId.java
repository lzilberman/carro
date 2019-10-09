package rentcar.carro;

import lombok.*;
import rentcar.carro.dto.PersonWhoBookdDto;

import java.util.Date;
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class OwnerGetBookedPeriodsByCarId {

//    TODO Date - wright formate
    Date start_date_time;
    Date end_date_time;
    String order_id;
    Boolean paid;
    Double amount;
    Date booking_date;
    PersonWhoBookdDto person_who_booked;

    }
