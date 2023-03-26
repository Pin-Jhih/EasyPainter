package EASY;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class ButtonN extends JButton {
    ToolBarN parent;

    ButtonN(ToolBarN p) {
        super();
        parent=p;
        this.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                doSomething();
            }
        });
    }
    public void doSomething() {}
}
