package GUI;

import javax.swing.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MyMouse implements MouseListener {

    JLabel jl;

    MyMouse(JLabel jl){
        this.jl = jl;
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        jl.setText("현재 좌표는 X: "+e.getX()+"  Y: "+e.getY()+"  입니다.");
        jl.setLocation(e.getX(),e.getY());
    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}
