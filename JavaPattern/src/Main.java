import Decorate.ConcreteComponent;
import Decorate.ConcreteDecorateEx_1;
import Observer.Observer;
import Observer.Subject;
import Singleton.*;
import Proxy.*;



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
        singleton.setValue(20);
        System.out.println(singleton.getValue());
        Singleton singleton2 = Singleton.getSingleton();
        System.out.println(singleton2.getValue());

        SingletonEx singletonEx = SingletonEx.getSingletonEx();
        System.out.println(singleton.getValue());
        singletonEx.setValue(20);
        System.out.println(singletonEx.getValue());
        SingletonEx singletonEx2 = SingletonEx.getSingletonEx();
        System.out.println(singletonEx2.getValue());

        // Proxy
        Proxy proxy = new Proxy();
        proxy.doSomework();

        // Decorate
        ConcreteComponent component = new ConcreteComponent();
        ConcreteDecorateEx_1 decorateEx_1 = new ConcreteDecorateEx_1();
        decorateEx_1.dojob();
        decorateEx_1.setComponent(component);
        decorateEx_1.dojob();


    }
}
