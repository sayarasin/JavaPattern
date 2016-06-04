package Singleton;

/**
 * This is java singleton standard implement
 * Created by Sayarasin on 6/4/2016.
 */
public class SingletonEx {

    private int _value = 0;

    private SingletonEx() {

    }

    private static class SingletonHelper {
        private static final SingletonEx _singleton  = new SingletonEx();
    }

    public static SingletonEx getSingletonEx() {
        return SingletonHelper._singleton;
    }

    public void setValue(int value){
        _value = value;
    }

    public int getValue() {
        return _value;
    }
}
