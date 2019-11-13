package VehicleType;
import java.util.ArrayList;

import VehicleSpecs.Optional;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public interface Vehicle {
	ArrayList<Optional> optionals = new ArrayList<Optional>();
	public float getBaseCost();
	public boolean addOptional(Optional o); 
	public float getFullPrice();
	public ObservableList<String> optionalsName = FXCollections.observableArrayList();

}
