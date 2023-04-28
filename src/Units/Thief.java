package Units;

import java.util.ArrayList;

public class Thief extends Melee {
    public Thief(ArrayList<BaseUnit> team, String name) {
        super(team, 100, 100, 20, 3, 5, 10, name, new int[]{1, 2},
                3, 30, 100);
    }

    //    super(100, 100, 20, 3, 5, 10, name, 30, 100);
    @Override
    public String toString() {
        return "Class: Thief, name " + name;
    }

    public void hide() {
    } // спрятаться

    @Override
    public void step() {

    }
}
