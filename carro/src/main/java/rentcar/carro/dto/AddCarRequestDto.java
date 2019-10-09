package rentcar.carro.dto;

import lombok.*;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class AddCarRequestDto {
    String serialNumber;
    String make;
    String model;
    String year;
    String engine;
    String fluel;
    String gear;
    String wheels_drive;
    int doors;
    int seats;
    float fuel_consumption;
    List<String> features;
    String car_class;
    Double price_per_day;
    Integer distance_included;
    PickUpPlaceDTO pickUpPlaceDTO;
    List<String> imageUrl;
}
