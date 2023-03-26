package EASY;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class ButtonS extends JButton {
    ToolBarS parent;

    ButtonS(ToolBarS p) {
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
