package Units;

import java.util.ArrayList;

public class Xbowman extends Shooter {
    public Xbowman(ArrayList<BaseUnit> team, String name) {
        super(team, 70, 70, 10, 5, 3, 15, name, new int[]{1, 2},
                1, 4, 15);
    }

    @Override
    public String toString() {
        return "Class: Xbowman, name " + name;
    }

    public void reload() {
    } // перезарядка

    @Override
    public void step() {

    }
}
