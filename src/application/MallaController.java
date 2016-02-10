package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ChoiceBox;
import javafx.stage.Stage;
import modulos.Materia;
import modulos.Plan;
import utils.ConnectedComboBox;

public class MallaController extends Main implements Initializable{
	
	@FXML
	private ChoiceBox<String> mat11;
	@FXML
	private ChoiceBox<?> pre11;
	@FXML
	private ChoiceBox<?> pres11;
	@FXML
	private ChoiceBox<?> cor11;
	@FXML
	private ChoiceBox<String> mat12;
	@FXML
	private ChoiceBox<?> pre12;
	@FXML
	private ChoiceBox<?> pres12;
	@FXML
	private ChoiceBox<?> cor12;
	@FXML
	private ChoiceBox<String> mat13;
	@FXML
	private ChoiceBox<?> pre13;
	@FXML
	private ChoiceBox<?> pres13;
	@FXML
	private ChoiceBox<?> cor13;
	@FXML
	private ChoiceBox<String> mat14;
	@FXML
	private ChoiceBox<?> pre14;
	@FXML
	private ChoiceBox<?> pres14;
	@FXML
	private ChoiceBox<?> cor14;
	@FXML
	private ChoiceBox<String> mat15;
	@FXML
	private ChoiceBox<?> pre15;
	@FXML
	private ChoiceBox<?> pres15;
	@FXML
	private ChoiceBox<?> cor15;
	@FXML
	private ChoiceBox<String> mat16;
	@FXML
	private ChoiceBox<?> pre16;
	@FXML
	private ChoiceBox<?> pres16;
	@FXML
	private ChoiceBox<?> cor16;
	@FXML
	private ChoiceBox<String> mat21;
	@FXML
	private ChoiceBox<?> pre21;
	@FXML
	private ChoiceBox<?> pres21;
	@FXML
	private ChoiceBox<?> cor21;
	@FXML
	private ChoiceBox<String> mat22;
	@FXML
	private ChoiceBox<?> pre22;
	@FXML
	private ChoiceBox<?> pres22;
	@FXML
	private ChoiceBox<?> cor22;
	@FXML
	private ChoiceBox<String> mat23;
	@FXML
	private ChoiceBox<?> pre23;
	@FXML
	private ChoiceBox<?> pres23;
	@FXML
	private ChoiceBox<?> cor23;
	@FXML
	private ChoiceBox<String> mat24;
	@FXML
	private ChoiceBox<?> pre24;
	@FXML
	private ChoiceBox<?> pres24;
	@FXML
	private ChoiceBox<?> cor24;
	@FXML
	private ChoiceBox<String> mat25;
	@FXML
	private ChoiceBox<?> pre25;
	@FXML
	private ChoiceBox<?> pres25;
	@FXML
	private ChoiceBox<?> cor25;
	@FXML
	private ChoiceBox<String> mat26;
	@FXML
	private ChoiceBox<?> pre26;
	@FXML
	private ChoiceBox<?> pres26;
	@FXML
	private ChoiceBox<?> cor26;
	@FXML
	private ChoiceBox<String> mat31;
	@FXML
	private ChoiceBox<?> pre31;
	@FXML
	private ChoiceBox<?> pres31;
	@FXML
	private ChoiceBox<?> cor31;
	@FXML
	private ChoiceBox<String> mat32;
	@FXML
	private ChoiceBox<?> pre32;
	@FXML
	private ChoiceBox<?> pres32;
	@FXML
	private ChoiceBox<?> cor32;
	@FXML
	private ChoiceBox<String> mat33;
	@FXML
	private ChoiceBox<?> pre33;
	@FXML
	private ChoiceBox<?> pres33;
	@FXML
	private ChoiceBox<?> cor33;
	@FXML
	private ChoiceBox<String> mat34;
	@FXML
	private ChoiceBox<?> pre34;
	@FXML
	private ChoiceBox<?> pres34;
	@FXML
	private ChoiceBox<?> cor34;
	@FXML
	private ChoiceBox<String> mat35;
	@FXML
	private ChoiceBox<?> pre35;
	@FXML
	private ChoiceBox<?> pres35;
	@FXML
	private ChoiceBox<?> cor35;
	@FXML
	private ChoiceBox<String> mat36;
	@FXML
	private ChoiceBox<?> pre36;
	@FXML
	private ChoiceBox<?> pres36;
	@FXML
	private ChoiceBox<?> cor36;
	@FXML
	private ChoiceBox<String> mat41;
	@FXML
	private ChoiceBox<?> pre41;
	@FXML
	private ChoiceBox<?> pres41;
	@FXML
	private ChoiceBox<?> cor41;
	@FXML
	private ChoiceBox<String> mat42;
	@FXML
	private ChoiceBox<?> pre42;
	@FXML
	private ChoiceBox<?> pres42;
	@FXML
	private ChoiceBox<?> cor42;
	@FXML
	private ChoiceBox<String> mat43;
	@FXML
	private ChoiceBox<?> pre43;
	@FXML
	private ChoiceBox<?> pres43;
	@FXML
	private ChoiceBox<?> cor43;
	@FXML
	private ChoiceBox<String> mat44;
	@FXML
	private ChoiceBox<?> pre44;
	@FXML
	private ChoiceBox<?> pres44;
	@FXML
	private ChoiceBox<?> cor44;
	@FXML
	private ChoiceBox<String> mat45;
	@FXML
	private ChoiceBox<?> pre45;
	@FXML
	private ChoiceBox<?> pres45;
	@FXML
	private ChoiceBox<?> cor45;
	@FXML
	private ChoiceBox<String> mat46;
	@FXML
	private ChoiceBox<?> pre46;
	@FXML
	private ChoiceBox<?> pres46;
	@FXML
	private ChoiceBox<?> cor46;
	@FXML
	private ChoiceBox<String> mat51;
	@FXML
	private ChoiceBox<?> pre51;
	@FXML
	private ChoiceBox<?> pres51;
	@FXML
	private ChoiceBox<?> cor51;
	@FXML
	private ChoiceBox<String> mat52;
	@FXML
	private ChoiceBox<?> pre52;
	@FXML
	private ChoiceBox<?> pres52;
	@FXML
	private ChoiceBox<?> cor52;
	@FXML
	private ChoiceBox<String> mat53;
	@FXML
	private ChoiceBox<?> pre53;
	@FXML
	private ChoiceBox<?> pres53;
	@FXML
	private ChoiceBox<?> cor53;
	@FXML
	private ChoiceBox<String> mat54;
	@FXML
	private ChoiceBox<?> pre54;
	@FXML
	private ChoiceBox<?> pres54;
	@FXML
	private ChoiceBox<?> cor54;
	@FXML
	private ChoiceBox<String> mat55;
	@FXML
	private ChoiceBox<?> pre55;
	@FXML
	private ChoiceBox<?> pres55;
	@FXML
	private ChoiceBox<?> cor55;
	@FXML
	private ChoiceBox<String> mat56;
	@FXML
	private ChoiceBox<?> pre56;
	@FXML
	private ChoiceBox<?> pres56;
	@FXML
	private ChoiceBox<?> cor56;
	@FXML
	private ChoiceBox<String> mat61;
	@FXML
	private ChoiceBox<?> pre61;
	@FXML
	private ChoiceBox<?> pres61;
	@FXML
	private ChoiceBox<?> cor61;
	@FXML
	private ChoiceBox<String> mat62;
	@FXML
	private ChoiceBox<?> pre62;
	@FXML
	private ChoiceBox<?> pres62;
	@FXML
	private ChoiceBox<?> cor62;
	@FXML
	private ChoiceBox<String> mat63;
	@FXML
	private ChoiceBox<?> pre63;
	@FXML
	private ChoiceBox<?> pres63;
	@FXML
	private ChoiceBox<?> cor63;
	@FXML
	private ChoiceBox<String> mat64;
	@FXML
	private ChoiceBox<?> pre64;
	@FXML
	private ChoiceBox<?> pres64;
	@FXML
	private ChoiceBox<?> cor64;
	@FXML
	private ChoiceBox<String> mat65;
	@FXML
	private ChoiceBox<?> pre65;
	@FXML
	private ChoiceBox<?> pres65;
	@FXML
	private ChoiceBox<?> cor65;
	@FXML
	private ChoiceBox<String> mat66;
	@FXML
	private ChoiceBox<?> pre66;
	@FXML
	private ChoiceBox<?> pres66;
	@FXML
	private ChoiceBox<?> cor66;
	@FXML
	private ChoiceBox<String> mat71;
	@FXML
	private ChoiceBox<?> pre71;
	@FXML
	private ChoiceBox<?> pres71;
	@FXML
	private ChoiceBox<?> cor71;
	@FXML
	private ChoiceBox<String> mat72;
	@FXML
	private ChoiceBox<?> pre72;
	@FXML
	private ChoiceBox<?> pres72;
	@FXML
	private ChoiceBox<?> cor72;
	@FXML
	private ChoiceBox<String> mat73;
	@FXML
	private ChoiceBox<?> pre73;
	@FXML
	private ChoiceBox<?> pres73;
	@FXML
	private ChoiceBox<?> cor73;
	@FXML
	private ChoiceBox<String> mat74;
	@FXML
	private ChoiceBox<?> pre74;
	@FXML
	private ChoiceBox<?> pres74;
	@FXML
	private ChoiceBox<?> cor74;
	@FXML
	private ChoiceBox<String> mat75;
	@FXML
	private ChoiceBox<?> pre75;
	@FXML
	private ChoiceBox<?> pres75;
	@FXML
	private ChoiceBox<?> cor75;
	@FXML
	private ChoiceBox<String> mat76;
	@FXML
	private ChoiceBox<?> pre76;
	@FXML
	private ChoiceBox<?> pres76;
	@FXML
	private ChoiceBox<?> cor76;
	@FXML
	private ChoiceBox<String> mat81;
	@FXML
	private ChoiceBox<?> pre81;
	@FXML
	private ChoiceBox<?> pres81;
	@FXML
	private ChoiceBox<?> cor81;
	@FXML
	private ChoiceBox<String> mat82;
	@FXML
	private ChoiceBox<?> pre82;
	@FXML
	private ChoiceBox<?> pres82;
	@FXML
	private ChoiceBox<?> cor82;
	@FXML
	private ChoiceBox<String> mat83;
	@FXML
	private ChoiceBox<?> pre83;
	@FXML
	private ChoiceBox<?> pres83;
	@FXML
	private ChoiceBox<?> cor83;
	@FXML
	private ChoiceBox<String> mat84;
	@FXML
	private ChoiceBox<?> pre84;
	@FXML
	private ChoiceBox<?> pres84;
	@FXML
	private ChoiceBox<?> cor84;
	@FXML
	private ChoiceBox<String> mat85;
	@FXML
	private ChoiceBox<?> pre85;
	@FXML
	private ChoiceBox<?> pres85;
	@FXML
	private ChoiceBox<?> cor85;
	@FXML
	private ChoiceBox<String> mat86;
	@FXML
	private ChoiceBox<?> pre86;
	@FXML
	private ChoiceBox<?> pres86;
	@FXML
	private ChoiceBox<?> cor86;
	@FXML
	private ChoiceBox<String> mat91;
	@FXML
	private ChoiceBox<?> pre91;
	@FXML
	private ChoiceBox<?> pres91;
	@FXML
	private ChoiceBox<?> cor91;
	@FXML
	private ChoiceBox<String> mat92;
	@FXML
	private ChoiceBox<?> pre92;
	@FXML
	private ChoiceBox<?> pres92;
	@FXML
	private ChoiceBox<?> cor92;
	@FXML
	private ChoiceBox<String> mat93;
	@FXML
	private ChoiceBox<?> pre93;
	@FXML
	private ChoiceBox<?> pres93;
	@FXML
	private ChoiceBox<?> cor93;
	@FXML
	private ChoiceBox<String> mat94;
	@FXML
	private ChoiceBox<?> pre94;
	@FXML
	private ChoiceBox<?> pres94;
	@FXML
	private ChoiceBox<?> cor94;
	@FXML
	private ChoiceBox<String> mat95;
	@FXML
	private ChoiceBox<?> pre95;
	@FXML
	private ChoiceBox<?> pres95;
	@FXML
	private ChoiceBox<?> cor95;
	@FXML
	private ChoiceBox<String> mat96;
	@FXML
	private ChoiceBox<?> pre96;
	@FXML
	private ChoiceBox<?> pres96;
	@FXML
	private ChoiceBox<?> cor96;



	
	private Stage dialogStage;
    private boolean okClicked = false;
    private ObservableList<String> choices = FXCollections.observableArrayList();
    
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		
	}
	
	public void setDialogStage(Stage dialogStage) {
        this.dialogStage = dialogStage;
    }
	
	public void setPlan(ObservableList<Plan> planData, ObservableList<Materia> materiaData){
		
		for(Materia mat: materiaData){
			choices.add(mat.getCodigo().getValue()+" "+mat.getNom().getValue());
		}
		if (planData.isEmpty()){
			
			ConnectedComboBox<String> connectedComboBox = new ConnectedComboBox<>(choices);
			connectedComboBox.addComboBox(mat11);
			connectedComboBox.addComboBox(mat12);
			connectedComboBox.addComboBox(mat13);
			connectedComboBox.addComboBox(mat14);
			connectedComboBox.addComboBox(mat15);
			connectedComboBox.addComboBox(mat16);
			connectedComboBox.addComboBox(mat21);
			connectedComboBox.addComboBox(mat22);
			connectedComboBox.addComboBox(mat23);
			connectedComboBox.addComboBox(mat24);
			connectedComboBox.addComboBox(mat25);
			connectedComboBox.addComboBox(mat26);
			connectedComboBox.addComboBox(mat31);
			connectedComboBox.addComboBox(mat32);
			connectedComboBox.addComboBox(mat33);
			connectedComboBox.addComboBox(mat34);
			connectedComboBox.addComboBox(mat35);
			connectedComboBox.addComboBox(mat36);
			connectedComboBox.addComboBox(mat41);
			connectedComboBox.addComboBox(mat42);
			connectedComboBox.addComboBox(mat43);
			connectedComboBox.addComboBox(mat44);
			connectedComboBox.addComboBox(mat45);
			connectedComboBox.addComboBox(mat46);
			connectedComboBox.addComboBox(mat51);
			connectedComboBox.addComboBox(mat52);
			connectedComboBox.addComboBox(mat53);
			connectedComboBox.addComboBox(mat54);
			connectedComboBox.addComboBox(mat55);
			connectedComboBox.addComboBox(mat56);
			connectedComboBox.addComboBox(mat61);
			connectedComboBox.addComboBox(mat62);
			connectedComboBox.addComboBox(mat63);
			connectedComboBox.addComboBox(mat64);
			connectedComboBox.addComboBox(mat65);
			connectedComboBox.addComboBox(mat66);
			connectedComboBox.addComboBox(mat71);
			connectedComboBox.addComboBox(mat72);
			connectedComboBox.addComboBox(mat73);
			connectedComboBox.addComboBox(mat74);
			connectedComboBox.addComboBox(mat75);
			connectedComboBox.addComboBox(mat76);
			connectedComboBox.addComboBox(mat81);
			connectedComboBox.addComboBox(mat82);
			connectedComboBox.addComboBox(mat83);
			connectedComboBox.addComboBox(mat84);
			connectedComboBox.addComboBox(mat85);
			connectedComboBox.addComboBox(mat86);
			connectedComboBox.addComboBox(mat91);
			connectedComboBox.addComboBox(mat92);
			connectedComboBox.addComboBox(mat93);
			connectedComboBox.addComboBox(mat94);
			connectedComboBox.addComboBox(mat95);
			connectedComboBox.addComboBox(mat96);

		}
		
	}
	public boolean isOkClicked() {
        return okClicked;
    }
	
}
