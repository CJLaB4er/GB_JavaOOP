package Units;

import java.util.ArrayList;
import java.util.Random;

public abstract class Magical extends BaseUnit {
    protected int mana, maxMana;

    public Magical(ArrayList<BaseUnit> team, int hp, int maxHp, int deff, int evasion, int speed, int accuracy, String name, int[] damage, int mana, int maxMana) {
        super(team, hp, maxHp, deff, evasion, speed, accuracy, name, damage);
        this.mana = mana;
        this.maxMana = maxMana;
    }

    public void heal() {
    } // лечить

    @Override
    public void step() {
        int index_min_hp = team.size() - 1;
        for (int i = 0; i < team.size(); i++) {
            for (int j = 0; j < team.size() - 1; j++) {
                if (team.get(i).hp / team.get(i).maxHp < team.get(j).hp / team.get(j).maxHp) {
                    index_min_hp = i;
                }
            }
        }
        team.get(index_min_hp).healed(new Random().nextInt(this.damage[0], this.damage[1]));
        this.mana -= 5;
    }

    @Override
    public String getInfo() {
        return "Class: " + this.getClass().getSimpleName() + " " + super.getInfo();
    }
}
