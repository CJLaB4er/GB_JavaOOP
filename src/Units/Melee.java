package Units;

import java.util.ArrayList;

public abstract class Melee extends BaseUnit {
    protected int bravery; // храбрость
    protected int endurance; // выносливость

    public Melee(ArrayList<BaseUnit> team, int hp, int maxHp, int deff, int evasion, int speed,
                 int accuracy, String name, int[] damage, int initiative, int bravery, int endurance) {
        super(team, hp, maxHp, deff, evasion, speed, accuracy, name, damage, initiative);
        this.bravery = bravery;
        this.endurance = endurance;
    }

    public void recover() {} // восстановить выносливость

    @Override
    public String getInfo() {
        return "Class: " + this.getClass().getSimpleName() + ", " + super.getInfo();
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName();
    }
}