package Command;

/**
 * This is executor
 * Created by Sayarasin on 6/9/2016.
 */
public class Invoke {

    private ICommand cmd;

    public void ExecuteCommand(ICommand cmd) {
        this.cmd = cmd;
        cmd.Do();
    }
}
