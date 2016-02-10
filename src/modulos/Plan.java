package modulos;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URL;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class Plan {
	
	private StringProperty code;
	private StringProperty nombre;
	private StringProperty req;
	private StringProperty cor;
	private StringProperty semestre;
	
	public Plan(String code, String nombre, String req, String cor, String semestre) {
		this.code = new SimpleStringProperty(code);
		this.nombre = new SimpleStringProperty(nombre);
		this.req = new SimpleStringProperty(req);
		this.cor = new SimpleStringProperty(cor);
		this.semestre = new SimpleStringProperty(semestre);
	}
	
	public Plan(){
		this.code = new SimpleStringProperty("");
		this.nombre = new SimpleStringProperty("");
		this.req = new SimpleStringProperty("");
		this.cor = new SimpleStringProperty("");
		this.semestre = new SimpleStringProperty("");
	}

	public StringProperty getCode() {
		return code;
	}

	public void setCode(StringProperty code) {
		this.code = code;
	}

	public StringProperty getNombre() {
		return nombre;
	}

	public void setNombre(StringProperty nombre) {
		this.nombre = nombre;
	}

	public StringProperty getReq() {
		return req;
	}

	public void setReq(StringProperty req) {
		this.req = req;
	}

	public StringProperty getCor() {
		return cor;
	}

	public void setCor(StringProperty cor) {
		this.cor = cor;
	}

	public StringProperty getSemestre() {
		return semestre;
	}

	public void setSemestre(StringProperty semestre) {
		this.semestre = semestre;
	}
	
	public static ObservableList<Plan> cargarPlan(String dir) throws IOException {
		
		URL url	= MallaCurricular.class.getResource(dir);
		ObservableList<Plan> planData = FXCollections.observableArrayList();
		BufferedReader br 		= new BufferedReader(new FileReader(url.getPath()));
		
		try {
			String linea = br.readLine();
			linea		 = br.readLine();
			while (linea != null){
				String []atributos = linea.split("\\|");
				Plan  pl = new Plan (atributos[0],atributos[1],atributos[2],atributos[3],atributos[4]);
				planData.add(pl);
				linea	=br.readLine();
			}
		}catch(FileNotFoundException ex) {
	        System.out.println("No se puede abrir el archivo");                
	    }catch(IOException ex){
	        ex.printStackTrace();
	    }finally{
	    	 br.close();
	    }	
		
		return planData;
	}
	
	public static void guardarPlan(ObservableList<Plan> plan, String dir) throws IOException{
		
		File file = new File("C:/Users/Administrator/workspace/AdminMallasCurriculares/bin/modulos/"+dir);
		file.createNewFile();
		
		URL url	= MallaCurricular.class.getResource(file.getName());	
		FileWriter fl = new FileWriter(url.getPath());
		BufferedWriter bw = new BufferedWriter(fl);
		
		try {
			bw.write("Codigo|Nombre|Requisitos|Correquisitos|Semestre");
			for(Plan pl:plan){
				bw.newLine();
				bw.write(pl.getCode().getValue()+"|"+pl.getNombre().getValue()+"|"+pl.getReq().getValue()
						+"|"+pl.getCor().getValue()+"|"+pl.getSemestre().getValue());
			}
		}catch(IOException ex){
	       	 ex.printStackTrace();
	    }finally{
	       	bw.close();
	    }
	}
	
}
