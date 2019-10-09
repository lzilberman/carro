package rentcar.carro.dto;


import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class SearchWithFiltersRequestDto {
    String make;
    String model;
    String year;
    String engine;
    String fluel;
    String gear;
    String wheels_drive;
    Double fuel_consumption;
}
