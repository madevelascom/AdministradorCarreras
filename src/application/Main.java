package application;
	
import java.io.IOException;
import java.util.HashMap;

import javafx.application.Application;
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
	public static HashMap<String, Materia> mp = new HashMap<String, Materia>();
	public static HashMap<String, Carrera> hm = new HashMap<String, Carrera>();
	
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
	
	public static void main(String[] args) throws IOException {
		mp = Materia.cargarMaterias();
		hm = Carrera.cargarCarreras();
		
		launch(args);
		
		Materia.guardarMaterias(mp);
		Carrera.guardarCarreras(hm);

	}
}
