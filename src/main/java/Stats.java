

public class Stats {
    public static final String RESET = "\u001B[0m";
    public static final String BLACK = "\u001B[30m";
    public static final String RED = "\u001B[31m";
    public static final String GREEN = "\u001B[32m";
    public static final String YELLOW = "\u001B[33m";


    public static void stats(HeroEntities hero)
    {
        System.out.println(RED +"---------------------------------------------------------------------------");
             System.out.println("---------------------------------------------------------------------------");
        System.out.println(hero.statistics());
        System.out.println();
        System.out.println(RED +"---------------------------------------------------------------------------" + RESET);

    }
    public static void stats(HeroEntities hero, DarkEntities enemy)
    {
        System.out.println(RED +"---------------------------------------------------------------------------");
        System.out.println("---------------------------------------------------------------------------");
        System.out.println(hero.statistics());
        System.out.println(enemy.statistics());
        System.out.println(RED +"---------------------------------------------------------------------------" + RESET);
    }
    public static void stats(Weapon weapon)
    {
        System.out.println(RED +"---------------------------------------------------------------------------");
        System.out.println("---------------------------------------------------------------------------");
        System.out.println(weapon.statistics());
        System.out.println();
        System.out.println(RED +"---------------------------------------------------------------------------" + RESET);
    }
}
