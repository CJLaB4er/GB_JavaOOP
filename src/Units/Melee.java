package Units;

import java.util.ArrayList;

public abstract class Melee extends BaseUnit {
    public Melee(ArrayList<BaseUnit> team, int maxHp, String name, int[] damage, int initiative, int x, int y) {
        super(team, maxHp, name, damage, initiative, x, y);
    }
    @Override
    public void step(ArrayList<BaseUnit> enemys) {
        System.out.println("Юнит ближнего боя пропускает свой ход");
    }
}