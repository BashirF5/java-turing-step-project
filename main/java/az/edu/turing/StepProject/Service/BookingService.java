package az.edu.turing.StepProject.Service;

import az.edu.turing.StepProject.DAO.BookingDto;
import az.edu.turing.StepProject.DAO.iml.BookingEntity;

import java.io.IOException;
import java.util.Optional;

public interface  BookingService {

    public  BookingDto createBooking(BookingDto bookingDto) throws IOException;
    public Optional<BookingEntity> getDetailsBooking(BookingDto bookingDto);

}
