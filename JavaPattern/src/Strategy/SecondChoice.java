package Strategy;

/**
 * This is a second choice
 * Created by Sayarasin on 6/5/2016.
 */
public class SecondChoice implements IChoise {

    public void myChoice(String s1, String s2) {
        System.out.println("You wanted to concatenate the numbers.");
        System.out.println(" The result of the addition is:"+s1+s2);
        System.out.println("***End of the strategy***");
    }
}
