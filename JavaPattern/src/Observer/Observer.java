package Observer;

/**
 * This is class implement from IObserver
 * Created by Sayarasin on 6/4/2016.
 */
public class Observer implements IObserver {

    public void update() {
        System.out.println("Subject is chagned.");
    }
}
