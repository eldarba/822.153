package app.core.controllers;

import java.util.ArrayList;
import java.util.List;

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

}
