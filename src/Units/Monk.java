package Units;

public class Monk extends Magical {
    public Monk(String name) {
        super(30, 30, 5, 2, 2, 10, name, 50, 50);
    }

    @Override
    public String toString() {
        return "Class: Monk, name " + name;
    }

    public void resurrect() {
    } // воскресить

    @Override
    public void step() {

    }

    @Override
    public String getInfo() {
        return "Class: Monk, name: " + name + ", maxHP: " + maxHp + ", deff: " + deff + ", evansion: " + evasion
                + " speed: " + speed + ", accuracy: " + accuracy + ", maxMana: " + maxMana;
    }
}
