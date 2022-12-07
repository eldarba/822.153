package app.core.controllers;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import app.core.models.Car;

@RestController
@RequestMapping("/api/cars")
public class CarController {
	private List<Car> cars = new ArrayList<>();

	// create a resource on the server - HTTP Post method
	@PostMapping
	public Car addCar(@RequestBody Car car) {
		cars.add(car);
		System.out.println(cars);
		return car;
	}

	// get a resource from the server - HTTP Get method
	@GetMapping("/{number}")
	public Car getCar(int number) {
		Car car = new Car();
		car.setNumber(number);
		int index = this.cars.indexOf(car);
		if (index != -1) {
			return cars.get(index);
		} else {
			return null;
		}
	}

	@GetMapping
	public List<Car> getAll() {
		return cars;
	}

	@PostConstruct
	void init() {
		cars.add(new Car(101, "Red", "Skoda"));
		cars.add(new Car(102, "Green", "Porsh"));
		cars.add(new Car(103, "Blue", "Mercedes"));
	}
}
