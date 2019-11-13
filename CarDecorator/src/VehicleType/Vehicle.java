package VehicleType;
import java.util.ArrayList;

import VehicleSpecs.EngineType;
import VehicleSpecs.Optional;
import VehicleSpecs.WheelDrive;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public interface Vehicle {
	public EngineType engine = null;
	public WheelDrive wheelDriveType = null;
	public int seats = 0;
	public int horsePower = 0;
	ArrayList<Optional> optionals = new ArrayList<Optional>();
	public float getBaseCost();
	public boolean addOptional(Optional o); 
	public float getFullPrice();
}
