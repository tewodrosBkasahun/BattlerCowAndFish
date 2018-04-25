package testing;

import static org.junit.Assert.*;

import java.util.Arrays;

import implementation.Battleable;
import implementation.BattleCow;
import implementation.BattleFish;
import implementation.BattleDeck;
import implementation.PokeeCreature;

import org.junit.Test;
/**
 * @author Tewodors Kasahun
 */
public class exampleTests {

	@Test
	public void testOne() {
		BattleDeck<BattleFish> bq = new BattleDeck<BattleFish>();
		bq.add(new BattleFish("one", 1));
		bq.add(new BattleFish("two", 2));
		bq.add(new BattleFish("three", 3));
		bq.add(new BattleFish("four", 4));

		assertEquals(
				"Contents: [ BattleFish<Name: three  Strength: 3>, BattleFish<Name: one  Strength: 1>, BattleFish<Name: two  Strength: 2>, BattleFish<Name: four  Strength: 4> ]",
				bq.toString());
	}

	@Test
	public void testTwo() {
		BattleDeck<BattleFish> bq = new BattleDeck<BattleFish>();
		bq.add(new BattleFish("one", 11));
		bq.add(new BattleFish("two", 12));
		bq.add(new BattleFish("three", 13));
		bq.add(new BattleFish("four", 14));

		assertEquals(
				"Contents: [ BattleFish<Name: three  Strength: 13>, BattleFish<Name: one  Strength: 11>, BattleFish<Name: two  Strength: 12>, BattleFish<Name: four  Strength: 14> ]",
				bq.toString());

		assertEquals("BattleFish<Name: four  Strength: 14>", bq.fight().toString());

		assertEquals("BattleFish<Name: two  Strength: 11>", bq.fight().toString());
	}

	@Test
	public void testThree() {
		BattleDeck<BattleFish> bq = new BattleDeck<BattleFish>();
		bq.add(new BattleFish("four", 14));
		bq.add(new BattleFish("three", 13));
		bq.add(new BattleFish("two", 12));
		bq.add(new BattleFish("one", 11));

		assertEquals(
				"Contents: [ BattleFish<Name: two  Strength: 12>, BattleFish<Name: four  Strength: 14>, BattleFish<Name: three  Strength: 13>, BattleFish<Name: one  Strength: 11> ]",
				bq.toString());

		assertEquals("BattleFish<Name: two  Strength: 12>", bq.fight().toString());

		assertEquals("BattleFish<Name: four  Strength: 13>", bq.fight().toString());

	}

	@Test
	public void testFour() {
		BattleDeck<BattleFish> bq = new BattleDeck<BattleFish>();
		bq.add(new BattleFish("one", 1));
		bq.add(new BattleFish("two", 2));
		bq.add(new BattleFish("three", 3));
		bq.add(new BattleFish("one", 1));
		bq.add(new BattleFish("two", 2));

		assertEquals(
				"Contents: [ BattleFish<Name: two  Strength: 2>, BattleFish<Name: three  Strength: 3>, BattleFish<Name: one  Strength: 1>, BattleFish<Name: two  Strength: 2>, BattleFish<Name: one  Strength: 1> ]",
				bq.toString());

		assertEquals("BattleFish<Name: two  Strength: 2>", bq.fight().toString());

		assertEquals("Contents: [ BattleFish<Name: three  Strength: 2>, BattleFish<Name: two  Strength: 1> ]",
				bq.toString());

		assertEquals("BattleFish<Name: three  Strength: 2>", bq.fight().toString());

		assertEquals("Contents: [  ]", bq.toString());
	}

	@Test
	public void testFive() {
		BattleDeck<Battleable> bq = new BattleDeck<Battleable>();

		bq.add(new BattleCow("one", 11));
		bq.add(new BattleFish("two", 12));
		bq.add(new BattleCow("three", 13));
		bq.add(new BattleFish("four", 14));

		assertEquals(
				"Contents: [ BattleCow<Name: three  Strength: 13>, BattleCow<Name: one  Strength: 11>, BattleFish<Name: two  Strength: 12>, BattleFish<Name: four  Strength: 14> ]",
				bq.toString());

		assertEquals("BattleCow<Name: three  Strength: 13>", bq.fight().toString());

		assertEquals("BattleCow<Name: one  Strength: 10>", bq.fight().toString());
	}

	@Test
	public void testSix() {
		BattleDeck<Battleable> bq = new BattleDeck<Battleable>();

		bq.add(new BattleCow("one", 11));
		bq.add(new PokeeCreature("A", 7));
		bq.add(new BattleFish("two", 12));
		bq.add(new PokeeCreature("Z", 7));
		bq.add(new BattleCow("three", 13));
		bq.add(new PokeeCreature("L", 7));
		bq.add(new BattleFish("four", 14));

		assertEquals(
				"Contents: [ BattleFish<Name: four  Strength: 14>, BattleCow<Name: three  Strength: 13>, BattleFish<Name: two  Strength: 12>, BattleCow<Name: one  Strength: 11>, PokeeCreature<Name: A  Strength: 7>, PokeeCreature<Name: Z  Strength: 7>, PokeeCreature<Name: L  Strength: 7> ]",
				bq.toString());

		assertEquals("PokeeCreature<Name: L  Strength: 7>", bq.fight().toString());

		assertEquals("BattleCow<Name: three  Strength: 12>", bq.fight().toString());

		assertEquals("PokeeCreature<Name: A  Strength: 5>", bq.fight().toString());

	}

	@Test
	public void testSeven() {
		BattleDeck<Battleable> bq = new BattleDeck<Battleable>();

		bq.add(new BattleCow("one", 11));
		bq.add(new PokeeCreature("A", 7));
		bq.add(new BattleFish("two", 12));
		bq.add(new PokeeCreature("Z", 7));
		bq.add(new BattleCow("three", 13));
		bq.add(new PokeeCreature("L", 7));
		bq.add(new BattleFish("four", 14));

		assertEquals("[]", Arrays.toString(bq.export2D()[2]));
		assertEquals("[]", Arrays.toString(bq.export2D()[3]));
		assertEquals("[]", Arrays.toString(bq.export2D()[4]));
		assertEquals("[PokeeCreature<Name: Z  Strength: 7>]", Arrays.toString(bq.export2D()[0]));
		assertEquals("[PokeeCreature<Name: L  Strength: 7>]", Arrays.toString(bq.export2D()[6]));
		assertEquals(
				"[BattleCow<Name: three  Strength: 13>, BattleCow<Name: one  Strength: 11>, PokeeCreature<Name: A  Strength: 7>]",
				Arrays.toString(bq.export2D()[5]));
		assertEquals("[BattleFish<Name: four  Strength: 14>, BattleFish<Name: two  Strength: 12>]",
				Arrays.toString(bq.export2D()[1]));

		assertEquals(
				"[BattleCow<Name: three  Strength: 13>, BattleCow<Name: one  Strength: 11>, PokeeCreature<Name: A  Strength: 7>]",
				Arrays.toString(bq.export2D()[5]));
		assertEquals("[PokeeCreature<Name: L  Strength: 7>]", Arrays.toString(bq.export2D()[6]));
		assertEquals("[]", Arrays.toString(bq.export2D()[8]));
		assertEquals("[]", Arrays.toString(bq.export2D()[9]));
	}

}
