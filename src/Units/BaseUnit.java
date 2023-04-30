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
        this.status = "ready"; //три возможных статуса: ready, busy, died
    }

    protected void getDamage(int damage) {
        if (this.hp - damage < 1) {
            this.status = "died";
            this.hp = 0;
        }
        this.hp = this.hp - damage > this.maxHp ? this.maxHp : this.hp - damage;

    } // метод получения дамага/лечения

    @Override
    public String getInfo() {
        return this.getClass().getSimpleName() + " " + name;
    }

    public int compareTo(Object o) {
        BaseUnit unit = (BaseUnit) o;
        return unit.initiative - this.initiative;
    }
}
