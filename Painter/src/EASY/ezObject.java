/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EASY;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Vector;

public class ezObject extends Panel{
    Page parent;

    ezObject(Page p){
        super();
        parent = p;

        setSize(getSize());
    }
/*
    public void add(ImageIcon img, String center) {

    }
*/
}
 /*
    State   state;
    Page    parent;
    Point   p1,p2,p0;

    ezObject(Page p)
    {
        super();
        parent = p;

    }
*/
/*
    State state;
    Page parent;
    Point lp, cp, op;
    boolean outlineVisibility=true;

    Vector<ControlPoint> controlPoints;
    ControlPoint  E, W, N, S, NE, SE, NW, SW;

    ezObject(Page p)
    {
        super();
        parent=p;
        state=State.actived;


        controlPoints = new Vector<ControlPoint>();
        NE = new ControlPoint(this, Type.NE);
        controlPoints.add(NE);
        SE = new ControlPoint(this, Type.SE);
        controlPoints.add(SE);
        NW = new ControlPoint(this, Type.NW);
        controlPoints.add(NW);
        SW = new ControlPoint(this, Type.SW);
        controlPoints.add(SW);

        N = new ControlPoint(this, Type.N);
        controlPoints.add(N);
        W = new ControlPoint(this, Type.W);
        controlPoints.add(W);
        E = new ControlPoint(this, Type.E);
        controlPoints.add(E);
        S = new ControlPoint(this, Type.S);
        controlPoints.add(S);

        this.parent.add(N);
        this.parent.add(W);
        this.parent.add(E);
        this.parent.add(S);

         this.parent.add(NE);
         this.parent.add(SE);
         this.parent.add(NW);
         this.parent.add(SW);


        this.parent.repaint();

           showOutline(true);

        this.addMouseListener(new MouseAdapter(){
            public void mousePressed(MouseEvent e)
            {

                if((parent.activeObj!=null)&&(parent.activeObj!=ezObject.this))
                {
                    parent.activeObj.showOutline(false);
                    parent.activeObj.state=State.inactived;
                }

                if(ezObject.this.state==State.inactived)
                {
                    if(ezObject.this.parent.activeObj!=null)
                    {
                        ezObject.this.parent.activeObj.showOutline(false);
                        ezObject.this.parent.activeObj.drawOutline();
                        ezObject.this.parent.activeObj.state=State.inactived;
                    }
                    ezObject.this.state=State.actived;
                    ezObject.this.showOutline(true);
                    ezObject.this.drawOutline();
                    ezObject.this.parent.repaint();
                    ezObject.this.parent.activeObj=ezObject.this;
                }
                else if(ezObject.this.state==State.actived)
                {
                    ezObject.this.setVisible(false);

                    lp=e.getLocationOnScreen();
                    System.out.println(lp.toString());

                    ezObject.this.state=State.readymove;
                }
            }

            public void mouseReleased(MouseEvent e)
            {
                if(ezObject.this.state==State.moving)
                {
                    ezObject.this.setVisible(true);
                    ezObject.this.showOutline(true);
                    ezObject.this.parent.repaint();
                    ezObject.this.state=State.actived;
                }
                else if(ezObject.this.state==State.readymove)
                {
                    ezObject.this.setVisible(true);
                    ezObject.this.showOutline(true);
                    ezObject.this.parent.repaint();
                    ezObject.this.state=State.actived;
                }
            }
        });

        this.addMouseMotionListener(new MouseAdapter(){
            public void mouseDragged(MouseEvent e)
            {
                if(ezObject.this.state==State.readymove)
                {
                    ezObject.this.state=State.moving;
                }

                if(ezObject.this.state==State.moving)
                {
                    cp=e.getLocationOnScreen();
                    //   System.out.println(cp.toString());

                    ezObject.this.showOutline(false);

                    ezObject.this.parent.repaint();


                    op=ezObject.this.getLocation();

                    ezObject.this.setLocation(cp.x-lp.x+op.x,cp.y-lp.y+op.y);

                    ezObject.this.showOutline(true);
                    ezObject.this.parent.repaint();

                    lp=cp;
                }
            }
        });
    }

    public void showOutline(boolean b)
    {
        this.outlineVisibility=b;
    }

    public void drawOutline()
    {
        Graphics g = parent.getGraphics();
        g.setXORMode(new Color(0, 255, 255));
        Point p = getLocation();
        Dimension d = getSize();

        g.drawRect(p.x-5, p.y-5, d.width+10, d.height+10);
        System.out.println("Paint: x=" + p.x + " y=" + p.y);



        if(outlineVisibility){
            for(ControlPoint cp: controlPoints) {
                cp.setLocationAndSize(ezObject.this.getLocation(), ezObject.this.getSize());
                cp.setVisible(true);
            }
        }
        else {
            for(ControlPoint cp: controlPoints) {
                cp.setVisible(false);
            }
        }

    }

    public void removeOutline() {
        System.out.print("R ");
        drawOutline();
    }
}*/
