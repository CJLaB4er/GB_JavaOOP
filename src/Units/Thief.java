package Units;

import java.util.ArrayList;

public class Thief extends Melee {
    public Thief(ArrayList<BaseUnit> team, String name, int x, int y) {
        super(team, 35, name, new int[]{2, 5}, 3, x, y);
    }


}
