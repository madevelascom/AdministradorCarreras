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
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;
import javafx.stage.Stage;
import modulos.Materia;

public class MateriaController extends Main implements Initializable{

	@FXML
    private TextField codigo;
	@FXML
    private TextField nombre;
	@FXML
    private TextField descripcion;
	@FXML
    private TextField cte;
	@FXML
    private TextField cpr;
	
	private Stage dialogStage;
    private Materia mat;
    private boolean okClicked = false;
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		
	}
	
	public void setDialogStage(Stage dialogStage) {
        this.dialogStage = dialogStage;
    }
	
	public void setMateria(Materia mat) {
        this.mat = mat;

        codigo.setText(mat.getCodigo().getValue().toString());
        nombre.setText(mat.getNom().getValue().toString());
        descripcion.setText(mat.getDescription().getValue().toString());
        cte.setText(mat.getCret().getValue().toString());
        cpr.setText(mat.getCrep().getValue().toString());
    }
	
	public boolean isOkClicked() {
        return okClicked;
    }
	
	@FXML
    private void handleOk() {
        if (isInputValid()) {
        	
        	StringProperty prop = new SimpleStringProperty(codigo.getText());        	
        	mat.setCodigo(prop);
        	prop = new SimpleStringProperty(nombre.getText()); 
        	mat.setNom(prop);
            prop = new SimpleStringProperty(descripcion.getText()); 
            mat.setDescription(prop);
            IntegerProperty iprop = new SimpleIntegerProperty(Integer.parseInt(cte.getText()));
            mat.setCret(iprop);
            iprop = new SimpleIntegerProperty(Integer.parseInt(cpr.getText()));
            mat.setCrep(iprop);
            
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
        }
        if (nombre.getText() == null || nombre.getText().length() == 0) {
            errorMessage += "Nombre incorrecto \n"; 
        }
        if (descripcion.getText() == null || descripcion.getText().length() == 0) {
            errorMessage += "Descripción vacía \n"; 
        }

        if (cte.getText() == null || cte.getText().length() == 0) {
            errorMessage += "Cantidad de créditos teóricos vacío \n"; 
        } else {
            try {
                Integer.parseInt(cte.getText());
            } catch (NumberFormatException e) {
                errorMessage += "Cantidad de créditos teóricos no válida (debe ser un entero)!\n"; 
            }
        }
        
        if (cpr.getText() == null || cpr.getText().length() == 0) {
            errorMessage += "Cantidad de créditos prácticos vacío \n"; 
        } else {
            try {
                Integer.parseInt(cpr.getText());
            } catch (NumberFormatException e) {
                errorMessage += "Cantidad de créditos prácticos no válida (debe ser un entero)!\n"; 
            }
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
