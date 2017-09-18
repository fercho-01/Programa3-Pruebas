package com.udea.datos;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class Datos {
	private List<Float> x;
	private List<Float> y;
	
	public List<Float> getX() {
		return x;
	}

	public List<Float> getY() {
		return y;
	}

	public boolean cargarDatos(String ruta) {

		x = new ArrayList<>();
		y = new ArrayList<>();
		
		File archivo = null;
		FileReader fileReader=null;
		BufferedReader br = null;
		
		try {
			String url = new File("").getAbsolutePath() + "/Archivos/" + ruta;
			archivo = new File(url);
			fileReader = new FileReader(archivo);
			br = new BufferedReader(fileReader);
			
			String linea;
	        while((linea=br.readLine())!=null){
	        	String datos[] = linea.split(",");
	            x.add(Float.parseFloat(datos[0]));
	            y.add(Float.parseFloat(datos[1]));
	        }
	        
	        return true;
		} catch (Exception e) {
			return false;
		}
	
	}
}
