package implementation;

/**
 * A mutable class that represents a PokeeCreature creature that might do battle
 * in our game. As such, it implements the Battleable interface. <br>
 * <br>
 * A PokeeCreature object has a name (String) and a strength (int).
 */
public class PokeeCreature implements Battleable {

	private String name;
	private int strength;

	/**
	 * Standard constructor.
	 * 
	 * @param nameIn
	 *            desired name for this PokeeCreature
	 * @param strengthIn
	 *            starting strength for this PokeeCreature
	 */
	public PokeeCreature(String nameIn, int strengthIn) {
		name = nameIn;
		strength = strengthIn;
	}

	/**
	 * Copy constructor.
	 * 
	 * @param other
	 *            reference to the existing object which is the basis of the new one
	 */
	public PokeeCreature(PokeeCreature other) {
		name = other.name;
		strength = other.strength;
	}

	/**
	 * Getter for skill level of the PokeeCreature, which is calculated based on the
	 * first character of the name of the PokeeCreature.
	 * 
	 * @return skill level of the PokeeCreature
	 */
	public int getLevel() {
		return (int) name.charAt(0) % 10;
	}

	/**
	 * Getter for name of the creature.
	 * 
	 * @return reference to the name of the PokeeCreature
	 */
	public String getName() {
		return name;
	}

	/**
	 * Getter for strength value of the PokeeCreature.
	 * 
	 * @return strength value of the PokeeCreature
	 */
	public int getStrength() {
		return strength;
	}

	/**
	 * Setter for the strength of the PokeeCreature.
	 * 
	 * @param newStrength
	 *            the new strength value for the PokeeCreature
	 */
	public void setStrength(int newStrength) {
		strength = newStrength;
	}

	/**
	 * Method to create an independent copy of the PokeeCreature.
	 * 
	 * @return independent copy of the PokeeCreature
	 */
	public Battleable returnDuplicate() {
		return new PokeeCreature(this);
	}

	public String toString() {
		return "PokeeCreature<Name: " + name + "  Strength: " + strength + ">";
	}
}
