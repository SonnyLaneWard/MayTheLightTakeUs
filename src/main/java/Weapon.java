import java.util.*;
public class Weapon{

    int hitpoints;
    String typename;
    public Weapon(int hitpoints,String typename)
    {

        this.hitpoints = hitpoints;
        this.typename = typename;
    }
    public String statistics()
    {
        return (typename + " -> " + hitpoints);
    }


}
