public class StoneWall {
    public static final String RESET = "\u001B[0m";
    public static final String BLACK = "\u001B[30m";
    public static final String RED = "\u001B[31m";
    public static final String GREEN = "\u001B[32m";
    public static final String YELLOW = "\u001B[33m";




    public void printStoneWall()
    {
        System.out.println(GREEN +"-----------0-------------------------------1-------------------1-----------");
               System.out.println("-------------------------------------------------2----------3--5--------8--");
        System.out.println(YELLOW +"---------------//------------2-----------------------------------//--------");
        System.out.println(GREEN +"-------------------------------------13--------------------21---------------");
               System.out.println("-----------------------------------//--------------------------------------");
        System.out.println(GREEN +"---------------------------------------------------------------------------");
        System.out.println("-------------------------------------------------34-------------------------");
        System.out.println(YELLOW +"---------------//------------------------------------------------//--------");
        System.out.println(GREEN +"---------------------------------------------------------------------------");
        System.out.println("-----------------------------------//---------------??---------------------");
        System.out.println(RED + "insert 2gigit value to crack the wall" + RESET);
        // 55 answer
    }
    public void crackWall()
    {
        System.out.println(BLACK +"---------------------------------------------------------------------------");
        System.out.println("-----------                                          ----------------------");
        System.out.println("--------------                                      -----------------------");
        System.out.println("-----                                                                 -----");
        System.out.println("----------------                                  -------------------------");
        System.out.println("--------                 -----------                     ------------------" + RESET);
    }
    public void wallFall()
    {
        System.out.println("You chose poorly and the wall falls on your head makes you feel dizzy");
    }


}
