package EASY;

import javax.swing.*;
import java.awt.*;
import java.util.Vector;

public class MainWin extends JFrame{

    Painter parent;
    Dimension size  = new Dimension(1000,700);
    public ToolBarN toolN;
    public ToolBarS toolS;

    Page ActPages ;
    Vector<Page> pages = null;

    ezObject obj = null;

    ImageIcon icon = new ImageIcon("icon/ImageIcon.png");

    public MainWin(Painter p) {

        parent = p;

        pages = new Vector<Page>();

        this.setSize(size);
        setTitle("Painter");
        setIconImage(icon.getImage());
        this.setResizable(false);
        toolN = new ToolBarN(this);
        toolS = new ToolBarS(this);

        setLayout(new BorderLayout());
        add(toolN,BorderLayout.NORTH);
        add(toolS,BorderLayout.SOUTH);

        if (ActPages == null) {
            Page newPage = new Page();
            add(newPage, BorderLayout.CENTER);
            pages.add(newPage);
            ActPages = newPage;
            System.out.println("Page 1 has created");
        }

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
