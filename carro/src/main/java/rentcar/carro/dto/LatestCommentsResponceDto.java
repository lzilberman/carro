package rentcar.carro.dto;

import lombok.*;

import java.util.Date;
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class LatestCommentsResponceDto {

   String first_name;
   String second_name;
//   TODO formate of date
   Date post_date;
   String post;

}
