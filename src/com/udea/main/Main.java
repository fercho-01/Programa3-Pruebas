package com.udea.main;

import com.udea.datos.Datos;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Datos datos = new Datos();
		boolean resultado = datos.cargarDatos("datos.txt");
		
		
		
		System.out.println(resultado);
		for (float numero : datos.getY()) {
			System.out.println(numero);
		}
		
		
	}

}
