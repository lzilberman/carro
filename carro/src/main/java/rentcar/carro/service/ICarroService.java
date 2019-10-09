package rentcar.carro.service;

import java.util.List;

import rentcar.carro.dto.*;
import rentcar.carro.entities.*;

public interface ICarroService {
	Car addCar(Car car);
	
	Car updateCar(CarDto car);
	
	void deleteCar(String regNumber);
	
	Car getCar(String regNumber);
	
	List<Car> findBy(SearchCriteriaDto searchData);
	
	BookingResultDto makeReservation(BookingDataDto bookingData);
	
	void confirmPayment(ConfirmPaymentDto confirm);
	
	void addCarComment(Comment comment);
	
	List<Comment> getCarComments(String regNumber);

}
