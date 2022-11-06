package GUI.mouse;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public class MouseEx extends JFrame {

    ImageIcon image = new ImageIcon("images/dog.jpg");
    JLabel la = new JLabel(image);

    MouseEx(){
        setTitle("마우스 움직임 프로그램");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = getContentPane();
        MyMouse1 mouse = new MyMouse1();
        c.addMouseListener(mouse);
        c.addMouseMotionListener(mouse);
        c.setLayout(null);
        la.setSize(800,1000);
        la.setLocation(100,80);
        c.add(la);
        setSize(800,1000);
        setVisible(true);
    }

    class MyMouse1 implements MouseListener, MouseMotionListener {
        @Override
        public void mouseClicked(MouseEvent e) {}

        @Override
        public void mousePressed(MouseEvent e) {

        }

        @Override
        public void mouseReleased(MouseEvent e) {

        }

        @Override
        public void mouseEntered(MouseEvent e) {
            Component comp = (Component) e.getSource();
            comp.setBackground(Color.ORANGE);
        }

        @Override
        public void mouseExited(MouseEvent e) {
            Component comp = (Component) e.getSource();
            comp.setBackground(Color.pink);
        }

        @Override
        public void mouseDragged(MouseEvent e) {

        }

        @Override
        public void mouseMoved(MouseEvent e) {

        }
    }


}
