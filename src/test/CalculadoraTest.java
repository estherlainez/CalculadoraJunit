package test;

import code.Calculadora;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

public class CalculadoraTest {
	
	Calculadora calc;
	
	@Before
	public void iniciaCalculadora() {
		System.out.println("Before");
		this.calc = new Calculadora(4,5);
	}

	@Ignore
	@Test 
	public void testCalculadora() {
		fail("Not yet implemented");
	}

	@Test
	public void testSuma() {
		System.out.println("Probando la suma");
		int resultado = calc.suma();
		assertEquals(9, resultado);
	}

	@Test
	public void testResta() {
		System.out.println("Probando la resta");
		int resultado=calc.resta();
		assertEquals(-1, resultado);
	}

	@Test
	public void testProducto() {
		System.out.println("Probando la multiplicacion");
		int resultado= calc.producto();
		assertEquals(20, resultado);
	}

	@Test
	public void testDivision() {
		System.out.println("Probando la division");
		float resultado = calc.division();
		float esperado = 0.8f;
		assertEquals(1, resultado, esperado );
	}

}
