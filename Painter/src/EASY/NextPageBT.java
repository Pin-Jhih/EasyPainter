package EASY;

import javax.swing.*;
import java.awt.*;

public class NextPageBT extends ButtonN {
    NextPageBT(ToolBarN p) {
        super(p);
        this.setIcon(new ImageIcon("icon/nextBT.png"));
    }

    public void doSomething(){
        this.parent.prevPageBT.setEnabled(true);

        Page activePage = this.parent.parent.ActPages;
        Page prevPage;

        int p = this.parent.parent.pages.indexOf(activePage);

        if(p < this.parent.parent.pages.size()-1) {
            prevPage = this.parent.parent.pages.get(p+1);

            this.parent.parent.remove(this.parent.parent.ActPages);
            this.parent.parent.revalidate();
            this.parent.parent.repaint();

            this.parent.parent.ActPages = prevPage;

            this.parent.parent.add(prevPage, BorderLayout.CENTER);
            System.out.println("Page : " + (this.parent.parent.pages.indexOf(activePage)+2) +
                                    "/" + (this.parent.parent.pages.size()));

            if(p == this.parent.parent.pages.size()-2)
                NextPageBT.this.setEnabled(false);

        }
    }
}
