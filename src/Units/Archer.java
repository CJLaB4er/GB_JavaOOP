package Units;

import java.util.ArrayList;

public class Archer extends Shooter implements GameInterface {
    public Archer(ArrayList<BaseUnit> team, String name, int x, int y) {
        super(team, 50, 50, 5, 20, 5, 10, name, new int[]{1, 2}, 3,
                x, y, 5, 25);
    }
}
