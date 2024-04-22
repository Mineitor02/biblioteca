package biblioteca;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Date;

import org.junit.jupiter.api.Test;

public class prestamoTest {
	 @Test
	    public void testGetAndSetFechaPrestamo() {
	        Prestamo prestamo = new Prestamo();
	        Date now = new Date();
	        prestamo.setFechaPrestamo(now);
	        assertEquals(now, prestamo.getFechaPrestamo(), "La fecha de préstamo debe ser la actual");
	    }

	    @Test
	    public void testRelaciones() {
	        Libro libro = new Libro();
	        libro.setTitulo("El Principito");

	        Lector lector = new Lector();
	        lector.setNombre("Ana");

	        Prestamo prestamo = new Prestamo();
	        prestamo.setLibro(libro);
	        prestamo.setLector(lector);

	        assertEquals("El Principito", prestamo.getLibro().getTitulo(), "El libro asociado debe ser 'El Principito'");
	        assertEquals("Ana", prestamo.getLector().getNombre(), "El lector asociado debe ser Ana");
	    }
}
