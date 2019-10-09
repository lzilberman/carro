package rentcar.carro.entities;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
public class Comment {
	String carNumber;
	String firstName;
	String lastName;
	@JsonFormat(pattern="yyyy-MM-dd")
	LocalDate postDate;
	String post;
	Integer rating;
}
