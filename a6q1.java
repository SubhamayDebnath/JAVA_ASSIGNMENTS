import java.awt.*;
import java.awt.event.*;

public class a6q1 extends Frame {
    public a6q1() {
        setSize(300, 300);
        setTitle("Smiley Face");
        setVisible(true);
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });
    }

    public void paint(Graphics g) {
        g.setColor(Color.yellow);
        g.fillOval(50, 50, 200, 200);
        g.setColor(Color.black);
        g.fillOval(100, 100, 30, 50);
        g.fillOval(170, 100, 30, 50);
        g.setColor(Color.black);
        g.drawArc(100, 140, 100, 60, 0, -180);
    }

    public static void main(String[] args) {
        new a6q1();
    }
}
