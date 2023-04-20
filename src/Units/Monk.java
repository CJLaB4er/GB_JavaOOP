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
}
