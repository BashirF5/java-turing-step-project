package az.edu.turing.StepProject.service;

import az.edu.turing.StepProject.dao.BookingDto;
import az.edu.turing.StepProject.dao.iml.BookingEntity;

import java.io.IOException;
import java.util.Optional;

public interface  BookingService {

    public  BookingDto createBooking(BookingDto bookingDto) throws IOException;
    public Optional<BookingEntity> getDetailsBooking(BookingDto bookingDto);

}
