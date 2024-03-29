package rentcar.carro.entities;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.google.common.collect.Range;
import lombok.*;
import rentcar.carro.dto.BookingResultDto;
import rentcar.carro.dto.CarDto;
import rentcar.carro.dto.CarRatingDto;
import rentcar.carro.dto.ConfirmPaymentDto;

@AllArgsConstructor
@Getter
@Setter
@Builder
@ToString
@Document("cars")
public class Car {
	  public Car() {
		  this.bookings = new ArrayList<>();
		  this.comments = new ArrayList<>();
	  }
	  public Car(CarDto dto) {
			this.regNumber = dto.getRegNumber();
			this.owner = dto.getOwner();
			this.hostCity = dto.getHostCity();
			this.location = dto.getLocation();
			this.make = dto.getMake();
			this.model = dto.getModel();
			this.year = dto.getYear();
			this.engine = dto.getEngine();
			this.fuel = dto.getFuel();
			this.transmission = dto.getTransmission();
			this.wheelsDrive = dto.getWheelsDrive();
			this.doors = dto.getDoors();
			this.seats = dto.getSeats();
			this.carClass = dto.getCarClass();
			this.fuelConsumption = dto.getFuelConsumption();
			this.features = dto.getFeatures();
			this.dayPrice = dto.getDayPrice();
			this.distanceIncluded = dto.getDistanceIncluded();
			this.imageUrl = dto.getImageUrl();		
			this.bookings = new ArrayList<>();
			this.comments = new ArrayList<>();
	  }
	  
	  private void createComments() {
		  if (this.comments == null)
			  this.comments = new ArrayList<>();
	  }	  
	  private void createBookings() {
		  if (this.bookings == null)
			  this.bookings = new ArrayList<>();
	  }
	  /*
	   * https://www.baeldung.com/guava-rangemap
	   * https://javabot.evanchooly.com/javadoc/guava/22.0/com/google/common/collect/Range.html
	   */	  
	  public boolean canBook(Booking booking) {
		    createBookings();
		    Long nowTime = Timestamp.valueOf(LocalDateTime.now()).getTime();
		    Range<Long> period = booking.getBookingRange();
		    // if the period is in the past - no book
		    if (period.upperEndpoint().compareTo(nowTime) <= 0) {
		    	return false;
		    }
		    boolean[] res = {true};
		    
		    bookings.stream()
		    		.filter(b->b.getEndDateTime().compareTo(nowTime) >= 0)
		            .map(b->b.getBookingRange())
		            .peek(range -> {if (range.isConnected(period)) res[0] = false;})
		            .collect(Collectors.toList());
		    
			return res[0];
	  }
	  public void addBooking(Booking booking) {
		  booking.setAmount(this.getDayPrice());
		  this.bookings.add(booking);
	  }
	  public BookingResultDto getBookingResult(Booking booking) {
		  Long[] orderNumber = {0L};
		  bookings.stream()
				  .filter(b->b.getStartDateTime().equals(booking.getStartDateTime()))
				  .peek(b -> orderNumber[0] = b.getOrderNumber())
				  .collect(Collectors.toList());

		  BookingResultDto res = new BookingResultDto(regNumber, orderNumber[0], booking.getBookingDateTime(), booking.getAmount());
		  return res;
	  }
	  public void confirmPaymemt(ConfirmPaymentDto dto) {
		 Booking order = bookings.stream()
				 .filter(b->b.getOrderNumber() == dto.getOrderNumber())
				 .findFirst()
				 .orElse(null);
		 
		  if (order != null) {
			  order.setPaymentConfirmed(dto.isPaymentConfirmed());
		  }
	  }
	  public void addComment(Comment comment) {
		  createComments();
		  this.comments.add(comment);
	  }
	  public CarRatingDto getCarRating() {
		  Integer [] count = {0};
		  
		  Integer total  = comments.stream()
		  .filter(c->c.rating > 0)
		  .peek(c->++count[0])
		  .mapToInt(c->c.rating)
		  .reduce(0, (result, current)-> result+current);
		  
		  return count[0]==0? null : new CarRatingDto(Math.round(total/count[0]), count[0] );
	  }
	  
	  @Id
	  String regNumber;
	  String owner; //email OR User owner
	  
	  // Location
	  String hostCity;
	  Location location;
	  
	  // Car details	  
	  String make;
	  String model;
	  Integer year;
	  Double engine;
	  String fuel;
	  String transmission;
	  String wheelsDrive;
	  Integer doors;
	  Integer seats;
	  String carClass;
	  Double fuelConsumption;
	  
	  // Feachers&Price&Images
	  String [] features;
	  Integer dayPrice;
	  
	  Double distanceIncluded;
	  String [] imageUrl;
	  
	  // Bookings
	  List<Booking> bookings;
	  // Comments
	  List<Comment> comments;
	  
}
