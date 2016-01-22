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

public class Carrera {
	private String codigo;
	private String nombre;
	private String facultad;
	private String description;
	private int estudiantes;
	private static URL url	= Carrera.class.getResource("carreras.sol");
	
	public Carrera(String codigo, String nombre, String facultad, String description, int estudiantes) {
		this.codigo = codigo;
		this.nombre = nombre;
		this.facultad = facultad;
		this.description = description;
		this.estudiantes = estudiantes;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getFacultad() {
		return facultad;
	}

	public void setFacultad(String facultad) {
		this.facultad = facultad;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getEstudiantes() {
		return estudiantes;
	}

	public void setEstudiantes(int estudiantes) {
		this.estudiantes = estudiantes;
	}
	
	public static HashMap<String, Carrera> cargarCarreras() throws IOException {
		
		File file = new File(url.getPath());
		HashMap<String, Carrera> hm = new HashMap<String, Carrera>();
		
		if(file.exists()){
			BufferedReader br 		= new BufferedReader(new FileReader(url.getPath()));
			
			try {
				String linea = br.readLine();
				linea		 = br.readLine();
				while (linea != null){
					String []atributos = linea.split("\\|");
					Carrera  car = new Carrera (atributos[0],atributos[1],atributos[2],atributos[3],
							Integer.parseInt(atributos[4]));
					hm.put(car.getCodigo(), car);
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
	
	public static void guardarCarreras(HashMap<String, Carrera> mp) throws IOException {
		
		FileWriter fl = new FileWriter(url.getPath());
		BufferedWriter bw = new BufferedWriter(fl);
		
		try {
			bw.write("Codigo|Nombre|Facultad|Descripcion|Estudiantes");
			
			for (Carrera value : mp.values()) {
				bw.newLine();
			    bw.write(value.getCodigo()+"|"+value.getNombre()+"|"+value.getFacultad()+"|"+
			    		 value.getDescription()+"|"+value.getEstudiantes());
			}
			
		}catch(IOException ex){
        	 ex.printStackTrace();
        }finally{
        	bw.close();
        }

	}
}
