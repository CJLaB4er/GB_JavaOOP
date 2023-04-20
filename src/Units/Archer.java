package Units;

public class Archer extends Shooter{
    public Archer(String name) {
        super(50, 50, 5, 20, 5, 10, name,  5, 25);
    }

    @Override
    public String toString() {
        return "Class: Archer, name " + name;
    }

    public void quick_shot(){} // быстрый выстрел
}
