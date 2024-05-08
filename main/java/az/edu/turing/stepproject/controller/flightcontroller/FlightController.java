package az.edu.turing.stepproject.controller.flightcontroller;

import az.edu.turing.stepproject.dto.FlightResponseDto;
import az.edu.turing.stepproject.service.flightservice.FlightService;

import java.time.DayOfWeek;
import java.util.List;

public class FlightController {
    private final FlightService flightService;

    public FlightController(FlightService flightService) {
        this.flightService = flightService;
    }

    public FlightResponseDto create (FlightResponseDto flightResponseDto){
        if(flightResponseDto.date.equals("Saturday")||flightResponseDto.date.equals("Sunday")){
            System.out.println("it is weekend");
            return null;
        }

        return flightService.create(flightResponseDto);
    }


    public List<FlightResponseDto> getAllFlights(){
        return  null;
    }
}
