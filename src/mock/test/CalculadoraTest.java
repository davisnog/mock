package mock.test;

import static org.junit.Assert.*;

import javax.servlet.http.HttpServletRequest;

import mock.Calculadora;

import org.junit.Test;

public class CalculadoraTest {

	@Test
	public void deveRetornar5naSomaDe3E2() {
		HttpServletRequest req = new HttpServletRequestMaroto();
		
		Calculadora calculadora = new Calculadora();
		int resultado = calculadora.soma(req);
		
		assertEquals(5, resultado);
	}

}
