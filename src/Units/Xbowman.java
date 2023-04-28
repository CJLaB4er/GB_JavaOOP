package Units;

import java.util.ArrayList;

public class Xbowman extends Shooter {
    public Xbowman(ArrayList<BaseUnit> team, String name) {
        super(team, 70, 70, 10, 5, 3, 15, name, new int[]{1, 2}, 4, 15);
    }
//    super(70, 70, 10, 5, 3, 15, name, 4, 15);

    @Override
    public String toString() {
        return "Class: Xbowman, name " + name;
    }

    public void reload() {
    } // перезарядка

    @Override
    public void step() {

    }

//    @Override
//    public String getInfo() {
//        return "Class: Xbowman, name: " + name + ", maxHP: " + maxHp + ", HP: " + hp + ", deff: " + deff + ", evansion: " + evasion
//                + " speed: " + speed + ", accuracy: " + accuracy + ", distance: " + distance
//                + ", ammunition: " + ammunition;
//    }
}
