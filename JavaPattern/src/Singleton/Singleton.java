package Singleton;

/**
 * This is a singleton implement
 * Created by Sayarasin on 6/4/2016.
 */
public class Singleton {

    private int _value = 0;
    private static Singleton _signleton = null;

    private Singleton() {

    }

    public static Singleton getSingleton() {
        if(_signleton == null)
            _signleton = new Singleton();

        return _signleton;
    }

    public void setValue(int value){
        _value = value;
    }

    public int getValue() {
        return _value;
    }
}
