package EASY;

import javax.swing.*;
import java.awt.*;

public class DeletePageBT extends ButtonN {
    DeletePageBT(ToolBarN p){
        super(p);
        this.setIcon(new ImageIcon("icon/deleteBT.png"));
    }

    public void doSomething(){
        Page activePage = this.parent.parent.ActPages;

        int p = this.parent.parent.pages.indexOf(activePage);

        if(this.parent.parent.pages.size() >= 1){
            if((p < this.parent.parent.pages.size()-1) && (p >= 1)){
                System.out.println("Delete Page" + (p+1));

                this.parent.parent.remove(this.parent.parent.pages.get(p));

                this.parent.parent.pages.removeElement(this.parent.parent.ActPages);
                this.parent.parent.revalidate();

                this.parent.parent.ActPages = this.parent.parent.pages.get(p);

                activePage = this.parent.parent.ActPages;
                this.parent.parent.add(this.parent.parent.pages.get(p), BorderLayout.CENTER);
                System.out.println("Page : " + (this.parent.parent.pages.indexOf(activePage)+1) +"/" + (this.parent.parent.pages.size()));
            }
            else if(p >= this.parent.parent.pages.size()-1){
                System.out.println("Delete Page" + (p+1) );
                this.parent.parent.remove(this.parent.parent.pages.get(p));

                this.parent.parent.pages.removeElement(this.parent.parent.ActPages);
                this.parent.parent.revalidate();

                if(this.parent.parent.pages.size() == 0){
                    Page newPage = new Page();
                    this.parent.parent.add(newPage, BorderLayout.CENTER);
                    this.parent.parent.pages.add(newPage);
                    this.parent.parent.ActPages = newPage;
                    activePage = this.parent.parent.ActPages;
                    this.parent.parent.revalidate();
                    System.out.println("Page "+ (this.parent.parent.pages.indexOf(activePage)+1) +" has created");
                }

                this.parent.parent.add(this.parent.parent.ActPages, BorderLayout.CENTER);

                activePage = this.parent.parent.ActPages;
                System.out.println("Page : "+(this.parent.parent.pages.indexOf(activePage)+1) +
                        "/" + (this.parent.parent.pages.size()));
            }
        }
    }
}
