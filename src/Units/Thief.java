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
}
