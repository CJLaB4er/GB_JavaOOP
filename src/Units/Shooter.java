package Units;

import java.util.ArrayList;
import java.util.Random;

public abstract class Shooter extends BaseUnit implements GameInterface {
    protected int ammunition;


    public Shooter(ArrayList<BaseUnit> team, int maxHp, String name, int[] damage,
                   int initiative, int x, int y, int ammunition) {
        super(team, maxHp, name, damage, initiative, x, y);
        this.ammunition = ammunition;
    }

    @Override
    public String getInfo() {
        return super.getInfo() + ", запас стрелл: " + ammunition + ", состояние: " + status;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName();
    }

    @Override
    public void step(ArrayList<BaseUnit> enemys) {
        BaseUnit target = null;
        float minDist = Float.MAX_VALUE;
        if (status.equals("died")) {
            System.out.println("Персонаж мёртв");
            return;
        }
        if (ammunition < 1) {
            System.out.println("У персонажа закончились стрелы");
            return;
        }
        for (BaseUnit item : enemys) {
            float tmp = item.coord.getDistance(this.coord);
            if (tmp < minDist) {
                minDist = tmp;
                target = item;
            }
        }
        int damage = new Random().nextInt(this.damage[0], this.damage[1]);
        System.out.println(name + " Стреляет в " + target.name + " и наносит " + damage + " урона");
        target.getDamage(damage);
        ammunition -= 1;

    }
}
