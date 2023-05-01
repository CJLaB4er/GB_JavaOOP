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
        return super.getInfo() + ", ����� ������: " + ammunition + ", ���������: " + status;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName();
    }

    @Override
    public void step(ArrayList<BaseUnit> enemys) {
        if (ammunition < 1) {
            System.out.println("� ��������� ����������� ������");
            return;
        }
        if (enemys.size() < 1) {
            return;
        }
        BaseUnit target = null;
        float minDist = Float.MAX_VALUE;
        for (BaseUnit item : enemys) {
            float tmp = item.coord.getDistance(this.coord);
            if (tmp < minDist && !item.status.equals("died")) {
                minDist = tmp;
                target = item;
            }
        }
        if (target == null) {
            return;
        }
        int damage = new Random().nextInt(this.damage[0], this.damage[1]);
        System.out.println(getClass().getSimpleName() + ": " + name + " �������� � "
                + target.getClass().getSimpleName() + ": " + target.name + " � ������� " + damage + " �����");
        target.getDamage(damage);
//        ammunition -= 1;

    }
}
