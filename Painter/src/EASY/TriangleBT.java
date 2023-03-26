package EASY;

import javax.swing.*;

public class TriangleBT extends ButtonS {
    TriangleBT(ToolBarS p) {
        super(p);
        this.setIcon(new ImageIcon("icon/TriangleBT.png"));
    }

    public void doSomething() {

        this.parent.parent.ActPages.state = State.readydraw;
        this.parent.parent.ActPages.drawType = DrawType.triangle;
        System.out.println("Draw Triangle");
    }
}
