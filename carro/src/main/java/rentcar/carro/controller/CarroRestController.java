package rentcar.carro.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import rentcar.carro.dto.*;
import rentcar.carro.entities.Car;
import rentcar.carro.service.ICarroService;

import java.time.LocalDateTime;

@CrossOrigin(origins = "*")
@RestController
public class CarroRestController {


    @Autowired
    ICarroService carroService;

    private String currentDate = LocalDateTime.now().toLocalDate().toString();
//TODO methods after creating methods in the service

    //TODO Errors
//    Errors here or in the Service?????

    @PostMapping(value = CarroApiConstants.ADD_CAR)
    Response add_car(@RequestBody AddCarRequestDto car) {
        return carroService.addCar();
    }

    @PutMapping(value = CarroApiConstants.UPDATE_CAR)
    Response updaCar(@RequestBody UpdateCarRequestDto carDto, String carNumber, @PathVariable String carId) {
        return carroService.updateCar();
    }

    @DeleteMapping(value = CarroApiConstants.DELETE_CAR)
    Response deleteCar(@PathVariable String carNumber) {
        return carroService.deleteCar();
    }

    @GetMapping(value = CarroApiConstants.GET_CAR)
    Response getCarByIdForUser(@PathVariable String carNumber) {
        return carroService.getCarById();
    }

    @GetMapping(value = CarroApiConstants.OWNER_GET_CAR_BY_ID)
    Response ownerGetCarById(@PathVariable String carNumber) {
        return carroService.ownerGetCarById();
    }


    @GetMapping(value = CarroApiConstants.GET_CAR_BOOKINGS)
    Response ownerGetBookedPeriodById(@PathVariable String carNumber, @RequestBody BookedPeriodDto bookedPeriodDto) {
        return carroService.ownerGetBookedPeriodsByCarId();
    }

//TODO - should thing about this mrthod
//    Response searchWithoutFiltres ();


//    Response serachWithFiltres();

    @PostMapping(value = CarroApiConstants.BOOK_CAR)
    Response reservCar(@PathVariable String carNumber, @RequestBody MakeReservationRequestDto reservationDto) {
        return carroService.makeReservation();
    }


    @PostMapping(value = CarroApiConstants.CONGIRM_PAYMENT)
    Response confirmPayment(@RequestBody ConfirmPaymentRequestDto paymenDto){
        return carroService.confirmPayment();
    }


    @GetMapping(value = CarroApiConstants.BEST_BOOKED)
    Response bestBooked(){
        return carroService.bestBooked();
    }



    @GetMapping(value = CarroApiConstants.COMMENTS)
    Response getComments(){
        return carroService.latestComments();
    }


    @PostMapping(value = CarroApiConstants.POST_COMMENT)
    Response addComments(@RequestBody PostCommentRequestDto postCommentDto){
        return carroService.postComment();
    }

//TODO we need GetFiltresDTO, dont understand how to do
//    Response getFiltres();


}
