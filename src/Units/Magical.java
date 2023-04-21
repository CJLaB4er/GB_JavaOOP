package Units;

public abstract class Magical extends BaseUnit{
    protected int mana, maxMana;

    public Magical(int hp, int maxHp, int deff, int evasion, int speed, int accuracy, String name, int mana, int maxMana) {
        super(hp, maxHp, deff, evasion, speed, accuracy, name);
        this.mana = mana;
        this.maxMana = maxMana;
    }

    public void heal(){} // лечить

}
