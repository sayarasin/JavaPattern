import Observer.Subject;
import Observer.Observer;

/**
 * This is the main
 * Created by Sayarasin on 6/4/2016.
 */
public class Main {

    private static Subject subject = new Subject();

    public static void main(String [] args) {
        Observer observer1 = new Observer();
        subject.register(observer1);
        subject.setValue(10);
        subject.setValue(20);
        subject.unregister(observer1);
        subject.setValue(30);
    }
}
