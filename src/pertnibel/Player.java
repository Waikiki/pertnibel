package pertnibel;

/**
 *
 * @author waikiki
 */
public class Player {

    private String name;
    private boolean ismale;
    private int race;
    private int hp;
    private int def;
    private int attack;
    private int range;

    /**
     * Instantiate a new player
     * @param name Player Name
     * @param ismale Player is male gender?
     */
    public Player(String name, boolean ismale) {
        this.name = name;
        this.ismale = ismale;
    }

    /**
     * Instantiates a Player with default values
     * (Jewhr, male)
     */
    public Player() {
        this("Jewhr", true);
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public int getDef() {
        return def;
    }

    public void setDef(int def) {
        this.def = def;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public boolean isIsmale() {
        return ismale;
    }

    public void setIsmale(boolean ismale) {
        this.ismale = ismale;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRace() {
        return race;
    }

    public void setRace(int race) {
        this.race = race;
    }

    public int getRange() {
        return range;
    }

    public void setRange(int range) {
        this.range = range;
    }
}
