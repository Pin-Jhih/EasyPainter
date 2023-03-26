package EASY;

import javax.swing.*;

public class EraserBT extends ButtonS{
    EraserBT(ToolBarS p){
        super(p);
        this.setIcon(new ImageIcon("icon/eraserBT.png"));
    }

    public void doSomething() {

        this.parent.parent.ActPages.state = State.readydraw;
        this.parent.parent.ActPages.drawType = DrawType.eraser;
        System.out.println("Use Eraser");
    }
}
