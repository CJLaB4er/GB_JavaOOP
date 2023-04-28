package Units;

import java.util.ArrayList;

public class Monk extends Magical {
    public Monk(ArrayList<BaseUnit> team, String name) {
        super(team, 30, 30, 5, 2, 2, 10, name, new int[]{5, 11},
                2,50, 50);
    }
    @Override
    public String toString() {
        return "Class: Monk, name " + name;
    }

    public void resurrect() {
    } // воскресить
}
