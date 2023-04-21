package Units;

public abstract class Melee extends BaseUnit {
    protected int bravery; // храбрость
    protected int endurance; // выносливость

    public Melee(int hp, int maxHp, int deff, int evasion, int speed, int accuracy, String name, int bravery, int endurance) {
        super(hp, maxHp, deff, evasion, speed, accuracy, name);
        this.bravery = bravery;
        this.endurance = endurance;
    }

    public void recover() {} // восстановить выносливость
}