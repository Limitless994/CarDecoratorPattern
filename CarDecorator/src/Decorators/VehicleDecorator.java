package Decorators;

import java.util.ArrayList;

import VehicleSpecs.Optional;
import VehicleType.Vehicle;

public abstract class VehicleDecorator implements Vehicle {
	protected Vehicle car;

	public VehicleDecorator(Vehicle car){
		this.car = car;
	}

	public void addOptionalList(ArrayList<Optional> opt) {
		for(Optional o: opt)
			car.addOptional(o);
	}
}
