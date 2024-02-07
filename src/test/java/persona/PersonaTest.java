package persona;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PersonaTest {

	private Persona persona;

	@BeforeEach
	void iniciar() {
		persona = new Persona("Gonzalo", 27, 'H');
	}

	@AfterEach
	void finalizar() {
		persona = null;
	}

	@Test
	void testMayorDeEdad() {
		assertTrue(persona.esMayorDeEdad());
	}

	@Test
	void testMenorDeEdad() {
		persona.setEdad(1);
		assertFalse(persona.esMayorDeEdad());
	}

	@Test
	void testConstructor() {
		persona = new Persona();
	}

	@Test
	void testSetPeso() {
		persona.setPeso(30);
	}

	@Test
	void testSetEdad() {
		persona.setEdad(30);
	}

	@Test
	void testSetNombre() {
		persona.setNombre("Gonzalo");
	}

	@Test
	void testSetSexo() {
		persona.setSexo('H');
	}
	
}
