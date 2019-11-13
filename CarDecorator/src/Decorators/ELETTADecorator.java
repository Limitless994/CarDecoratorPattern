package Decorators;

import VehicleSpecs.Optional;
import VehicleSpecs.OptionalType;
import VehicleType.Vehicle;

public class ELETTADecorator extends VehicleDecorator {

	public ELETTADecorator(Vehicle car) {
		super(car);
		car.optionals.removeAll(optionals);
		car.optionalsName.removeAll(optionalsName);

		car.addOptional(new Optional(OptionalType.clima,500,"Bizona Avanti e dietro"));
		car.addOptional(new Optional(OptionalType.headlight,700,"Fari led Anteriori"));
		car.addOptional(new Optional(OptionalType.interior,1500,"Interni in pelle"));	
		optionalsName.addAll("Bizona Avanti e dietro","Fari led Anteriori","Interni in pelle");

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
