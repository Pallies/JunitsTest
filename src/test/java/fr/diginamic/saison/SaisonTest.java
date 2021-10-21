package fr.diginamic.saison;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

import fr.diginamic.saison.EnumException;
import fr.diginamic.saison.Saison;

public class SaisonTest {

	@Test
	public void testLibelle() throws EnumException {
		Saison res = Saison.libelle("Printemps");
		assertEquals(  Saison.PRINTEMPS,res);
	}
	@Test(expected=EnumException.class)
	public void testLibelleNotEpx() throws EnumException{
		Saison.libelle("Prems");
	}
	@Test
	public void testLibelleNull() throws EnumException {
		Saison res = Saison.libelle(null);
		assertEquals(  null,res);
	}
	@Test(expected=EnumException.class)
	public void testLibelleInt() throws EnumException {
	Saison.libelle("1.1");
	}
	
}
