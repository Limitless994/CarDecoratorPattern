package application;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import Decorators.VehicleFactory;
import VehicleSpecs.EngineType;
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
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;


public class UiMain implements Initializable {
	@FXML
	private ImageView preview;
	
//	@FXML
//	private Label name;
//	@FXML
//	private Label displayType;
//	@FXML
//	private Label cpuType;
//	@FXML
//	private Label cost;
//	@FXML
//	private ListView<String> shelf;
//	
//	@FXML
//	private ImageView diagram;

	ObservableList<String> list = FXCollections.observableArrayList();
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		//shelf.setItems(list);
	}

	VehicleFactory vf = VehicleFactory.getInstance();
	
	public void showDiagram(ActionEvent e) throws IOException {
//		Parent root = FXMLLoader.load(getClass().getResource("/application/diag.fxml"));
//		Scene scene = new Scene(root,1000,700);
//		Stage secondaryStage = new Stage();
//		scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
//		secondaryStage.setScene(scene);
//		secondaryStage.show();

	}
	public void addCar(ActionEvent e) {
		Vehicle car = vf.getVehicle("Suv");
		preview.setImage(new Image("Suv.png"));
		car.addOptional(new Optional(OptionalType.clima,200,"bizona"));
		System.out.println(car.getFullPrice());
		System.out.println(car.getBaseCost());

	}
	
}