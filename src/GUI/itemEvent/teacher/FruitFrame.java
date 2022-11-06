package GUI.itemEvent.teacher;

import javax.swing.*;
import java.awt.*;

public class FruitFrame extends JFrame {

    int totalPrice = 0;

    pricePanel pricePanel = new pricePanel();
    buttonPanel buttonPanel = new buttonPanel(totalPrice);
    totalPanel totalPanel = new totalPanel(totalPrice);

    FruitFrame(){

        setLayout(new FlowLayout());
        add(pricePanel);
        add(buttonPanel);
        add(totalPanel);

        setTitle("과일 개꿀맛 계산 프로그램");
        setSize(400,400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

}
