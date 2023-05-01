package Units;

import java.util.ArrayList;

public class Mag extends Magical {
    public Mag(ArrayList<BaseUnit> team, String name, int x, int y) {
        super(team, 15, name, new int[]{2, 5}, 5, x, y, 10);
    }
}
