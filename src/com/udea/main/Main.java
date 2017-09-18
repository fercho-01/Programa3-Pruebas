package com.udea.main;

import com.udea.calculo.RegresionLineal;
import com.udea.datos.Datos;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Datos datos = new Datos();
		boolean resultado = datos.cargarDatos("datos.txt");
		
		RegresionLineal regresion = new RegresionLineal();
		System.out.println(regresion.calcularPromedio(datos.getY()));
		
		System.out.println(resultado);
		for (float numero : datos.getX()) {
			System.out.println(numero);
		}
		
		
	}

}
