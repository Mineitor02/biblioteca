package biblioteca;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;


public class LibroTest {

	@Test
    public void testGetAndSetTitulo() {
        Libro libro = new Libro();
        libro.setTitulo("1984");
        assertEquals("1984", libro.getTitulo(), "El título debe ser 1984");
    }

    @Test
    public void testGetAndSetAutor() {
        Libro libro = new Libro();
        libro.setAutor("George Orwell");
        assertEquals("George Orwell", libro.getAutor(), "El autor debe ser George Orwell");
    }

    @Test
    public void testDisponibilidad() {
        Libro libro = new Libro();
        libro.setDisponible(true);
        assertEquals(true, libro.isDisponible(), "El libro debe estar disponible");
    }
}
