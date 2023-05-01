package Units;

import java.util.ArrayList;

public abstract class Melee extends BaseUnit {
    public Melee(ArrayList<BaseUnit> team, int maxHp, String name, int[] damage, int initiative, int x, int y) {
        super(team, maxHp, name, damage, initiative, x, y);
    }

    @Override
    public void step(ArrayList<BaseUnit> enemys) {
//        System.out.println("ёнит ближнего бо€ пропускает свой ход");
    }

    @Override
    public String getInfo() {
        return super.getInfo() + ", состо€ние: " + status;
    }
}