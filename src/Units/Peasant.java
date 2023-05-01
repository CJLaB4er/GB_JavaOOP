package Units;

import java.util.ArrayList;

public class Peasant extends BaseUnit {
    public Peasant(ArrayList<BaseUnit> team, String name, int x, int y) {
        super(team, 10, name, new int[]{0, 1}, 1, x, y);
    }

    @Override
    public void step(ArrayList<BaseUnit> enemys) {
        for (BaseUnit unit : this.team) { // проходим по списку своих союзников
            if (unit instanceof Archer || unit instanceof Xbowman) { // ищем лучника или арбалетчика
                if (!unit.status.equals("died")) {// проверяем, что найденый юнит не мёртв.
                    Shooter tmp = (Shooter) unit;
                    tmp.ammunition ++;
                    System.out.println(getClass().getSimpleName() + ": " + name + " выдал одну стрелу "
                            + tmp.getClass().getSimpleName() + ": " + tmp.name);
                    return;
                    // Крестьянин находит первого не мёртвого лучника или арбалетчика и даёт им одну стрелу.
                }
            }

        }
        System.out.println("Крестьянин не нашёл в команде стрелка и пропустил ход");
    }
}
