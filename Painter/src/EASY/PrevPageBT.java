package EASY;

import javax.swing.*;
import java.awt.*;

public class PrevPageBT extends ButtonN {
    PrevPageBT(ToolBarN p) {
        super(p);
        this.setIcon(new ImageIcon("icon/previousBT.png"));
    }

    public void doSomething(){
        this.parent.nextPageBT.setEnabled(true);

        Page activePage = this.parent.parent.ActPages;
        Page prevPage;

        int p = this.parent.parent.pages.indexOf(activePage);

        if(p > 0) {
            prevPage = this.parent.parent.pages.get(p-1);

            this.parent.parent.remove(this.parent.parent.ActPages);
            this.parent.parent.revalidate();
            this.parent.parent.repaint();

            this.parent.parent.ActPages=prevPage;

            this.parent.parent.add(prevPage, BorderLayout.CENTER);
            System.out.println("Page : " + (this.parent.parent.pages.indexOf(activePage)) +
                                    "/" + (this.parent.parent.pages.size()));

            if(p == 1) {
                PrevPageBT.this.setEnabled(false);
            }
        }
    }
}
