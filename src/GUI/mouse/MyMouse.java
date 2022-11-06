package GUI.mouse;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MyMouse extends MouseAdapter {

    JLabel jl;

    MyMouse(JLabel jl){
        this.jl = jl;
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        jl.setText("현재 좌표는 X: "+e.getX()+"  Y: "+e.getY()+"  입니다.");
    }

}
