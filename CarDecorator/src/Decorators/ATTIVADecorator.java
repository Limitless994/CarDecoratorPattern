package Decorators;

import VehicleSpecs.Optional;
import VehicleSpecs.OptionalType;
import VehicleType.Vehicle;

public class ATTIVADecorator extends VehicleDecorator {

	public ATTIVADecorator(Vehicle car) {
		super(car);
		car.optionals.removeAll(optionals);
		car.optionalsName.removeAll(optionalsName);
		car.addOptional(new Optional(OptionalType.headlight,300,"Fari Xenon"));
		car.addOptional(new Optional(OptionalType.interior,500,"Interni camoscio"));
		optionalsName.addAll("Fari Xenon","Interni in camoscio");
	}

	@Override
	public float getBaseCost() {
		return car.getBaseCost();
	}

	@Override
	public boolean addOptional(Optional o) {
		return true;
	}

	@Override
	public float getFullPrice() {
		return car.getFullPrice();
	}

}
