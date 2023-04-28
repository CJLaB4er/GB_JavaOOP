package Units;

import java.util.ArrayList;

public class Monk extends Magical {
    public Monk(ArrayList<BaseUnit> team, String name) {
        super(team, 30, 30, 5, 2, 2, 10, name, new int[]{5, 11}, 50, 50);
    }
    //    super(team, 30, 30, 5, 2, 2, 10, name, new int[]{1, 2}, 50, 50);

    @Override
    public String toString() {
        return "Class: Monk, name " + name;
    }

    public void resurrect() {
    } // воскресить

//    @Override
//    public String getInfo() {
//        return "Class: Monk, name: " + name + ", maxHP: " + maxHp + ", HP: " + hp + ", deff: " + deff + ", evansion: " + evasion
//                + " speed: " + speed + ", accuracy: " + accuracy + ", maxMana: " + maxMana;
//    }
}
