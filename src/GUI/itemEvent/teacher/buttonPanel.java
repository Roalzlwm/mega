package GUI.itemEvent.teacher;

import javax.swing.*;

public class buttonPanel extends JPanel {
    Fruit apple = new Fruit("사과",100);
    Fruit pear = new Fruit("배",500);
    Fruit cherry = new Fruit("체리",20000);

    buttonPanel(int totalPanel){
        this.add(new FruitButton(apple,totalPanel));
        this.add(new FruitButton(pear,totalPanel));
        this.add(new FruitButton(cherry,totalPanel));
    }
}
