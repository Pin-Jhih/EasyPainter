package EASY;

import javax.swing.*;

public class ExitBT extends ButtonN {
    public ExitBT(ToolBarN p) {
        super(p);
        this.setIcon(new ImageIcon("icon/exitBT.png"));
    }
    public void doSomething() {
        System.exit(0);
    }
}
