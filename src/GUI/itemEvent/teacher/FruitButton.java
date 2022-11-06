package GUI.itemEvent.teacher;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FruitButton extends JButton {

    Integer fruitPrice;
    Integer totalPrice;

    FruitButton(Fruit fruit,int totalPrice){
        this.fruitPrice = fruit.price;
        this.totalPrice = totalPrice;
        setText(fruit.namingify());
        this.addActionListener(new ButtonListener());
    }

    class ButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println(totalPrice);
            totalPrice += fruitPrice;
        }
    }
}


