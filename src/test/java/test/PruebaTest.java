package test;

import static org.junit.Assert.*;

import org.Prueba;
import org.junit.Test;

public class PruebaTest {

	Prueba p = new Prueba();
	@Test
	public void test() {
		assertEquals(5,p.getCont());
	}

}
