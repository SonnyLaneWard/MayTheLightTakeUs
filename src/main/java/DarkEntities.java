public class DarkEntities extends Entities {

    String name;
    int strength;

    public void setName(String name) {
        this.name = name;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }


    public static final String RESET = "\u001B[0m";
    public static final String BLACK = "\u001B[30m";
    public static final String RED = "\u001B[31m";
    public static final String GREEN = "\u001B[32m";
    public static final String YELLOW = "\u001B[33m";

    @Override
    public void talk() {
       System.out.println(RED + "My  ... name .... is " + name + RESET);
    }

    @Override
    public void hit() {
        System.out.println("and now you gonna die");
    }
    public void statistics()
    {
        System.out.println(GREEN + "ITS name is "+ name + " its strength is " + strength+ RESET);

    }


}
