package implementation;

/**
 * A mutable class that represents a BattleCow creature that might do battle in
 * our game. As such, it implements the Battleable interface. <br>
 * <br>
 * A BattleCow object has a name (String) and a strength (int).
 * @author Tewodros Kasahun
 */
public class BattleCow implements Battleable {

	private String name;
	private int strength;

	/**
	 * Standard constructor.
	 * 
	 * @param nameIn
	 *            desired name for this BattleCow
	 * @param strengthIn
	 *            starting strength for this BattleCow
	 */
	public BattleCow(String nameIn, int strengthIn) {
		name = nameIn;
		strength = strengthIn;
	}

	/**
	 * Copy constructor.
	 * 
	 * @param other
	 *            reference to the existing object which is the basis of the new one
	 */
	public BattleCow(BattleCow other) {
		name = other.name;
		strength = other.strength;
	}

	/**
	 * Getter for skill level of the BattleCow, which is always 5.
	 * 
	 * @return skill level of the BattleCow
	 */
	public int getLevel() {
		return 5;
	}

	/**
	 * Getter for name of the creature.
	 * 
	 * @return reference to the name of the BattleCow
	 */
	public String getName() {
		return name;
	}

	/**
	 * Getter for strength value of the BattleCow.
	 * 
	 * @return strength value of the BattleCow
	 */
	public int getStrength() {
		return strength;
	}

	/**
	 * Setter for the strength of the BattleCow.
	 * 
	 * @param newStrength
	 *            the new strength value for the BattleCow
	 */
	public void setStrength(int newStrength) {
		strength = newStrength;
	}

	/**
	 * Method to create an independent copy of the BattleCow.
	 * 
	 * @return independent copy of the BattleCow
	 */
	public Battleable returnDuplicate() {
		return new BattleCow(this);
	}

	public String toString() {
		return "BattleCow<Name: " + name + "  Strength: " + strength + ">";
	}
}
