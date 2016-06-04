package Proxy;

/**
 * This is a proxy class
 * Created by Sayarasin on 6/4/2016.
 */
public class Proxy extends Original {

    private ConcreteSubject concrete = null;

    @Override
    public void doSomework() {
        System.out.println("Proxy has been call right now.");

        if(concrete == null) {
            concrete = new ConcreteSubject();
        }

        concrete.doSomework();
    }
}
