package Units;

public class Mag extends Magical{
    public Mag(String name) {
        super(30, 30, 10, 2, 2, 10, name, 75, 75);
    }
    @Override
    public String toString() {
        return "Class: Mag, name " + name;
    }

    public void fireBall() {
    } // огненный шар

    @Override
    public void step() {

    }

    @Override
    public String getInfo() {
        return "Class: Mag, name: " + name + ", maxHP: " + maxHp + ", deff: " + deff + ", evansion: " + evasion
                + " speed: " + speed + ", accuracy: " + accuracy + ", maxMana: " + maxMana;
    }
}
