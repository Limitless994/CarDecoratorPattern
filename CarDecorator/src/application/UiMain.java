package application;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import Decorators.ATTIVADecorator;
import Decorators.ELETTADecorator;
import Decorators.FUTURADecorator;
import Decorators.VehicleFactory;
import VehicleSpecs.Optional;
import VehicleSpecs.OptionalType;
import VehicleType.Vehicle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;


public class UiMain implements Initializable {
	@FXML
	private ImageView preview;
	@FXML
	private Label cost;
	@FXML
	private ChoiceBox<String> carSelector;
	@FXML
	private ChoiceBox<String> carSetup;
	@FXML
	private ListView<String> listview;


	ObservableList<String> carList = FXCollections.observableArrayList();
	ObservableList<String> setupList = FXCollections.observableArrayList();

	private void loadData() {
		carList.removeAll(carList);
		carList.add("Suv");
		carList.add("Hatchback");
		carList.add("Coupe");
		carList.add("Crossover");
		carSelector.getItems().addAll(carList);

		setupList.removeAll(setupList);
		setupList.add("ATTIVA");
		setupList.add("ELETTA");
		setupList.add("FUTURA");
		carSetup.getItems().addAll(setupList);
	}


	@Override
	public void initialize(URL location, ResourceBundle resources) {
		listview.setItems(car.optionalsName);
		loadData();
	}

	VehicleFactory vf = VehicleFactory.getInstance();

	Vehicle car = null;

	public void addCar(ActionEvent e) {
		if(carSelector.getValue()=="Suv") {

			car = vf.getVehicle("Suv");
			preview.setImage(new Image("Suv.png"));

		}else if(carSelector.getValue()=="Hatchback") {

			car = vf.getVehicle("Hatchback");
			preview.setImage(new Image("Hatchback.png"));
		}else if(carSelector.getValue()=="Coupe") {

			car = vf.getVehicle("Coupe");
			preview.setImage(new Image("Coupe.png"));
		}else if(carSelector.getValue()=="Crossover") {

			car = vf.getVehicle("Crossover");
			preview.setImage(new Image("Crossover.png"));
		}

		if(carSetup.getValue()=="ATTIVA") {

			car = new ATTIVADecorator(vf.getVehicle(carSelector.getValue()));

		}else if(carSetup.getValue()=="ELETTA") {

			car = new ELETTADecorator(vf.getVehicle(carSelector.getValue()));

		}else if(carSetup.getValue()=="FUTURA") {

			car = new FUTURADecorator(vf.getVehicle(carSelector.getValue()));
		}
		cost.setText(Float.toString(car.getFullPrice())+"€");

	}


}