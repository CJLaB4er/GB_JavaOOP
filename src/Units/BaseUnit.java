package Units;

import java.util.ArrayList;
import java.util.Random;

public abstract class BaseUnit implements GameInterface {
    protected int hp, maxHp, deff, evasion, speed, accuracy, initiative;
    protected String name;
    int[] damage;
    protected ArrayList<BaseUnit> team;

    public BaseUnit(ArrayList<BaseUnit> team, int hp, int maxHp, int deff, int evasion, int speed, int accuracy,
                    String name, int[] damage, int initiative) {
        this.team = team;
        this.hp = hp;
        this.maxHp = maxHp;
        if (new Random().nextBoolean()) this.hp /= 2;
        this.deff = deff;
        this.evasion = evasion;
        this.speed = speed;
        this.accuracy = accuracy;
        this.name = name;
        this.damage = damage;
        this.initiative = initiative;
    }

    protected void move() {
    } // движение персонажа

    protected void attack() {

    } // атака

    protected void defend() {
    } // защищаться

    protected void healed(int health) {
        this.hp = health + this.hp > this.maxHp ? this.maxHp : health + this.hp;
    } // принять лечение

    @Override
    public String getInfo() {
        return "Name: " + this.name + ", MaxHp: " + this.maxHp + ", Hp: " + this.hp + ", Initiative: "
                + this.initiative + ".";
    }

    public int compareTo(Object o){
        BaseUnit unit = (BaseUnit)o;
        return unit.initiative - this.initiative;
    }
}
