package Decorators;

import VehicleSpecs.Optional;
import VehicleSpecs.OptionalType;
import VehicleType.Vehicle;

public class FUTURADecorator extends VehicleDecorator{

	public FUTURADecorator(Vehicle car) {
		super(car);
		Vehicle.optionals.removeAll(optionals);
		Vehicle.optionalsName.removeAll(optionalsName);
		car.addOptional(new Optional(OptionalType.clima,700,"Bizona Avanti e Dietro"));
		car.addOptional(new Optional(OptionalType.headlight,500,"Fari full led"));
		car.addOptional(new Optional(OptionalType.stereo,1200,"Boose 7.1"));
		optionalsName.addAll("Boose 7.1","Fari full led","Bizona Avanti e Dietro");

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
