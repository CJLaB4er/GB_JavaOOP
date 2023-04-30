package Units;

import java.util.ArrayList;

public class Thief extends Melee {
    public Thief(ArrayList<BaseUnit> team, String name, int x, int y) {

        super(team, 100, 100, 20, 3, 5, 10, name, new int[]{1, 2},
                2, x, y, 30, 100);
    }


    @Override
    public void step(ArrayList enemys) {

    }

}
