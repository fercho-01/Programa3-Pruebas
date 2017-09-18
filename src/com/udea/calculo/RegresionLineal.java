package com.udea.calculo;

import java.util.List;

public class RegresionLineal {
	private List<Float> x;
	private List<Float> y;
	
	private float b0=0;
	private float b1=0;
	private float r=0;
	private float r2=0;
	private float yk=0;
	private float xk=0;
	
	public float calcularPromedio(List<Float> valores) {
		float suma = realizarSuma(valores);
		return suma/valores.size();
	}
	
	public float realizarSuma(List<Float> valores) {
		float suma=0;
		for (Float numero : valores) {
			suma+=numero;
		}
		return suma;
	}
	
	public float realizarSumaCuadrados(List<Float> valores) {
		float suma=0;
		for (Float numero : valores) {
			suma+=Math.pow(numero, 2);
		}
		return suma;
	}
	
	public float realizarSumaXY(List<Float> x, List<Float> y) {
		float suma = 0;
		for(int i=0;i<x.size();i++) {
			suma+=x.get(i)*y.get(i);
		}
		return suma;
	}
	
	public float calcularB0(List<Float> x,List<Float> y, float B1) {
		float promedioX = calcularPromedio(x);
		float promedioY = calcularPromedio(y);
		float B0 = promedioY - (B1*promedioX);
		return B0;
	}
	
	public float calcularB1(List<Float> x, List<Float> y) {
		float sumaXY = realizarSumaXY(x, y);
		float promedioX = calcularPromedio(x);
		float promedioY = calcularPromedio(y);
		float sumaCuadradosX = realizarSumaCuadrados(x);
		float n = x.size();
		float B1 = (sumaXY-(n*promedioX*promedioY))/(sumaCuadradosX-(n*(float)Math.pow(promedioX, 2)));
		return B1;
	}
	
	public float calcularR(List<Float> x, List<Float> y) {
		float n = x.size();
		float sumaXY = realizarSumaXY(x, y);
		float sumaX = realizarSuma(x);
		float sumaY = realizarSuma(y);
		float sumaCuadradoX = realizarSumaCuadrados(x);
		float sumaCuadradoY = realizarSumaCuadrados(y);
		
		float dividendo = (n*sumaXY)-(sumaX*sumaY);
		float divisor = (float) Math.sqrt(((n*sumaCuadradoX)-Math.pow(sumaX, 2))*((n*sumaCuadradoY)-Math.pow(sumaY, 2)));
		float r = dividendo/divisor;
		return r;
	}
	
	public float calcularYk(float B0,float B1,float Xk) {
		return B0+(B1*Xk);
	}
	
	
}
