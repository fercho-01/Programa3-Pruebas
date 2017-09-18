package com.udea.calculo;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class RegresionLinealTest {

	private RegresionLineal regresion;
	@Before
	public void setUp() throws Exception {
		regresion = new RegresionLineal();
	}

	@Test
	public void testPromedio() {
		List<Float> numeros = new ArrayList<>();
		numeros.add(10f);
		numeros.add(15f);
		numeros.add(20f);
		
		float resultado = regresion.calcularPromedio(numeros);
		assertTrue(resultado==15);
	}
	
	@Test
	public void testPromedioNegativos() {
		List<Float> numeros = new ArrayList<>();
		numeros.add(10f);
		numeros.add(-15f);
		numeros.add(20f);
		
		float resultado = regresion.calcularPromedio(numeros);
		assertTrue(resultado==5);
	}
	
	@Test
	public void testRealizarSuma() {
		List<Float> numeros = new ArrayList<>();
		numeros.add(10f);
		numeros.add(15f);
		numeros.add(20f);
		
		float resultado = regresion.realizarSuma(numeros);
		assertTrue(resultado==45);
	}
	
	@Test
	public void testRealizarSumaCuadrados() {
		List<Float> numeros = new ArrayList<>();
		numeros.add(10f);
		numeros.add(15f);
		numeros.add(20f);
		
		float resultado = regresion.realizarSumaCuadrados(numeros);
		assertTrue(resultado==725);
	}
	
	@Test
	public void testRealizarSumaXY() {
		List<Float> x = new ArrayList<>();
		x.add(10f);
		x.add(15f);
		x.add(20f);
		
		List<Float> y = new ArrayList<>();
		y.add(12f);
		y.add(17f);
		y.add(22f);
		
		float resultado = regresion.realizarSumaXY(x, y);
		assertTrue(resultado==815);
	}
	
	@Test
	public void testCalcularB0() {
		List<Float> x = new ArrayList<>();
		List<Float> y = new ArrayList<>();
		
		x.add(130f);	y.add(186f);
		x.add(650f);	y.add(699f);
		x.add(99f);		y.add(132f);
		x.add(150f);	y.add(272f);
		x.add(128f);	y.add(291f);
		x.add(302f);	y.add(331f);
		x.add(95f);		y.add(199f);
		x.add(945f);	y.add(1890f);
		x.add(368f);	y.add(788f);
		x.add(961f);	y.add(1601f);
		
		float B1 = 1.7279f;
		
		float B0 = regresion.calcularB0(x, y, B1);
		assertTrue(B0==-22.5401f);
		
	}
	
	@Test
	public void testCalcularB1() {
		List<Float> x = new ArrayList<>();
		List<Float> y = new ArrayList<>();
		
		x.add(130f);	y.add(186f);
		x.add(650f);	y.add(699f);
		x.add(99f);		y.add(132f);
		x.add(150f);	y.add(272f);
		x.add(128f);	y.add(291f);
		x.add(302f);	y.add(331f);
		x.add(95f);		y.add(199f);
		x.add(945f);	y.add(1890f);
		x.add(368f);	y.add(788f);
		x.add(961f);	y.add(1601f);
		
		float B1 = regresion.calcularB1(x, y);
		assertTrue(B1==1.7279321f);
	}
	
	@Test
	public void testCalcularR() {
		List<Float> x = new ArrayList<>();
		List<Float> y = new ArrayList<>();
		
		x.add(130f);	y.add(186f);
		x.add(650f);	y.add(699f);
		x.add(99f);		y.add(132f);
		x.add(150f);	y.add(272f);
		x.add(128f);	y.add(291f);
		x.add(302f);	y.add(331f);
		x.add(95f);		y.add(199f);
		x.add(945f);	y.add(1890f);
		x.add(368f);	y.add(788f);
		x.add(961f);	y.add(1601f);
		
		float r = regresion.calcularR(x, y);
		assertTrue(r==0.95449656f);
	}
	
	@Test
	public void testCalcularYk() {
		float B0 = -22.552f;
		float B1 = 1.727932f;
		float Xk = 386f;
		
		float Yk = regresion.calcularYk(B0, B1, Xk);
		assertTrue(Yk==644.42975f);
	}

}
