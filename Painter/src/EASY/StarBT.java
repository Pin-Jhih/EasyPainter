package EASY;

import javax.swing.*;

public class StarBT extends ButtonS{
    StarBT(ToolBarS p) {
        super(p);
        this.setIcon(new ImageIcon("icon/starBT.png"));
    }

    public void doSomething() {

        this.parent.parent.ActPages.state = State.readydraw;
        this.parent.parent.ActPages.drawType = DrawType.star;
        System.out.println("Draw Star");
    }
}
