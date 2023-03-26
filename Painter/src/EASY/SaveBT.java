package EASY;

import javax.swing.*;
import java.io.File;

public class SaveBT extends ButtonN{
    SaveBT(ToolBarN p) {
        super(p);
        this.setIcon(new ImageIcon("icon/exportBT.png"));

    }
    public void doSomething(){

        JFrame SaveWin = new JFrame("Save");
        JPanel SavePan = new JPanel();
        final JTextArea txt= new JTextArea(10,10);
        txt.setLineWrap(true);
        SavePan.add(txt);

        JFileChooser cho = new JFileChooser();
        int result = cho.showSaveDialog(SaveWin);

        if(result == cho.APPROVE_OPTION) {
            File file = cho.getSelectedFile();
            txt.append("Save to :" + file.getAbsolutePath() + "\n\n");
        }

    }
}
