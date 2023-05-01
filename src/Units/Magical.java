package Units;

import java.util.ArrayList;
import java.util.Random;

public abstract class Magical extends BaseUnit {
    protected int mana, maxMana;

    public Magical(ArrayList<BaseUnit> team, int maxHp, String name, int[] damage, int initiative,
                   int x, int y, int maxMana) {
        super(team, maxHp, name, damage, initiative, x, y);
        this.mana = maxMana;
        this.maxMana = maxMana;
    }

    @Override
    public void step(ArrayList enemys) {
        int index_min_hp = team.size() - 1;
        for (int i = 0; i < team.size(); i++) {
            for (int j = 0; j < team.size() - 1; j++) {
                if (team.get(i).hp / team.get(i).maxHp < team.get(j).hp / team.get(j).maxHp) {
                    index_min_hp = i;
                }
            }
        }
//        team.get(index_min_hp).getDamage(new Random().nextInt(this.damage[0], this.damage[1]));
        team.get(index_min_hp).getDamage(5);
    }

    @Override
    public String getInfo() {
        return super.getInfo() + ", запас маны: " + mana + ", состояние: " + status;
    }
}
