package az.edu.turing.StepProject.dao.iml;

import az.edu.turing.StepProject.dao.BookingDto;
import az.edu.turing.StepProject.dao.DaoBooking;
import az.edu.turing.StepProject.service.BookingService;
import az.edu.turing.StepProject.exception.BookingException;

import java.io.IOException;
import java.util.Optional;

public class BookingServiceImp implements BookingService {
    private final DaoBooking daoBooking;

    public BookingServiceImp(DaoBooking daoBooking) {
        this.daoBooking = daoBooking;
    }

    @Override
    public BookingDto createBooking(BookingDto bookingDto) {
        BookingEntity bookingEntity = new BookingEntity(bookingDto.passengerName, bookingDto.bookingId, bookingDto.flightId, bookingDto.NUM_TICKERS, bookingDto.CreadationDate);
        try {
            BookingEntity savedEntity = daoBooking.saveBooking(bookingEntity);
            return new BookingDto(savedEntity.getPassengerName(), savedEntity.getBookingId(), savedEntity.getFlightId(), savedEntity.getNUM_TICKERS(), savedEntity.getCreadationDate());
        } catch (IOException e) {
            System.out.println("Error saving booking: " + e.getMessage());
            throw new RuntimeException();
        }
    }

    @Override
    public Optional<BookingEntity> getDetailsBooking(BookingDto bookingDto) {
        try {
            Optional<BookingEntity> getInfo = daoBooking.getBookingById(bookingDto.bookingId);
            return getInfo;
        } catch (BookingException e) {
            System.out.println("Please try again..");
            e.getMessage();
            return null;
        }

    }


}
