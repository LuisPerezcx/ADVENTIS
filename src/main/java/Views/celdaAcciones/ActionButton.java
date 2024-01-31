package Views.celdaAcciones;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.geom.Ellipse2D;

/**
 *
 * @author david
 */
public class ActionButton extends JButton {
    private boolean mousePress;
    public ActionButton(){
        setContentAreaFilled(false);
        setBorder(new EmptyBorder(3,3,3,3));
        addListener();
    }
    private void addListener(){
        addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                mousePress = true;
            }
            @Override
            public void mouseReleased(MouseEvent e) {
                mousePress = false;
            }
            @Override
            public void mouseEntered(MouseEvent e) {
                setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
            }
            @Override
            public void mouseExited(MouseEvent e) {
                setCursor(Cursor.getDefaultCursor());
            }
            @Override
            public void mouseClicked(MouseEvent e) {
                System.out.println("sasaas");
            }
        });
    }

    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g.create();
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        int width = getWidth();
        int height = getHeight();
        int size = Math.min(width, height);
        int x = (width-size)/2;
        int y = (height-size)/2;
        if (mousePress){
            g2.setColor(new Color(158,158,158));
        }else {
            g2.setColor(new Color(199,199,199));
        }
        g2.fill(new Ellipse2D.Double(x,y,size,size));
        g2.dispose();
        super.paintComponent(g);
    }
}
