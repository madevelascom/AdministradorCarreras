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
	private Label codCar, nomCar, facCar, desCar, cantCar;
	@FXML
	private Label codMat, nomMat, desMat, cteo, cprc;
	
	@FXML
	public void initialize() {
		
		materiaTable.setItems(Main.getMateriaData());
		nomMateria.setCellValueFactory(cellData -> cellData.getValue().getNom());
		codMateria.setCellValueFactory(cellData -> cellData.getValue().getCodigo());
		
		carreraTable.setItems(Main.getCarreraData());
		nomCarrera.setCellValueFactory(cellData -> cellData.getValue().getNombre());
		codCarrera.setCellValueFactory(cellData -> cellData.getValue().getCodigo());
  
	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		
	}

}
