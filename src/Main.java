import Units.*;

public class Main {
    public static void main(String[] args) {
        Archer archer = new Archer("Legolaz");
        System.out.println(archer);
        Xbowman xbowman = new Xbowman("Vasiliy");
        System.out.println(xbowman);
        Spearman spearman = new Spearman("Ivan");
        System.out.println(spearman);
        Thief thief = new Thief("Igreck");
        System.out.println(thief);
        Monk monk = new Monk("Ieremia");
        System.out.println(monk);
        Mag mag = new Mag("Kirill");
        System.out.println(mag);
    }
}
