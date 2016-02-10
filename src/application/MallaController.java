package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ChoiceBox;
import javafx.stage.Stage;
import modulos.Materia;
import modulos.Plan;

public class MallaController extends Main implements Initializable{
	
	@FXML
	private ChoiceBox mat11;
	@FXML
	private ChoiceBox pre11;
	@FXML
	private ChoiceBox pres11;
	@FXML
	private ChoiceBox cor11;
	@FXML
	private ChoiceBox mat12;
	@FXML
	private ChoiceBox pre12;
	@FXML
	private ChoiceBox pres12;
	@FXML
	private ChoiceBox cor12;
	@FXML
	private ChoiceBox mat13;
	@FXML
	private ChoiceBox pre13;
	@FXML
	private ChoiceBox pres13;
	@FXML
	private ChoiceBox cor13;
	@FXML
	private ChoiceBox mat14;
	@FXML
	private ChoiceBox pre14;
	@FXML
	private ChoiceBox pres14;
	@FXML
	private ChoiceBox cor14;
	@FXML
	private ChoiceBox mat15;
	@FXML
	private ChoiceBox pre15;
	@FXML
	private ChoiceBox pres15;
	@FXML
	private ChoiceBox cor15;
	@FXML
	private ChoiceBox mat16;
	@FXML
	private ChoiceBox pre16;
	@FXML
	private ChoiceBox pres16;
	@FXML
	private ChoiceBox cor16;
	@FXML
	private ChoiceBox mat21;
	@FXML
	private ChoiceBox pre21;
	@FXML
	private ChoiceBox pres21;
	@FXML
	private ChoiceBox cor21;
	@FXML
	private ChoiceBox mat22;
	@FXML
	private ChoiceBox pre22;
	@FXML
	private ChoiceBox pres22;
	@FXML
	private ChoiceBox cor22;
	@FXML
	private ChoiceBox mat23;
	@FXML
	private ChoiceBox pre23;
	@FXML
	private ChoiceBox pres23;
	@FXML
	private ChoiceBox cor23;
	@FXML
	private ChoiceBox mat24;
	@FXML
	private ChoiceBox pre24;
	@FXML
	private ChoiceBox pres24;
	@FXML
	private ChoiceBox cor24;
	@FXML
	private ChoiceBox mat25;
	@FXML
	private ChoiceBox pre25;
	@FXML
	private ChoiceBox pres25;
	@FXML
	private ChoiceBox cor25;
	@FXML
	private ChoiceBox mat26;
	@FXML
	private ChoiceBox pre26;
	@FXML
	private ChoiceBox pres26;
	@FXML
	private ChoiceBox cor26;
	@FXML
	private ChoiceBox mat31;
	@FXML
	private ChoiceBox pre31;
	@FXML
	private ChoiceBox pres31;
	@FXML
	private ChoiceBox cor31;
	@FXML
	private ChoiceBox mat32;
	@FXML
	private ChoiceBox pre32;
	@FXML
	private ChoiceBox pres32;
	@FXML
	private ChoiceBox cor32;
	@FXML
	private ChoiceBox mat33;
	@FXML
	private ChoiceBox pre33;
	@FXML
	private ChoiceBox pres33;
	@FXML
	private ChoiceBox cor33;
	@FXML
	private ChoiceBox mat34;
	@FXML
	private ChoiceBox pre34;
	@FXML
	private ChoiceBox pres34;
	@FXML
	private ChoiceBox cor34;
	@FXML
	private ChoiceBox mat35;
	@FXML
	private ChoiceBox pre35;
	@FXML
	private ChoiceBox pres35;
	@FXML
	private ChoiceBox cor35;
	@FXML
	private ChoiceBox mat36;
	@FXML
	private ChoiceBox pre36;
	@FXML
	private ChoiceBox pres36;
	@FXML
	private ChoiceBox cor36;
	@FXML
	private ChoiceBox mat41;
	@FXML
	private ChoiceBox pre41;
	@FXML
	private ChoiceBox pres41;
	@FXML
	private ChoiceBox cor41;
	@FXML
	private ChoiceBox mat42;
	@FXML
	private ChoiceBox pre42;
	@FXML
	private ChoiceBox pres42;
	@FXML
	private ChoiceBox cor42;
	@FXML
	private ChoiceBox mat43;
	@FXML
	private ChoiceBox pre43;
	@FXML
	private ChoiceBox pres43;
	@FXML
	private ChoiceBox cor43;
	@FXML
	private ChoiceBox mat44;
	@FXML
	private ChoiceBox pre44;
	@FXML
	private ChoiceBox pres44;
	@FXML
	private ChoiceBox cor44;
	@FXML
	private ChoiceBox mat45;
	@FXML
	private ChoiceBox pre45;
	@FXML
	private ChoiceBox pres45;
	@FXML
	private ChoiceBox cor45;
	@FXML
	private ChoiceBox mat46;
	@FXML
	private ChoiceBox pre46;
	@FXML
	private ChoiceBox pres46;
	@FXML
	private ChoiceBox cor46;
	@FXML
	private ChoiceBox mat51;
	@FXML
	private ChoiceBox pre51;
	@FXML
	private ChoiceBox pres51;
	@FXML
	private ChoiceBox cor51;
	@FXML
	private ChoiceBox mat52;
	@FXML
	private ChoiceBox pre52;
	@FXML
	private ChoiceBox pres52;
	@FXML
	private ChoiceBox cor52;
	@FXML
	private ChoiceBox mat53;
	@FXML
	private ChoiceBox pre53;
	@FXML
	private ChoiceBox pres53;
	@FXML
	private ChoiceBox cor53;
	@FXML
	private ChoiceBox mat54;
	@FXML
	private ChoiceBox pre54;
	@FXML
	private ChoiceBox pres54;
	@FXML
	private ChoiceBox cor54;
	@FXML
	private ChoiceBox mat55;
	@FXML
	private ChoiceBox pre55;
	@FXML
	private ChoiceBox pres55;
	@FXML
	private ChoiceBox cor55;
	@FXML
	private ChoiceBox mat56;
	@FXML
	private ChoiceBox pre56;
	@FXML
	private ChoiceBox pres56;
	@FXML
	private ChoiceBox cor56;
	@FXML
	private ChoiceBox mat61;
	@FXML
	private ChoiceBox pre61;
	@FXML
	private ChoiceBox pres61;
	@FXML
	private ChoiceBox cor61;
	@FXML
	private ChoiceBox mat62;
	@FXML
	private ChoiceBox pre62;
	@FXML
	private ChoiceBox pres62;
	@FXML
	private ChoiceBox cor62;
	@FXML
	private ChoiceBox mat63;
	@FXML
	private ChoiceBox pre63;
	@FXML
	private ChoiceBox pres63;
	@FXML
	private ChoiceBox cor63;
	@FXML
	private ChoiceBox mat64;
	@FXML
	private ChoiceBox pre64;
	@FXML
	private ChoiceBox pres64;
	@FXML
	private ChoiceBox cor64;
	@FXML
	private ChoiceBox mat65;
	@FXML
	private ChoiceBox pre65;
	@FXML
	private ChoiceBox pres65;
	@FXML
	private ChoiceBox cor65;
	@FXML
	private ChoiceBox mat66;
	@FXML
	private ChoiceBox pre66;
	@FXML
	private ChoiceBox pres66;
	@FXML
	private ChoiceBox cor66;
	@FXML
	private ChoiceBox mat71;
	@FXML
	private ChoiceBox pre71;
	@FXML
	private ChoiceBox pres71;
	@FXML
	private ChoiceBox cor71;
	@FXML
	private ChoiceBox mat72;
	@FXML
	private ChoiceBox pre72;
	@FXML
	private ChoiceBox pres72;
	@FXML
	private ChoiceBox cor72;
	@FXML
	private ChoiceBox mat73;
	@FXML
	private ChoiceBox pre73;
	@FXML
	private ChoiceBox pres73;
	@FXML
	private ChoiceBox cor73;
	@FXML
	private ChoiceBox mat74;
	@FXML
	private ChoiceBox pre74;
	@FXML
	private ChoiceBox pres74;
	@FXML
	private ChoiceBox cor74;
	@FXML
	private ChoiceBox mat75;
	@FXML
	private ChoiceBox pre75;
	@FXML
	private ChoiceBox pres75;
	@FXML
	private ChoiceBox cor75;
	@FXML
	private ChoiceBox mat76;
	@FXML
	private ChoiceBox pre76;
	@FXML
	private ChoiceBox pres76;
	@FXML
	private ChoiceBox cor76;
	@FXML
	private ChoiceBox mat81;
	@FXML
	private ChoiceBox pre81;
	@FXML
	private ChoiceBox pres81;
	@FXML
	private ChoiceBox cor81;
	@FXML
	private ChoiceBox mat82;
	@FXML
	private ChoiceBox pre82;
	@FXML
	private ChoiceBox pres82;
	@FXML
	private ChoiceBox cor82;
	@FXML
	private ChoiceBox mat83;
	@FXML
	private ChoiceBox pre83;
	@FXML
	private ChoiceBox pres83;
	@FXML
	private ChoiceBox cor83;
	@FXML
	private ChoiceBox mat84;
	@FXML
	private ChoiceBox pre84;
	@FXML
	private ChoiceBox pres84;
	@FXML
	private ChoiceBox cor84;
	@FXML
	private ChoiceBox mat85;
	@FXML
	private ChoiceBox pre85;
	@FXML
	private ChoiceBox pres85;
	@FXML
	private ChoiceBox cor85;
	@FXML
	private ChoiceBox mat86;
	@FXML
	private ChoiceBox pre86;
	@FXML
	private ChoiceBox pres86;
	@FXML
	private ChoiceBox cor86;
	@FXML
	private ChoiceBox mat91;
	@FXML
	private ChoiceBox pre91;
	@FXML
	private ChoiceBox pres91;
	@FXML
	private ChoiceBox cor91;
	@FXML
	private ChoiceBox mat92;
	@FXML
	private ChoiceBox pre92;
	@FXML
	private ChoiceBox pres92;
	@FXML
	private ChoiceBox cor92;
	@FXML
	private ChoiceBox mat93;
	@FXML
	private ChoiceBox pre93;
	@FXML
	private ChoiceBox pres93;
	@FXML
	private ChoiceBox cor93;
	@FXML
	private ChoiceBox mat94;
	@FXML
	private ChoiceBox pre94;
	@FXML
	private ChoiceBox pres94;
	@FXML
	private ChoiceBox cor94;
	@FXML
	private ChoiceBox mat95;
	@FXML
	private ChoiceBox pre95;
	@FXML
	private ChoiceBox pres95;
	@FXML
	private ChoiceBox cor95;
	@FXML
	private ChoiceBox mat96;
	@FXML
	private ChoiceBox pre96;
	@FXML
	private ChoiceBox pres96;
	@FXML
	private ChoiceBox cor96;



	
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
	
	public void setPlan(Plan pl){
		
	}
	public boolean isOkClicked() {
        return okClicked;
    }
}
