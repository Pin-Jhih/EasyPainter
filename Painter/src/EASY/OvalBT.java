package EASY;

import javax.swing.*;

public class OvalBT extends ButtonS {
    OvalBT(ToolBarS p) {
        super(p);
        this.setIcon(new ImageIcon("icon/ovalBT.png"));
    }

    public void doSomething() {

        this.parent.parent.ActPages.state = State.readydraw;
        this.parent.parent.ActPages.drawType = DrawType.oval;
        System.out.println("Draw Oval");
    }
}
