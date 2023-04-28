package Units;

import java.util.ArrayList;

public class Thief extends Melee {
    public Thief(ArrayList<BaseUnit> team, String name) {
        super(team, 100, 100, 20, 3, 5, 10, name, new int[]{1, 2}, 30, 100);
    }
    //    super(100, 100, 20, 3, 5, 10, name, 30, 100);
    @Override
    public String toString() {
        return "Class: Thief, name " + name;
    }

    public void hide() {
    } // спрятаться

    @Override
    public void step() {

    }

//    @Override
//    public String getInfo() {
//        return "Class: Thief, name: " + name + ", maxHP: " + maxHp + ", HP: " + hp + ", deff: " + deff + ", evansion: " + evasion
//                + " speed: " + speed + ", accuracy: " + accuracy + ", bravery: "
//                + bravery + ", endurance: " + endurance;
//    }
}
