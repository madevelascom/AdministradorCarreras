package application;


import java.io.IOException;
import java.net.URL;
import java.util.Optional;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.collections.transformation.FilteredList;
import javafx.collections.transformation.SortedList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import modulos.Carrera;
import modulos.MallaCurricular;
import modulos.Materia;
import modulos.Plan;

public class Controller extends Main implements Initializable{

	@FXML
	private TableView<Carrera> carreraTable;
	@FXML
	private TableView<Materia> materiaTable;
	@FXML
	private TableView<MallaCurricular> mallaTable;
	
	@FXML 
	private TableColumn<Carrera, String> nomCarrera;
	@FXML 
	private TableColumn<Carrera, String> codCarrera;
	@FXML 
	private  TableColumn<Materia, String> nomMateria;
	@FXML 
	private TableColumn<Materia, String> codMateria;
	@FXML 
	private TableColumn<MallaCurricular, String> carrera;
	@FXML 
	private TableColumn<MallaCurricular, Number> version;
	private ObservableList<Materia> masterData = Main.getMateriaData();
	private ObservableList<Carrera> masterData2 = Main.getCarreraData();
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
	private Label lCarrera;
	@FXML
	private Label lVersion;
	@FXML
	private Label lFecha;
	@FXML
	private Label lCreator;
	
	@FXML
	private TextField materiaSearch;
	@FXML
	private TextField carreraSearch;
	@FXML
	private TextField mallaSearch;
	
	//1 Semestre
	@FXML
	private Label cod11;
	@FXML
	private Label nom11;
	@FXML
	private Label pre11;
	@FXML
	private Label cor11;
	@FXML
	private Label cod12;
	@FXML
	private Label nom12;
	@FXML
	private Label pre12;
	@FXML
	private Label cor12;
	@FXML
	private Label cod13;
	@FXML
	private Label nom13;
	@FXML
	private Label pre13;
	@FXML
	private Label cor13;
	@FXML
	private Label cod14;
	@FXML
	private Label nom14;
	@FXML
	private Label pre14;
	@FXML
	private Label cor14;
	@FXML
	private Label cod15;
	@FXML
	private Label nom15;
	@FXML
	private Label pre15;
	@FXML
	private Label cor15;
	@FXML
	private Label cod16;
	@FXML
	private Label nom16;
	@FXML
	private Label pre16;
	@FXML
	private Label cor16;
	
	//2 Semestre
	@FXML
	private Label cod21;
	@FXML
	private Label nom21;
	@FXML
	private Label pre21;
	@FXML
	private Label cor21;
	@FXML
	private Label cod22;
	@FXML
	private Label nom22;
	@FXML
	private Label pre22;
	@FXML
	private Label cor22;
	@FXML
	private Label cod23;
	@FXML
	private Label nom23;
	@FXML
	private Label pre23;
	@FXML
	private Label cor23;
	@FXML
	private Label cod24;
	@FXML
	private Label nom24;
	@FXML
	private Label pre24;
	@FXML
	private Label cor24;
	@FXML
	private Label cod25;
	@FXML
	private Label nom25;
	@FXML
	private Label pre25;
	@FXML
	private Label cor25;
	@FXML
	private Label cod26;
	@FXML
	private Label nom26;
	@FXML
	private Label pre26;
	@FXML
	private Label cor26;
	//3 Semestre
	@FXML
	private Label cod31;
	@FXML
	private Label nom31;
	@FXML
	private Label pre31;
	@FXML
	private Label cor31;
	@FXML
	private Label cod32;
	@FXML
	private Label nom32;
	@FXML
	private Label pre32;
	@FXML
	private Label cor32;
	@FXML
	private Label cod33;
	@FXML
	private Label nom33;
	@FXML
	private Label pre33;
	@FXML
	private Label cor33;
	@FXML
	private Label cod34;
	@FXML
	private Label nom34;
	@FXML
	private Label pre34;
	@FXML
	private Label cor34;
	@FXML
	private Label cod35;
	@FXML
	private Label nom35;
	@FXML
	private Label pre35;
	@FXML
	private Label cor35;
	@FXML
	private Label cod36;
	@FXML
	private Label nom36;
	@FXML
	private Label pre36;
	@FXML
	private Label cor36;
	//4 Semestre
	@FXML
	private Label cod41;
	@FXML
	private Label nom41;
	@FXML
	private Label pre41;
	@FXML
	private Label cor41;
	@FXML
	private Label cod42;
	@FXML
	private Label nom42;
	@FXML
	private Label pre42;
	@FXML
	private Label cor42;
	@FXML
	private Label cod43;
	@FXML
	private Label nom43;
	@FXML
	private Label pre43;
	@FXML
	private Label cor43;
	@FXML
	private Label cod44;
	@FXML
	private Label nom44;
	@FXML
	private Label pre44;
	@FXML
	private Label cor44;
	@FXML
	private Label cod45;
	@FXML
	private Label nom45;
	@FXML
	private Label pre45;
	@FXML
	private Label cor45;
	@FXML
	private Label cod46;
	@FXML
	private Label nom46;
	@FXML
	private Label pre46;
	@FXML
	private Label cor46;
	//5 Semestre
	@FXML
	private Label cod51;
	@FXML
	private Label nom51;
	@FXML
	private Label pre51;
	@FXML
	private Label cor51;
	@FXML
	private Label cod52;
	@FXML
	private Label nom52;
	@FXML
	private Label pre52;
	@FXML
	private Label cor52;
	@FXML
	private Label cod53;
	@FXML
	private Label nom53;
	@FXML
	private Label pre53;
	@FXML
	private Label cor53;
	@FXML
	private Label cod54;
	@FXML
	private Label nom54;
	@FXML
	private Label pre54;
	@FXML
	private Label cor54;
	@FXML
	private Label cod55;
	@FXML
	private Label nom55;
	@FXML
	private Label pre55;
	@FXML
	private Label cor55;
	@FXML
	private Label cod56;
	@FXML
	private Label nom56;
	@FXML
	private Label pre56;
	@FXML
	private Label cor56;
	//6 Semestre
	@FXML
	private Label cod61;
	@FXML
	private Label nom61;
	@FXML
	private Label pre61;
	@FXML
	private Label cor61;
	@FXML
	private Label cod62;
	@FXML
	private Label nom62;
	@FXML
	private Label pre62;
	@FXML
	private Label cor62;
	@FXML
	private Label cod63;
	@FXML
	private Label nom63;
	@FXML
	private Label pre63;
	@FXML
	private Label cor63;
	@FXML
	private Label cod64;
	@FXML
	private Label nom64;
	@FXML
	private Label pre64;
	@FXML
	private Label cor64;
	@FXML
	private Label cod65;
	@FXML
	private Label nom65;
	@FXML
	private Label pre65;
	@FXML
	private Label cor65;
	@FXML
	private Label cod66;
	@FXML
	private Label nom66;
	@FXML
	private Label pre66;
	@FXML
	private Label cor66;
	//7 Semestre
	@FXML
	private Label cod71;
	@FXML
	private Label nom71;
	@FXML
	private Label pre71;
	@FXML
	private Label cor71;
	@FXML
	private Label cod72;
	@FXML
	private Label nom72;
	@FXML
	private Label pre72;
	@FXML
	private Label cor72;
	@FXML
	private Label cod73;
	@FXML
	private Label nom73;
	@FXML
	private Label pre73;
	@FXML
	private Label cor73;
	@FXML
	private Label cod74;
	@FXML
	private Label nom74;
	@FXML
	private Label pre74;
	@FXML
	private Label cor74;
	@FXML
	private Label cod75;
	@FXML
	private Label nom75;
	@FXML
	private Label pre75;
	@FXML
	private Label cor75;
	@FXML
	private Label cod76;
	@FXML
	private Label nom76;
	@FXML
	private Label pre76;
	@FXML
	private Label cor76;
	//8 Semestre
	@FXML
	private Label cod81;
	@FXML
	private Label nom81;
	@FXML
	private Label pre81;
	@FXML
	private Label cor81;
	@FXML
	private Label cod82;
	@FXML
	private Label nom82;
	@FXML
	private Label pre82;
	@FXML
	private Label cor82;
	@FXML
	private Label cod83;
	@FXML
	private Label nom83;
	@FXML
	private Label pre83;
	@FXML
	private Label cor83;
	@FXML
	private Label cod84;
	@FXML
	private Label nom84;
	@FXML
	private Label pre84;
	@FXML
	private Label cor84;
	@FXML
	private Label cod85;
	@FXML
	private Label nom85;
	@FXML
	private Label pre85;
	@FXML
	private Label cor85;
	@FXML
	private Label cod86;
	@FXML
	private Label nom86;
	@FXML
	private Label pre86;
	@FXML
	private Label cor86;
	//9 Semestre
	@FXML
	private Label cod91;
	@FXML
	private Label nom91;
	@FXML
	private Label pre91;
	@FXML
	private Label cor91;
	@FXML
	private Label cod92;
	@FXML
	private Label nom92;
	@FXML
	private Label pre92;
	@FXML
	private Label cor92;
	@FXML
	private Label cod93;
	@FXML
	private Label nom93;
	@FXML
	private Label pre93;
	@FXML
	private Label cor93;
	@FXML
	private Label cod94;
	@FXML
	private Label nom94;
	@FXML
	private Label pre94;
	@FXML
	private Label cor94;
	@FXML
	private Label cod95;
	@FXML
	private Label nom95;
	@FXML
	private Label pre95;
	@FXML
	private Label cor95;
	@FXML
	private Label cod96;
	@FXML
	private Label nom96;
	@FXML
	private Label pre96;
	@FXML
	private Label cor96;
	
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
		int selectedIndex = mallaTable.getSelectionModel().getSelectedIndex();
		if (selectedIndex >= 0) {
			Alert alert = new Alert(AlertType.CONFIRMATION);
			alert.setTitle("Confirmación de borrado");
			alert.setHeaderText("Vas a borrar la malla que escogiste");
			alert.setContentText("¿Estás seguro?");
			 
			Optional<ButtonType> result = alert.showAndWait();
			 
			if (result.get() == ButtonType.OK){
				mallaTable.getItems().remove(selectedIndex);
			}			 
		}
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
	
	private void showMallaDetails (MallaCurricular mal){
		if (mal != null){
			
			lCarrera.setText(mal.getCarrera().getValue());
			lVersion.setText(mal.getVersion().getValue().toString());
			lFecha.setText(mal.getFecha().getValue());
			lCreator.setText(mal.getElaborado().getValue());
			
			cod11.setText("");nom11.setText("");pre11.setText("");	cor11.setText("");
			cod12.setText("");nom12.setText("");pre12.setText("");	cor12.setText("");
			cod13.setText("");nom13.setText("");pre13.setText("");	cor13.setText("");
			cod14.setText("");nom14.setText("");pre14.setText("");	cor14.setText("");
			cod15.setText("");nom15.setText("");pre15.setText("");	cor15.setText("");
			cod16.setText("");nom16.setText("");pre16.setText("");	cor16.setText("");
			cod21.setText("");nom21.setText("");pre21.setText("");	cor21.setText("");
			cod22.setText("");nom22.setText("");pre22.setText("");	cor22.setText("");
			cod23.setText("");nom23.setText("");pre23.setText("");	cor23.setText("");
			cod24.setText("");nom24.setText("");pre24.setText("");	cor24.setText("");
			cod25.setText("");nom25.setText("");pre25.setText("");	cor25.setText("");
			cod26.setText("");nom26.setText("");pre26.setText("");	cor26.setText("");
			cod31.setText("");nom31.setText("");pre31.setText("");	cor31.setText("");
			cod32.setText("");nom32.setText("");pre32.setText("");	cor32.setText("");
			cod33.setText("");nom33.setText("");pre33.setText("");	cor33.setText("");
			cod34.setText("");nom34.setText("");pre34.setText("");	cor34.setText("");
			cod35.setText("");nom35.setText("");pre35.setText("");	cor35.setText("");
			cod36.setText("");nom36.setText("");pre36.setText("");	cor36.setText("");
			cod41.setText("");nom41.setText("");pre41.setText("");	cor41.setText("");
			cod42.setText("");nom42.setText("");pre42.setText("");	cor42.setText("");
			cod43.setText("");nom43.setText("");pre43.setText("");	cor43.setText("");
			cod44.setText("");nom44.setText("");pre44.setText("");cor44.setText("");
			cod45.setText("");nom45.setText("");pre45.setText("");cor45.setText("");
			cod46.setText("");nom46.setText("");pre46.setText("");	cor46.setText("");
			cod51.setText("");nom51.setText("");pre51.setText("");cor51.setText("");
			cod52.setText("");nom52.setText("");pre52.setText("");cor52.setText("");
			cod53.setText("");nom53.setText("");pre53.setText("");cor53.setText("");
			cod54.setText("");nom54.setText("");pre54.setText("");cor54.setText("");
			cod55.setText("");nom55.setText("");pre55.setText("");cor55.setText("");
			cod56.setText("");nom56.setText("");pre56.setText("");cor56.setText("");
			cod61.setText("");nom61.setText("");pre61.setText("");cor61.setText("");
			cod62.setText("");nom62.setText("");pre62.setText("");cor62.setText("");
			cod63.setText("");nom63.setText("");pre63.setText("");cor63.setText("");
			cod64.setText("");nom64.setText("");pre64.setText("");cor64.setText("");
			cod65.setText("");nom65.setText("");pre65.setText("");cor65.setText("");
			cod66.setText("");nom66.setText("");pre66.setText("");cor66.setText("");
			cod71.setText("");nom71.setText("");pre71.setText("");cor71.setText("");
			cod72.setText("");nom72.setText("");pre72.setText("");cor72.setText("");
			cod73.setText("");nom73.setText("");pre73.setText("");cor73.setText("");
			cod74.setText("");nom74.setText("");pre74.setText("");cor74.setText("");
			cod75.setText("");nom75.setText("");pre75.setText("");cor75.setText("");
			cod76.setText("");nom76.setText("");pre76.setText("");cor76.setText("");
			cod81.setText("");nom81.setText("");pre81.setText("");cor81.setText("");
			cod82.setText("");nom82.setText("");pre82.setText("");cor82.setText("");
			cod83.setText("");nom83.setText("");pre83.setText("");cor83.setText("");
			cod84.setText("");nom84.setText("");pre84.setText("");cor84.setText("");
			cod85.setText("");nom85.setText("");pre85.setText("");cor85.setText("");
			cod86.setText("");nom86.setText("");pre86.setText("");cor86.setText("");
			cod91.setText("");nom91.setText("");pre91.setText("");cor91.setText("");
			cod92.setText("");nom92.setText("");pre92.setText("");cor92.setText("");
			cod93.setText("");nom93.setText("");pre93.setText("");cor93.setText("");
			cod94.setText("");nom94.setText("");pre94.setText("");cor94.setText("");
			cod95.setText("");nom95.setText("");pre95.setText("");cor95.setText("");
			cod96.setText("");nom96.setText("");pre96.setText("");cor96.setText("");
			
			ObservableList<Plan> planData = FXCollections.observableArrayList();
			planData = plansData.get(mal.getLocation());
			int pr=0, sec=0, ter=0, cu=0, qu=0, se=0, sep=0, oct=0 , nov= 0;
			for(Plan value:planData){
				//primer
				if(value.getSemestre().getValue().equals("1")){
					pr++;
					if(pr == 1){
						cod11.setText(value.getCode().getValue());
						nom11.setText(value.getNombre().getValue());
						pre11.setText(value.getReq().getValue());
						cor11.setText(value.getCor().getValue());
					}
					if(pr == 2){
						cod12.setText(value.getCode().getValue());
						nom12.setText(value.getNombre().getValue());
						pre12.setText(value.getReq().getValue());
						cor12.setText(value.getCor().getValue());
					}
					if(pr == 3){
						cod13.setText(value.getCode().getValue());
						nom13.setText(value.getNombre().getValue());
						pre13.setText(value.getReq().getValue());
						cor13.setText(value.getCor().getValue());
					}
					if(pr == 4){
						cod14.setText(value.getCode().getValue());
						nom14.setText(value.getNombre().getValue());
						pre14.setText(value.getReq().getValue());
						cor14.setText(value.getCor().getValue());
					}
					if(pr == 5){
						cod14.setText(value.getCode().getValue());
						nom14.setText(value.getNombre().getValue());
						pre14.setText(value.getReq().getValue());
						cor14.setText(value.getCor().getValue());
					}
					if(pr == 6){
						cod14.setText(value.getCode().getValue());
						nom14.setText(value.getNombre().getValue());
						pre14.setText(value.getReq().getValue());
						cor14.setText(value.getCor().getValue());
					}
				}
				//segundo
				if(value.getSemestre().getValue().equals("2")){
					sec++;
					if(sec == 1){
						cod21.setText(value.getCode().getValue());
						nom21.setText(value.getNombre().getValue());
						pre21.setText(value.getReq().getValue());
						cor21.setText(value.getCor().getValue());
					}
					if(sec == 2){
						cod22.setText(value.getCode().getValue());
						nom22.setText(value.getNombre().getValue());
						pre22.setText(value.getReq().getValue());
						cor22.setText(value.getCor().getValue());
					}
					if(sec == 3){
						cod23.setText(value.getCode().getValue());
						nom23.setText(value.getNombre().getValue());
						pre23.setText(value.getReq().getValue());
						cor23.setText(value.getCor().getValue());
					}
					if(sec == 4){
						cod24.setText(value.getCode().getValue());
						nom24.setText(value.getNombre().getValue());
						pre24.setText(value.getReq().getValue());
						cor24.setText(value.getCor().getValue());
					}
					if(sec == 5){
						cod25.setText(value.getCode().getValue());
						nom25.setText(value.getNombre().getValue());
						pre25.setText(value.getReq().getValue());
						cor25.setText(value.getCor().getValue());
					}
					if(sec == 6){
						cod26.setText(value.getCode().getValue());
						nom26.setText(value.getNombre().getValue());
						pre26.setText(value.getReq().getValue());
						cor26.setText(value.getCor().getValue());
					}
				}
				//tercero
				if(value.getSemestre().getValue().equals("3")){
					ter++;
					if(ter == 1){
						cod31.setText(value.getCode().getValue());
						nom31.setText(value.getNombre().getValue());
						pre31.setText(value.getReq().getValue());
						cor31.setText(value.getCor().getValue());
					}
					if(ter == 2){
						cod32.setText(value.getCode().getValue());
						nom32.setText(value.getNombre().getValue());
						pre32.setText(value.getReq().getValue());
						cor32.setText(value.getCor().getValue());
					}
					if(ter == 3){
						cod33.setText(value.getCode().getValue());
						nom33.setText(value.getNombre().getValue());
						pre33.setText(value.getReq().getValue());
						cor33.setText(value.getCor().getValue());
					}
					if(ter == 4){
						cod34.setText(value.getCode().getValue());
						nom34.setText(value.getNombre().getValue());
						pre34.setText(value.getReq().getValue());
						cor34.setText(value.getCor().getValue());
					}
					if(ter == 5){
						cod35.setText(value.getCode().getValue());
						nom35.setText(value.getNombre().getValue());
						pre35.setText(value.getReq().getValue());
						cor35.setText(value.getCor().getValue());
					}
					if(ter == 6){
						cod36.setText(value.getCode().getValue());
						nom36.setText(value.getNombre().getValue());
						pre36.setText(value.getReq().getValue());
						cor36.setText(value.getCor().getValue());
					}
				}
				//cuarto
				if(value.getSemestre().getValue().equals("4")){
					cu++;
					if(cu == 1){
						cod41.setText(value.getCode().getValue());
						nom41.setText(value.getNombre().getValue());
						pre41.setText(value.getReq().getValue());
						cor41.setText(value.getCor().getValue());
					}
					if(cu == 2){
						cod42.setText(value.getCode().getValue());
						nom42.setText(value.getNombre().getValue());
						pre42.setText(value.getReq().getValue());
						cor42.setText(value.getCor().getValue());
					}
					if(cu == 3){
						cod43.setText(value.getCode().getValue());
						nom43.setText(value.getNombre().getValue());
						pre43.setText(value.getReq().getValue());
						cor43.setText(value.getCor().getValue());
					}
					if(cu == 4){
						cod44.setText(value.getCode().getValue());
						nom44.setText(value.getNombre().getValue());
						pre44.setText(value.getReq().getValue());
						cor44.setText(value.getCor().getValue());
					}
					if(cu == 5){
						cod45.setText(value.getCode().getValue());
						nom45.setText(value.getNombre().getValue());
						pre45.setText(value.getReq().getValue());
						cor45.setText(value.getCor().getValue());
					}
					if(cu == 6){
						cod46.setText(value.getCode().getValue());
						nom46.setText(value.getNombre().getValue());
						pre46.setText(value.getReq().getValue());
						cor46.setText(value.getCor().getValue());
					}
				}
				//quinto
				if(value.getSemestre().getValue().equals("5")){
					qu++;
					if(qu == 1){
						cod51.setText(value.getCode().getValue());
						nom51.setText(value.getNombre().getValue());
						pre51.setText(value.getReq().getValue());
						cor51.setText(value.getCor().getValue());
					}
					if(qu == 2){
						cod52.setText(value.getCode().getValue());
						nom52.setText(value.getNombre().getValue());
						pre52.setText(value.getReq().getValue());
						cor52.setText(value.getCor().getValue());
					}
					if(qu == 3){
						cod53.setText(value.getCode().getValue());
						nom53.setText(value.getNombre().getValue());
						pre53.setText(value.getReq().getValue());
						cor53.setText(value.getCor().getValue());
					}
					if(qu == 4){
						cod54.setText(value.getCode().getValue());
						nom54.setText(value.getNombre().getValue());
						pre54.setText(value.getReq().getValue());
						cor54.setText(value.getCor().getValue());
					}
					if(qu == 5){
						cod55.setText(value.getCode().getValue());
						nom55.setText(value.getNombre().getValue());
						pre55.setText(value.getReq().getValue());
						cor55.setText(value.getCor().getValue());
					}
					if(qu == 6){
						cod56.setText(value.getCode().getValue());
						nom56.setText(value.getNombre().getValue());
						pre56.setText(value.getReq().getValue());
						cor56.setText(value.getCor().getValue());
					}
				}
				//sexto
				if(value.getSemestre().getValue().equals("6")){
					se++;
					if(se == 1){
						cod61.setText(value.getCode().getValue());
						nom61.setText(value.getNombre().getValue());
						pre61.setText(value.getReq().getValue());
						cor61.setText(value.getCor().getValue());
					}
					if(se == 2){
						cod62.setText(value.getCode().getValue());
						nom62.setText(value.getNombre().getValue());
						pre62.setText(value.getReq().getValue());
						cor62.setText(value.getCor().getValue());
					}
					if(se == 3){
						cod63.setText(value.getCode().getValue());
						nom63.setText(value.getNombre().getValue());
						pre63.setText(value.getReq().getValue());
						cor63.setText(value.getCor().getValue());
					}
					if(se == 4){
						cod64.setText(value.getCode().getValue());
						nom64.setText(value.getNombre().getValue());
						pre64.setText(value.getReq().getValue());
						cor64.setText(value.getCor().getValue());
					}
					if(se == 5){
						cod65.setText(value.getCode().getValue());
						nom65.setText(value.getNombre().getValue());
						pre65.setText(value.getReq().getValue());
						cor65.setText(value.getCor().getValue());
					}
					if(se == 6){
						cod66.setText(value.getCode().getValue());
						nom66.setText(value.getNombre().getValue());
						pre66.setText(value.getReq().getValue());
						cor66.setText(value.getCor().getValue());
					}
				}
				//septimo
				if(value.getSemestre().getValue().equals("7")){
					sep++;
					if(sep == 1){
						cod71.setText(value.getCode().getValue());
						nom71.setText(value.getNombre().getValue());
						pre71.setText(value.getReq().getValue());
						cor71.setText(value.getCor().getValue());
					}
					if(sep == 2){
						cod72.setText(value.getCode().getValue());
						nom72.setText(value.getNombre().getValue());
						pre72.setText(value.getReq().getValue());
						cor72.setText(value.getCor().getValue());
					}
					if(sep == 3){
						cod73.setText(value.getCode().getValue());
						nom73.setText(value.getNombre().getValue());
						pre73.setText(value.getReq().getValue());
						cor73.setText(value.getCor().getValue());
					}
					if(sep == 4){
						cod74.setText(value.getCode().getValue());
						nom74.setText(value.getNombre().getValue());
						pre74.setText(value.getReq().getValue());
						cor74.setText(value.getCor().getValue());
					}
					if(sep == 5){
						cod75.setText(value.getCode().getValue());
						nom75.setText(value.getNombre().getValue());
						pre75.setText(value.getReq().getValue());
						cor75.setText(value.getCor().getValue());
					}
					if(sep == 6){
						cod76.setText(value.getCode().getValue());
						nom76.setText(value.getNombre().getValue());
						pre76.setText(value.getReq().getValue());
						cor76.setText(value.getCor().getValue());
					}
				}
				//octavo
				if(value.getSemestre().getValue().equals("8")){
					oct++;
					if(oct == 1){
						cod81.setText(value.getCode().getValue());
						nom81.setText(value.getNombre().getValue());
						pre81.setText(value.getReq().getValue());
						cor81.setText(value.getCor().getValue());
					}
					if(oct == 2){
						cod82.setText(value.getCode().getValue());
						nom82.setText(value.getNombre().getValue());
						pre82.setText(value.getReq().getValue());
						cor82.setText(value.getCor().getValue());
					}
					if(oct == 3){
						cod83.setText(value.getCode().getValue());
						nom83.setText(value.getNombre().getValue());
						pre83.setText(value.getReq().getValue());
						cor83.setText(value.getCor().getValue());
					}
					if(oct == 4){
						cod84.setText(value.getCode().getValue());
						nom84.setText(value.getNombre().getValue());
						pre84.setText(value.getReq().getValue());
						cor84.setText(value.getCor().getValue());
					}
					if(oct == 5){
						cod85.setText(value.getCode().getValue());
						nom85.setText(value.getNombre().getValue());
						pre85.setText(value.getReq().getValue());
						cor85.setText(value.getCor().getValue());
					}
					if(oct == 6){
						cod85.setText(value.getCode().getValue());
						nom85.setText(value.getNombre().getValue());
						pre85.setText(value.getReq().getValue());
						cor85.setText(value.getCor().getValue());
					}
				}
				//noveno
				if(value.getSemestre().getValue().equals("9")){
					nov++;
					if(nov == 1){
						cod91.setText(value.getCode().getValue());
						nom91.setText(value.getNombre().getValue());
						pre91.setText(value.getReq().getValue());
						cor91.setText(value.getCor().getValue());
					}
					if(nov == 2){
						cod92.setText(value.getCode().getValue());
						nom92.setText(value.getNombre().getValue());
						pre92.setText(value.getReq().getValue());
						cor92.setText(value.getCor().getValue());
					}
					if(nov == 3){
						cod93.setText(value.getCode().getValue());
						nom93.setText(value.getNombre().getValue());
						pre93.setText(value.getReq().getValue());
						cor93.setText(value.getCor().getValue());
					}
					if(nov == 4){
						cod94.setText(value.getCode().getValue());
						nom94.setText(value.getNombre().getValue());
						pre94.setText(value.getReq().getValue());
						cor94.setText(value.getCor().getValue());
					}
					if(nov == 5){
						cod95.setText(value.getCode().getValue());
						nom95.setText(value.getNombre().getValue());
						pre95.setText(value.getReq().getValue());
						cor95.setText(value.getCor().getValue());
					}
					if(nov == 6){
						cod96.setText(value.getCode().getValue());
						nom96.setText(value.getNombre().getValue());
						pre96.setText(value.getReq().getValue());
						cor96.setText(value.getCor().getValue());
					}
				}
				
					
			}
		}else{
			
			lCarrera.setText("");
			lVersion.setText("");
			lFecha.setText("");
			lCreator.setText("");
			
			cod11.setText("");nom11.setText("");pre11.setText("");	cor11.setText("");
			cod12.setText("");nom12.setText("");pre12.setText("");	cor12.setText("");
			cod13.setText("");nom13.setText("");pre13.setText("");	cor13.setText("");
			cod14.setText("");nom14.setText("");pre14.setText("");	cor14.setText("");
			cod15.setText("");nom15.setText("");pre15.setText("");	cor15.setText("");
			cod16.setText("");nom16.setText("");pre16.setText("");	cor16.setText("");
			cod21.setText("");nom21.setText("");pre21.setText("");	cor21.setText("");
			cod22.setText("");nom22.setText("");pre22.setText("");	cor22.setText("");
			cod23.setText("");nom23.setText("");pre23.setText("");	cor23.setText("");
			cod24.setText("");nom24.setText("");pre24.setText("");	cor24.setText("");
			cod25.setText("");nom25.setText("");pre25.setText("");	cor25.setText("");
			cod26.setText("");nom26.setText("");pre26.setText("");	cor26.setText("");
			cod31.setText("");nom31.setText("");pre31.setText("");	cor31.setText("");
			cod32.setText("");nom32.setText("");pre32.setText("");	cor32.setText("");
			cod33.setText("");nom33.setText("");pre33.setText("");	cor33.setText("");
			cod34.setText("");nom34.setText("");pre34.setText("");	cor34.setText("");
			cod35.setText("");nom35.setText("");pre35.setText("");	cor35.setText("");
			cod36.setText("");nom36.setText("");pre36.setText("");	cor36.setText("");
			cod41.setText("");nom41.setText("");pre41.setText("");	cor41.setText("");
			cod42.setText("");nom42.setText("");pre42.setText("");	cor42.setText("");
			cod43.setText("");nom43.setText("");pre43.setText("");	cor43.setText("");
			cod44.setText("");nom44.setText("");pre44.setText("");cor44.setText("");
			cod45.setText("");nom45.setText("");pre45.setText("");cor45.setText("");
			cod46.setText("");nom46.setText("");pre46.setText("");	cor46.setText("");
			cod51.setText("");nom51.setText("");pre51.setText("");cor51.setText("");
			cod52.setText("");nom52.setText("");pre52.setText("");cor52.setText("");
			cod53.setText("");nom53.setText("");pre53.setText("");cor53.setText("");
			cod54.setText("");nom54.setText("");pre54.setText("");cor54.setText("");
			cod55.setText("");nom55.setText("");pre55.setText("");cor55.setText("");
			cod56.setText("");nom56.setText("");pre56.setText("");cor56.setText("");
			cod61.setText("");nom61.setText("");pre61.setText("");cor61.setText("");
			cod62.setText("");nom62.setText("");pre62.setText("");cor62.setText("");
			cod63.setText("");nom63.setText("");pre63.setText("");cor63.setText("");
			cod64.setText("");nom64.setText("");pre64.setText("");cor64.setText("");
			cod65.setText("");nom65.setText("");pre65.setText("");cor65.setText("");
			cod66.setText("");nom66.setText("");pre66.setText("");cor66.setText("");
			cod71.setText("");nom71.setText("");pre71.setText("");cor71.setText("");
			cod72.setText("");nom72.setText("");pre72.setText("");cor72.setText("");
			cod73.setText("");nom73.setText("");pre73.setText("");cor73.setText("");
			cod74.setText("");nom74.setText("");pre74.setText("");cor74.setText("");
			cod75.setText("");nom75.setText("");pre75.setText("");cor75.setText("");
			cod76.setText("");nom76.setText("");pre76.setText("");cor76.setText("");
			cod81.setText("");nom81.setText("");pre81.setText("");cor81.setText("");
			cod82.setText("");nom82.setText("");pre82.setText("");cor82.setText("");
			cod83.setText("");nom83.setText("");pre83.setText("");cor83.setText("");
			cod84.setText("");nom84.setText("");pre84.setText("");cor84.setText("");
			cod85.setText("");nom85.setText("");pre85.setText("");cor85.setText("");
			cod86.setText("");nom86.setText("");pre86.setText("");cor86.setText("");
			cod91.setText("");nom91.setText("");pre91.setText("");cor91.setText("");
			cod92.setText("");nom92.setText("");pre92.setText("");cor92.setText("");
			cod93.setText("");nom93.setText("");pre93.setText("");cor93.setText("");
			cod94.setText("");nom94.setText("");pre94.setText("");cor94.setText("");
			cod95.setText("");nom95.setText("");pre95.setText("");cor95.setText("");
			cod96.setText("");nom96.setText("");pre96.setText("");cor96.setText("");
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
		public  void buscarMateria(){
		nomMateria . setCellValueFactory ( cellData -> cellData . getValue ().NameProperty()); 
		codMateria . setCellValueFactory ( cellData -> cellData . getValue (). IDProperty ());	
		FilteredList<Materia> filteredData = new FilteredList<>(masterData, p -> true);	
		materiaSearch.textProperty().addListener((observable, oldValue, newValue) -> {
            filteredData.setPredicate(person -> {
                // If filter text is empty, display all persons.
                if (newValue == null || newValue.isEmpty()) {
                    return true;
                }

                // Compare first name and last name of every person with filter text.
                String lowerCaseFilter = newValue.toLowerCase();

                if (( person.getNombre()).toLowerCase().contains(lowerCaseFilter)) {
                    return true; // Filter matches first name.
                } else if (person.getID().toLowerCase().contains(lowerCaseFilter)) {
                    return true; // Filter matches last name.
                }
                return false; // Does not match.
            });
        });
		SortedList<Materia> sortedData = new SortedList<>(filteredData);
		sortedData.comparatorProperty().bind((ObservableValue<? extends Comparator<? super Materia>>) materiaTable.comparatorProperty());		materiaTable.setItems(sortedData);

	}
	public  void buscarCarrera(){
		nomCarrera . setCellValueFactory ( cellData -> cellData . getValue ().NameProperty()); 
		codCarrera . setCellValueFactory ( cellData -> cellData . getValue (). IDProperty ());	
		FilteredList<Carrera> filteredData = new FilteredList<>(masterData2, p -> true);	
		materiaSearch.textProperty().addListener((observable, oldValue, newValue) -> {
            filteredData.setPredicate(person -> {
                // If filter text is empty, display all persons.
                if (newValue == null || newValue.isEmpty()) {
                    return true;
                }

                // Compare first name and last name of every person with filter text.
                String lowerCaseFilter = newValue.toLowerCase();

                if (( person.getNombrec()).toLowerCase().contains(lowerCaseFilter)) {
                    return true; // Filter matches first name.
                } else if (person.getID().toLowerCase().contains(lowerCaseFilter)) {
                    return true; // Filter matches last name.
                }
                return false; // Does not match.
            });
        });
		SortedList<Carrera> sortedData = new SortedList<>(filteredData);
		sortedData.comparatorProperty().bind((ObservableValue<? extends Comparator<? super Carrera>>) materiaTable.comparatorProperty());
		carreraTable.setItems(sortedData);

	}
		
	@FXML
	public void initialize(URL url, ResourceBundle rb) {
			
		carreraTable.setItems(Main.getCarreraData());
		nomCarrera.setCellValueFactory(cellData -> cellData.getValue().getNombre());
		codCarrera.setCellValueFactory(cellData -> cellData.getValue().getCodigo());
		
		materiaTable.setItems(Main.getMateriaData());
		nomMateria.setCellValueFactory(cellData -> cellData.getValue().getNom());
		codMateria.setCellValueFactory(cellData -> cellData.getValue().getCodigo());
		
		mallaTable.setItems(Main.getMallaData());
		carrera.setCellValueFactory(cellData -> cellData.getValue().getCarrera());
		version.setCellValueFactory(cellData -> cellData.getValue().getVersion());
		buscarCarrera();
		buscarMateria();
		showMateriaDetails(null);
		showCarreraDetails(null);
		showMallaDetails(null);
		 
		materiaTable.getSelectionModel().selectedItemProperty().addListener(
	            (observable, oldValue, newValue) -> showMateriaDetails(newValue));
		carreraTable.getSelectionModel().selectedItemProperty().addListener(
	            (observable, oldValue, newValue) -> showCarreraDetails(newValue));
		mallaTable.getSelectionModel().selectedItemProperty().addListener(
			        (observable, oldValue, newValue) -> showMallaDetails(newValue));

	}
}
