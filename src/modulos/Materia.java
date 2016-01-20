package modulos;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URL;
import java.util.HashMap;


public class Materia {
	private String codigo;
	private String nom;
	private String description;
	private int cret;
	private int crep;
	private static URL url	= Materia.class.getResource("materias.sol");
	
	public Materia(String codigo, String nom, String description, int cret, int crep) {
		this.codigo = codigo;
		this.nom = nom;
		this.description = description;
		this.cret = cret;
		this.crep = crep;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getCret() {
		return cret;
	}

	public void setCret(int cret) {
		this.cret = cret;
	}

	public int getCrep() {
		return crep;
	}

	public void setCrep(int crep) {
		this.crep = crep;
	}
	
	public static HashMap<String, Materia> cargarMaterias() throws IOException {
		
		File file = new File(url.getPath());
		HashMap<String, Materia> hm = new HashMap<String, Materia>();
		
		if(file.exists()){
			BufferedReader br 		= new BufferedReader(new FileReader(url.getPath()));
			
			try {
				String linea = br.readLine();
				linea		 = br.readLine();
				while (linea != null){
					String []atributos = linea.split("\\|");
					Materia  mat = new Materia (atributos[0],atributos[1],atributos[2],Integer.parseInt(atributos[3]),
							Integer.parseInt(atributos[4]));
					hm.put(mat.getCodigo(), mat);
					linea	=br.readLine();
				}					
			}catch(FileNotFoundException ex) {
	            System.out.println("No se puede abrir el archivo");                
	        }catch(IOException ex){
	        	 ex.printStackTrace();
	        }finally{
	        	br.close();
	        }
		}
		
	return hm;
	}
	
	public static void guardarMaterias(HashMap<String, Materia> mp) throws IOException {
		
		FileWriter fl = new FileWriter(url.getPath());
		BufferedWriter bw = new BufferedWriter(fl);
		
		try {
			bw.write("Codigo|Nombre|Descripcion|CTeoricos|CPracticos");
			
			for (Materia value : mp.values()) {
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
