/**
 * Basic knight object that holds the values for a knight. Often called a dataclass.
 *
 * @author Albert Lionelle <br>
 *         lionelle@colostate.edu <br>
 *         Computer Science Department <br>
 *         Colorado State University
 * @version 202010
 */
public class RtKnight {

    // these variables track the information in the knight object
    private final int maxHealth;
    private String name;
    private int power;
    private int armor;
    private int damage = 0;
    private int xp = 0;

    /**
     * Gets the experience points for the knight
     * @return amount of XP
     */
    public int getXp() {
        return xp;
        
    }

    /**
     * Sets the experience points. Complete set, not adding to the current pool.
     * @param xp amount to set XP to.
     */
    public void setXp(int xp) {
        this.xp = xp;
    }

    /**
     * Gets the name of the knight
     * @return the name of the knight
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the name of the knight
     * @param name the name to set for the knight
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Gets the maxHealth for the knight. Max doesn't change at this point
     * @return the health of the knight
     */
    public int getMaxHealth() {
        return maxHealth;
    }

    /**
     * Gets the maxHealth minus the amount of damage taken
     * @return int value of health-damage
     */
    public int getRemainingHealth() {
        return maxHealth - damage;
    }

    /**
     * Adds to the total damage counter
     * @param amount the amount to add to the damage counter
     */
    public void addDamage(int amount) {
        damage += amount;
    }

    /**
     * Resets the knight after a battle. At this point, resets damage taken to zero.
     */
    public void reset() {
        damage = 0;
    }

    /**
     * Gets the knight's power level
     * @return  the power of the knight
     */
    public int getPower() {
        return power;
    }

    /**
     * Sets the knights power
     * @param power the value to set the power to
     */
    public void setPower(int power) {
        this.power = power;
    }

    /**
     * Gets the knights amount of armor
     * @return the armor score
     */
    public int getArmor() {
        return armor;
    }

    /**
     * Sets the knights armor score
     * @param armor value to set armor to
     */
    public void setArmor(int armour) {
        armor = armour;
    }

    /**
     * Gets a contact card for the knight. Example cards look like
     * +============================+
     * | Pendragon                  |
     * |                            |
     * | Health: 100     XP: 0      |
     * |  Power: 100     Armor: 100 |
     * |                            |
     * +============================+
     *
     * and
     * +============================+
     * | Bedwyr Bedrydant           |
     * |                            |
     * | Health: 75      XP: 0      |
     * |  Power: 100     Armor: 15  |
     * |                            |
     * +============================+
     *
     * Width and spacing remains no matter the length of the knights name and score values.
     *
     * Each line in the card is 30 characters long , and for the spacing
     * String.format is used with the space parameter. For example:
     * String.format(| %-27s|%n", getName())
     *
     * @return a completed card of six lines
     */
    public String getCard() {
        return "+============================+\n" +
                String.format("| %-27s|%n", getName()) +
                "|                            |\n" +
                String.format("| Health: %-6d  XP: %-7d|%n", getMaxHealth(), getXp())  +
                String.format("|  Power: %-6d  Armor: %-4d|%n", getPower(), getArmor()) +
                "|                            |\n" +
                "+============================+\n";
    }
    

    /**
     * toString helps with debugging, as we can print the knight info directly
     * @return the string representing the knight
     */
    public String toString() {
        return String.format("[name = %s, health = %d, power = %d, armor = %d, damage = %d,  xp = %d]",
                name, maxHealth, power, armor, damage, xp);
    }

    /**
     * Constructor for the knight
     * @param name name of the knight
     * @param maxHealth maxHealth of the  knight
     * @param power the power of the knight
     * @param armor the armor of the knight
     */
    public RtKnight(String name, int maxHealth, int power, int armor) {
        setName(name);
        this.maxHealth = maxHealth; // this doesn't have a setter so we use that
        setPower(power);
        setArmor(armor);
    }


}
