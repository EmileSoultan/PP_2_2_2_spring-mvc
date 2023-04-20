package web.repository;

import org.springframework.stereotype.Repository;
import web.entity.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
@Repository
public class CarDAOImpl implements CarDAO{
    private static long CARS_COUNT = 0;
    private List<Car> cars = new ArrayList<>();

    {
        cars.add(new Car(++CARS_COUNT, "BMW", "735"));
        cars.add(new Car(++CARS_COUNT, "Honda", "HRV"));
        cars.add(new Car(++CARS_COUNT, "Toyota", "Camry"));
        cars.add(new Car(++CARS_COUNT, "Mercedes-Benz", "200"));
        cars.add(new Car(++CARS_COUNT, "Nissan", "Juke"));
    }

    @Override
    public List<Car> showCars(int count) {
        return cars.stream().limit(count).collect(Collectors.toList());
    }
}
