package fr.test.git.bush;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestGiTBushTest {
	 VerifPersonne VP=new VerifPersonne("athar", "Etudiante", 32);

	@Test
	public void testNom() {
		assertEquals("athar",VP.getNom());
	}
	@Test
	public void testEmploi() {
		assertEquals("Etudiante",VP.getEmploi());
	}
	@Test
	public void testAge() {
		assertEquals(32,VP.getAge());
	}
}
