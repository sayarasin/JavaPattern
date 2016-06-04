package Observer;

/**
 * This is subject inteface
 * Created by Sayarasin on 6/4/2016.
 */
interface ISubject {
    void register(IObserver o);
    void unregister(IObserver o);
    void notifyObservers();
}
