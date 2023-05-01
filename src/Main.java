import Units.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {
    static ArrayList<BaseUnit> darkTeam = new ArrayList<>();
    static ArrayList<BaseUnit> holyTeam = new ArrayList<>();
    static List<BaseUnit> allTeam = new ArrayList<>();

    public static void main(String[] args) {

        int teamSize = 10;
        int countChar = 7;


        for (int i = 0; i < teamSize; i++) {
            switch (new Random().nextInt(countChar)) {
                case 0:
                    darkTeam.add(new Archer(darkTeam, getName(), 1, i + 1));
                    break;
                case 1:
                    darkTeam.add(new Xbowman(darkTeam, getName(), 1, i + 1));
                    break;
                case 2:
                    darkTeam.add(new Mag(darkTeam, getName(), 1, i + 1));
                    break;
                case 3:
                    darkTeam.add(new Monk(darkTeam, getName(), 1, i + 1));
                    break;
                case 4:
                    darkTeam.add(new Spearman(darkTeam, getName(), 1, i + 1));
                    break;
                case 5:
                    darkTeam.add(new Thief(darkTeam, getName(), 1, i + 1));
                    break;
                case 6:
                    darkTeam.add(new Peasant(darkTeam, getName(), 1, i + 1));
                    break;
            }
        }
        for (int i = 0; i < teamSize; i++) {
            switch (new Random().nextInt(countChar)) {
                case 0:
                    holyTeam.add(new Archer(holyTeam, getName(), 10, i + 1));
                    break;
                case 1:
                    holyTeam.add(new Xbowman(holyTeam, getName(), 10, i + 1));
                    break;
                case 2:
                    holyTeam.add(new Mag(holyTeam, getName(), 10, i + 1));
                    break;
                case 3:
                    holyTeam.add(new Monk(holyTeam, getName(), 10, i + 1));
                    break;
                case 4:
                    holyTeam.add(new Spearman(holyTeam, getName(), 10, i + 1));
                    break;
                case 5:
                    holyTeam.add(new Thief(holyTeam, getName(), 10, i + 1));
                    break;
                case 6:
                    holyTeam.add(new Peasant(holyTeam, getName(), 10, i + 1));
                    break;
            }
        }
        allTeam.addAll(darkTeam);
        allTeam.addAll(holyTeam);
        allTeam.sort(BaseUnit::compareTo);
        Scanner scanner = new Scanner(System.in);
        while (true) {
            View.view();
            scanner.nextLine();
            for (BaseUnit unit : allTeam) {
                if (holyTeam.contains(unit)) {
                    unit.step(darkTeam);
                } else {
                    unit.step(holyTeam);
                }
            }
        }
    }
//        Scanner scanner = new Scanner(System.in);
//        while (darkTeam.size() > 0 && holyTeam.size() > 0) {
//            scanner.nextLine();
//            System.out.println(darkTeam);
//            System.out.println(holyTeam);
//            darkTeam.forEach(unit -> unit.step(holyTeam));
//            holyTeam.forEach(unit -> unit.step(darkTeam));
//        }


    private static String getName() {
        return String.valueOf(Names.values()[new Random().nextInt(Names.values().length)]);
    }
}
