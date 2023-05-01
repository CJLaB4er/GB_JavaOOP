package Units;

import java.util.ArrayList;

public class Monk extends Magical {
    public Monk(ArrayList<BaseUnit> team, String name, int x, int y) {
        super(team, 15, name, new int[]{2, 4}, 4, x, y, 10);
    }
}
