package Observer;

import java.util.ArrayList;
import java.util.List;

/**
 * This is a subject implement form ISubject
 * Created by Sayarasin on 6/4/2016.
 */
public class Subject implements ISubject {

    private int _value = 0;
    private List<IObserver> observers = new ArrayList<IObserver>();

    /**
     *
     * @param o observer
     */
    public void register(IObserver o) {
        observers.add(o);
    }

    /**
     *
     * @param o observer
     */
    public void unregister(IObserver o) {
        observers.remove(o);
    }

    /**
     *
     */
    public void notifyObservers() {
        for(IObserver o : observers) {
            o.update();
        }
    }

    /**
     *
     * @param value the value set to class
     */
    public void setValue(int value) {
        _value = value;
        notifyObservers();
    }

    /**
     *
     * @return value from class
     */
    public int getValue() {
        return _value;
    }
}
