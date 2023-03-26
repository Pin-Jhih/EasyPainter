package EASY;

public class Painter {
    public MainWin mainWin;

    Painter(){
        mainWin = new MainWin(this);
        mainWin.setVisible(true);
    }
}
