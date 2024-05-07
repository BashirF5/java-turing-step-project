package az.edu.turing.StepProject.DAO;

import az.edu.turing.StepProject.DAO.iml.BookingEntity;
import com.fasterxml.jackson.core.JsonProcessingException;

import java.io.IOException;
import java.util.Optional;

public abstract class DaoBooking implements BookingDAO<BookingEntity> {
    @Override
    public BookingEntity saveBooking(BookingEntity booking) throws IOException {
        return null;
    }

    @Override
    public Optional<BookingEntity> getBookingById(String bookingId) {
        return Optional.empty();
    }

    @Override
    public BookingEntity getAllBookings() {
        return null;
    }

    @Override
    public Optional<BookingEntity> getBookingsByPassengerName(String name) {
        return Optional.empty();
    }

    @Override
    public Optional<BookingEntity> cancelBooking(String bookingId) {
        return Optional.empty();
    }
}
