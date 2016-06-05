package Strategy;

/**
 * This is choice context
 * Created by Sayarasin on 6/5/2016.
 */
public class Context {

    // Set choice
    private IChoise choice = null;

    public Context(IChoise choice) {
        this.choice = choice;
    }

    public void ShowChoice(String s1, String s2) {
        choice.myChoice(s1, s2);
    }
}
