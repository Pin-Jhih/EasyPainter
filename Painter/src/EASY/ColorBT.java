package EASY;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ColorBT extends ButtonN implements ActionListener{

    public static Color c = Color.BLACK;

    JColorChooser jc = new JColorChooser();

    public ColorBT(ToolBarN p) {
        super(p);
        this.setIcon(new ImageIcon("icon/colorBT.png"));
    }
    public void doSomething() {

        c = jc.showDialog(parent.parent.ActPages,"00",parent.parent.ActPages.c);
        parent.parent.ActPages.c = c;
    }
    public void actionPerformed(ActionEvent e) {

    }
}
