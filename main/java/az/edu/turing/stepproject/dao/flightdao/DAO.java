package az.edu.turing.stepproject.dao.flightdao;


import java.util.List;

public interface DAO <T>{
    T save (T t);
    List<T> getAllFlight();
    T getById ();



}
