package az.edu.turing.stepproject.service.flightservice;

import az.edu.turing.stepproject.dto.FlightResponseDto;

import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public interface FlightService {

    FlightResponseDto create (FlightResponseDto flightResponseDto);
    List<FlightResponseDto> getAllFlights();

}





