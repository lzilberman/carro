package rentcar.carro.dto;

import lombok.*;

import javax.xml.crypto.Data;
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class BookedPeriodDto {
//    TODO время в правильный формат поставить (считаем в милисекундах)
    Data start_date_time;
    Data end_date_time;
}
