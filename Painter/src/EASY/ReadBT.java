package EASY;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import javax.swing.filechooser.FileNameExtensionFilter;

public class ReadBT extends ButtonN implements ActionListener{

//    JLabel label;
//    ezObject object;

    ReadBT(ToolBarN p) {
        super(p);
        this.setIcon(new ImageIcon("icon/importBT.png"));
        this.addActionListener(this);
    }
    public void doSomething(){
        Page newPage= new Page();
        if(this.parent.parent.ActPages!=null)
            this.parent.parent.remove(this.parent.parent.ActPages);

        this.parent.parent.add(newPage, BorderLayout.CENTER);
        this.parent.parent.pages.add(newPage);
        if(this.parent.parent.pages.size()==2)
            this.parent.prevPageBT.setEnabled(true);
        this.parent.parent.ActPages=newPage;
        this.parent.parent.revalidate();
        System.out.println("Page " + (this.parent.parent.pages.size()) + " has created");

        this.addActionListener(this);
    }
    public void actionPerformed(ActionEvent e) {
        JFileChooser cho = new JFileChooser();
        int retrunVal = cho.showOpenDialog(null);
        if (retrunVal == cho.APPROVE_OPTION) {
            File f = cho.getSelectedFile();
            String n = f.getAbsolutePath();
            ImageIcon img = new ImageIcon(n);
/*
            label.setIcon(img);
            label.setHorizontalAlignment(JLabel.CENTER);

            object.add(label,BorderLayout.CENTER);
            parent.parent.ActPages.add(object,BorderLayout.CENTER);

*/
        }
    }
}
