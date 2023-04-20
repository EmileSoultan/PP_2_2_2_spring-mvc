package web.repository;

import web.entity.Car;

import java.util.List;

public interface CarDAO {
    List<Car> showCars(int count);
}

