package Decorators;

import VehicleType.Vehicle;

public abstract class VehicleDecorator implements Vehicle {
protected Vehicle car;

public VehicleDecorator(Vehicle car){
    this.car = car;
 }
}
