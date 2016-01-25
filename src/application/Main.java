package application;
	
import java.io.IOException;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import modulos.Carrera;
import modulos.Materia;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;


public class Main extends Application {
	
	private Stage primaryStage;
	private BorderPane rootLayout;
	private Scene scene;
	public static ObservableList<Materia> materiaData = FXCollections.observableArrayList();
	public static ObservableList<Carrera> carreraData = FXCollections.observableArrayList();
	
	@Override
	public void start(Stage primaryStage) {
		 this.primaryStage = primaryStage;
		 this.primaryStage.setTitle("Administrador de Mallas Curriculares");  
		 
		 initRootLayout();
	     
	}
	
	public void initRootLayout() {
        try {
            // Load root layout from fxml file.
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(Main.class.getResource("Root.fxml"));
            rootLayout = (BorderPane) loader.load();

            // Show the scene containing the root layout.
            scene = new Scene(rootLayout);           
            
            primaryStage.setScene(scene);
            primaryStage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
	
	public static ObservableList<Carrera> getCarreraData() {
        return carreraData;
    }
	
	public static ObservableList<Materia> getMateriaData(){
		return materiaData;
	}
	
	public static void main(String[] args) throws IOException {
		materiaData = Materia.cargarMaterias();
		carreraData = Carrera.cargarCarreras();
		
		launch(args);
		
		Materia.guardarMaterias(materiaData);
		Carrera.guardarCarreras(carreraData);

	}
}
