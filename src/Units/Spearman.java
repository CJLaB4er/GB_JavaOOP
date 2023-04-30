package Units;

import java.util.ArrayList;

public class Spearman extends Melee {
    public Spearman(ArrayList<BaseUnit> team, String name, int x, int y) {
        super(team, 50, name, new int[]{4, 8}, 2, x, y);
    }
}
