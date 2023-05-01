package Units;

import java.util.ArrayList;

public class Peasant extends BaseUnit {
    public Peasant(ArrayList<BaseUnit> team, String name, int x, int y) {
        super(team, 10, name, new int[]{0, 1}, 1, x, y);
    }

    @Override
    public void step(ArrayList<BaseUnit> enemys) {
        for (BaseUnit unit : this.team) { // �������� �� ������ ����� ���������
            if (unit instanceof Archer || unit instanceof Xbowman) { // ���� ������� ��� �����������
                if (!unit.status.equals("died")) {// ���������, ��� �������� ���� �� ����.
                    Shooter tmp = (Shooter) unit;
                    tmp.ammunition ++;
                    System.out.println(getClass().getSimpleName() + ": " + name + " ����� ���� ������ "
                            + tmp.getClass().getSimpleName() + ": " + tmp.name);
                    return;
                    // ���������� ������� ������� �� ������� ������� ��� ����������� � ��� �� ���� ������.
                }
            }

        }
        System.out.println("���������� �� ����� � ������� ������� � ��������� ���");
    }
}
