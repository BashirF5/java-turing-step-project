package az.edu.turing.StepProject.DAO;

import java.time.LocalDate;

public class BookingDto {
    private String passengerName;
    private Long bookingId;
    private Long flightId;
    private Long NUM_TICKERS;
    private LocalDate CreadationDate;

    public BookingDto(String passengerName, Long bookingId, Long flightId, Long NUM_TICKERS, LocalDate creadationDate) {
        this.passengerName = passengerName;
        this.bookingId = bookingId;
        this.flightId = flightId;
        this.NUM_TICKERS = NUM_TICKERS;
        CreadationDate = creadationDate;
    }
}
