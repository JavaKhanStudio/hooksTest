import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.Test;

public class TestMe {

	@Test
	public void testThisMethode() {
		int value = 5/3 ; 
		assertEquals(value, 1);
		assertNull(getClass());
	}

	
}
