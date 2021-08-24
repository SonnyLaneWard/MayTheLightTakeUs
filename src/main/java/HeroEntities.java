public class HeroEntities extends Entities{
    String name;
    @Override
    public void talk() {
        System.out.println("I should not at least forget my name -" + name);
    }

    @Override
    public void hit() {
        System.out.println("I'm so ready");
    }
}
