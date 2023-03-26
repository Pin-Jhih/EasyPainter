package EASY;

import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Page extends Panel {

    State state;

    Point p1, p2, p0;

    Color c1 = Color.WHITE;
    Color c = ColorBT.c;

//    public ezObject obj = null;

    boolean firstTime = true;

    DrawType drawType, fillType = DrawType.hollow;

    Page() {
        this.setLayout(getLayout());
        this.setBackground(Color.white);

        this.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {
                if (state == State.readydraw)
                    state = State.drawing;

                p1 = e.getPoint();
            }
            public void mouseReleased(MouseEvent e) {
                if (state == State.drawing) {
                    Graphics g = getGraphics();
                    if (    (drawType == DrawType.line) ||
                            (drawType == DrawType.rectangle)||
                            (drawType == DrawType.oval)||
                            (drawType == DrawType.triangle)||
                            (drawType == DrawType.star)||
                            (drawType == DrawType.eraser)) {
                        drawSomething(g, p1, p0);
                    }
                    p1 = p2 = p0 = null;
                    firstTime = true;
                }
            }
        });
        this.addMouseMotionListener(new MouseAdapter() {
            public void mouseDragged(MouseEvent e) {
                if (state == State.drawing) {
                    p2 = e.getPoint();
                    Graphics g = Page.this.getGraphics();
                    g.setXORMode(c1);

                    if (drawType == DrawType.pen){
                        g.setColor(c);
                        drawSomething(g,p1,p2);
                        g.drawLine(p1.x,p1.y,p2.x,p2.y);
                        p1 = p2;
                    }
                    else if(drawType == DrawType.eraser) {
                        if (fillType == DrawType.hollow) {
                            drawSomething(g, p1, p2);
                            p1 = p2;
                        }
                    }

                    if (!firstTime) {
                        drawSomething(g, p1, p0);
                    } else {
                        firstTime = false;
                    }
                    drawSomething(g, p1, p2);
                    p0 = p2;
                }
            }
        });

    }

    public void drawSomething(Graphics g, Point p1, Point p2) {
        int x, y, w, h;
        int mx = (int) ((p1.x + p2.x) / 2);
        int my = (int) ((p1.y + p2.y) / 2);
        int[] x0 = {mx, Math.max(p1.x, p2.x), Math.min(p1.x, p2.x)};
        int[] y0 = {Math.min(p1.y, p2.y), Math.max(p1.y, p2.y), Math.max(p1.y, p2.y)};
        int[] x1 = new int[5],y1 = new int[5];
        double length = Math.pow(Math.pow(p1.x-p2.x, 2)+Math.pow(p1.y-p2.y, 2), 0.5);

        if ((p1.x <= p2.x) && (p1.y >= p2.y)) {
            x = p1.x;
            y = p2.y;
            w = p2.x - p1.x;
            h = p1.y - p2.y;
        }
        else if ((p1.x > p2.x) && (p1.y > p2.y)) {
            x = p2.x;
            y = p2.y;
            w = p1.x - p2.x;
            h = p1.y - p2.y;
        }
        else if ((p1.x >= p2.x) && (p1.y <= p2.y)) {
            x = p2.x;
            y = p1.y;
            w = p1.x - p2.x;
            h = p2.y - p1.y;
        }
        else {
            x = p1.x;
            y = p1.y;
            w = p2.x - p1.x;
            h = p2.y - p1.y;
        }

        for (int i = 0; i < 5; i++) {
            x1[i] = (int)(Math.cos(i * 72 * Math.PI / 30 - Math.PI /2) * length + p1.x);
            y1[i] = (int)(Math.sin(i * 72 * Math.PI / 30 - Math.PI /2) * length + p1.y);
        }

        //x1[0] = p1.x;
        //y1[0] = p1.y;

        g.setColor(c);
        if (drawType == DrawType.line)
            g.drawLine(p1.x, p1.y, p2.x, p2.y);
        else if (drawType == DrawType.rectangle) {
            if (fillType == DrawType.hollow)
                g.drawRect(x, y, w, h);
            else if (fillType == DrawType.fill)
                g.fillRect(x, y, w, h);
        }
        else if (drawType == DrawType.oval) {
            if (fillType == DrawType.hollow)
                g.drawOval(x, y, w, h);
            else if (fillType == DrawType.fill)
                g.fillOval(x, y, w, h);
        }
        else if (drawType == DrawType.triangle) {
            if (fillType == DrawType.hollow)
                g.drawPolygon(x0,y0,3);
            else if (fillType == DrawType.fill)
                g.fillPolygon(x0, y0, 3);
        }
        else if (drawType == DrawType.star) {
            if(fillType == DrawType.hollow) {
                //g.drawPolygon(x1, y1, 5);
                g.drawOval(p1.x-(int)length-1, p1.y-(int)length-1 , (int)length*2, (int)length*2);
                g.drawOval(p1.x-(int)length-(int)length/8, p1.y-(int)length-(int)length/8 , (int)length*2+(int)length/4, (int)length*2+(int)length/4);
                g.drawLine(x1[0], y1[0], x1[2], y1[2]);
                g.drawLine(x1[0], y1[0], x1[3], y1[3]);
                g.drawLine(x1[1], y1[1], x1[3], y1[3]);
                g.drawLine(x1[1], y1[1], x1[4], y1[4]);
                g.drawLine(x1[2], y1[2], x1[4], y1[4]);
                g.drawLine(x1[2], y1[2], x1[0], y1[0]);
            }
        }
        else if (drawType == DrawType.eraser) {
            if (fillType == DrawType.hollow)
                g.clearRect(p2.x,p2.y,10,10);
            else if (fillType == DrawType.fill)
                g.clearRect(x,y,w,h);
        }
        else if (drawType == DrawType.pen) {
            g.drawLine(p1.x,p1.y,p2.x,p2.y);
        }
    }
}
