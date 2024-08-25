package web.service;

import org.springframework.stereotype.Service;
import web.models.Car;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarServiceImpl implements CarService {

    @Override
    public List<Car> listCars(int count) {
        int size = Car.getCars().size();
        if (count >= size) {
            count = size;
        } else if (count <= 0) {
            count = 0;
        }
        return Car.getCars().stream().limit(count).toList();
    }

}
