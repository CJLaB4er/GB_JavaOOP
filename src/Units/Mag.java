package Units;

import java.util.ArrayList;

public class Mag extends Magical {
    public Mag(ArrayList<BaseUnit> team, String name, int x, int y) {
        super(team, 30, 30, 10, 2, 2, 10, name, new int[]{1, 2},
                1, x, y, 75, 75);
    }
    public void fireBall() {
    } // огненный шар
}
