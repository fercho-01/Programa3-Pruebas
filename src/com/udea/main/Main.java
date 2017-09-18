package com.udea.main;

import com.udea.calculo.RegresionLineal;
import com.udea.datos.Datos;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Datos datos = new Datos();
		boolean resultado = datos.cargarDatos("datos T4.txt");
		
		System.out.println(resultado);
		RegresionLineal regresion = new RegresionLineal();
		float B1 = regresion.calcularB1(datos.getX(), datos.getY());
		float B0 = regresion.calcularB0(datos.getX(), datos.getY(), B1);
		float r = regresion.calcularR(datos.getX(), datos.getY());
		float r2 = (float) Math.pow(r, 2);
		float Yk = regresion.calcularYk(B0, B1,386f );
		
		System.out.println("B0: "+B0);
		System.out.println("B1: "+B1);
		System.out.println("r: "+r);
		System.out.println("r^2: "+r2);
		System.out.println("Yk: "+Yk);
		
	}

}
