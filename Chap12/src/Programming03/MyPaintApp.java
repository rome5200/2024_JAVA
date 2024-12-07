package Programming03;

import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JPanel;

class Point{
    int x, y;
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

public class MyPaintApp extends JFrame{
    int x, y, dx, dy;
    boolean click = true;
    Vector<Point> list = new Vector<>();
    Vector<Point> dlist = new Vector<>();
    
    class MyPanel extends JPanel {
        public MyPanel() {
            addMouseMotionListener(new MouseMotionAdapter() {
                public void mouseDragged(MouseEvent e) {
                    dx = e.getX();
                    dy = e.getY();
                    dlist.add(new Point(dx, dy));
                    x = dx;
                    y = dy;
                    list.add(new Point(x,y));
          
                    repaint();
                }
            });
            
            addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {
               x = e.getX();
               y = e.getY();
               list.add(new Point(x,y));
            }
         });
        }

        public void paintComponent(Graphics g) {
            super.paintComponent(g);
            for (int i = 0; i < dlist.size(); i++) {
                g.drawLine(list.elementAt(i).x, list.elementAt(i).y,
                      dlist.elementAt(i).x, dlist.elementAt(i).y);
            }
        }
    }

    public MyPaintApp() {
        setSize(1000, 600);
        add(new MyPanel());
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        MyPaintApp f = new MyPaintApp();
    }
}