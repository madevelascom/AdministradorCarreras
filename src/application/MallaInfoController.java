package application;

import java.net.URL;
import java.time.LocalDate;
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
import modulos.MallaCurricular;

public class MallaInfoController extends Main implements Initializable{
	
	@FXML
    private TextField carrera;
	@FXML
    private TextField version;
	@FXML
    private TextField elaborado;
	
	private Stage dialogStage;
    private MallaCurricular mallacurricular;
    private boolean okClicked = false;
    
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		
		
	}
	
	public void setDialogStage(Stage dialogStage) {
        this.dialogStage = dialogStage;
    }
	
	public void setMallaCurricular(MallaCurricular mallacurricular) {
		this.mallacurricular = mallacurricular;
		
		carrera.setText(mallacurricular.getCarrera().getValue().toString());
		version.setText(mallacurricular.getVersion().getValue().toString());
		elaborado.setText(mallacurricular.getElaborado().getValue().toString());
		
		
	}
	
	public boolean isOkClicked() {
        return okClicked;
    }
	
	@FXML
    private void handleOk() {
		if (isInputValid()) {
            

        	StringProperty prop = new SimpleStringProperty(carrera.getText());        	
        	mallacurricular.setCarrera(prop);
        	prop = new SimpleStringProperty(elaborado.getText()); 
        	mallacurricular.setElaborado(prop);
            prop = new SimpleStringProperty(LocalDate.now().toString()); 
            mallacurricular.setFecha(prop);           
            IntegerProperty iprop = new SimpleIntegerProperty(Integer.parseInt(version.getText()));
            mallacurricular.setVersion(iprop);
            String dir = carrera.getText()+version.getText()+".sol";
            mallacurricular.setLocation(dir);   
            
            okClicked = true;
            dialogStage.close();
		}
	}
	
	private boolean isInputValid() {
		String errorMessage = "";
		
		if (carrera.getText() == null || carrera.getText().length() == 0) {
            errorMessage += "Código de carrera incorrecto \n"; 
        }
        if (version.getText() == null || version.getText().length() == 0) {
            errorMessage += "Version incorrecta \n"; 
        }else{
        	try {
                Integer.parseInt(version.getText());
            } catch (NumberFormatException e) {
                errorMessage += "La versión debe ser un entero!\n"; 
            }
        }
        if (elaborado.getText() == null || elaborado.getText().length() == 0) {
            errorMessage += "Elaborado por  vacío \n"; 
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
	
	@FXML
    private void handleCancel() {
        dialogStage.close();
    }
	
	
}
