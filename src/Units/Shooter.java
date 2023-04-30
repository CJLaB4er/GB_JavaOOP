package Units;

import java.util.ArrayList;

public abstract class Shooter extends BaseUnit implements GameInterface {
    protected int ammunition;


    public Shooter(ArrayList<BaseUnit> team, int maxHp, String name, int[] damage,
                   int initiative, int x, int y, int ammunition) {
        super(team, maxHp, name, damage, initiative, x, y);
        this.ammunition = ammunition;
    }

    @Override
    public String getInfo() {
        return super.getInfo() + ", запас стрелл: " + ammunition;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName();
    }

    @Override
    public void step(ArrayList<BaseUnit> enemys) {
        BaseUnit target = null;
        float minDist = Float.MAX_VALUE;
        if (this.ammunition > 0 && this.hp > 0) {
            for (BaseUnit item : enemys) {
                float tmp = item.coord.getDistance(this.coord);
                if (tmp < minDist) {
                    minDist = tmp;
                    target = item;
                }
            }
            System.out.println(name + " Стреляет в " + target.name);
            ammunition -= 1;
        }
    }
}
