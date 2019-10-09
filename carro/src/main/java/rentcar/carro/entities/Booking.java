package rentcar.carro.entities;
import org.springframework.data.annotation.Id;

import lombok.*;

@NoArgsConstructor
@Setter
@Getter
@ToString
public class Booking {
	@Id
//	@GeneratedValue(strategy=GenerationType.IDENTITY)
	String orderNumber;
	String carNumber;
	
	Long startDateTime;
	Long endDateTime;
	Long bookingDateTime;
	Boolean paymentConfirmed;
	
	String user; // User user
}
