public class HeroEntities extends Entities{
    public static final String RESET = "\u001B[0m";
    public static final String BLACK = "\u001B[30m";
    public static final String RED = "\u001B[31m";
    public static final String GREEN = "\u001B[32m";
    public static final String YELLOW = "\u001B[33m";


        String name;
         int wisdom;
         int strenth;
         int sanity;


    public HeroEntities(String name, int wisdom, int strenth, int sanity) {
        this.name = name;
        this.wisdom = wisdom;
        this.strenth = wisdom- strenth;
        this.sanity = sanity;
    }

    public void setStrenth(int strenth) {
        this.strenth = strenth;
    }
    public void setSanity(int sanity){
        this.sanity = sanity;
    }

    public void statistics()
    {
      System.out.println(GREEN + "Your name is "+ name + " your wisdom is " + wisdom + " your strength is " + strenth + " your sanity is " + sanity+ RESET);

    }
    @Override
    public void talk() {
        System.out.println(RED + "I should not at least forget my name -" + name + RESET);
    }

    @Override
    public void hit() {
        System.out.println("I'm so ready");
    }






}
