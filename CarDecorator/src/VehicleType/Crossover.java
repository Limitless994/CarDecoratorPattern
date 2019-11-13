package VehicleType;

import VehicleSpecs.Optional;

public class Crossover implements Vehicle {

	@Override
	public float getBaseCost() {
		return 20000;
	}
	public boolean addOptional(Optional optional) {
		for(Optional o : optionals) {
			if(o.type == optional.type) return false;
		}
		optionals.add(optional);
		return true;

	}

	@Override
	public float getFullPrice() {
		float out = 20000;
		for(Optional o : optionals) {
			out+=o.cost;
		}
		return out;
	}
}
