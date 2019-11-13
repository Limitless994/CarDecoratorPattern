package VehicleType;

import VehicleSpecs.Optional;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Hatchback implements Vehicle {

	@Override
	public float getBaseCost() {
		return 10000;
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
		float out = 10000;
		for(Optional o : optionals) {
			out+=o.cost;
		}
		return out;
	}
}
