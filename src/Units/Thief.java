package Units;

public class Thief extends Melee{
    public Thief(String name) {
        super(100, 100, 20, 3, 5, 10, name, 30, 100);
    }
    @Override
    public String toString() {
        return "Class: Thief, name " + name;
    }

    public void hide(){} // спрятаться

    @Override
    public void step() {

    }

    @Override
    public String getInfo() {
        return "Class: Thief, name: " + name + ", maxHP: " + maxHp + ", deff: " + deff + ", evansion: " + evasion
                + " speed: " + speed + ", accuracy: " + accuracy + ", bravery: "
                + bravery + ", endurance: " + endurance;
    }
}
