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


public class Materia {
	private StringProperty codigo;
	private StringProperty nom;
	private StringProperty description;
	private IntegerProperty cret;
	private IntegerProperty crep;
	private static URL url	= Materia.class.getResource("materias.sol");
	
	public Materia(String codigo, String nom, String description, int cret, int crep) {
		this.codigo = new SimpleStringProperty(codigo);
		this.nom = new SimpleStringProperty(nom);
		this.description = new SimpleStringProperty(description);
		this.cret = new SimpleIntegerProperty(cret);
		this.crep = new SimpleIntegerProperty(crep);
	}

	public StringProperty getCodigo() {
		return codigo;
	}

	public void setCodigo(StringProperty codigo) {
		this.codigo = codigo;
	}

	public StringProperty getNom() {
		return nom;
	}

	public void setNom(StringProperty nom) {
		this.nom = nom;
	}

	public StringProperty getDescription() {
		return description;
	}

	public void setDescription(StringProperty description) {
		this.description = description;
	}

	public IntegerProperty getCret() {
		return cret;
	}

	public void setCret(IntegerProperty cret) {
		this.cret = cret;
	}

	public IntegerProperty getCrep() {
		return crep;
	}

	public void setCrep(IntegerProperty crep) {
		this.crep = crep;
	}



	public static ObservableList<Materia> cargarMaterias() throws IOException {
		
		ObservableList<Materia> materiaData = FXCollections.observableArrayList();
		BufferedReader br 		= new BufferedReader(new FileReader(url.getPath()));
			
		try {
			String linea = br.readLine();
			linea		 = br.readLine();
			while (linea != null){
				String []atributos = linea.split("\\|");
				int ct = Integer.parseInt(atributos[3]);
				int cp = Integer.parseInt(atributos[4]);
				Materia  mat = new Materia (atributos[0],atributos[1],atributos[2],ct,cp);
				materiaData.add(mat);
				linea	=br.readLine();
			}					
		}catch(FileNotFoundException ex) {
	        System.out.println("No se puede abrir el archivo");                
	    }catch(IOException ex){
	        ex.printStackTrace();
	    }finally{
	    	 br.close();
	    }

	return materiaData;
	}
	
	public static void guardarMaterias(ObservableList<Materia> materiaData) throws IOException {
		
		FileWriter fl = new FileWriter(url.getPath());
		BufferedWriter bw = new BufferedWriter(fl);
		
		try {
			bw.write("Codigo|Nombre|Descripcion|CTeoricos|CPracticos");
			
			for (Materia value : materiaData) {
				bw.newLine();
			    bw.write(value.getCodigo()+"|"+value.getNom()+"|"+value.getDescription()+"|"+
			    		 value.getCret()+"|"+value.getCrep());
			}
			
		}catch(IOException ex){
        	 ex.printStackTrace();
        }finally{
        	bw.close();
        }

	}
}
