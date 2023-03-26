package EASY;

import java.awt.*;

public class ToolBarS extends Panel  {
    MainWin     parent;

    PenBT       penBT;
    OvalBT      ovalBT;
    RectangleBT rectangleBT;
    TriangleBT  triangleBT;
    LineBT      lineBT;
    EraserBT    eraserBT;
    StarBT      starBT;


    ToolBarS(MainWin p){

        parent = p;

        this.setBackground(Color.cyan);

        penBT = new PenBT(this);
        ovalBT = new OvalBT(this);
        rectangleBT = new RectangleBT(this);
        triangleBT = new TriangleBT(this);
        lineBT = new LineBT(this);
        eraserBT = new EraserBT(this);
        starBT = new StarBT(this);

        this.setLayout(new FlowLayout());
        this.add(penBT);
        this.add(rectangleBT);
        this.add(ovalBT);
        this.add(triangleBT);
        this.add(lineBT);
        this.add(starBT);
        this.add(eraserBT);
    }
}
