package az.edu.turing.stepproject;

import az.edu.turing.stepproject.controller.flightcontroller.FlightController;
import az.edu.turing.stepproject.dto.FlightResponseDto;
import az.edu.turing.stepproject.service.flightservice.FlightService;

public class StepProjectApp {
    public static void main(String[] args) {
        FlightService service = new FlightService();
        FlightResponseDto dto = new FlightResponseDto();

        FlightController controller = new FlightController(service);

        String all = controller.getAll();
        controller.getById("5");

    }
}
