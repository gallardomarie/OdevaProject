package odeva.odeva;

import static org.junit.Assert.*;

import org.junit.Test;

public class VoitureTest {
	
	Voiture maVoiture = new Voiture("Lamborghini",2000);
	
	/**
	 * Test des getters de ma classe Voiture
	 */

	@Test
	public void getMarqueTest(){
		assertEquals("Lamborghini", maVoiture.getMarque());
		assertFalse("Porshe".equals(maVoiture.getMarque()));	
	}
	
	@Test
	public void getAnneeTest(){
		assertEquals(2000, maVoiture.getAnnee());
		assertFalse(0 == maVoiture.getAnnee());	
	}
	
	@Test
	public void getKmTest(){
		assertEquals(0, maVoiture.getKilometre());
		assertFalse(540 == maVoiture.getKilometre());	
	}



	/**
	 * Test des setters de ma classe Voiture
	 */
	
	@Test
	public void setMarqueTest(){
		maVoiture.setMarque("maMarque");
		assertEquals("maMarque", maVoiture.getMarque());
		assertFalse("Lamborghini".equals(maVoiture.getMarque()));	
	}
	
	@Test
	public void setAnneeTest(){
		maVoiture.setAnnee(2002);
		assertEquals(2002, maVoiture.getAnnee());
		assertFalse(2000 == maVoiture.getAnnee());	
	}
	
	@Test
	public void rouleTest(){
		maVoiture.roule(10);
		assertEquals(10, maVoiture.getKilometre());
		assertFalse(0 == maVoiture.getKilometre());	
	}
		
}
