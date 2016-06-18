package Memento;

/**
 * This is memento
 * Created by Sayarasin on 6/18/2016.
 */
public class Memento {

    private String state;

    Memento(String state) {
        this.state = state;
    }

    String getState() {
        return state;
    }
}
