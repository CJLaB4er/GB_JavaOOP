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
        super.step(enemys);
        if (mana > 1) {
            int index_min_hp = team.size() - 1;
            for (int i = 0; i < team.size(); i++) {
                for (int j = 0; j < team.size() - 1; j++) {
                    if (team.get(i).hp / team.get(i).maxHp < team.get(j).hp / team.get(j).maxHp) {
                        index_min_hp = i;
                    }
                }
            }
            BaseUnit target = team.get(index_min_hp);
            int damage = new Random().nextInt(this.damage[0], this.damage[1]);
            target.getDamage(damage * -1);
            mana -= 2;
        }
        else {mana++;}; //восстановление маны
//        System.out.println(getClass().getSimpleName() + ": " + name + " Лечит "
//                + target.getClass().getSimpleName() + ": " + target.name + " на " + damage + " единиц здоровья");
    }

    @Override
    public String getInfo() {
        return super.getInfo() + ", запас маны: " + mana + ", состояние: " + status;
    }

    @Override
    public String toString() {
        return super.toString() + ", mana: " + mana;
    }
}
