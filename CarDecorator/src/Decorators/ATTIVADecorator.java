package Decorators;

import VehicleSpecs.Optional;
import VehicleType.Vehicle;

public class ATTIVADecorator extends VehicleDecorator {

	public ATTIVADecorator(Vehicle car) {
		super(car);
		// TODO Auto-generated constructor stub
	}

	@Override
	public float getBaseCost() {
		return car.getBaseCost();
	}

	@Override
	public boolean addOptional(Optional o) {
		return car.addOptional(o);
	}

	@Override
	public float getFullPrice() {
		return car.getFullPrice();
	}

}
