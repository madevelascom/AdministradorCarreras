package application;
	
import java.io.IOException;
import java.util.HashMap;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.stage.Modality;
import javafx.stage.Stage;
import modulos.Carrera;
import modulos.MallaCurricular;
import modulos.Materia;
import modulos.Plan;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;


public class Main extends Application {
	
	private static Stage primaryStage;
	public BorderPane rootLayout;
	private Scene scene;
	public static ObservableList<Materia> materiaData = FXCollections.observableArrayList();
	public static ObservableList<Carrera> carreraData = FXCollections.observableArrayList();
	public static ObservableList<MallaCurricular> mallaData = FXCollections.observableArrayList();
	public static HashMap<String, ObservableList<Plan>> plansData = new HashMap<String, ObservableList<Plan>>();
	
	@Override
	public void start(Stage primaryStage) {
		 Main.primaryStage = primaryStage;
		 Main.primaryStage.setTitle("Administrador de Mallas Curriculares");  
		 
		 Main.primaryStage.getIcons().add(new Image("file:resources/appIcon.png"));
		 
		 initRootLayout();
	     
	}
	
	public void initRootLayout() {
        try {
            // Load root layout from fxml file.
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(Main.class.getResource("Root.fxml"));
            rootLayout = (BorderPane) loader.load();

            scene = new Scene(rootLayout);           
            
            primaryStage.setScene(scene);
            primaryStage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
	
	public static boolean showCarreraEditDialog(Carrera car) {
	    try {
	        // Load the fxml file and create a new stage for the popup dialog.
	        FXMLLoader loader = new FXMLLoader();
	        loader.setLocation(Main.class.getResource("EditCarrera.fxml"));
	        AnchorPane page = (AnchorPane) loader.load();

	        // Create the dialog Stage.
	        Stage dialogStage = new Stage();
	        dialogStage.setTitle("Crear/Editar Carrera");
	        dialogStage.initModality(Modality.WINDOW_MODAL);
	        dialogStage.initOwner(primaryStage);
	        dialogStage.getIcons().add(new Image("file:resources/appIcon.png"));
	        Scene scene = new Scene(page);
	        dialogStage.setScene(scene);

	        // Set the person into the controller.
	        CarreraController controller = loader.getController();
	        controller.setDialogStage(dialogStage);
	        controller.setCarrera(car);

	        // Show the dialog and wait until the user closes it
	        dialogStage.showAndWait();

	        return controller.isOkClicked();
	    } catch (IOException e) {
	        e.printStackTrace();
	        return false;
	    }
	}
	
	public static boolean showMateriaEditDialog(Materia mat) {
	    try {
	        // Load the fxml file and create a new stage for the popup dialog.
	        FXMLLoader loader = new FXMLLoader();
	        loader.setLocation(Main.class.getResource("EditMateria.fxml"));
	        AnchorPane page = (AnchorPane) loader.load();

	        // Create the dialog Stage.
	        Stage dialogStage = new Stage();
	        dialogStage.setTitle("Crear/Editar materia");
	        dialogStage.initModality(Modality.WINDOW_MODAL);
	        dialogStage.initOwner(primaryStage);
	        dialogStage.getIcons().add(new Image("file:resources/appIcon.png"));
	        Scene scene = new Scene(page);
	        dialogStage.setScene(scene);

	        // Set the person into the controller.
	        MateriaController controller = loader.getController();
	        controller.setDialogStage(dialogStage);
	        controller.setMateria(mat);

	        // Show the dialog and wait until the user closes it
	        dialogStage.showAndWait();

	        return controller.isOkClicked();
	    } catch (IOException e) {
	        e.printStackTrace();
	        return false;
	    }
	}
	
	public static ObservableList<Carrera> getCarreraData() {
        return carreraData;
    }
	
	public static ObservableList<Materia> getMateriaData(){
		return materiaData;
	}
	
	public static ObservableList<MallaCurricular> getMallaData(){
		return mallaData;
	}
	
	
	
	public static void main(String[] args) throws IOException {
		materiaData = Materia.cargarMaterias();
		carreraData = Carrera.cargarCarreras();
		mallaData = MallaCurricular.cargarMallas();
		
		for(MallaCurricular mal:mallaData){
			plansData.put(mal.getLocation(), Plan.cargarPlan(mal.getLocation()));
		}
		
		launch(args);
		
		Materia.guardarMaterias(materiaData);
		Carrera.guardarCarreras(carreraData);
		MallaCurricular.guardarMallas(mallaData);
		


	}
}
