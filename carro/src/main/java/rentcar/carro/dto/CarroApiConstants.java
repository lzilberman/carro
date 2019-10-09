package rentcar.carro.dto;

public class CarroApiConstants {
    public static final String ADD_CAR = "/car";
    public static final String UPDATE_CAR = "/car/{carId}";
    public static final String DELETE_CAR = "/car/{carId}";
    public static final String GET_CAR = "/car/{carId}";
    public static final String OWNER_GET_CAR_BY_ID = "/user/cars/{carId}";


    public static final String CAR_ID = "carId";

    public static final String ADD_USER = "/registration";
    public static final String UPDATE_USER = "/user/{email}";
    public static final String LOGIN_USER = "user/login";

//    public static final String GET_CAR_BOOKINGS = "/user/cars/periods/{carId}"; // ???
//    TODO - tha same as in the API
    public static final String GET_CAR_BOOKINGS = "/user/cars/{carId}/periods";
    public static final String GET_AVAILABLE_CARS_BY_HOST = "/search/city/{start date}/{end date}";
    public static final String BOOK_CAR = "/car/{carId}/reservation";
    public static final String CONGIRM_PAYMENT = "/reservation/confirm";
    public static final String BEST_BOOKED = "/car/best";
    public static final String  COMMENTS = "/comments";
    public static final String POST_COMMENT = "/comment/{carId}"
    ;

//        "/search?country=string&city=string&start_date=\u201cYYYY-MM-dd\u201d&end_date=\u201cYYYY-MM-dd\u201d;

}
