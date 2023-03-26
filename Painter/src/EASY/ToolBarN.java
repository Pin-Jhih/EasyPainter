package EASY;

import java.awt.*;

public class ToolBarN extends Panel {
    MainWin     parent;

    ExitBT          exitBT;
    NewPageBT       newPageBT;
    DeletePageBT    deletePageBT;
    NextPageBT      nextPageBT;
    PrevPageBT      prevPageBT;
    SaveBT          saveBT;
    ReadBT          readBT;
    ColorBT         colorBT;
    FillBT          fillBT;

    ToolBarN(MainWin p){

        parent = p;
        this.setBackground(Color.cyan);

        exitBT = new ExitBT(this);
        newPageBT = new NewPageBT(this);
        deletePageBT = new DeletePageBT(this);
        nextPageBT = new NextPageBT(this);
        prevPageBT = new PrevPageBT(this);
        saveBT = new SaveBT(this);
        readBT = new ReadBT(this);
        colorBT = new ColorBT(this);
        fillBT = new FillBT(this);

        nextPageBT.setEnabled(false);
        prevPageBT.setEnabled(false);

        this.setLayout(new FlowLayout());
        this.add(exitBT);
        this.add(saveBT);
        this.add(readBT);

        this.add(newPageBT);
        this.add(prevPageBT);
        this.add(deletePageBT);
        this.add(nextPageBT);
        this.add(colorBT);
        this.add(fillBT);

    }
}
