package application;


import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;

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

}
