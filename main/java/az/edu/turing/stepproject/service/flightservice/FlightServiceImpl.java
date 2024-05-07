package az.edu.turing.stepproject.service.flightservice;

import az.edu.turing.stepproject.dao.flightdao.FlightDAO;
import az.edu.turing.stepproject.dto.FlightResponseDto;

public class FlightServiceImpl implements FlightService{
    private final FlightDAO flightDAO;

    public FlightServiceImpl(FlightDAO flightDAO) {
        this.flightDAO = flightDAO;
    }

    @Override
    public FlightResponseDto create(FlightResponseDto flightResponseDto) {
        return null;
    }
}
