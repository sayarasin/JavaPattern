package Command;

import javax.swing.*;

/**
 * This is a redo command implement
 * Created by Sayarasin on 6/9/2016.
 */
public class MyRedoCommand implements ICommand {

    private Receiver recv;

    public MyRedoCommand(Receiver recv) {
        this.recv = recv;
    }

    public void Do() {
        recv.performRedo();
    }
}
