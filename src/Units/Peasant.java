package Units;

import java.util.ArrayList;

public class Peasant extends BaseUnit {
    public Peasant(ArrayList<BaseUnit> team, String name, int x, int y) {
        super(team, 10, name, new int[]{0, 1}, 1, x, y);
    }
}
