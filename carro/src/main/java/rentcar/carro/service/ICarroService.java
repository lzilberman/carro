package rentcar.carro.service;

import rentcar.carro.dto.Response;

public interface ICarroService {

    Response addCar();

    Response updateCar();

    Response deleteCar();

    Response getCarById();

    Response ownerGetCarById();

    Response ownerGetBookedPeriodsByCarId();

    Response searchCarByPlaceAndStartEndDates ();

    Response makeReservation();

}
