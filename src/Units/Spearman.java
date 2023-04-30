package Units;

import java.util.ArrayList;

public class Spearman extends Melee {
    public Spearman(ArrayList<BaseUnit> team, String name, int x, int y) {

        super(team, 150, 150, 30, 1, 2, 10, name, new int[]{1, 2},
                2, x, y, 50, 100);
    }

    @Override
    public void step(ArrayList enemys) {
    }

    @Override
    public String getInfo() {
        return super.getInfo();
    }
}
