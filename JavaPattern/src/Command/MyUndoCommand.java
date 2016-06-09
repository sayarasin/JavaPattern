package Command;

/**
 * This is a Undo command implement
 * Created by Sayarasin on 6/9/2016.
 */
public class MyUndoCommand implements ICommand {

    private Receiver recv;

    public MyUndoCommand(Receiver recv) {
        this.recv = recv;
    }

    public void Do() {
        recv.performUndo();
    }
}
