package org.epsi.cafetiere.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.epsi.cafetiere.Tasse;
import org.junit.jupiter.api.Test;

public class MesTestCafetiere {

	@Test
	public void testTasseVide() {
		Tasse tasse = new Tasse() ; 
		
		assertNull(tasse.cafe) ; 
		assertEquals(tasse.quantiteCafeMax, 100);
	}
	
}
