package Units;

import java.util.ArrayList;

public  abstract class Shooter extends BaseUnit implements GameInterface{
    protected int distance, ammunition;

    public Shooter(ArrayList<BaseUnit> team, int hp, int maxHp, int deff, int evasion,
                   int speed, int accuracy, String name, int[] damage, int initiative, int distance, int ammunition) {
        super(team, hp, maxHp, deff, evasion, speed, accuracy, name, damage, initiative);
        this.distance = distance;
        this.ammunition = ammunition;
    }

    public void accurate_shot(){} //меткий выстрел


    @Override
    public String getInfo() {
        return "Class: " + this.getClass().getSimpleName() + ", " + super.getInfo();
    }
    @Override
    public String toString() {
        return this.getClass().getSimpleName();
    }
}
