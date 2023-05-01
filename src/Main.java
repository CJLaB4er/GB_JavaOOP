import Units.*;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int teamSize = 5;


        ArrayList<BaseUnit> team1 = new ArrayList<>();
        for (int i = 0; i < teamSize; i++) {
            switch (new Random().nextInt(7)) {
                case 0:
                    team1.add(new Archer(team1, getName(), 1, i + 1));
                    break;
                case 1:
                    team1.add(new Xbowman(team1, getName(), 1, i + 1));
                    break;
                case 2:
                    team1.add(new Mag(team1, getName(), 1, i + 1));
                    break;
                case 3:
                    team1.add(new Monk(team1, getName(), 1, i + 1));
                    break;
                case 4:
                    team1.add(new Spearman(team1, getName(), 1, i + 1));
                    break;
                case 5:
                    team1.add(new Thief(team1, getName(), 1, i + 1));
                    break;
                case 6:
                    team1.add(new Peasant(team1, getName(), 1, i + 1));
                    break;
            }
        }
        ArrayList<BaseUnit> team2 = new ArrayList<>();
        for (int i = 0; i < teamSize; i++) {
            switch (new Random().nextInt(7)) {
                case 0:
                    team2.add(new Archer(team2, getName(), 10, i + 1));
                    break;
                case 1:
                    team2.add(new Xbowman(team2, getName(), 10, i + 1));
                    break;
                case 2:
                    team2.add(new Mag(team2, getName(), 10, i + 1));
                    break;
                case 3:
                    team2.add(new Monk(team2, getName(), 10, i + 1));
                    break;
                case 4:
                    team2.add(new Spearman(team2, getName(), 10, i + 1));
                    break;
                case 5:
                    team2.add(new Thief(team2, getName(), 10, i + 1));
                    break;
                case 6:
                    team2.add(new Peasant(team2, getName(), 1, i + 1));
                    break;
            }
        }
        Scanner scanner = new Scanner(System.in);
        while (team1.size() > 0 && team2.size() > 0) {
            scanner.nextLine();
            System.out.println(team1);
            System.out.println(team2);
            team1.forEach(unit -> unit.step(team2));
            team2.forEach(unit -> unit.step(team1));
        }
    }

    private static String getName() {
        return String.valueOf(Names.values()[new Random().nextInt(Names.values().length)]);
    }
}
