package Units;

import java.util.ArrayList;

public class Archer extends Shooter implements GameInterface {
    public Archer(ArrayList<BaseUnit> team, String name) {
        super(team, 50, 50, 5, 20, 5, 10, name, new int[]{1, 2}, 5, 25);
    }
//    super(50, 50, 5, 20, 5, 10, name, 5, 25);

    @Override
    public String toString() {
        return "Class: Archer, name " + name;
    }

    public void quick_shot() {
    } // ������� �������

    @Override
    public void step() {

    }

//    @Override
//    public String getInfo() {
//        return "Class: Archer, name: " + name + ", maxHP: " + maxHp + ", HP: " + hp + ", deff: " + deff + ", evansion: " + evasion
//                + " speed: " + speed + ", accuracy: " + accuracy + ", distance: " + distance
//                + ", ammunition: " + ammunition;
//    }

}
