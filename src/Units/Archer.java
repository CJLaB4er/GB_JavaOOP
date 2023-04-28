package Units;

import java.util.ArrayList;

public class Archer extends Shooter implements GameInterface {
    public Archer(ArrayList<BaseUnit> team, String name) {
        super(team, 50, 50, 5, 20, 5, 10, name, new int[]{1, 2}, 3,
                5, 25);
    }

    public void quick_shot() {
    } // быстрый выстрел

    @Override
    public void step() {
    }


}
