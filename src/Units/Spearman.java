package Units;

import java.util.ArrayList;

public class Spearman extends Melee {
    public Spearman(ArrayList<BaseUnit> team, String name) {

        super(team, 150, 150, 30, 1, 2, 10, name, new int[]{1, 2},
                2, 50, 100);
    }

    //    super(150, 150, 30, 1, 2, 10, name, 50, 100);

    public void specialAttakk() {
    } // специальная атака

    @Override
    public void step() {

    }

}
