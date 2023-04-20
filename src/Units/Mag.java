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
}
