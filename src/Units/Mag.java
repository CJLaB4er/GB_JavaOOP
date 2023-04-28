package Units;

import java.util.ArrayList;

public class Mag extends Magical {
    public Mag(ArrayList<BaseUnit> team, String name) {
        super(team, 30, 30, 10, 2, 2, 10, name, new int[]{1, 2},
                2, 75, 75);
    }
    @Override
    public String toString() {
        return "Class: Mag, name " + name;
    }

    public void fireBall() {
    } // огненный шар

//    @Override
//    public String getInfo() {
//        return "Class: Mag, name: " + name + ", maxHP: " + maxHp + ", HP: " + hp + ", deff: " + deff + ", evansion: " + evasion
//                + " speed: " + speed + ", accuracy: " + accuracy + ", maxMana: " + maxMana;
//    }
}
