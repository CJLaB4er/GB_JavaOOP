import Units.*;

import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        int teamSize = 10;

        ArrayList<BaseUnit> team1 = new ArrayList<>();
        for (int i = 0; i < teamSize; i++) {
            switch (new Random().nextInt(6)) {
                case 0:
                    team1.add(new Archer(team1, getName()));
                    break;
                case 1:
                    team1.add(new Xbowman(team1, getName()));
                    break;
                case 2:
                    team1.add(new Mag(team1, getName()));
                    break;
                case 3:
                    team1.add(new Monk(team1, getName()));
                    break;
                case 4:
                    team1.add(new Spearman(team1, getName()));
                    break;
                case 5:
                    team1.add(new Thief(team1, getName()));
                    break;
            }
        }
        System.out.println("Спиcок персонажей первой команды: ");
        team1.forEach(unit -> System.out.println(unit.getInfo()));


        ArrayList<BaseUnit> team2 = new ArrayList<>();
        for (int i = 0; i < teamSize; i++) {
            switch (new Random().nextInt(6)) {
                case 0:
                    team2.add(new Archer(team2, getName()));
                    break;
                case 1:
                    team2.add(new Xbowman(team2, getName()));
                    break;
                case 2:
                    team2.add(new Mag(team2, getName()));
                    break;
                case 3:
                    team2.add(new Monk(team2, getName()));
                    break;
                case 4:
                    team2.add(new Spearman(team2, getName()));
                    break;
                case 5:
                    team2.add(new Thief(team2, getName()));
                    break;
            }
        }

        System.out.println("Спиcок персонажей второй команды: ");
        team2.forEach(unit -> System.out.println(unit.getInfo()));

        team1.forEach(unit -> unit.step());
        team2.forEach(unit -> unit.step());

        System.out.println("----------");
        System.out.println("Первая команда");
        team1.forEach(unit -> System.out.println(unit.getInfo()));
        System.out.println("Вторая команда");
        team2.forEach(unit -> System.out.println(unit.getInfo()));

        team1.sort(BaseUnit::compareTo);
        System.out.println(team1);
    }

    private static String getName() {
        return String.valueOf(Names.values()[new Random().nextInt(Names.values().length)]);
    }
}
