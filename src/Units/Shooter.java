package Units;

public  abstract class Shooter extends BaseUnit implements GameInterface{
    protected int distance, ammunition;

    public Shooter(int hp, int maxHp, int deff, int evasion, int speed, int accuracy, String name, int distance, int ammunition) {
        super(hp, maxHp, deff, evasion, speed, accuracy, name);
        this.distance = distance;
        this.ammunition = ammunition;
    }
     public void accurate_shot(){} //меткий выстрел
}
