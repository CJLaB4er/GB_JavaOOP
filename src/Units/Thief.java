package Units;

import java.util.ArrayList;

public class Thief extends Melee {
    public Thief(ArrayList<BaseUnit> team, String name) {
        super(team, 100, 100, 20, 3, 5, 10, name, new int[]{1, 2},
                2, 30, 100);
    }

    //    super(100, 100, 20, 3, 5, 10, name, 30, 100);

    public void hide() {
    } // ����������

    @Override
    public void step() {

    }
}
