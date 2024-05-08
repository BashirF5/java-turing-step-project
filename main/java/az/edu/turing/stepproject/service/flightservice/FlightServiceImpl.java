package az.edu.turing.stepproject.service.flightservice;

import az.edu.turing.stepproject.dao.flightdao.FlightDAO;
import az.edu.turing.stepproject.dao.flightdao.FlightEntity;
import az.edu.turing.stepproject.dto.FlightResponseDto;

import java.util.List;

public class FlightServiceImpl implements FlightService{
    private final FlightDAO flightDAO;

    public FlightServiceImpl(FlightDAO flightDAO) {
        this.flightDAO = flightDAO;
    }

    @Override
    public FlightResponseDto create(FlightResponseDto flightResponseDto) {
        FlightEntity flightEntity = new FlightEntity(flightResponseDto.date,
                                                 flightResponseDto.destination,
                                                    flightResponseDto.freeSeats);

        FlightEntity savedEntity = flightDAO.save(flightEntity);



        return new FlightResponseDto(
                savedEntity.date,
                savedEntity.destination,
                savedEntity.freeSeats
        ) ;
    }

    @Override
    public List<FlightResponseDto> getAllFlights() {
        return null;
    }
}
