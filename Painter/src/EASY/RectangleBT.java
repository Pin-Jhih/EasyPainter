package EASY;

import javax.swing.*;

public class RectangleBT extends ButtonS {
    RectangleBT(ToolBarS p) {
        super(p);
        this.setIcon(new ImageIcon("icon/RectangleBT.png"));
    }

    public void doSomething() {

        this.parent.parent.ActPages.state = State.readydraw;
        this.parent.parent.ActPages.drawType = DrawType.rectangle;
        System.out.println("Draw Rectangle");
    }
}
