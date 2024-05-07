package az.edu.turing.stepproject.dto;

public class FlightResponseDto {
    public final String date;
    public final String destination;
    public final int freeSeats;

    public FlightResponseDto(String date, String destination, int freeSeats) {
        this.date = date;
        this.destination = destination;
        this.freeSeats = freeSeats;
    }
}

// TestEntity entity = service.getFlightFromDatabase();
//FlightResponseDto dto = new FlightResponseDto();
//dto.setName(entity.getName());
//dto.setFlightNumber(entity.getFlightNumber());

//dto




//mapstruct
