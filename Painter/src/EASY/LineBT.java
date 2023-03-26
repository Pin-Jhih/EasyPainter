package EASY;

import javax.swing.*;

public class LineBT extends ButtonS {
    LineBT(ToolBarS p) {
        super(p);
        this.setIcon(new ImageIcon("icon/lineBT.png"));
    }

    public void doSomething() {

        this.parent.parent.ActPages.state = State.readydraw;
        this.parent.parent.ActPages.drawType = DrawType.line;
        System.out.println("Draw Line");
    }
}
