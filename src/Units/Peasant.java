package Units;

import java.util.ArrayList;

public class Peasant extends BaseUnit {
    public Peasant(ArrayList<BaseUnit> team, String name, int x, int y) {
        super(team, 10, name, new int[]{0, 1}, 1, x, y);
    }

    @Override
    //Крестьянин ищет союзного стрелка с наименьшим числом стрел и выдаёт ему одну стрелу, иначе просто стоит
    public void step(ArrayList<BaseUnit> enemys) {
        super.step(enemys);
        Shooter tmp = null;
        for (BaseUnit unit : this.team) { // проходим по списку своих союзников
            if (unit instanceof Archer || unit instanceof Xbowman) { // ищем лучника или арбалетчика
                if (!unit.status.equals("died")) {// проверяем, что найденый юнит не мёртв.
                    if (tmp == null || tmp.ammunition > ((Shooter) unit).ammunition)
                        tmp = (Shooter) unit; // ищем союзника с минимальным запасом стрел
                }
            }
        }
        if (tmp == null) {
//            System.out.println("Крестьянин не нашёл в команде стрелка и пропустил ход");
            return;
        }
        tmp.ammunition++;
//        System.out.println(getClass().getSimpleName() + ": " + name + " выдал одну стрелу "
//                + tmp.getClass().getSimpleName() + ": " + tmp.name);
    }
}
