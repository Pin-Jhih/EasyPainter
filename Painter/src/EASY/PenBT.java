package EASY;

import javax.swing.*;

public class PenBT extends ButtonS {
    PenBT(ToolBarS p) {
        super(p);
        this.setIcon(new ImageIcon("icon/penBT.png"));
    }

    public void doSomething() {

        this.parent.parent.ActPages.state = State.readydraw;
        this.parent.parent.ActPages.drawType = DrawType.pen;
        System.out.println("Free Pen");
    }
}
