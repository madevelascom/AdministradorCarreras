package application;


import java.net.URL;
import java.util.Optional;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import modulos.Carrera;
import modulos.Materia;

public class Controller extends Main implements Initializable{

	@FXML
	private TableView<Carrera> carreraTable;
	@FXML
	private TableView<Materia> materiaTable;
	
	@FXML 
	private TableColumn<Carrera, String> nomCarrera;
	@FXML 
	private TableColumn<Carrera, String> codCarrera;
	@FXML 
	private TableColumn<Materia, String> nomMateria;
	@FXML 
	private TableColumn<Materia, String> codMateria;
   
	@FXML
	private Label lcprc ;
	@FXML
	private Label lcodCar;
	@FXML
	private Label lnomCar;
	@FXML
	private Label lfacCar;
	@FXML
	private Label ldesCar;
	@FXML
	private Label lcantCar;
	@FXML
	private Label lcodMat;
	@FXML
	private Label lnomMat;
	@FXML
	private Label ldesMat;
	@FXML
	private Label lcteo;
	
	@FXML
	private void borrarMateria(){
		 int selectedIndex = materiaTable.getSelectionModel().getSelectedIndex();
		 if (selectedIndex >= 0) {
			 Alert alert = new Alert(AlertType.CONFIRMATION);
			 alert.setTitle("Confirmación de borrado");
			 alert.setHeaderText("Vas a borrar la materia que escogiste");
			 alert.setContentText("¿Estás seguro?");
			 
			 Optional<ButtonType> result = alert.showAndWait();
			 
			 if (result.get() == ButtonType.OK){
				 materiaTable.getItems().remove(selectedIndex);
				}  
		 }
		
	}
	@FXML
		private void borrarCarrera(){
		int selectedIndex = carreraTable.getSelectionModel().getSelectedIndex();
		 if (selectedIndex >= 0) {
			 Alert alert = new Alert(AlertType.CONFIRMATION);
			 alert.setTitle("Confirmación de borrado");
			 alert.setHeaderText("Vas a borrar la carrera que escogiste");
			 alert.setContentText("¿Estás seguro?");
			 
			 Optional<ButtonType> result = alert.showAndWait();
			 
			 if (result.get() == ButtonType.OK){
				 carreraTable.getItems().remove(selectedIndex);
			 }			 
		 }	
	}
	@FXML
	private void borrarMalla(){
		
	}
	
	@FXML
	public void initialize(URL url, ResourceBundle rb) {
			
		carreraTable.setItems(Main.getCarreraData());
		nomCarrera.setCellValueFactory(cellData -> cellData.getValue().getNombre());
		codCarrera.setCellValueFactory(cellData -> cellData.getValue().getCodigo());
		
		materiaTable.setItems(Main.getMateriaData());
		nomMateria.setCellValueFactory(cellData -> cellData.getValue().getNom());
		codMateria.setCellValueFactory(cellData -> cellData.getValue().getCodigo());
		
		showMateriaDetails(null);
		showCarreraDetails(null);
		 
		materiaTable.getSelectionModel().selectedItemProperty().addListener(
	            (observable, oldValue, newValue) -> showMateriaDetails(newValue));
		carreraTable.getSelectionModel().selectedItemProperty().addListener(
	            (observable, oldValue, newValue) -> showCarreraDetails(newValue));
	}
	
	private void showMateriaDetails(Materia mat){
		if (mat != null) {
				lcodMat.setText(mat.getCodigo().getValue());
				lnomMat.setText(mat.getNom().getValue());
				ldesMat.setText(mat.getDescription().getValue());
				lcteo.setText(mat.getCret().getValue().toString());
				lcprc.setText(mat.getCrep().getValue().toString());
		}else{
			lcodMat.setText("");
			lnomMat.setText("");
			ldesMat.setText("");
			lcteo.setText("");
			lcprc.setText("");
		}
	}
	
	private void showCarreraDetails (Carrera car){
		if (car != null) {
			lcodCar.setText(car.getCodigo().getValue());
			lnomCar.setText(car.getNombre().getValue());
			lfacCar.setText(car.getFacultad().getValue());
			ldesCar.setText(car.getDescription().getValue());
			lcantCar.setText(car.getEstudiantes().getValue().toString());
		}else{
			lcodCar.setText("");
			lnomCar.setText("");
			lfacCar.setText("");
			ldesCar.setText("");
			lcantCar.setText("");
		}
	}
	
	@FXML
	private void handleNewCarrera() {
	    Carrera temp = new Carrera();
	    boolean okClicked = Main.showCarreraEditDialog(temp);
	    if (okClicked) {
	    	Main.getCarreraData().add(temp);
	    }
	}

	@FXML
	private void handleEditCarrera() {
		int selectedIndex = carreraTable.getSelectionModel().getSelectedIndex();
		
		if (selectedIndex >= 0) {			
			Carrera selected = carreraTable.getItems().get(selectedIndex);
			if (selected != null) {
		        boolean okClicked = Main.showCarreraEditDialog(selected);
		        if (okClicked) {
		            showCarreraDetails(selected);
		        }
		    } 
		}
		
	    
	}
	
	@FXML
	private void handleNewMateria() {
	    Materia temp = new Materia();
	    boolean okClicked = Main.showMateriaEditDialog(temp);
	    if (okClicked) {
	    	Main.getMateriaData().add(temp);
	    }
	}
	
	@FXML
	private void handleEditMateria() {
		int selectedIndex = materiaTable.getSelectionModel().getSelectedIndex();
		
		if (selectedIndex >= 0) {			
			Materia selected = materiaTable.getItems().get(selectedIndex);
			if (selected != null) {
		        boolean okClicked = Main.showMateriaEditDialog(selected);
		        if (okClicked) {
		            showMateriaDetails(selected);
		        }
		    } 
		}
		
	    
	}
	
}
