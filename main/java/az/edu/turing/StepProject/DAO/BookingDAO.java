package az.edu.turing.StepProject.DAO;

import java.util.Optional;

public interface BookingDAO<T> {
    T saveBooking(T booking);
   Optional<T> getBookingById(String bookingId);
    T getAllBookings();
    Optional<T>getBookingsByPassengerName(String name);
    Optional<T>cancelBooking(String bookingId);

public class BookingDAO {

    private int data;

    public BookingDAO(int data) {
        this.data = data;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

}
