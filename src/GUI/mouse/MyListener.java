package GUI.mouse;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

public class MyListener implements ActionListener {

    private String dir;

    MyListener(String direction){
        this.dir = direction;
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        JButton jb = (JButton) e.getSource();
        switch (this.dir){
            case "동" :
                jb.setText("EAST");
                break;
            case "서" :
                jb.setText("WEST");
                break;
            case "남" :
                jb.setText("SOUTH");
                break;
            case "북" :
                jb.setText("NORTH");
                break;
            case "중" :
                jb.setText("CENTER");
                break;
            default:
        }

    }
}
