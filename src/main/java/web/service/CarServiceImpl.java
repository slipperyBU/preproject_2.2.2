package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarServiceImpl implements CarService {

private List<Car> cars;

    {
        cars = new ArrayList<>();
        cars.add(new Car("Russia","Lada",1999));
        cars.add(new Car("Germany","Porsche",2007));
        cars.add(new Car("Germany","Audi",2001));
        cars.add(new Car("Japan","Subaru",2019));
        cars.add(new Car("Italy","Ferrari",1980));
    }


    public List<Car> index() {
        return cars;
    }

    @Override
    public List<Car> index(int number) {
        return cars.stream().limit(number).toList();
    }
}
