package az.edu.turing.StepProject.controller;

import az.edu.turing.StepProject.dao.BookingDto;
import az.edu.turing.StepProject.service.BookingService;
import az.edu.turing.StepProject.exception.BookingException;

import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;

public class BookingController {
    private final BookingService bookingService;

    public BookingController(BookingService bookingService) {
        this.bookingService = bookingService;
    }

    public BookingDto checkBooking(BookingDto bookingDto) throws IOException {
        final Long bookingId = bookingDto.bookingId;
        if (bookingId == null && bookingId != 6) {
            throw new RuntimeException("Not valid BookingId,please check again! -->" + bookingDto);
        }
        return bookingService.createBooking(bookingDto);

    }

    public BookingDto getBookingPasserName(BookingDto bookingDto) {
        try {
            Collections.sort(Arrays.asList(bookingDto.passengerName.split(" ")));
            StringBuilder sortedName = new StringBuilder();
            for (String word : bookingDto.passengerName.split(" ")) {
                sortedName.append(word).append(" ");
            }
            bookingDto.passengerName = sortedName.toString().trim();
            return bookingDto;
        } catch (BookingException e) {
            System.out.println("There are some problems sorter passengers..!");

            return bookingDto;
        }
    }


}
