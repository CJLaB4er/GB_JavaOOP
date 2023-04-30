package Units;

import java.util.ArrayList;

public class Archer extends Shooter implements GameInterface {
    public Archer(ArrayList<BaseUnit> team, String name, int x, int y) {
        super(team, 15, name, new int[]{2, 5}, 7, x, y, 10);
    }
}
