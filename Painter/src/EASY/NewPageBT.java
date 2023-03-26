package EASY;

import javax.swing.*;
import java.awt.*;

public class NewPageBT extends ButtonN {
    NewPageBT(ToolBarN p) {
        super(p);
        this.setIcon(new ImageIcon("icon/newBT.png"));
    }

    public void doSomething(){
        Page newPage= new Page();

        if(this.parent.parent.ActPages!=null) {
            this.parent.parent.remove(this.parent.parent.ActPages);
        }
        this.parent.parent.add(newPage, BorderLayout.CENTER);

        this.parent.parent.pages.add(newPage);

        if(this.parent.parent.pages.size()==2) {
            this.parent.prevPageBT.setEnabled(true);
        }
        this.parent.parent.ActPages=newPage;
        this.parent.parent.revalidate();
        System.out.println("Page " + (this.parent.parent.pages.size()) + " has created");
    }
}
