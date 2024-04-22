package biblioteca;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Mensaje de inicio
				System.out.println("Inicio de programa....");
				
				
				//Configuración de hibernate
				
				Configuration cfg = new Configuration().configure();
				
				//Configuración de Hibernate
				
				
				SessionFactory sessionFactory = cfg.buildSessionFactory(new StandardServiceRegistryBuilder().configure().build());
				
				//Abrimos sesión
				
			
				@SuppressWarnings("unused")
				Session session = sessionFactory.openSession();
				
				//Mensaje comprobación
				
				System.out.println("Configuración realizada");
				
				 // Iniciamos una transacción
		        Transaction tx = session.beginTransaction();

		        // Creamos instancias de Libro
		        Libro libro1 = new Libro();
		        libro1.setTitulo("Cien años de soledad");
		        libro1.setAutor("Gabriel García Márquez");
		        libro1.setAnioPublicacion(1967);
		        libro1.setDisponible(true);

		        Libro libro2 = new Libro();
		        libro2.setTitulo("1984");
		        libro2.setAutor("George Orwell");
		        libro2.setAnioPublicacion(1949);
		        libro2.setDisponible(true);
		        
		        Libro libro3 = new Libro();
		        libro3.setTitulo("El Principito");
		        libro3.setAutor("Antoine de Saint-Exupéry");
		        libro3.setAnioPublicacion(1943);
		        libro3.setDisponible(true);

		        Libro libro4 = new Libro();
		        libro4.setTitulo("La sombra del viento");
		        libro4.setAutor("Carlos Ruiz Zafón");
		        libro4.setAnioPublicacion(2001);
		        libro4.setDisponible(true);

		        // Guardamos libros
		        session.save(libro1);
		        session.save(libro2);
		        session.save(libro3);
		        session.save(libro4);
		        
		        // Crear instancias de Lector
		        Lector lector1 = new Lector();
		        lector1.setNombre("Juan");
		        lector1.setApellido("Pérez");
		        lector1.setEmail("juan.perez@gmail.com");

		        Lector lector2 = new Lector();
		        lector2.setNombre("Ana");
		        lector2.setApellido("Lopez");
		        lector2.setEmail("ana.lopez@gmail.com");
		        
		        Lector lector3 = new Lector();
		        lector3.setNombre("Carlos");
		        lector3.setApellido("Martínez");
		        lector3.setEmail("carlos.martinez@gmail.com");

		        Lector lector4 = new Lector();
		        lector4.setNombre("María");
		        lector4.setApellido("González");
		        lector4.setEmail("maria.gonzalez@gmail.com");

		        // Guardar lectores
		        session.save(lector1);
		        session.save(lector2);
		        session.save(lector3);
		        session.save(lector4);
		        
		     // Crear instancias de Prestamo
		        Prestamo prestamo1 = new Prestamo();
		        prestamo1.setFechaPrestamo(new Date());
		        prestamo1.setFechaDevolucion(null); 
		        prestamo1.setLibro(libro1);
		        prestamo1.setLector(lector1);

		        Prestamo prestamo2 = new Prestamo();
		        prestamo2.setFechaPrestamo(new Date());
		        prestamo2.setFechaDevolucion(null); 
		        prestamo2.setLibro(libro2);
		        prestamo2.setLector(lector2);
		        
		        Prestamo prestamo3 = new Prestamo();
		        prestamo3.setFechaPrestamo(new Date());
		        prestamo3.setFechaDevolucion(null); 
		        prestamo3.setLibro(libro3);
		        prestamo3.setLector(lector3);

		        Prestamo prestamo4 = new Prestamo();
		        prestamo4.setFechaPrestamo(new Date());
		        prestamo4.setFechaDevolucion(null); 
		        prestamo4.setLibro(libro4);
		        prestamo4.setLector(lector4);

		        // Guardar préstamos
		        session.save(prestamo1);
		        session.save(prestamo2);
		        session.save(prestamo3);
		        session.save(prestamo4);

		        // Completamos la transacción
		        tx.commit();

		        // Cerramos la sesión
		        session.close();

		        System.out.println("Datos insertados correctamente");
				
			}
	}

