package implementation;

/**
 * Objects that implement this interface can be put into a BattleDeck.
 */
public interface Battleable {

	/**
	 * Getter for the skill level of the creature.
	 * 
	 * @return skill level of the creature
	 */
	public int getLevel();

	/**
	 * Getter for the name of the creature.
	 * 
	 * @return name of the creature
	 */
	public String getName();

	/**
	 * Getter for the strength of the creature.
	 * 
	 * @return strength of the item
	 */
	public int getStrength();

	/**
	 * Setter for the strength of the creature.
	 * 
	 * @param newStrength
	 *            the new strength value for the creature
	 */
	public void setStrength(int newStrength);

	/**
	 * Method to create an independent copy of the creature.
	 * 
	 * @return independent copy of the creature
	 */
	public Battleable returnDuplicate();

	/**
	 * String generator for the creature.
	 * 
	 * @return String representing the creature
	 */
	public String toString();

}
