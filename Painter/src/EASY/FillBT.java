package EASY;

import javax.swing.*;

public class FillBT extends ButtonN{
    public FillBT(ToolBarN p) {
        super(p);
        this.setIcon(new ImageIcon("icon/fillBT.png"));
    }
        public void doSomething() {

        if (this.parent.parent.ActPages.fillType == DrawType.fill) {
            this.parent.parent.ActPages.fillType = DrawType.hollow;
            this.setIcon(new ImageIcon("icon/fillBT.png"));
        }
        else if (this.parent.parent.ActPages.fillType == DrawType.hollow) {
            this.parent.parent.ActPages.fillType = DrawType.fill;
            this.setIcon(new ImageIcon("icon/hollowBT.png"));
        }

    }
}
