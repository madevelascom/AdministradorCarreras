package modulos;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URL;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class MallaCurricular {
	private StringProperty carrera;
	private IntegerProperty version;
	private StringProperty elaborado;
	private StringProperty fecha;
	private String location;
	
	private static URL url	= MallaCurricular.class.getResource("mallas.sol");
	
	public MallaCurricular(String carrera, int version, String elaborado, String fecha, String location){
		this.carrera = new SimpleStringProperty(carrera);
		this.version = new SimpleIntegerProperty(version);
		this.elaborado = new SimpleStringProperty(elaborado);
		this.fecha = new SimpleStringProperty(fecha);
		this.location = location;
	}
	
	public MallaCurricular(){
		this.carrera = new SimpleStringProperty("");
		this.version = new SimpleIntegerProperty(0);
		this.elaborado = new SimpleStringProperty("");
		this.fecha = new SimpleStringProperty("");
		this.location = "";
	}

	public StringProperty getCarrera() {
		return carrera;
	}

	public void setCarrera(StringProperty carrera) {
		this.carrera = carrera;
	}

	public IntegerProperty getVersion() {
		return version;
	}
	
	public IntegerProperty IDProperty() {
		return version;
	}
	public StringProperty NameProperty() {
		return carrera;
	}
	
	public void setVersion(IntegerProperty version) {
		this.version = version;
	}

	public StringProperty getElaborado() {
		return elaborado;
	}

	public void setElaborado(StringProperty elaborado) {
		this.elaborado = elaborado;
	}

	public StringProperty getFecha() {
		return fecha;
	}

	public void setFecha(StringProperty fecha) {
		this.fecha = fecha;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}
	
	public static ObservableList<MallaCurricular> cargarMallas() throws IOException {
		
		ObservableList<MallaCurricular> mallaData = FXCollections.observableArrayList();
		BufferedReader br 		= new BufferedReader(new FileReader(url.getPath()));
		
		try {
			String linea = br.readLine();
			linea		 = br.readLine();
			while (linea != null){
				String []atributos = linea.split("\\|");
				MallaCurricular  mat = new MallaCurricular (atributos[0],Integer.parseInt(atributos[1]),
						atributos[2],atributos[3],atributos[4]);
				mallaData.add(mat);
				linea	=br.readLine();
			}					
		}catch(FileNotFoundException ex) {
	        System.out.println("No se puede abrir el archivo");                
	    }catch(IOException ex){
	        ex.printStackTrace();
	    }finally{
	    	 br.close();
	    }	
		return mallaData;
	}
	
	public static void guardarMallas(ObservableList<MallaCurricular> mallaData) throws IOException{
		FileWriter fl = new FileWriter(url.getPath());
		BufferedWriter bw = new BufferedWriter(fl);
		
		try {
			bw.write("Carrera|Version|Elaborado|Fecha|Ubicacion");
			
			for (MallaCurricular value: mallaData){
				bw.newLine();
				bw.write(value.getCarrera().getValue()+"|"+value.getVersion().getValue()
						+"|"+value.getElaborado().getValue()+"|"+value.getFecha().getValue()+"|"+value.getLocation());
			}
		}catch(IOException ex){
       	 ex.printStackTrace();
       }finally{
       	bw.close();
       }
	}
}
