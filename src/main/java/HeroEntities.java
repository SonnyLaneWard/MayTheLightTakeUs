public class HeroEntities extends Entities{


        String name;
         int wisdom;
         int strenth;


    public HeroEntities(String name, int wisdom, int strenth) {
        this.name = name;
        this.wisdom = wisdom;
        this.strenth = strenth - wisdom;
    }

    public void setStrenth(int strenth) {
        this.strenth = strenth;
    }

    public void statistics()
    {
      System.out.println("Your name is "+ name + " your wisdom is " + wisdom + " your strength is " + strenth);

    }
    @Override
    public void talk() {
        System.out.println("I should not at least forget my name -" + name);
    }

    @Override
    public void hit() {
        System.out.println("I'm so ready");
    }






}
