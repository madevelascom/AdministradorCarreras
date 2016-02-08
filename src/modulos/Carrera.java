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


public class Carrera {
	private StringProperty  codigo;
	private StringProperty  nombre;
	private StringProperty  facultad;
	private StringProperty  description;
	private IntegerProperty estudiantes;
	private static URL url	= Carrera.class.getResource("carreras.sol");
	
	public Carrera(String codigo, String nombre, String facultad, String description, int estudiantes) {
		this.codigo 	= new SimpleStringProperty(codigo);
		this.nombre 	= new SimpleStringProperty(nombre);
		this.facultad	= new SimpleStringProperty(facultad);
		this.description = new SimpleStringProperty(description);
		this.estudiantes = new SimpleIntegerProperty(estudiantes);
	}
	
	public Carrera(){
		this.codigo 	= new SimpleStringProperty(" ");;
		this.nombre 	= new SimpleStringProperty(" ");;
		this.facultad 	= new SimpleStringProperty(" ");;
		this.description = new SimpleStringProperty(" ");;
		this.estudiantes = new SimpleIntegerProperty(0);
	}
	
	public StringProperty getCodigo() {
		return codigo;
	}

	public void setCodigo(StringProperty codigo) {
		this.codigo = codigo;
	}

	public StringProperty getNombre() {
		return nombre;
	}

	public void setNombre(StringProperty nombre) {
		this.nombre = nombre;
	}

	public StringProperty getFacultad() {
		return facultad;
	}

	public void setFacultad(StringProperty facultad) {
		this.facultad = facultad;
	}

	public StringProperty getDescription() {
		return description;
	}

	public void setDescription(StringProperty description) {
		this.description = description;
	}

	public IntegerProperty getEstudiantes() {
		return estudiantes;
	}

	public void setEstudiantes(IntegerProperty estudiantes) {
		this.estudiantes = estudiantes;
	}

	public static ObservableList<Carrera> cargarCarreras() throws IOException {
		
		ObservableList<Carrera> carreraData = FXCollections.observableArrayList();
		BufferedReader br 		= new BufferedReader(new FileReader(url.getPath()));
			
		try {
			String linea = br.readLine();
			linea		 = br.readLine();
			while (linea != null){
				String []atributos = linea.split("\\|");
				Carrera  car = new Carrera (atributos[0],atributos[1],atributos[2],atributos[3],
						Integer.parseInt(atributos[4]));
				carreraData.add(car);
				linea	=br.readLine();
				}					
		}catch(FileNotFoundException ex) {
	         System.out.println("No se puede abrir el archivo");                
	    }catch(IOException ex){
	    	ex.printStackTrace();
	    }finally{
	        br.close();
	    }

	return carreraData;
	}
	
	public static void guardarCarreras(ObservableList<Carrera> carreraData) throws IOException {
		
		FileWriter fl = new FileWriter(url.getPath());
		BufferedWriter bw = new BufferedWriter(fl);
		
		try {
			bw.write("Codigo|Nombre|Facultad|Descripcion|Estudiantes");
			
			for (Carrera value : carreraData) {
				bw.newLine();
			    bw.write(value.getCodigo().getValue()+"|"+value.getNombre().getValue()+"|"+value.getFacultad().getValue()+"|"+
			    		 value.getDescription().getValue()+"|"+value.getEstudiantes().getValue());
			}
			
		}catch(IOException ex){
        	 ex.printStackTrace();
        }finally{
        	bw.close();
        }

	}
}
