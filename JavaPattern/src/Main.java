import Observer.Observer;
import Observer.Subject;
import Singleton.Singleton;

/**
 * This is the main
 * Created by Sayarasin on 6/4/2016.
 */
public class Main {

    private static Subject subject = new Subject();

    public static void main(String [] args) {

        // Observer
        Observer observer1 = new Observer();
        subject.register(observer1);
        subject.setValue(10);
        subject.setValue(20);
        subject.unregister(observer1);
        subject.setValue(30);

        //Singleton
        Singleton singleton = Singleton.getSingleton();
        System.out.println(singleton.getValue());
        singleton.setValue(10);
        System.out.println(singleton.getValue());
        Singleton singleton2 = Singleton.getSingleton();
        System.out.println(singleton2.getValue());


    }
}
