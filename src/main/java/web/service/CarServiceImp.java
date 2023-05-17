package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CarServiceImp implements CarService {

    List<Car> carsList = new ArrayList<>();

    public CarServiceImp() {
        carsList.add(new Car("VAZ", "2109", 2003));
        carsList.add(new Car("VAZ", "2112", 2011));
        carsList.add(new Car("Mercedes", "B-class", 2015));
        carsList.add(new Car("Mercedes", "CLS", 2008));
        carsList.add(new Car("McLaren", "650", 2022));
    }

    @Override
    public List<Car> getCarsFromList(int count) {
        return carsList.stream().limit(count).collect(Collectors.toList());
    }
}
