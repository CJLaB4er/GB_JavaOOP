package Units;

import java.util.ArrayList;


public class Xbowman extends Shooter {
    public Xbowman(ArrayList<BaseUnit> team, String name, int x, int y) {
        super(team, 70, 70, 10, 5, 3, 15, name, new int[]{1, 2},
                3, x, y, 4, 15);
    }
}
