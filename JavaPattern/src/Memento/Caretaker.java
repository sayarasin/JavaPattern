package Memento;

/**
 * This is a caretaker
 * Created by Sayarasin on 6/18/2016.
 */
public class Caretaker {

    private Memento m;

    public void SaveMemento(Memento m)
    {
        this.m = m;
    }
    public Memento RetrieveMemento()
    {
        return this.m;
    }
}
