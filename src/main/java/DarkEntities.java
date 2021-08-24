public class DarkEntities extends Entities {

    String name;

    @Override
    public void talk() {
       System.out.println("My name is" + name);
    }

    @Override
    public void hit() {
        System.out.println("and now you gonna die");
    }
}
