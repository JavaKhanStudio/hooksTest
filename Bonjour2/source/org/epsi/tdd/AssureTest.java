package org.epsi.tdd;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.apache.commons.lang3.StringUtils;
import org.junit.jupiter.api.Test;

public class AssureTest {

	@Test
	public void testAssure() throws Exception {
		Assure assure = new Assure("nom", "prenom", "email") ; 
		assertNotNull(assure.nom);
		assertNotNull(assure.prenom);
		assertNotNull(assure.email);
		
		
		assertThrows(Exception.class, () -> {
			Assure assureVide = new Assure("ffr", "frfr", "") ;
	    });
		
		assertThrows(Exception.class, () -> {
			Assure assureVide = new Assure("", "frfr", "frferfre") ;
	    });
		
		assertThrows(Exception.class, () -> {
			Assure assureVide = new Assure("frfrf", "frfrf", "") ;
	    });
		
	
		
	}
	
}
