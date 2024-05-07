package az.edu.turing.StepProject.DAO.iml;

import az.edu.turing.StepProject.DAO.DaoBooking;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

public class BookingInFile extends DaoBooking {
    private static final String FILE_PATH="C:\\Users\\aydan\\OneDrive\\Desktop\\java-turing-step-project\\main\\java\\az\\edu\\turing\\StepProject\\resources";
    private static final String FILE_PATH_RESOURCES=FILE_PATH.concat("bookingInfo.ser");

    @Override
    public BookingEntity saveBooking(BookingEntity booking) {
        return super.saveBooking(booking);
    }

    @Override
    public Optional<BookingEntity> getBookingById(String bookingId) {
        return super.getBookingById(bookingId);
    }

    @Override
    public BookingEntity getAllBookings() {
        return super.getAllBookings();
    }

    @Override
    public Optional<BookingEntity> getBookingsByPassengerName(String name) {
        return super.getBookingsByPassengerName(name);
    }

    @Override
    public Optional<BookingEntity> cancelBooking(String bookingId) {
        return super.cancelBooking(bookingId);
    }
}
