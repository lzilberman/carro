package rentcar.carro.service;

import org.springframework.stereotype.Service;
import rentcar.carro.dto.Response;

import java.time.LocalDateTime;

@Service
public class CarroServiceImpl implements ICarroService {

    private String currentDate = LocalDateTime.now().toLocalDate().toString();

    @Override
    public Response addCar() {
        return null;
    }

    @Override
    public Response updateCar() {
        return null;
    }

    @Override
    public Response deleteCar() {
        return null;
    }

    @Override
    public Response getCarById() {
        return null;
    }

    @Override
    public Response ownerGetCarById() {
        return null;
    }

    @Override
    public Response ownerGetBookedPeriodsByCarId() {
        return null;
    }

    @Override
    public Response searchCarByPlaceAndStartEndDates() {
        return null;
    }

    @Override
    public Response makeReservation() {
        return null;
    }
}
