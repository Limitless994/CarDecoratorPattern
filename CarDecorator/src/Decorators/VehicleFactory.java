package Decorators;

import VehicleType.Coupe;
import VehicleType.Crossover;
import VehicleType.Hatchback;
import VehicleType.Suv;
import VehicleType.Vehicle;

public class VehicleFactory {

	private VehicleFactory(){}
	
	private static VehicleFactory f = new VehicleFactory();
	public Vehicle getVehicle(String vehicleType){
		if(vehicleType == null){
			return null;
		}		
		if(vehicleType.equalsIgnoreCase("Coupe")){
			return new Coupe();

		} else if(vehicleType.equalsIgnoreCase("Crossover")){
			return new Crossover();

		} else if(vehicleType.equalsIgnoreCase("Suv")){
			return new Suv();

		}else if(vehicleType.equalsIgnoreCase("Hatchback")){
			return new Hatchback();
		}


		return null;
	}
	public static VehicleFactory getInstance(){
		return f;
	}
}
