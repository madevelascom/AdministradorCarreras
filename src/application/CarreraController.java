package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import modulos.Carrera;

public class CarreraController extends Main implements Initializable {
	
	@FXML
    private TextField codigo;
	@FXML
    private TextField nombre;
	@FXML
    private TextField facultad;
	@FXML
    private TextField descripcion;
	@FXML
    private TextField inscritos;
	
	private Stage dialogStage;
    private Carrera carrera;
    private boolean okClicked = false;
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		
	}
	
	public void setDialogStage(Stage dialogStage) {
        this.dialogStage = dialogStage;
    }
	
	public void setCarrera(Carrera carrera) {
        this.carrera = carrera;

        codigo.setText(carrera.getCodigo().getValue().toString());
        nombre.setText(carrera.getNombre().getValue().toString());
        facultad.setText(carrera.getFacultad().getValue().toString());
        descripcion.setText(carrera.getDescription().getValue().toString());
        inscritos.setText(carrera.getEstudiantes().getValue().toString());
    }
	
	public boolean isOkClicked() {
        return okClicked;
    }
	
	@FXML
    private void handleOk() {
        if (isInputValid()) {
        	
        	StringProperty prop = new SimpleStringProperty(codigo.getText());        	
        	carrera.setCodigo(prop);
        	prop = new SimpleStringProperty(nombre.getText()); 
            carrera.setNombre(prop);
            prop = new SimpleStringProperty(facultad.getText()); 
            carrera.setFacultad(prop);
            prop = new SimpleStringProperty(descripcion.getText()); 
            carrera.setDescription(prop);
            IntegerProperty iprop = new SimpleIntegerProperty(Integer.parseInt(inscritos.getText()));
            carrera.setEstudiantes(iprop);
            
            okClicked = true;
            dialogStage.close();
        }
                    
    }
	
	 @FXML
	    private void handleCancel() {
	        dialogStage.close();
	    }
	 
	private boolean isInputValid() {
        String errorMessage = "";

        if (codigo.getText() == null || codigo.getText().length() == 0) {
            errorMessage += "Código incorrecto \n"; 
        }/*else{
        	boolean content = false;
        	for (Carrera car: carreraData){
        		if (car.getCodigo().getValue().equals(codigo)){
        			content = true;
        			break;
        		}
        	}
        	if(content == false){
        		errorMessage += "Ese código de materia ya existe \n"; 
        	}
        }*/
        if (nombre.getText() == null || nombre.getText().length() == 0) {
            errorMessage += "Nombre incorrecto \n"; 
        }/*else{
        	boolean content = false;
        	for (Carrera car: carreraData){
        		if (car.getNombre().getValue().equals(codigo)){
        			content = true;
        			break;
        		}
        	}
        	if(content == false){
        		errorMessage += "Ese nombre de materia ya existe \n"; 
        	}
        }*/
        if (facultad.getText() == null || facultad.getText().length() == 0) {
            errorMessage += "Facultad vacía \n"; 
        }

        if (inscritos.getText() == null || inscritos.getText().length() == 0) {
            errorMessage += "Cantidad de estudiantes inscritos vacía \n"; 
        } else {
            try {
                Integer.parseInt(inscritos.getText());
            } catch (NumberFormatException e) {
                errorMessage += "Cantidad de estudiantes no válida (debe ser un entero)!\n"; 
            }
        }

        if (descripcion.getText() == null || descripcion.getText().length() == 0) {
            errorMessage += "Descripción vacía \n"; 
        }

        if (errorMessage.length() == 0) {
            return true;
        } else {
        	Alert alert = new Alert(AlertType.ERROR);
        	alert.setTitle("Error");
        	alert.setHeaderText("Tienes un(os) error(es) al ingresar los datos");
        	alert.setContentText(errorMessage);

        	alert.showAndWait();
        	
            return false;
        }

	}
}
