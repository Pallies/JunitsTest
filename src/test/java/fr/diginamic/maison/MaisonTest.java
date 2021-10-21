package fr.diginamic.maison;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MaisonTest {

	@Test
	public void testAddPiece() {
		Maison maison = new Maison();
		maison.addPiece(null);
		assertEquals(0,maison.getPiece().length);
	}
	@Test
	public void testAddPieceNegatif() {
		SalleDeBain piece = new SalleDeBain(-3.00d,0);
		assertEquals(new SalleDeBain(3,0),piece);
	}
}
