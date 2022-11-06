package GUI.itemEvent.teacher;

import javax.swing.*;
import java.util.ArrayList;

public class pricePanel extends JPanel {

    JLabel jl = new JLabel();
    ArrayList<Fruit> fruitsBox = new ArrayList<>();
    Fruit apple = new Fruit("사과",100);
    Fruit pear = new Fruit("배",500);
    Fruit cherry = new Fruit("체리",20000);

    pricePanel(){
        this.add(new JLabel(apple.namingify()));
        this.add(new JLabel(pear.namingify()));
        this.add(new JLabel(cherry.namingify()));
    }

    void addFruit(Fruit fruit){
        fruitsBox.add(fruit);
    }

}
