package Units;

public class Xbowman extends Shooter{
    public Xbowman(String name) {
        super(70, 70, 10, 5, 3, 15, name, 4, 15);
    }
    @Override
    public String toString() {
        return "Class: Xbowman, name " + name;
    }

    public void reload(){} // перезарядка
}
