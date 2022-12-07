package app.core.controllers;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import app.core.models.Car;

@RestController
@RequestMapping("/api/cars")
public class CarController {
	private List<Car> cars = new ArrayList<>();

	@Autowired
	private ConfigurableApplicationContext ctx;

	// http://localhost:8080/api/cars/x
	@GetMapping("/x")
	public void shutServerDown() {
		ctx.close();
	}

	// create a resource on the server - HTTP Post method
	@PostMapping
	public Car addCar(@RequestBody Car car) {
		cars.add(car);
		System.out.println(cars);
		return car;
	}

	// get a resource from the server - HTTP Get method
	@GetMapping("/{number}")
	public ResponseEntity<?> getCar(int number) {
		Car car = new Car();
		car.setNumber(number);
		int index = this.cars.indexOf(car);
		if (index != -1) {
			return ResponseEntity.ok(cars.get(index)); // http status 200 OK and a car in the body
		} else {
			// http status 404 NotFound and an error message in the body
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body("the car number " + number + " not found");
		}
	}

	@GetMapping
	public List<Car> getAll() {
		return cars;
	}

	// update a resource on the server - HTTP Put method
	@PutMapping
	public Car updateCar(Car car) {
		try {
			Car carInMemory = (Car) getCar(car.getNumber()).getBody();
			carInMemory.setColor(car.getColor());
			carInMemory.setMake(car.getMake());
			return carInMemory;
		} catch (Exception e) {
			throw new ResponseStatusException(HttpStatus.NOT_FOUND, "car number " + car.getNumber() + " not found");
		}
	}

	// delete a resource on the server - HTTP Delete method
	@DeleteMapping
	public ResponseEntity<String> deleteCar(int number) {
		Iterator<Car> it = cars.iterator();
		while (it.hasNext()) {
			if (it.next().getNumber() == number) {
				it.remove();
				return ResponseEntity.ok("the car was removed");
			}
		}
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body("the car was NOT removed");
	}

	// delete a resource on the server - HTTP Delete method
	@DeleteMapping("/2")
	public String deleteCar2(int number) {
		Iterator<Car> it = cars.iterator();
		while (it.hasNext()) {
			if (it.next().getNumber() == number) {
				it.remove();
				return "the car was removed";
			}
		}
		throw new ResponseStatusException(HttpStatus.NOT_FOUND, "the car was NOT removed");
	}

	@PostConstruct // life cycle hook method
	void init() {
		cars.add(new Car(101, "Red", "Skoda"));
		cars.add(new Car(102, "Green", "Porsh"));
		cars.add(new Car(103, "Blue", "Mercedes"));
	}
}
