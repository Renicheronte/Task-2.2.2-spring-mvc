package web.service;

import web.model.Car;

import java.util.List;

public class CarServiceImp implements CarService {
    @Override
    public List<Car> getCarsFromList(List<Car> carsList, Integer count) {
        return carsList.stream().limit(count).toList();
    }
}
