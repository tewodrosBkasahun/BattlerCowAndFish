package implementation;

/**
 * A mutable class that represents a BattleFish creature that might do battle in
 * our game. As such, it implements the Battleable interface. <br>
 * <br>
 * A BattleFish object has a name (String) and a strength (int).
 * @author Tewodros Kasahun
 */
public class BattleFish implements Battleable {

	private String name;
	private int strength;

	/**
	 * Standard constructor.
	 * 
	 * @param nameIn
	 *            desired name for this BattleFish
	 * @param strengthIn
	 *            starting strength for this BattleFish
	 */
	public BattleFish(String nameIn, int strengthIn) {
		name = nameIn;
		strength = strengthIn;
	}

	/**
	 * Copy constructor.
	 * 
	 * @param other
	 *            reference to the existing object which is the basis of the new one
	 */
	public BattleFish(BattleFish other) {
		name = other.name;
		strength = other.strength;
	}

	/**
	 * Getter for skill level of the BattleFish, which is always 1.
	 * 
	 * @return skill level of the BattleFish
	 */
	public int getLevel() {
		return 1;
	}

	/**
	 * Getter for name of the creature.
	 * 
	 * @return reference to the name of the BattleFish
	 */
	public String getName() {
		return name;
	}

	/**
	 * Getter for strength value of the BattleFish.
	 * 
	 * @return strength value of the BattleFish
	 */
	public int getStrength() {
		return strength;
	}

	/**
	 * Setter for the strength of the BattleFish.
	 * 
	 * @param newStrength
	 *            the new strength value for the BattleFish
	 */
	public void setStrength(int newStrength) {
		strength = newStrength;
	}

	/**
	 * Method to create an independent copy of the BattleFish.
	 * 
	 * @return independent copy of the BattleFish
	 */
	public Battleable returnDuplicate() {
		return new BattleFish(this);
	}

	public String toString() {
		return "BattleFish<Name: " + name + "  Strength: " + strength + ">";
	}
}
