package GUI.itemEvent.teacher;

import javax.swing.*;

public class totalPanel extends JPanel {

    totalPanel(int totalPrice){
        this.add(new JLabel("현재 "+totalPrice+"원 입니다."));
    }

}
