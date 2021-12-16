import Owl.NightOwl;

public class FirstTest {

    public static void main(String[] args) {
        NightOwl owl = new NightOwl(666.8);

        displayHeight(owl);

    }


    public static void displayHeight(NightOwl myOwl) {
        System.out.println("Сова большая, ее рост = " + getNightOwlHeight(myOwl));
    }

public static double getNightOwlHeight(NightOwl owl)
{
    return owl.owlHeight;
}


}
