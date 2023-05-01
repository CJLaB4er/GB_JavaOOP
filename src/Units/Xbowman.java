package Units;

import java.util.ArrayList;


public class Xbowman extends Shooter {
    public Xbowman(ArrayList<BaseUnit> team, String name, int x, int y) {
        super(team, 25, name, new int[]{4, 12}, 6, x, y, 10);
    }
}
