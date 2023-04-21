import Units.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Archer archer = new Archer("Legolaz");
//        System.out.println(archer);
        Xbowman xbowman = new Xbowman("Vasiliy");
//        System.out.println(xbowman);
        Spearman spearman = new Spearman("Ivan");
//        System.out.println(spearman);
        Thief thief = new Thief("Igreck");
//        System.out.println(thief);
        Monk monk = new Monk("Ieremia");
//        System.out.println(monk);
        Mag mag = new Mag("Kirill");
//        System.out.println(mag);

        List<BaseUnit> team1 = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            switch (new Random().nextInt(6)) {
                case 0:
                    team1.add(new Archer(getName()));
                    break;
                case 1:
                    team1.add(new Xbowman(getName()));
                    break;
                case 2:
                    team1.add(new Mag(getName()));
                    break;
                case 3:
                    team1.add(new Monk(getName()));
                    break;
                case 4:
                    team1.add(new Spearman(getName()));
                    break;
                case 5:
                    team1.add(new Thief(getName()));
                    break;
            }
        }
        System.out.println("Спикок персонажей первой команды: ");
        team1.forEach(item -> System.out.println(item.getInfo()));


        List<BaseUnit> team2 = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            switch (new Random().nextInt(6)) {
                case 0:
                    team2.add(new Archer(getName()));
                    break;
                case 1:
                    team2.add(new Xbowman(getName()));
                    break;
                case 2:
                    team2.add(new Mag(getName()));
                    break;
                case 3:
                    team2.add(new Monk(getName()));
                    break;
                case 4:
                    team2.add(new Spearman(getName()));
                    break;
                case 5:
                    team2.add(new Thief(getName()));
                    break;
            }
        }
        System.out.println("Спикок персонажей второй команды: ");
        team2.forEach(item -> System.out.println(item.getInfo()));
    }

    private static String getName() {
        return String.valueOf(Names.values()[new Random().nextInt(Names.values().length)]);
    }
}
