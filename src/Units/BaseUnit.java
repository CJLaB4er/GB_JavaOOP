package Units;

import java.util.ArrayList;
import java.util.Random;

public abstract class BaseUnit implements GameInterface {
    protected int hp, maxHp, initiative;
    protected String name;
    protected int[] damage;
    protected ArrayList<BaseUnit> team;
    protected Coord coord;
    protected String status;


    public BaseUnit(ArrayList<BaseUnit> team, int maxHp, String name, int[] damage, int initiative, int x, int y) {

        this.team = team;
        this.hp = maxHp;
        this.maxHp = maxHp;
        if (new Random().nextBoolean()) this.hp /= 2;
        this.name = name;
        this.damage = damage;
        this.initiative = initiative;
        this.coord = new Coord(x, y);
        this.status = "ready"; //��� ��������� �������: ready, busy, died
    }

    protected void getDamage(int damage) {
        if (this.hp - damage < 1) {
            this.status = "died"; // ������ died ��������, ��� ���� ����
            this.hp = 0;
        } else {
            this.hp = this.hp - damage > this.maxHp ? this.maxHp : this.hp - damage;
        }

    } // ����� ��������� ������/�������

    @Override
    public String getInfo() {
        return this.getClass().getSimpleName() + " " + name + ", ������� ��������: " + hp;
    }

    public int compareTo(Object o) {
        BaseUnit unit = (BaseUnit) o;
        return unit.initiative - this.initiative;
    }

    @Override
    public void step(ArrayList<BaseUnit> enemys) {
        if (status.equals("died")) {
            return;
        }
    }
    @Override
    public String toString() {
        return this.getClass().getSimpleName() + ": " + name + ", hp: " + hp + ", статус: " + status;
    }

    public int[] getCoords(){
        return new int[]{coord.x, coord.y};
    }

    public int getHp() {
        return hp;
    }
}