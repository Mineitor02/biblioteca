package biblioteca;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class LectorTest {
	 @Test
	    public void testGetAndSetNombre() {
	        Lector lector = new Lector();
	        lector.setNombre("Juan");
	        assertEquals("Juan", lector.getNombre(), "El nombre debe ser Juan");
	    }

	    @Test
	    public void testGetAndSetApellido() {
	        Lector lector = new Lector();
	        lector.setApellido("Pérez");
	        assertEquals("Pérez", lector.getApellido(), "El apellido debe ser Pérez");
	    }

	    @Test
	    public void testGetAndSetEmail() {
	        Lector lector = new Lector();
	        lector.setEmail("juan.perez@gmail.com");
	        assertEquals("juan.perez@gmail.com", lector.getEmail(), "El email debe ser juan.perez@gmail.com");
	    }

}
