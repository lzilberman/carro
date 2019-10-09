package rentcar.carro.dto;

import lombok.*;

import java.util.List;
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class UpdateCarRequestDto {

    List features;
    Double price_per_day;
    Integer distance_included;
    PickUpPlaceDTO pick_up_place;
    List<String> image_url;
}
