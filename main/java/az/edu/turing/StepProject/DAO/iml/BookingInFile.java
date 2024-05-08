package az.edu.turing.StepProject.DAO.iml;

import az.edu.turing.StepProject.DAO.DaoBooking;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Optional;

public class BookingInFile extends DaoBooking {
    private static final String FILE_PATH = "C:\\Users\\aydan\\OneDrive\\Desktop\\java-turing-step-project\\main\\java\\az\\edu\\turing\\StepProject\\resources";
    private static final String FILE_PATH_RESOURCES = FILE_PATH.concat("bookingInfo.ser");
    private static final ObjectMapper mapper = new ObjectMapper();

    @Override
    public BookingEntity saveBooking(BookingEntity booking) {
        try {
            final Path path = Paths.get(FILE_PATH_RESOURCES);
            Files.write(path, mapper.writeValueAsBytes(booking));
        } catch (IOException e) {
            System.out.println("Error writing Booking information in file");
            e.printStackTrace();
        }
        return booking;
    }



    @Override
    public Optional<BookingEntity> getBookingById(Long bookingId) {
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
