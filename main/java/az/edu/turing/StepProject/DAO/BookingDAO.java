package az.edu.turing.StepProject.DAO;

import com.fasterxml.jackson.core.JsonProcessingException;

import java.io.IOException;
import java.util.Optional;

public interface BookingDAO<T> {
    T saveBooking(T booking) throws IOException;
    Optional<T> getBookingById(Long bookingId);
    T getAllBookings();
    Optional<T>getBookingsByPassengerName(String name);
    Optional<T>cancelBooking(String bookingId);


    }