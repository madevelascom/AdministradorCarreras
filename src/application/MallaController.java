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
import utils.DependableComboBox;
import utils.DisconnectedComboBox;

public class MallaController extends Main implements Initializable{
	
	@FXML
	private ChoiceBox<String> mat11;
	@FXML
	private ChoiceBox<String> pre11;
	@FXML
	private ChoiceBox<String> pres11;
	@FXML
	private ChoiceBox<String> cor11;
	@FXML
	private ChoiceBox<String> mat12;
	@FXML
	private ChoiceBox<String> pre12;
	@FXML
	private ChoiceBox<String> pres12;
	@FXML
	private ChoiceBox<String> cor12;
	@FXML
	private ChoiceBox<String> mat13;
	@FXML
	private ChoiceBox<String> pre13;
	@FXML
	private ChoiceBox<String> pres13;
	@FXML
	private ChoiceBox<String> cor13;
	@FXML
	private ChoiceBox<String> mat14;
	@FXML
	private ChoiceBox<String> pre14;
	@FXML
	private ChoiceBox<String> pres14;
	@FXML
	private ChoiceBox<String> cor14;
	@FXML
	private ChoiceBox<String> mat15;
	@FXML
	private ChoiceBox<String> pre15;
	@FXML
	private ChoiceBox<String> pres15;
	@FXML
	private ChoiceBox<String> cor15;
	@FXML
	private ChoiceBox<String> mat16;
	@FXML
	private ChoiceBox<String> pre16;
	@FXML
	private ChoiceBox<String> pres16;
	@FXML
	private ChoiceBox<String> cor16;
	@FXML
	private ChoiceBox<String> mat21;
	@FXML
	private ChoiceBox<String> pre21;
	@FXML
	private ChoiceBox<String> pres21;
	@FXML
	private ChoiceBox<String> cor21;
	@FXML
	private ChoiceBox<String> mat22;
	@FXML
	private ChoiceBox<String> pre22;
	@FXML
	private ChoiceBox<String> pres22;
	@FXML
	private ChoiceBox<String> cor22;
	@FXML
	private ChoiceBox<String> mat23;
	@FXML
	private ChoiceBox<String> pre23;
	@FXML
	private ChoiceBox<String> pres23;
	@FXML
	private ChoiceBox<String> cor23;
	@FXML
	private ChoiceBox<String> mat24;
	@FXML
	private ChoiceBox<String> pre24;
	@FXML
	private ChoiceBox<String> pres24;
	@FXML
	private ChoiceBox<String> cor24;
	@FXML
	private ChoiceBox<String> mat25;
	@FXML
	private ChoiceBox<String> pre25;
	@FXML
	private ChoiceBox<String> pres25;
	@FXML
	private ChoiceBox<String> cor25;
	@FXML
	private ChoiceBox<String> mat26;
	@FXML
	private ChoiceBox<String> pre26;
	@FXML
	private ChoiceBox<String> pres26;
	@FXML
	private ChoiceBox<String> cor26;
	@FXML
	private ChoiceBox<String> mat31;
	@FXML
	private ChoiceBox<String> pre31;
	@FXML
	private ChoiceBox<String> pres31;
	@FXML
	private ChoiceBox<String> cor31;
	@FXML
	private ChoiceBox<String> mat32;
	@FXML
	private ChoiceBox<String> pre32;
	@FXML
	private ChoiceBox<String> pres32;
	@FXML
	private ChoiceBox<String> cor32;
	@FXML
	private ChoiceBox<String> mat33;
	@FXML
	private ChoiceBox<String> pre33;
	@FXML
	private ChoiceBox<String> pres33;
	@FXML
	private ChoiceBox<String> cor33;
	@FXML
	private ChoiceBox<String> mat34;
	@FXML
	private ChoiceBox<String> pre34;
	@FXML
	private ChoiceBox<String> pres34;
	@FXML
	private ChoiceBox<String> cor34;
	@FXML
	private ChoiceBox<String> mat35;
	@FXML
	private ChoiceBox<String> pre35;
	@FXML
	private ChoiceBox<String> pres35;
	@FXML
	private ChoiceBox<String> cor35;
	@FXML
	private ChoiceBox<String> mat36;
	@FXML
	private ChoiceBox<String> pre36;
	@FXML
	private ChoiceBox<String> pres36;
	@FXML
	private ChoiceBox<String> cor36;
	@FXML
	private ChoiceBox<String> mat41;
	@FXML
	private ChoiceBox<String> pre41;
	@FXML
	private ChoiceBox<String> pres41;
	@FXML
	private ChoiceBox<String> cor41;
	@FXML
	private ChoiceBox<String> mat42;
	@FXML
	private ChoiceBox<String> pre42;
	@FXML
	private ChoiceBox<String> pres42;
	@FXML
	private ChoiceBox<String> cor42;
	@FXML
	private ChoiceBox<String> mat43;
	@FXML
	private ChoiceBox<String> pre43;
	@FXML
	private ChoiceBox<String> pres43;
	@FXML
	private ChoiceBox<String> cor43;
	@FXML
	private ChoiceBox<String> mat44;
	@FXML
	private ChoiceBox<String> pre44;
	@FXML
	private ChoiceBox<String> pres44;
	@FXML
	private ChoiceBox<String> cor44;
	@FXML
	private ChoiceBox<String> mat45;
	@FXML
	private ChoiceBox<String> pre45;
	@FXML
	private ChoiceBox<String> pres45;
	@FXML
	private ChoiceBox<String> cor45;
	@FXML
	private ChoiceBox<String> mat46;
	@FXML
	private ChoiceBox<String> pre46;
	@FXML
	private ChoiceBox<String> pres46;
	@FXML
	private ChoiceBox<String> cor46;
	@FXML
	private ChoiceBox<String> mat51;
	@FXML
	private ChoiceBox<String> pre51;
	@FXML
	private ChoiceBox<String> pres51;
	@FXML
	private ChoiceBox<String> cor51;
	@FXML
	private ChoiceBox<String> mat52;
	@FXML
	private ChoiceBox<String> pre52;
	@FXML
	private ChoiceBox<String> pres52;
	@FXML
	private ChoiceBox<String> cor52;
	@FXML
	private ChoiceBox<String> mat53;
	@FXML
	private ChoiceBox<String> pre53;
	@FXML
	private ChoiceBox<String> pres53;
	@FXML
	private ChoiceBox<String> cor53;
	@FXML
	private ChoiceBox<String> mat54;
	@FXML
	private ChoiceBox<String> pre54;
	@FXML
	private ChoiceBox<String> pres54;
	@FXML
	private ChoiceBox<String> cor54;
	@FXML
	private ChoiceBox<String> mat55;
	@FXML
	private ChoiceBox<String> pre55;
	@FXML
	private ChoiceBox<String> pres55;
	@FXML
	private ChoiceBox<String> cor55;
	@FXML
	private ChoiceBox<String> mat56;
	@FXML
	private ChoiceBox<String> pre56;
	@FXML
	private ChoiceBox<String> pres56;
	@FXML
	private ChoiceBox<String> cor56;
	@FXML
	private ChoiceBox<String> mat61;
	@FXML
	private ChoiceBox<String> pre61;
	@FXML
	private ChoiceBox<String> pres61;
	@FXML
	private ChoiceBox<String> cor61;
	@FXML
	private ChoiceBox<String> mat62;
	@FXML
	private ChoiceBox<String> pre62;
	@FXML
	private ChoiceBox<String> pres62;
	@FXML
	private ChoiceBox<String> cor62;
	@FXML
	private ChoiceBox<String> mat63;
	@FXML
	private ChoiceBox<String> pre63;
	@FXML
	private ChoiceBox<String> pres63;
	@FXML
	private ChoiceBox<String> cor63;
	@FXML
	private ChoiceBox<String> mat64;
	@FXML
	private ChoiceBox<String> pre64;
	@FXML
	private ChoiceBox<String> pres64;
	@FXML
	private ChoiceBox<String> cor64;
	@FXML
	private ChoiceBox<String> mat65;
	@FXML
	private ChoiceBox<String> pre65;
	@FXML
	private ChoiceBox<String> pres65;
	@FXML
	private ChoiceBox<String> cor65;
	@FXML
	private ChoiceBox<String> mat66;
	@FXML
	private ChoiceBox<String> pre66;
	@FXML
	private ChoiceBox<String> pres66;
	@FXML
	private ChoiceBox<String> cor66;
	@FXML
	private ChoiceBox<String> mat71;
	@FXML
	private ChoiceBox<String> pre71;
	@FXML
	private ChoiceBox<String> pres71;
	@FXML
	private ChoiceBox<String> cor71;
	@FXML
	private ChoiceBox<String> mat72;
	@FXML
	private ChoiceBox<String> pre72;
	@FXML
	private ChoiceBox<String> pres72;
	@FXML
	private ChoiceBox<String> cor72;
	@FXML
	private ChoiceBox<String> mat73;
	@FXML
	private ChoiceBox<String> pre73;
	@FXML
	private ChoiceBox<String> pres73;
	@FXML
	private ChoiceBox<String> cor73;
	@FXML
	private ChoiceBox<String> mat74;
	@FXML
	private ChoiceBox<String> pre74;
	@FXML
	private ChoiceBox<String> pres74;
	@FXML
	private ChoiceBox<String> cor74;
	@FXML
	private ChoiceBox<String> mat75;
	@FXML
	private ChoiceBox<String> pre75;
	@FXML
	private ChoiceBox<String> pres75;
	@FXML
	private ChoiceBox<String> cor75;
	@FXML
	private ChoiceBox<String> mat76;
	@FXML
	private ChoiceBox<String> pre76;
	@FXML
	private ChoiceBox<String> pres76;
	@FXML
	private ChoiceBox<String> cor76;
	@FXML
	private ChoiceBox<String> mat81;
	@FXML
	private ChoiceBox<String> pre81;
	@FXML
	private ChoiceBox<String> pres81;
	@FXML
	private ChoiceBox<String> cor81;
	@FXML
	private ChoiceBox<String> mat82;
	@FXML
	private ChoiceBox<String> pre82;
	@FXML
	private ChoiceBox<String> pres82;
	@FXML
	private ChoiceBox<String> cor82;
	@FXML
	private ChoiceBox<String> mat83;
	@FXML
	private ChoiceBox<String> pre83;
	@FXML
	private ChoiceBox<String> pres83;
	@FXML
	private ChoiceBox<String> cor83;
	@FXML
	private ChoiceBox<String> mat84;
	@FXML
	private ChoiceBox<String> pre84;
	@FXML
	private ChoiceBox<String> pres84;
	@FXML
	private ChoiceBox<String> cor84;
	@FXML
	private ChoiceBox<String> mat85;
	@FXML
	private ChoiceBox<String> pre85;
	@FXML
	private ChoiceBox<String> pres85;
	@FXML
	private ChoiceBox<String> cor85;
	@FXML
	private ChoiceBox<String> mat86;
	@FXML
	private ChoiceBox<String> pre86;
	@FXML
	private ChoiceBox<String> pres86;
	@FXML
	private ChoiceBox<String> cor86;
	@FXML
	private ChoiceBox<String> mat91;
	@FXML
	private ChoiceBox<String> pre91;
	@FXML
	private ChoiceBox<String> pres91;
	@FXML
	private ChoiceBox<String> cor91;
	@FXML
	private ChoiceBox<String> mat92;
	@FXML
	private ChoiceBox<String> pre92;
	@FXML
	private ChoiceBox<String> pres92;
	@FXML
	private ChoiceBox<String> cor92;
	@FXML
	private ChoiceBox<String> mat93;
	@FXML
	private ChoiceBox<String> pre93;
	@FXML
	private ChoiceBox<String> pres93;
	@FXML
	private ChoiceBox<String> cor93;
	@FXML
	private ChoiceBox<String> mat94;
	@FXML
	private ChoiceBox<String> pre94;
	@FXML
	private ChoiceBox<String> pres94;
	@FXML
	private ChoiceBox<String> cor94;
	@FXML
	private ChoiceBox<String> mat95;
	@FXML
	private ChoiceBox<String> pre95;
	@FXML
	private ChoiceBox<String> pres95;
	@FXML
	private ChoiceBox<String> cor95;
	@FXML
	private ChoiceBox<String> mat96;
	@FXML
	private ChoiceBox<String> pre96;
	@FXML
	private ChoiceBox<String> pres96;
	@FXML
	private ChoiceBox<String> cor96;



	
	private Stage dialogStage;
    private boolean okClicked = false;
    private ObservableList<Plan> planData = FXCollections.observableArrayList();;
    private ObservableList<String> choices = FXCollections.observableArrayList();
    
    public void editList(ObservableList<String> ls, Object oldValue, Object newValue){
    	if(oldValue == null){
    		ls.add((String) newValue);
    	}else{
    		ls.remove(oldValue);
    		ls.add((String) newValue);
    	}
    }
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		

	}
	
	public void setDialogStage(Stage dialogStage) {
        this.dialogStage = dialogStage;
    }
	
	public void setPlan(ObservableList<Plan> planData, ObservableList<Materia> materiaData){
		
		this.planData = planData;
		
		for(Materia mat: materiaData){
			choices.add(mat.getCodigo().getValue()+"-"+mat.getNom().getValue());
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
			

			DependableComboBox<String> ccbCor1 = new DependableComboBox<>();
			ccbCor1.addDependableComboBox(cor11);
			ccbCor1.addDependableComboBox(cor12);
			ccbCor1.addDependableComboBox(cor13);
			ccbCor1.addDependableComboBox(cor14);
			ccbCor1.addDependableComboBox(cor15);
			ccbCor1.addDependableComboBox(cor16);
			ccbCor1.addObservableComboBox(mat11);
			ccbCor1.addObservableComboBox(mat12);
			ccbCor1.addObservableComboBox(mat13);
			ccbCor1.addObservableComboBox(mat14);
			ccbCor1.addObservableComboBox(mat15);
			ccbCor1.addObservableComboBox(mat16);
			
			DependableComboBox<String> ccbCor2 = new DependableComboBox<>();
			ccbCor2.addDependableComboBox(cor21);
			ccbCor2.addDependableComboBox(cor22);
			ccbCor2.addDependableComboBox(cor23);
			ccbCor2.addDependableComboBox(cor24);
			ccbCor2.addDependableComboBox(cor25);
			ccbCor2.addDependableComboBox(cor26);			
			ccbCor2.addObservableComboBox(mat21);
			ccbCor2.addObservableComboBox(mat22);
			ccbCor2.addObservableComboBox(mat23);
			ccbCor2.addObservableComboBox(mat24);
			ccbCor2.addObservableComboBox(mat25);
			ccbCor2.addObservableComboBox(mat26);
			
			DependableComboBox<String> ccbCor3 = new DependableComboBox<>();
			ccbCor3.addDependableComboBox(cor31);
			ccbCor3.addDependableComboBox(cor32);
			ccbCor3.addDependableComboBox(cor33);
			ccbCor3.addDependableComboBox(cor34);
			ccbCor3.addDependableComboBox(cor35);
			ccbCor3.addDependableComboBox(cor36);
			ccbCor3.addObservableComboBox(mat31);
			ccbCor3.addObservableComboBox(mat32);
			ccbCor3.addObservableComboBox(mat33);
			ccbCor3.addObservableComboBox(mat34);
			ccbCor3.addObservableComboBox(mat35);
			ccbCor3.addObservableComboBox(mat36);
			
			DependableComboBox<String> ccbCor4= new DependableComboBox<>();
			ccbCor4.addDependableComboBox(cor41);
			ccbCor4.addDependableComboBox(cor42);
			ccbCor4.addDependableComboBox(cor43);
			ccbCor4.addDependableComboBox(cor44);
			ccbCor4.addDependableComboBox(cor45);
			ccbCor4.addDependableComboBox(cor46);
			ccbCor4.addObservableComboBox(mat41);
			ccbCor4.addObservableComboBox(mat42);
			ccbCor4.addObservableComboBox(mat43);
			ccbCor4.addObservableComboBox(mat44);
			ccbCor4.addObservableComboBox(mat45);
			ccbCor4.addObservableComboBox(mat46);
			
			DependableComboBox<String> ccbCor5 = new DependableComboBox<>();
			ccbCor5.addDependableComboBox(cor51);
			ccbCor5.addDependableComboBox(cor52);
			ccbCor5.addDependableComboBox(cor53);
			ccbCor5.addDependableComboBox(cor54);
			ccbCor5.addDependableComboBox(cor55);
			ccbCor5.addDependableComboBox(cor56);
			ccbCor5.addObservableComboBox(mat51);
			ccbCor5.addObservableComboBox(mat52);
			ccbCor5.addObservableComboBox(mat53);
			ccbCor5.addObservableComboBox(mat54);
			ccbCor5.addObservableComboBox(mat55);
			ccbCor5.addObservableComboBox(mat56);
			
			DependableComboBox<String> ccbCor6 = new DependableComboBox<>();
			ccbCor6.addDependableComboBox(cor61);
			ccbCor6.addDependableComboBox(cor62);
			ccbCor6.addDependableComboBox(cor63);
			ccbCor6.addDependableComboBox(cor64);
			ccbCor6.addDependableComboBox(cor65);
			ccbCor6.addDependableComboBox(cor66);
			ccbCor6.addObservableComboBox(mat61);
			ccbCor6.addObservableComboBox(mat62);
			ccbCor6.addObservableComboBox(mat63);
			ccbCor6.addObservableComboBox(mat64);
			ccbCor6.addObservableComboBox(mat65);
			ccbCor6.addObservableComboBox(mat66);
			
			DependableComboBox<String> ccbCor7 = new DependableComboBox<>();
			ccbCor7.addDependableComboBox(cor71);
			ccbCor7.addDependableComboBox(cor72);
			ccbCor7.addDependableComboBox(cor73);
			ccbCor7.addDependableComboBox(cor74);
			ccbCor7.addDependableComboBox(cor75);
			ccbCor7.addDependableComboBox(cor76);
			ccbCor7.addObservableComboBox(mat71);
			ccbCor7.addObservableComboBox(mat72);
			ccbCor7.addObservableComboBox(mat73);
			ccbCor7.addObservableComboBox(mat74);
			ccbCor7.addObservableComboBox(mat75);
			ccbCor7.addObservableComboBox(mat76);
			
			DependableComboBox<String> ccbCor8 = new DependableComboBox<>();
			ccbCor8.addDependableComboBox(cor81);
			ccbCor8.addDependableComboBox(cor82);
			ccbCor8.addDependableComboBox(cor83);
			ccbCor8.addDependableComboBox(cor84);
			ccbCor8.addDependableComboBox(cor85);
			ccbCor8.addDependableComboBox(cor86);
			ccbCor8.addObservableComboBox(mat81);
			ccbCor8.addObservableComboBox(mat82);
			ccbCor8.addObservableComboBox(mat83);
			ccbCor8.addObservableComboBox(mat84);
			ccbCor8.addObservableComboBox(mat85);
			ccbCor8.addObservableComboBox(mat86);
			
			DependableComboBox<String> ccbCor9 = new DependableComboBox<>();
			ccbCor9.addDependableComboBox(cor91);
			ccbCor9.addDependableComboBox(cor92);
			ccbCor9.addDependableComboBox(cor93);
			ccbCor9.addDependableComboBox(cor94);
			ccbCor9.addDependableComboBox(cor95);
			ccbCor9.addDependableComboBox(cor96);
			ccbCor9.addObservableComboBox(mat91);
			ccbCor9.addObservableComboBox(mat92);
			ccbCor9.addObservableComboBox(mat93);
			ccbCor9.addObservableComboBox(mat94);
			ccbCor9.addObservableComboBox(mat95);
			ccbCor9.addObservableComboBox(mat96);
			

			DisconnectedComboBox<String> dcbCor2 = new DisconnectedComboBox<>();
			dcbCor2.addDisconnectedComboBox(pre21);
			dcbCor2.addIndependentComboBox(mat11);
			dcbCor2.addDisconnectedComboBox(pre22);
			dcbCor2.addIndependentComboBox(mat12);
			dcbCor2.addDisconnectedComboBox(pre23);
			dcbCor2.addIndependentComboBox(mat13);
			dcbCor2.addDisconnectedComboBox(pre24);
			dcbCor2.addIndependentComboBox(mat14);
			dcbCor2.addDisconnectedComboBox(pre25);
			dcbCor2.addIndependentComboBox(mat15);
			dcbCor2.addDisconnectedComboBox(pre26);
			dcbCor2.addIndependentComboBox(mat16);

			DisconnectedComboBox<String> dcbCor3 = new DisconnectedComboBox<>();
			dcbCor3.addDisconnectedComboBox(pre31);
			dcbCor3.addIndependentComboBox(mat21);
			dcbCor3.addDisconnectedComboBox(pre32);
			dcbCor3.addIndependentComboBox(mat22);
			dcbCor3.addDisconnectedComboBox(pre33);
			dcbCor3.addIndependentComboBox(mat23);
			dcbCor3.addDisconnectedComboBox(pre34);
			dcbCor3.addIndependentComboBox(mat24);
			dcbCor3.addDisconnectedComboBox(pre35);
			dcbCor3.addIndependentComboBox(mat25);
			dcbCor3.addDisconnectedComboBox(pre36);
			dcbCor3.addIndependentComboBox(mat26);

			DisconnectedComboBox<String> dcbCor4 = new DisconnectedComboBox<>();
			dcbCor4.addDisconnectedComboBox(pre41);
			dcbCor4.addIndependentComboBox(mat31);
			dcbCor4.addDisconnectedComboBox(pre42);
			dcbCor4.addIndependentComboBox(mat32);
			dcbCor4.addDisconnectedComboBox(pre43);
			dcbCor4.addIndependentComboBox(mat33);
			dcbCor4.addDisconnectedComboBox(pre44);
			dcbCor4.addIndependentComboBox(mat34);
			dcbCor4.addDisconnectedComboBox(pre45);
			dcbCor4.addIndependentComboBox(mat35);
			dcbCor4.addDisconnectedComboBox(pre46);
			dcbCor4.addIndependentComboBox(mat36);

			DisconnectedComboBox<String> dcbCor5 = new DisconnectedComboBox<>();
			dcbCor5.addDisconnectedComboBox(pre51);
			dcbCor5.addIndependentComboBox(mat41);
			dcbCor5.addDisconnectedComboBox(pre52);
			dcbCor5.addIndependentComboBox(mat42);
			dcbCor5.addDisconnectedComboBox(pre53);
			dcbCor5.addIndependentComboBox(mat43);
			dcbCor5.addDisconnectedComboBox(pre54);
			dcbCor5.addIndependentComboBox(mat44);
			dcbCor5.addDisconnectedComboBox(pre55);
			dcbCor5.addIndependentComboBox(mat45);
			dcbCor5.addDisconnectedComboBox(pre56);
			dcbCor5.addIndependentComboBox(mat46);

			DisconnectedComboBox<String> dcbCor6 = new DisconnectedComboBox<>();
			dcbCor6.addDisconnectedComboBox(pre61);
			dcbCor6.addIndependentComboBox(mat51);
			dcbCor6.addDisconnectedComboBox(pre62);
			dcbCor6.addIndependentComboBox(mat52);
			dcbCor6.addDisconnectedComboBox(pre63);
			dcbCor6.addIndependentComboBox(mat53);
			dcbCor6.addDisconnectedComboBox(pre64);
			dcbCor6.addIndependentComboBox(mat54);
			dcbCor6.addDisconnectedComboBox(pre65);
			dcbCor6.addIndependentComboBox(mat55);
			dcbCor6.addDisconnectedComboBox(pre66);
			dcbCor6.addIndependentComboBox(mat56);

			DisconnectedComboBox<String> dcbCor7 = new DisconnectedComboBox<>();
			dcbCor7.addDisconnectedComboBox(pre71);
			dcbCor7.addIndependentComboBox(mat61);
			dcbCor7.addDisconnectedComboBox(pre72);
			dcbCor7.addIndependentComboBox(mat62);
			dcbCor7.addDisconnectedComboBox(pre73);
			dcbCor7.addIndependentComboBox(mat63);
			dcbCor7.addDisconnectedComboBox(pre74);
			dcbCor7.addIndependentComboBox(mat64);
			dcbCor7.addDisconnectedComboBox(pre75);
			dcbCor7.addIndependentComboBox(mat65);
			dcbCor7.addDisconnectedComboBox(pre76);
			dcbCor7.addIndependentComboBox(mat66);

			DisconnectedComboBox<String> dcbCor8 = new DisconnectedComboBox<>();
			dcbCor8.addDisconnectedComboBox(pre81);
			dcbCor8.addIndependentComboBox(mat71);
			dcbCor8.addDisconnectedComboBox(pre82);
			dcbCor8.addIndependentComboBox(mat72);
			dcbCor8.addDisconnectedComboBox(pre83);
			dcbCor8.addIndependentComboBox(mat73);
			dcbCor8.addDisconnectedComboBox(pre84);
			dcbCor8.addIndependentComboBox(mat74);
			dcbCor8.addDisconnectedComboBox(pre85);
			dcbCor8.addIndependentComboBox(mat75);
			dcbCor8.addDisconnectedComboBox(pre86);
			dcbCor8.addIndependentComboBox(mat76);

			DisconnectedComboBox<String> dcbCor9 = new DisconnectedComboBox<>();
			dcbCor9.addDisconnectedComboBox(pre91);
			dcbCor9.addIndependentComboBox(mat81);
			dcbCor9.addDisconnectedComboBox(pre92);
			dcbCor9.addIndependentComboBox(mat82);
			dcbCor9.addDisconnectedComboBox(pre93);
			dcbCor9.addIndependentComboBox(mat83);
			dcbCor9.addDisconnectedComboBox(pre94);
			dcbCor9.addIndependentComboBox(mat84);
			dcbCor9.addDisconnectedComboBox(pre95);
			dcbCor9.addIndependentComboBox(mat85);
			dcbCor9.addDisconnectedComboBox(pre96);
			dcbCor9.addIndependentComboBox(mat86);

		}
		
	}
	
	
	public boolean isOkClicked() {
        return okClicked;
    }
	
	@FXML
    private void handleOk() {
		
		
		Plan pl = new Plan();
		String qwe, asd, zxc;
		String [] code, req1, req2, coreq;
		

if(mat11.getSelectionModel().getSelectedItem()!=null){
	code = mat11.getSelectionModel().getSelectedItem().split("\\-");
	if (pre11.getSelectionModel().getSelectedItem()!=null){
		req1 = pre11.getSelectionModel().getSelectedItem().split("\\-");
		qwe = req1[0];
	}else{
		qwe = " ";
	}
	if (pres11.getSelectionModel().getSelectedItem()!=null){
		req2 = pres11.getSelectionModel().getSelectedItem().split("\\-");
		asd = req2[0];
	}else{
		asd = " ";
	}
	if (cor11.getSelectionModel().getSelectedItem()!=null){
		coreq = cor11.getSelectionModel().getSelectedItem().split("\\-");
		zxc = coreq[0];
	}else{
		zxc = " ";
	}
	pl = new Plan(code[0], code[1], qwe.concat(" "+asd),zxc, "1");
	planData.add(pl);
}
if(mat12.getSelectionModel().getSelectedItem()!=null){
	code = mat12.getSelectionModel().getSelectedItem().split("\\-");
	if (pre12.getSelectionModel().getSelectedItem()!=null){
		req1 = pre12.getSelectionModel().getSelectedItem().split("\\-");
		qwe = req1[0];
	}else{
		qwe = " ";
	}
	if (pres12.getSelectionModel().getSelectedItem()!=null){
		req2 = pres12.getSelectionModel().getSelectedItem().split("\\-");
		asd = req2[0];
	}else{
		asd = " ";
	}
	if (cor12.getSelectionModel().getSelectedItem()!=null){
		coreq = cor12.getSelectionModel().getSelectedItem().split("\\-");
		zxc = coreq[0];
	}else{
		zxc = " ";
	}
	pl = new Plan(code[0], code[1], qwe.concat(" "+asd),zxc, "1");
	planData.add(pl);
}
if(mat13.getSelectionModel().getSelectedItem()!=null){
	code = mat13.getSelectionModel().getSelectedItem().split("\\-");
	if (pre13.getSelectionModel().getSelectedItem()!=null){
		req1 = pre13.getSelectionModel().getSelectedItem().split("\\-");
		qwe = req1[0];
	}else{
		qwe = " ";
	}
	if (pres13.getSelectionModel().getSelectedItem()!=null){
		req2 = pres13.getSelectionModel().getSelectedItem().split("\\-");
		asd = req2[0];
	}else{
		asd = " ";
	}
	if (cor13.getSelectionModel().getSelectedItem()!=null){
		coreq = cor13.getSelectionModel().getSelectedItem().split("\\-");
		zxc = coreq[0];
	}else{
		zxc = " ";
	}
	pl = new Plan(code[0], code[1], qwe.concat(" "+asd),zxc, "1");
	planData.add(pl);
}
if(mat14.getSelectionModel().getSelectedItem()!=null){
	code = mat14.getSelectionModel().getSelectedItem().split("\\-");
	if (pre14.getSelectionModel().getSelectedItem()!=null){
		req1 = pre14.getSelectionModel().getSelectedItem().split("\\-");
		qwe = req1[0];
	}else{
		qwe = " ";
	}
	if (pres14.getSelectionModel().getSelectedItem()!=null){
		req2 = pres14.getSelectionModel().getSelectedItem().split("\\-");
		asd = req2[0];
	}else{
		asd = " ";
	}
	if (cor14.getSelectionModel().getSelectedItem()!=null){
		coreq = cor14.getSelectionModel().getSelectedItem().split("\\-");
		zxc = coreq[0];
	}else{
		zxc = " ";
	}
	pl = new Plan(code[0], code[1], qwe.concat(" "+asd),zxc, "1");
	planData.add(pl);
}
if(mat15.getSelectionModel().getSelectedItem()!=null){
	code = mat15.getSelectionModel().getSelectedItem().split("\\-");
	if (pre15.getSelectionModel().getSelectedItem()!=null){
		req1 = pre15.getSelectionModel().getSelectedItem().split("\\-");
		qwe = req1[0];
	}else{
		qwe = " ";
	}
	if (pres15.getSelectionModel().getSelectedItem()!=null){
		req2 = pres15.getSelectionModel().getSelectedItem().split("\\-");
		asd = req2[0];
	}else{
		asd = " ";
	}
	if (cor15.getSelectionModel().getSelectedItem()!=null){
		coreq = cor15.getSelectionModel().getSelectedItem().split("\\-");
		zxc = coreq[0];
	}else{
		zxc = " ";
	}
	pl = new Plan(code[0], code[1], qwe.concat(" "+asd),zxc, "1");
	planData.add(pl);
}
if(mat16.getSelectionModel().getSelectedItem()!=null){
	code = mat16.getSelectionModel().getSelectedItem().split("\\-");
	if (pre16.getSelectionModel().getSelectedItem()!=null){
		req1 = pre16.getSelectionModel().getSelectedItem().split("\\-");
		qwe = req1[0];
	}else{
		qwe = " ";
	}
	if (pres16.getSelectionModel().getSelectedItem()!=null){
		req2 = pres16.getSelectionModel().getSelectedItem().split("\\-");
		asd = req2[0];
	}else{
		asd = " ";
	}
	if (cor16.getSelectionModel().getSelectedItem()!=null){
		coreq = cor16.getSelectionModel().getSelectedItem().split("\\-");
		zxc = coreq[0];
	}else{
		zxc = " ";
	}
	pl = new Plan(code[0], code[1], qwe.concat(" "+asd),zxc, "1");
	planData.add(pl);
}

if(mat21.getSelectionModel().getSelectedItem()!=null){
	code = mat21.getSelectionModel().getSelectedItem().split("\\-");
	if (pre21.getSelectionModel().getSelectedItem()!=null){
		req1 = pre21.getSelectionModel().getSelectedItem().split("\\-");
		qwe = req1[0];
	}else{
		qwe = " ";
	}
	if (pres21.getSelectionModel().getSelectedItem()!=null){
		req2 = pres21.getSelectionModel().getSelectedItem().split("\\-");
		asd = req2[0];
	}else{
		asd = " ";
	}
	if (cor21.getSelectionModel().getSelectedItem()!=null){
		coreq = cor21.getSelectionModel().getSelectedItem().split("\\-");
		zxc = coreq[0];
	}else{
		zxc = " ";
	}
	pl = new Plan(code[0], code[1], qwe.concat(" "+asd),zxc, "2");
	planData.add(pl);
}
if(mat22.getSelectionModel().getSelectedItem()!=null){
	code = mat22.getSelectionModel().getSelectedItem().split("\\-");
	if (pre22.getSelectionModel().getSelectedItem()!=null){
		req1 = pre22.getSelectionModel().getSelectedItem().split("\\-");
		qwe = req1[0];
	}else{
		qwe = " ";
	}
	if (pres22.getSelectionModel().getSelectedItem()!=null){
		req2 = pres22.getSelectionModel().getSelectedItem().split("\\-");
		asd = req2[0];
	}else{
		asd = " ";
	}
	if (cor22.getSelectionModel().getSelectedItem()!=null){
		coreq = cor22.getSelectionModel().getSelectedItem().split("\\-");
		zxc = coreq[0];
	}else{
		zxc = " ";
	}
	pl = new Plan(code[0], code[1], qwe.concat(" "+asd),zxc, "2");
	planData.add(pl);
}
if(mat23.getSelectionModel().getSelectedItem()!=null){
	code = mat23.getSelectionModel().getSelectedItem().split("\\-");
	if (pre23.getSelectionModel().getSelectedItem()!=null){
		req1 = pre23.getSelectionModel().getSelectedItem().split("\\-");
		qwe = req1[0];
	}else{
		qwe = " ";
	}
	if (pres23.getSelectionModel().getSelectedItem()!=null){
		req2 = pres23.getSelectionModel().getSelectedItem().split("\\-");
		asd = req2[0];
	}else{
		asd = " ";
	}
	if (cor23.getSelectionModel().getSelectedItem()!=null){
		coreq = cor23.getSelectionModel().getSelectedItem().split("\\-");
		zxc = coreq[0];
	}else{
		zxc = " ";
	}
	pl = new Plan(code[0], code[1], qwe.concat(" "+asd),zxc, "2");
	planData.add(pl);
}
if(mat24.getSelectionModel().getSelectedItem()!=null){
	code = mat24.getSelectionModel().getSelectedItem().split("\\-");
	if (pre24.getSelectionModel().getSelectedItem()!=null){
		req1 = pre24.getSelectionModel().getSelectedItem().split("\\-");
		qwe = req1[0];
	}else{
		qwe = " ";
	}
	if (pres24.getSelectionModel().getSelectedItem()!=null){
		req2 = pres24.getSelectionModel().getSelectedItem().split("\\-");
		asd = req2[0];
	}else{
		asd = " ";
	}
	if (cor24.getSelectionModel().getSelectedItem()!=null){
		coreq = cor24.getSelectionModel().getSelectedItem().split("\\-");
		zxc = coreq[0];
	}else{
		zxc = " ";
	}
	pl = new Plan(code[0], code[1], qwe.concat(" "+asd),zxc, "2");
	planData.add(pl);
}
if(mat25.getSelectionModel().getSelectedItem()!=null){
	code = mat25.getSelectionModel().getSelectedItem().split("\\-");
	if (pre25.getSelectionModel().getSelectedItem()!=null){
		req1 = pre25.getSelectionModel().getSelectedItem().split("\\-");
		qwe = req1[0];
	}else{
		qwe = " ";
	}
	if (pres25.getSelectionModel().getSelectedItem()!=null){
		req2 = pres25.getSelectionModel().getSelectedItem().split("\\-");
		asd = req2[0];
	}else{
		asd = " ";
	}
	if (cor25.getSelectionModel().getSelectedItem()!=null){
		coreq = cor25.getSelectionModel().getSelectedItem().split("\\-");
		zxc = coreq[0];
	}else{
		zxc = " ";
	}
	pl = new Plan(code[0], code[1], qwe.concat(" "+asd),zxc, "2");
	planData.add(pl);
}
if(mat26.getSelectionModel().getSelectedItem()!=null){
	code = mat26.getSelectionModel().getSelectedItem().split("\\-");
	if (pre26.getSelectionModel().getSelectedItem()!=null){
		req1 = pre26.getSelectionModel().getSelectedItem().split("\\-");
		qwe = req1[0];
	}else{
		qwe = " ";
	}
	if (pres26.getSelectionModel().getSelectedItem()!=null){
		req2 = pres26.getSelectionModel().getSelectedItem().split("\\-");
		asd = req2[0];
	}else{
		asd = " ";
	}
	if (cor26.getSelectionModel().getSelectedItem()!=null){
		coreq = cor26.getSelectionModel().getSelectedItem().split("\\-");
		zxc = coreq[0];
	}else{
		zxc = " ";
	}
	pl = new Plan(code[0], code[1], qwe.concat(" "+asd),zxc, "2");
	planData.add(pl);
}

if(mat31.getSelectionModel().getSelectedItem()!=null){
	code = mat31.getSelectionModel().getSelectedItem().split("\\-");
	if (pre31.getSelectionModel().getSelectedItem()!=null){
		req1 = pre31.getSelectionModel().getSelectedItem().split("\\-");
		qwe = req1[0];
	}else{
		qwe = " ";
	}
	if (pres31.getSelectionModel().getSelectedItem()!=null){
		req2 = pres31.getSelectionModel().getSelectedItem().split("\\-");
		asd = req2[0];
	}else{
		asd = " ";
	}
	if (cor31.getSelectionModel().getSelectedItem()!=null){
		coreq = cor31.getSelectionModel().getSelectedItem().split("\\-");
		zxc = coreq[0];
	}else{
		zxc = " ";
	}
	pl = new Plan(code[0], code[1], qwe.concat(" "+asd),zxc, "3");
	planData.add(pl);
}
if(mat32.getSelectionModel().getSelectedItem()!=null){
	code = mat32.getSelectionModel().getSelectedItem().split("\\-");
	if (pre32.getSelectionModel().getSelectedItem()!=null){
		req1 = pre32.getSelectionModel().getSelectedItem().split("\\-");
		qwe = req1[0];
	}else{
		qwe = " ";
	}
	if (pres32.getSelectionModel().getSelectedItem()!=null){
		req2 = pres32.getSelectionModel().getSelectedItem().split("\\-");
		asd = req2[0];
	}else{
		asd = " ";
	}
	if (cor32.getSelectionModel().getSelectedItem()!=null){
		coreq = cor32.getSelectionModel().getSelectedItem().split("\\-");
		zxc = coreq[0];
	}else{
		zxc = " ";
	}
	pl = new Plan(code[0], code[1], qwe.concat(" "+asd),zxc, "3");
	planData.add(pl);
}
if(mat33.getSelectionModel().getSelectedItem()!=null){
	code = mat33.getSelectionModel().getSelectedItem().split("\\-");
	if (pre33.getSelectionModel().getSelectedItem()!=null){
		req1 = pre33.getSelectionModel().getSelectedItem().split("\\-");
		qwe = req1[0];
	}else{
		qwe = " ";
	}
	if (pres33.getSelectionModel().getSelectedItem()!=null){
		req2 = pres33.getSelectionModel().getSelectedItem().split("\\-");
		asd = req2[0];
	}else{
		asd = " ";
	}
	if (cor33.getSelectionModel().getSelectedItem()!=null){
		coreq = cor33.getSelectionModel().getSelectedItem().split("\\-");
		zxc = coreq[0];
	}else{
		zxc = " ";
	}
	pl = new Plan(code[0], code[1], qwe.concat(" "+asd),zxc, "3");
	planData.add(pl);
}
if(mat34.getSelectionModel().getSelectedItem()!=null){
	code = mat34.getSelectionModel().getSelectedItem().split("\\-");
	if (pre34.getSelectionModel().getSelectedItem()!=null){
		req1 = pre34.getSelectionModel().getSelectedItem().split("\\-");
		qwe = req1[0];
	}else{
		qwe = " ";
	}
	if (pres34.getSelectionModel().getSelectedItem()!=null){
		req2 = pres34.getSelectionModel().getSelectedItem().split("\\-");
		asd = req2[0];
	}else{
		asd = " ";
	}
	if (cor34.getSelectionModel().getSelectedItem()!=null){
		coreq = cor34.getSelectionModel().getSelectedItem().split("\\-");
		zxc = coreq[0];
	}else{
		zxc = " ";
	}
	pl = new Plan(code[0], code[1], qwe.concat(" "+asd),zxc, "3");
	planData.add(pl);
}
if(mat35.getSelectionModel().getSelectedItem()!=null){
	code = mat35.getSelectionModel().getSelectedItem().split("\\-");
	if (pre35.getSelectionModel().getSelectedItem()!=null){
		req1 = pre35.getSelectionModel().getSelectedItem().split("\\-");
		qwe = req1[0];
	}else{
		qwe = " ";
	}
	if (pres35.getSelectionModel().getSelectedItem()!=null){
		req2 = pres35.getSelectionModel().getSelectedItem().split("\\-");
		asd = req2[0];
	}else{
		asd = " ";
	}
	if (cor35.getSelectionModel().getSelectedItem()!=null){
		coreq = cor35.getSelectionModel().getSelectedItem().split("\\-");
		zxc = coreq[0];
	}else{
		zxc = " ";
	}
	pl = new Plan(code[0], code[1], qwe.concat(" "+asd),zxc, "3");
	planData.add(pl);
}
if(mat36.getSelectionModel().getSelectedItem()!=null){
	code = mat36.getSelectionModel().getSelectedItem().split("\\-");
	if (pre36.getSelectionModel().getSelectedItem()!=null){
		req1 = pre36.getSelectionModel().getSelectedItem().split("\\-");
		qwe = req1[0];
	}else{
		qwe = " ";
	}
	if (pres36.getSelectionModel().getSelectedItem()!=null){
		req2 = pres36.getSelectionModel().getSelectedItem().split("\\-");
		asd = req2[0];
	}else{
		asd = " ";
	}
	if (cor36.getSelectionModel().getSelectedItem()!=null){
		coreq = cor36.getSelectionModel().getSelectedItem().split("\\-");
		zxc = coreq[0];
	}else{
		zxc = " ";
	}
	pl = new Plan(code[0], code[1], qwe.concat(" "+asd),zxc, "3");
	planData.add(pl);
}

if(mat41.getSelectionModel().getSelectedItem()!=null){
	code = mat41.getSelectionModel().getSelectedItem().split("\\-");
	if (pre41.getSelectionModel().getSelectedItem()!=null){
		req1 = pre41.getSelectionModel().getSelectedItem().split("\\-");
		qwe = req1[0];
	}else{
		qwe = " ";
	}
	if (pres41.getSelectionModel().getSelectedItem()!=null){
		req2 = pres41.getSelectionModel().getSelectedItem().split("\\-");
		asd = req2[0];
	}else{
		asd = " ";
	}
	if (cor41.getSelectionModel().getSelectedItem()!=null){
		coreq = cor41.getSelectionModel().getSelectedItem().split("\\-");
		zxc = coreq[0];
	}else{
		zxc = " ";
	}
	pl = new Plan(code[0], code[1], qwe.concat(" "+asd),zxc, "4");
	planData.add(pl);
}
if(mat42.getSelectionModel().getSelectedItem()!=null){
	code = mat42.getSelectionModel().getSelectedItem().split("\\-");
	if (pre42.getSelectionModel().getSelectedItem()!=null){
		req1 = pre42.getSelectionModel().getSelectedItem().split("\\-");
		qwe = req1[0];
	}else{
		qwe = " ";
	}
	if (pres42.getSelectionModel().getSelectedItem()!=null){
		req2 = pres42.getSelectionModel().getSelectedItem().split("\\-");
		asd = req2[0];
	}else{
		asd = " ";
	}
	if (cor42.getSelectionModel().getSelectedItem()!=null){
		coreq = cor42.getSelectionModel().getSelectedItem().split("\\-");
		zxc = coreq[0];
	}else{
		zxc = " ";
	}
	pl = new Plan(code[0], code[1], qwe.concat(" "+asd),zxc, "4");
	planData.add(pl);
}
if(mat43.getSelectionModel().getSelectedItem()!=null){
	code = mat43.getSelectionModel().getSelectedItem().split("\\-");
	if (pre43.getSelectionModel().getSelectedItem()!=null){
		req1 = pre43.getSelectionModel().getSelectedItem().split("\\-");
		qwe = req1[0];
	}else{
		qwe = " ";
	}
	if (pres43.getSelectionModel().getSelectedItem()!=null){
		req2 = pres43.getSelectionModel().getSelectedItem().split("\\-");
		asd = req2[0];
	}else{
		asd = " ";
	}
	if (cor43.getSelectionModel().getSelectedItem()!=null){
		coreq = cor43.getSelectionModel().getSelectedItem().split("\\-");
		zxc = coreq[0];
	}else{
		zxc = " ";
	}
	pl = new Plan(code[0], code[1], qwe.concat(" "+asd),zxc, "4");
	planData.add(pl);
}
if(mat44.getSelectionModel().getSelectedItem()!=null){
	code = mat44.getSelectionModel().getSelectedItem().split("\\-");
	if (pre44.getSelectionModel().getSelectedItem()!=null){
		req1 = pre44.getSelectionModel().getSelectedItem().split("\\-");
		qwe = req1[0];
	}else{
		qwe = " ";
	}
	if (pres44.getSelectionModel().getSelectedItem()!=null){
		req2 = pres44.getSelectionModel().getSelectedItem().split("\\-");
		asd = req2[0];
	}else{
		asd = " ";
	}
	if (cor44.getSelectionModel().getSelectedItem()!=null){
		coreq = cor44.getSelectionModel().getSelectedItem().split("\\-");
		zxc = coreq[0];
	}else{
		zxc = " ";
	}
	pl = new Plan(code[0], code[1], qwe.concat(" "+asd),zxc, "4");
	planData.add(pl);
}
if(mat45.getSelectionModel().getSelectedItem()!=null){
	code = mat45.getSelectionModel().getSelectedItem().split("\\-");
	if (pre45.getSelectionModel().getSelectedItem()!=null){
		req1 = pre45.getSelectionModel().getSelectedItem().split("\\-");
		qwe = req1[0];
	}else{
		qwe = " ";
	}
	if (pres45.getSelectionModel().getSelectedItem()!=null){
		req2 = pres45.getSelectionModel().getSelectedItem().split("\\-");
		asd = req2[0];
	}else{
		asd = " ";
	}
	if (cor45.getSelectionModel().getSelectedItem()!=null){
		coreq = cor45.getSelectionModel().getSelectedItem().split("\\-");
		zxc = coreq[0];
	}else{
		zxc = " ";
	}
	pl = new Plan(code[0], code[1], qwe.concat(" "+asd),zxc, "4");
	planData.add(pl);
}
if(mat46.getSelectionModel().getSelectedItem()!=null){
	code = mat46.getSelectionModel().getSelectedItem().split("\\-");
	if (pre46.getSelectionModel().getSelectedItem()!=null){
		req1 = pre46.getSelectionModel().getSelectedItem().split("\\-");
		qwe = req1[0];
	}else{
		qwe = " ";
	}
	if (pres46.getSelectionModel().getSelectedItem()!=null){
		req2 = pres46.getSelectionModel().getSelectedItem().split("\\-");
		asd = req2[0];
	}else{
		asd = " ";
	}
	if (cor46.getSelectionModel().getSelectedItem()!=null){
		coreq = cor46.getSelectionModel().getSelectedItem().split("\\-");
		zxc = coreq[0];
	}else{
		zxc = " ";
	}
	pl = new Plan(code[0], code[1], qwe.concat(" "+asd),zxc, "4");
	planData.add(pl);
}

if(mat51.getSelectionModel().getSelectedItem()!=null){
	code = mat51.getSelectionModel().getSelectedItem().split("\\-");
	if (pre51.getSelectionModel().getSelectedItem()!=null){
		req1 = pre51.getSelectionModel().getSelectedItem().split("\\-");
		qwe = req1[0];
	}else{
		qwe = " ";
	}
	if (pres51.getSelectionModel().getSelectedItem()!=null){
		req2 = pres51.getSelectionModel().getSelectedItem().split("\\-");
		asd = req2[0];
	}else{
		asd = " ";
	}
	if (cor51.getSelectionModel().getSelectedItem()!=null){
		coreq = cor51.getSelectionModel().getSelectedItem().split("\\-");
		zxc = coreq[0];
	}else{
		zxc = " ";
	}
	pl = new Plan(code[0], code[1], qwe.concat(" "+asd),zxc, "5");
	planData.add(pl);
}
if(mat52.getSelectionModel().getSelectedItem()!=null){
	code = mat52.getSelectionModel().getSelectedItem().split("\\-");
	if (pre52.getSelectionModel().getSelectedItem()!=null){
		req1 = pre52.getSelectionModel().getSelectedItem().split("\\-");
		qwe = req1[0];
	}else{
		qwe = " ";
	}
	if (pres52.getSelectionModel().getSelectedItem()!=null){
		req2 = pres52.getSelectionModel().getSelectedItem().split("\\-");
		asd = req2[0];
	}else{
		asd = " ";
	}
	if (cor52.getSelectionModel().getSelectedItem()!=null){
		coreq = cor52.getSelectionModel().getSelectedItem().split("\\-");
		zxc = coreq[0];
	}else{
		zxc = " ";
	}
	pl = new Plan(code[0], code[1], qwe.concat(" "+asd),zxc, "5");
	planData.add(pl);
}
if(mat53.getSelectionModel().getSelectedItem()!=null){
	code = mat53.getSelectionModel().getSelectedItem().split("\\-");
	if (pre53.getSelectionModel().getSelectedItem()!=null){
		req1 = pre53.getSelectionModel().getSelectedItem().split("\\-");
		qwe = req1[0];
	}else{
		qwe = " ";
	}
	if (pres53.getSelectionModel().getSelectedItem()!=null){
		req2 = pres53.getSelectionModel().getSelectedItem().split("\\-");
		asd = req2[0];
	}else{
		asd = " ";
	}
	if (cor53.getSelectionModel().getSelectedItem()!=null){
		coreq = cor53.getSelectionModel().getSelectedItem().split("\\-");
		zxc = coreq[0];
	}else{
		zxc = " ";
	}
	pl = new Plan(code[0], code[1], qwe.concat(" "+asd),zxc, "5");
	planData.add(pl);
}
if(mat54.getSelectionModel().getSelectedItem()!=null){
	code = mat54.getSelectionModel().getSelectedItem().split("\\-");
	if (pre54.getSelectionModel().getSelectedItem()!=null){
		req1 = pre54.getSelectionModel().getSelectedItem().split("\\-");
		qwe = req1[0];
	}else{
		qwe = " ";
	}
	if (pres54.getSelectionModel().getSelectedItem()!=null){
		req2 = pres54.getSelectionModel().getSelectedItem().split("\\-");
		asd = req2[0];
	}else{
		asd = " ";
	}
	if (cor54.getSelectionModel().getSelectedItem()!=null){
		coreq = cor54.getSelectionModel().getSelectedItem().split("\\-");
		zxc = coreq[0];
	}else{
		zxc = " ";
	}
	pl = new Plan(code[0], code[1], qwe.concat(" "+asd),zxc, "5");
	planData.add(pl);
}
if(mat55.getSelectionModel().getSelectedItem()!=null){
	code = mat55.getSelectionModel().getSelectedItem().split("\\-");
	if (pre55.getSelectionModel().getSelectedItem()!=null){
		req1 = pre55.getSelectionModel().getSelectedItem().split("\\-");
		qwe = req1[0];
	}else{
		qwe = " ";
	}
	if (pres55.getSelectionModel().getSelectedItem()!=null){
		req2 = pres55.getSelectionModel().getSelectedItem().split("\\-");
		asd = req2[0];
	}else{
		asd = " ";
	}
	if (cor55.getSelectionModel().getSelectedItem()!=null){
		coreq = cor55.getSelectionModel().getSelectedItem().split("\\-");
		zxc = coreq[0];
	}else{
		zxc = " ";
	}
	pl = new Plan(code[0], code[1], qwe.concat(" "+asd),zxc, "5");
	planData.add(pl);
}
if(mat56.getSelectionModel().getSelectedItem()!=null){
	code = mat56.getSelectionModel().getSelectedItem().split("\\-");
	if (pre56.getSelectionModel().getSelectedItem()!=null){
		req1 = pre56.getSelectionModel().getSelectedItem().split("\\-");
		qwe = req1[0];
	}else{
		qwe = " ";
	}
	if (pres56.getSelectionModel().getSelectedItem()!=null){
		req2 = pres56.getSelectionModel().getSelectedItem().split("\\-");
		asd = req2[0];
	}else{
		asd = " ";
	}
	if (cor56.getSelectionModel().getSelectedItem()!=null){
		coreq = cor56.getSelectionModel().getSelectedItem().split("\\-");
		zxc = coreq[0];
	}else{
		zxc = " ";
	}
	pl = new Plan(code[0], code[1], qwe.concat(" "+asd),zxc, "5");
	planData.add(pl);
}

if(mat61.getSelectionModel().getSelectedItem()!=null){
	code = mat61.getSelectionModel().getSelectedItem().split("\\-");
	if (pre61.getSelectionModel().getSelectedItem()!=null){
		req1 = pre61.getSelectionModel().getSelectedItem().split("\\-");
		qwe = req1[0];
	}else{
		qwe = " ";
	}
	if (pres61.getSelectionModel().getSelectedItem()!=null){
		req2 = pres61.getSelectionModel().getSelectedItem().split("\\-");
		asd = req2[0];
	}else{
		asd = " ";
	}
	if (cor61.getSelectionModel().getSelectedItem()!=null){
		coreq = cor61.getSelectionModel().getSelectedItem().split("\\-");
		zxc = coreq[0];
	}else{
		zxc = " ";
	}
	pl = new Plan(code[0], code[1], qwe.concat(" "+asd),zxc, "6");
	planData.add(pl);
}
if(mat62.getSelectionModel().getSelectedItem()!=null){
	code = mat62.getSelectionModel().getSelectedItem().split("\\-");
	if (pre62.getSelectionModel().getSelectedItem()!=null){
		req1 = pre62.getSelectionModel().getSelectedItem().split("\\-");
		qwe = req1[0];
	}else{
		qwe = " ";
	}
	if (pres62.getSelectionModel().getSelectedItem()!=null){
		req2 = pres62.getSelectionModel().getSelectedItem().split("\\-");
		asd = req2[0];
	}else{
		asd = " ";
	}
	if (cor62.getSelectionModel().getSelectedItem()!=null){
		coreq = cor62.getSelectionModel().getSelectedItem().split("\\-");
		zxc = coreq[0];
	}else{
		zxc = " ";
	}
	pl = new Plan(code[0], code[1], qwe.concat(" "+asd),zxc, "6");
	planData.add(pl);
}
if(mat63.getSelectionModel().getSelectedItem()!=null){
	code = mat63.getSelectionModel().getSelectedItem().split("\\-");
	if (pre63.getSelectionModel().getSelectedItem()!=null){
		req1 = pre63.getSelectionModel().getSelectedItem().split("\\-");
		qwe = req1[0];
	}else{
		qwe = " ";
	}
	if (pres63.getSelectionModel().getSelectedItem()!=null){
		req2 = pres63.getSelectionModel().getSelectedItem().split("\\-");
		asd = req2[0];
	}else{
		asd = " ";
	}
	if (cor63.getSelectionModel().getSelectedItem()!=null){
		coreq = cor63.getSelectionModel().getSelectedItem().split("\\-");
		zxc = coreq[0];
	}else{
		zxc = " ";
	}
	pl = new Plan(code[0], code[1], qwe.concat(" "+asd),zxc, "6");
	planData.add(pl);
}
if(mat64.getSelectionModel().getSelectedItem()!=null){
	code = mat64.getSelectionModel().getSelectedItem().split("\\-");
	if (pre64.getSelectionModel().getSelectedItem()!=null){
		req1 = pre64.getSelectionModel().getSelectedItem().split("\\-");
		qwe = req1[0];
	}else{
		qwe = " ";
	}
	if (pres64.getSelectionModel().getSelectedItem()!=null){
		req2 = pres64.getSelectionModel().getSelectedItem().split("\\-");
		asd = req2[0];
	}else{
		asd = " ";
	}
	if (cor64.getSelectionModel().getSelectedItem()!=null){
		coreq = cor64.getSelectionModel().getSelectedItem().split("\\-");
		zxc = coreq[0];
	}else{
		zxc = " ";
	}
	pl = new Plan(code[0], code[1], qwe.concat(" "+asd),zxc, "6");
	planData.add(pl);
}
if(mat65.getSelectionModel().getSelectedItem()!=null){
	code = mat65.getSelectionModel().getSelectedItem().split("\\-");
	if (pre65.getSelectionModel().getSelectedItem()!=null){
		req1 = pre65.getSelectionModel().getSelectedItem().split("\\-");
		qwe = req1[0];
	}else{
		qwe = " ";
	}
	if (pres65.getSelectionModel().getSelectedItem()!=null){
		req2 = pres65.getSelectionModel().getSelectedItem().split("\\-");
		asd = req2[0];
	}else{
		asd = " ";
	}
	if (cor65.getSelectionModel().getSelectedItem()!=null){
		coreq = cor65.getSelectionModel().getSelectedItem().split("\\-");
		zxc = coreq[0];
	}else{
		zxc = " ";
	}
	pl = new Plan(code[0], code[1], qwe.concat(" "+asd),zxc, "6");
	planData.add(pl);
}
if(mat66.getSelectionModel().getSelectedItem()!=null){
	code = mat66.getSelectionModel().getSelectedItem().split("\\-");
	if (pre66.getSelectionModel().getSelectedItem()!=null){
		req1 = pre66.getSelectionModel().getSelectedItem().split("\\-");
		qwe = req1[0];
	}else{
		qwe = " ";
	}
	if (pres66.getSelectionModel().getSelectedItem()!=null){
		req2 = pres66.getSelectionModel().getSelectedItem().split("\\-");
		asd = req2[0];
	}else{
		asd = " ";
	}
	if (cor66.getSelectionModel().getSelectedItem()!=null){
		coreq = cor66.getSelectionModel().getSelectedItem().split("\\-");
		zxc = coreq[0];
	}else{
		zxc = " ";
	}
	pl = new Plan(code[0], code[1], qwe.concat(" "+asd),zxc, "6");
	planData.add(pl);
}

if(mat71.getSelectionModel().getSelectedItem()!=null){
	code = mat71.getSelectionModel().getSelectedItem().split("\\-");
	if (pre71.getSelectionModel().getSelectedItem()!=null){
		req1 = pre71.getSelectionModel().getSelectedItem().split("\\-");
		qwe = req1[0];
	}else{
		qwe = " ";
	}
	if (pres71.getSelectionModel().getSelectedItem()!=null){
		req2 = pres71.getSelectionModel().getSelectedItem().split("\\-");
		asd = req2[0];
	}else{
		asd = " ";
	}
	if (cor71.getSelectionModel().getSelectedItem()!=null){
		coreq = cor71.getSelectionModel().getSelectedItem().split("\\-");
		zxc = coreq[0];
	}else{
		zxc = " ";
	}
	pl = new Plan(code[0], code[1], qwe.concat(" "+asd),zxc, "7");
	planData.add(pl);
}
if(mat72.getSelectionModel().getSelectedItem()!=null){
	code = mat72.getSelectionModel().getSelectedItem().split("\\-");
	if (pre72.getSelectionModel().getSelectedItem()!=null){
		req1 = pre72.getSelectionModel().getSelectedItem().split("\\-");
		qwe = req1[0];
	}else{
		qwe = " ";
	}
	if (pres72.getSelectionModel().getSelectedItem()!=null){
		req2 = pres72.getSelectionModel().getSelectedItem().split("\\-");
		asd = req2[0];
	}else{
		asd = " ";
	}
	if (cor72.getSelectionModel().getSelectedItem()!=null){
		coreq = cor72.getSelectionModel().getSelectedItem().split("\\-");
		zxc = coreq[0];
	}else{
		zxc = " ";
	}
	pl = new Plan(code[0], code[1], qwe.concat(" "+asd),zxc, "7");
	planData.add(pl);
}
if(mat73.getSelectionModel().getSelectedItem()!=null){
	code = mat73.getSelectionModel().getSelectedItem().split("\\-");
	if (pre73.getSelectionModel().getSelectedItem()!=null){
		req1 = pre73.getSelectionModel().getSelectedItem().split("\\-");
		qwe = req1[0];
	}else{
		qwe = " ";
	}
	if (pres73.getSelectionModel().getSelectedItem()!=null){
		req2 = pres73.getSelectionModel().getSelectedItem().split("\\-");
		asd = req2[0];
	}else{
		asd = " ";
	}
	if (cor73.getSelectionModel().getSelectedItem()!=null){
		coreq = cor73.getSelectionModel().getSelectedItem().split("\\-");
		zxc = coreq[0];
	}else{
		zxc = " ";
	}
	pl = new Plan(code[0], code[1], qwe.concat(" "+asd),zxc, "7");
	planData.add(pl);
}
if(mat74.getSelectionModel().getSelectedItem()!=null){
	code = mat74.getSelectionModel().getSelectedItem().split("\\-");
	if (pre74.getSelectionModel().getSelectedItem()!=null){
		req1 = pre74.getSelectionModel().getSelectedItem().split("\\-");
		qwe = req1[0];
	}else{
		qwe = " ";
	}
	if (pres74.getSelectionModel().getSelectedItem()!=null){
		req2 = pres74.getSelectionModel().getSelectedItem().split("\\-");
		asd = req2[0];
	}else{
		asd = " ";
	}
	if (cor74.getSelectionModel().getSelectedItem()!=null){
		coreq = cor74.getSelectionModel().getSelectedItem().split("\\-");
		zxc = coreq[0];
	}else{
		zxc = " ";
	}
	pl = new Plan(code[0], code[1], qwe.concat(" "+asd),zxc, "7");
	planData.add(pl);
}
if(mat75.getSelectionModel().getSelectedItem()!=null){
	code = mat75.getSelectionModel().getSelectedItem().split("\\-");
	if (pre75.getSelectionModel().getSelectedItem()!=null){
		req1 = pre75.getSelectionModel().getSelectedItem().split("\\-");
		qwe = req1[0];
	}else{
		qwe = " ";
	}
	if (pres75.getSelectionModel().getSelectedItem()!=null){
		req2 = pres75.getSelectionModel().getSelectedItem().split("\\-");
		asd = req2[0];
	}else{
		asd = " ";
	}
	if (cor75.getSelectionModel().getSelectedItem()!=null){
		coreq = cor75.getSelectionModel().getSelectedItem().split("\\-");
		zxc = coreq[0];
	}else{
		zxc = " ";
	}
	pl = new Plan(code[0], code[1], qwe.concat(" "+asd),zxc, "7");
	planData.add(pl);
}
if(mat76.getSelectionModel().getSelectedItem()!=null){
	code = mat76.getSelectionModel().getSelectedItem().split("\\-");
	if (pre76.getSelectionModel().getSelectedItem()!=null){
		req1 = pre76.getSelectionModel().getSelectedItem().split("\\-");
		qwe = req1[0];
	}else{
		qwe = " ";
	}
	if (pres76.getSelectionModel().getSelectedItem()!=null){
		req2 = pres76.getSelectionModel().getSelectedItem().split("\\-");
		asd = req2[0];
	}else{
		asd = " ";
	}
	if (cor76.getSelectionModel().getSelectedItem()!=null){
		coreq = cor76.getSelectionModel().getSelectedItem().split("\\-");
		zxc = coreq[0];
	}else{
		zxc = " ";
	}
	pl = new Plan(code[0], code[1], qwe.concat(" "+asd),zxc, "7");
	planData.add(pl);
}

if(mat81.getSelectionModel().getSelectedItem()!=null){
	code = mat81.getSelectionModel().getSelectedItem().split("\\-");
	if (pre81.getSelectionModel().getSelectedItem()!=null){
		req1 = pre81.getSelectionModel().getSelectedItem().split("\\-");
		qwe = req1[0];
	}else{
		qwe = " ";
	}
	if (pres81.getSelectionModel().getSelectedItem()!=null){
		req2 = pres81.getSelectionModel().getSelectedItem().split("\\-");
		asd = req2[0];
	}else{
		asd = " ";
	}
	if (cor81.getSelectionModel().getSelectedItem()!=null){
		coreq = cor81.getSelectionModel().getSelectedItem().split("\\-");
		zxc = coreq[0];
	}else{
		zxc = " ";
	}
	pl = new Plan(code[0], code[1], qwe.concat(" "+asd),zxc, "8");
	planData.add(pl);
}
if(mat82.getSelectionModel().getSelectedItem()!=null){
	code = mat82.getSelectionModel().getSelectedItem().split("\\-");
	if (pre82.getSelectionModel().getSelectedItem()!=null){
		req1 = pre82.getSelectionModel().getSelectedItem().split("\\-");
		qwe = req1[0];
	}else{
		qwe = " ";
	}
	if (pres82.getSelectionModel().getSelectedItem()!=null){
		req2 = pres82.getSelectionModel().getSelectedItem().split("\\-");
		asd = req2[0];
	}else{
		asd = " ";
	}
	if (cor82.getSelectionModel().getSelectedItem()!=null){
		coreq = cor82.getSelectionModel().getSelectedItem().split("\\-");
		zxc = coreq[0];
	}else{
		zxc = " ";
	}
	pl = new Plan(code[0], code[1], qwe.concat(" "+asd),zxc, "8");
	planData.add(pl);
}
if(mat83.getSelectionModel().getSelectedItem()!=null){
	code = mat83.getSelectionModel().getSelectedItem().split("\\-");
	if (pre83.getSelectionModel().getSelectedItem()!=null){
		req1 = pre83.getSelectionModel().getSelectedItem().split("\\-");
		qwe = req1[0];
	}else{
		qwe = " ";
	}
	if (pres83.getSelectionModel().getSelectedItem()!=null){
		req2 = pres83.getSelectionModel().getSelectedItem().split("\\-");
		asd = req2[0];
	}else{
		asd = " ";
	}
	if (cor83.getSelectionModel().getSelectedItem()!=null){
		coreq = cor83.getSelectionModel().getSelectedItem().split("\\-");
		zxc = coreq[0];
	}else{
		zxc = " ";
	}
	pl = new Plan(code[0], code[1], qwe.concat(" "+asd),zxc, "8");
	planData.add(pl);
}
if(mat84.getSelectionModel().getSelectedItem()!=null){
	code = mat84.getSelectionModel().getSelectedItem().split("\\-");
	if (pre84.getSelectionModel().getSelectedItem()!=null){
		req1 = pre84.getSelectionModel().getSelectedItem().split("\\-");
		qwe = req1[0];
	}else{
		qwe = " ";
	}
	if (pres84.getSelectionModel().getSelectedItem()!=null){
		req2 = pres84.getSelectionModel().getSelectedItem().split("\\-");
		asd = req2[0];
	}else{
		asd = " ";
	}
	if (cor84.getSelectionModel().getSelectedItem()!=null){
		coreq = cor84.getSelectionModel().getSelectedItem().split("\\-");
		zxc = coreq[0];
	}else{
		zxc = " ";
	}
	pl = new Plan(code[0], code[1], qwe.concat(" "+asd),zxc, "8");
	planData.add(pl);
}
if(mat85.getSelectionModel().getSelectedItem()!=null){
	code = mat85.getSelectionModel().getSelectedItem().split("\\-");
	if (pre85.getSelectionModel().getSelectedItem()!=null){
		req1 = pre85.getSelectionModel().getSelectedItem().split("\\-");
		qwe = req1[0];
	}else{
		qwe = " ";
	}
	if (pres85.getSelectionModel().getSelectedItem()!=null){
		req2 = pres85.getSelectionModel().getSelectedItem().split("\\-");
		asd = req2[0];
	}else{
		asd = " ";
	}
	if (cor85.getSelectionModel().getSelectedItem()!=null){
		coreq = cor85.getSelectionModel().getSelectedItem().split("\\-");
		zxc = coreq[0];
	}else{
		zxc = " ";
	}
	pl = new Plan(code[0], code[1], qwe.concat(" "+asd),zxc, "8");
	planData.add(pl);
}
if(mat86.getSelectionModel().getSelectedItem()!=null){
	code = mat86.getSelectionModel().getSelectedItem().split("\\-");
	if (pre86.getSelectionModel().getSelectedItem()!=null){
		req1 = pre86.getSelectionModel().getSelectedItem().split("\\-");
		qwe = req1[0];
	}else{
		qwe = " ";
	}
	if (pres86.getSelectionModel().getSelectedItem()!=null){
		req2 = pres86.getSelectionModel().getSelectedItem().split("\\-");
		asd = req2[0];
	}else{
		asd = " ";
	}
	if (cor86.getSelectionModel().getSelectedItem()!=null){
		coreq = cor86.getSelectionModel().getSelectedItem().split("\\-");
		zxc = coreq[0];
	}else{
		zxc = " ";
	}
	pl = new Plan(code[0], code[1], qwe.concat(" "+asd),zxc, "8");
	planData.add(pl);
}

if(mat91.getSelectionModel().getSelectedItem()!=null){
	code = mat91.getSelectionModel().getSelectedItem().split("\\-");
	if (pre91.getSelectionModel().getSelectedItem()!=null){
		req1 = pre91.getSelectionModel().getSelectedItem().split("\\-");
		qwe = req1[0];
	}else{
		qwe = " ";
	}
	if (pres91.getSelectionModel().getSelectedItem()!=null){
		req2 = pres91.getSelectionModel().getSelectedItem().split("\\-");
		asd = req2[0];
	}else{
		asd = " ";
	}
	if (cor91.getSelectionModel().getSelectedItem()!=null){
		coreq = cor91.getSelectionModel().getSelectedItem().split("\\-");
		zxc = coreq[0];
	}else{
		zxc = " ";
	}
	pl = new Plan(code[0], code[1], qwe.concat(" "+asd),zxc, "9");
	planData.add(pl);
}
if(mat92.getSelectionModel().getSelectedItem()!=null){
	code = mat92.getSelectionModel().getSelectedItem().split("\\-");
	if (pre92.getSelectionModel().getSelectedItem()!=null){
		req1 = pre92.getSelectionModel().getSelectedItem().split("\\-");
		qwe = req1[0];
	}else{
		qwe = " ";
	}
	if (pres92.getSelectionModel().getSelectedItem()!=null){
		req2 = pres92.getSelectionModel().getSelectedItem().split("\\-");
		asd = req2[0];
	}else{
		asd = " ";
	}
	if (cor92.getSelectionModel().getSelectedItem()!=null){
		coreq = cor92.getSelectionModel().getSelectedItem().split("\\-");
		zxc = coreq[0];
	}else{
		zxc = " ";
	}
	pl = new Plan(code[0], code[1], qwe.concat(" "+asd),zxc, "9");
	planData.add(pl);
}
if(mat93.getSelectionModel().getSelectedItem()!=null){
	code = mat93.getSelectionModel().getSelectedItem().split("\\-");
	if (pre93.getSelectionModel().getSelectedItem()!=null){
		req1 = pre93.getSelectionModel().getSelectedItem().split("\\-");
		qwe = req1[0];
	}else{
		qwe = " ";
	}
	if (pres93.getSelectionModel().getSelectedItem()!=null){
		req2 = pres93.getSelectionModel().getSelectedItem().split("\\-");
		asd = req2[0];
	}else{
		asd = " ";
	}
	if (cor93.getSelectionModel().getSelectedItem()!=null){
		coreq = cor93.getSelectionModel().getSelectedItem().split("\\-");
		zxc = coreq[0];
	}else{
		zxc = " ";
	}
	pl = new Plan(code[0], code[1], qwe.concat(" "+asd),zxc, "9");
	planData.add(pl);
}
if(mat94.getSelectionModel().getSelectedItem()!=null){
	code = mat94.getSelectionModel().getSelectedItem().split("\\-");
	if (pre94.getSelectionModel().getSelectedItem()!=null){
		req1 = pre94.getSelectionModel().getSelectedItem().split("\\-");
		qwe = req1[0];
	}else{
		qwe = " ";
	}
	if (pres94.getSelectionModel().getSelectedItem()!=null){
		req2 = pres94.getSelectionModel().getSelectedItem().split("\\-");
		asd = req2[0];
	}else{
		asd = " ";
	}
	if (cor94.getSelectionModel().getSelectedItem()!=null){
		coreq = cor94.getSelectionModel().getSelectedItem().split("\\-");
		zxc = coreq[0];
	}else{
		zxc = " ";
	}
	pl = new Plan(code[0], code[1], qwe.concat(" "+asd),zxc, "9");
	planData.add(pl);
}
if(mat95.getSelectionModel().getSelectedItem()!=null){
	code = mat95.getSelectionModel().getSelectedItem().split("\\-");
	if (pre95.getSelectionModel().getSelectedItem()!=null){
		req1 = pre95.getSelectionModel().getSelectedItem().split("\\-");
		qwe = req1[0];
	}else{
		qwe = " ";
	}
	if (pres95.getSelectionModel().getSelectedItem()!=null){
		req2 = pres95.getSelectionModel().getSelectedItem().split("\\-");
		asd = req2[0];
	}else{
		asd = " ";
	}
	if (cor95.getSelectionModel().getSelectedItem()!=null){
		coreq = cor95.getSelectionModel().getSelectedItem().split("\\-");
		zxc = coreq[0];
	}else{
		zxc = " ";
	}
	pl = new Plan(code[0], code[1], qwe.concat(" "+asd),zxc, "9");
	planData.add(pl);
}
if(mat96.getSelectionModel().getSelectedItem()!=null){
	code = mat96.getSelectionModel().getSelectedItem().split("\\-");
	if (pre96.getSelectionModel().getSelectedItem()!=null){
		req1 = pre96.getSelectionModel().getSelectedItem().split("\\-");
		qwe = req1[0];
	}else{
		qwe = " ";
	}
	if (pres96.getSelectionModel().getSelectedItem()!=null){
		req2 = pres96.getSelectionModel().getSelectedItem().split("\\-");
		asd = req2[0];
	}else{
		asd = " ";
	}
	if (cor96.getSelectionModel().getSelectedItem()!=null){
		coreq = cor96.getSelectionModel().getSelectedItem().split("\\-");
		zxc = coreq[0];
	}else{
		zxc = " ";
	}
	pl = new Plan(code[0], code[1], qwe.concat(" "+asd),zxc, "9");
	planData.add(pl);
}
	
	for(Plan pr:planData){
		System.out.println(pr.getCode().getValue());
	}
	
		
		okClicked = true;
        dialogStage.close();
	}
	
	
	@FXML
    private void handleCancel() {
        dialogStage.close();
    }
	
}
