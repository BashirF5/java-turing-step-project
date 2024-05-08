package az.edu.turing.stepproject.dao.flightdao;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class FlightDAO implements DAO<FlightEntity>{
    public static final String path = "/Users/ismayil/IdeaProjects/step-project/main/java/az/edu/turing/stepproject/resource/";
    public static final String path_file = path.concat("FlightInfo.ser");


    @Override
    public FlightEntity save(FlightEntity flightEntity) {
        final Path path = Paths.get(path_file);

        return null;
    }

    @Override
    public List<FlightEntity> getAllFlight() {
        return null;
    }

    @Override
    public FlightEntity getById() {
        return null;
    }


}
