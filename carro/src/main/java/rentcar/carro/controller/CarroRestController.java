package rentcar.carro.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import rentcar.carro.dto.*;
import rentcar.carro.entities.*;

import rentcar.carro.service.ICarroService;

import java.util.List;

@CrossOrigin(origins = "*")
@RestController
public class CarroRestController {

    @Autowired
    ICarroService carroService;

//TODO methods after creating methods in the service
//TODO Errors
    // CAR OPERATIONS
    @PostMapping(value = CarroApiConstants.ADD_CAR)
    Car addCar(@RequestBody CarDto car) {
        return carroService.addCar(car);
    }

    @PutMapping(value = CarroApiConstants.UPDATE_CAR)
    Car updateCar(@RequestBody UpdateCarDto car ) {
        return carroService.updateCar(car);
    }

    @DeleteMapping(value = CarroApiConstants.DELETE_CAR)
    void deleteCar(@PathVariable String regNumber) {
        carroService.deleteCar(regNumber);
    }

    @GetMapping(value = CarroApiConstants.GET_CAR)
    Car getCar(@PathVariable String regNumber) {
        return carroService.getCar(regNumber);
    }
    // BOOKING OPERATIONS
    @GetMapping(value = CarroApiConstants.GET_CAR_BOOKINGS) 
	List<Booking> getCarBookings(String regNumber) {
    	return carroService.getCarBookings(regNumber);
    }

//    @GetMapping(value = CarroApiConstants.GET_CAR_BOOKINGS)
//    Response ownerGetBookedPeriodById(@PathVariable String carNumber, @RequestBody BookedPeriodDto bookedPeriodDto) {
//        return carroService.ownerGetBookedPeriodsByCarId();
//    }

//TODO - should thing about this mrthod
//    Response searchWithoutFiltres ();
//    Response serachWithFiltres();

    @PostMapping(value = CarroApiConstants.BOOK_CAR)
    BookingResultDto makeReservation(@RequestBody BookingDataDto bookingData) {
        return carroService.makeReservation(bookingData);
    }

    @PostMapping(value = CarroApiConstants.CONGIRM_PAYMENT)
    void confirmPayment(@RequestBody ConfirmPaymentDto confirm){
        carroService.confirmPayment(confirm);
    }
    // SERCH
    @PostMapping(value = CarroApiConstants.FIND_BY)
    List<Car> findBy(@RequestBody SearchCriteriaDto searchData) {
    	return carroService.findBy(searchData);
    }
//    @GetMapping(value = CarroApiConstants.BEST_BOOKED)
//    Response bestBooked(){
//        return carroService.bestBooked();
//    }
    // COMMENTS OPERATIONS
    @PostMapping(value = CarroApiConstants.ADD_COMMENT)
    void addCarComment(@RequestBody Comment comment){
        carroService.addCarComment(comment);
    }
    
    @GetMapping(value = CarroApiConstants.GET_CAR_COMMENTS)
    List<Comment> getCarComments(@PathVariable String regNumber) {
        return carroService.getCarComments(regNumber);
    }

}
