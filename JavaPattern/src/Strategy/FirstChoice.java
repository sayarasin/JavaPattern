package Strategy;

/**
 * This is frist choice of choice implement
 * Created by Sayarasin on 6/5/2016.
 */
public class FirstChoice implements IChoise {

    public void myChoice(String s1, String s2) {
        System.out.println("You wanted to add the numbers.");
        int int1, int2,sum;
        int1=Integer.parseInt(s1);
        int2=Integer.parseInt(s2);
        sum=int1+int2;
        System.out.println(" The result of the addition is:"+sum);
        System.out.println("***End of the strategy***");
    }
}
