package Units;

public abstract class BaseUnit implements GameInterface {
    protected int hp, maxHp, deff, evasion, speed, accuracy;
    protected String name;

    public BaseUnit(int hp, int maxHp, int deff, int evasion, int speed, int accuracy, String name) {
        this.hp = hp;
        this.maxHp = maxHp;
        this.deff = deff;
        this.evasion = evasion;
        this.speed = speed;
        this.accuracy = accuracy;
        this.name = name;
    }

    public void move() {
    } // �������� ���������

    public void attack() {
    } // �����

    public void defend() {
    } // ����������

    public void skip() {
    } // ���������� ���

}
