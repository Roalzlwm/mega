package GUI.itemEvent.me;

import javax.swing.*;
import java.awt.*;

public class Hungry extends JFrame {
    JLabel la;
    PCButton pc = new PCButton();

    Hungry(){
        setTitle("메뉴");
        setSize(800,800);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container c = getContentPane();
        c.setLayout(new FlowLayout(FlowLayout.LEFT,30,10));

        JButton fireChikin = new JButton("불닭");

        c.add(new JButton("만두"));

        c.add(new JButton("짜계치"));

        setVisible(true);
    }
}
