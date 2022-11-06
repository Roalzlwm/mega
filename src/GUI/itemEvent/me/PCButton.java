package GUI.itemEvent.me;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class PCButton extends MouseAdapter {

    private JLabel la;

    int fireChikin = 2000;
    int mandu = 3000;
    int jjagyechi = 5000;
    int money;

//    void MyItem(JLabel PC){
//        this.la = PC;
//    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if (e.getButton() == MouseEvent.BUTTON1) { money += fireChikin; }
        else if (e.getButton() == MouseEvent.BUTTON2) { money += mandu; }
        else if (e.getButton() == MouseEvent.BUTTON3) { money += jjagyechi; }
        else { }

        la.setText("불닭 "+fireChikin+"원, 만두 "+mandu+"원, 짜계치 "+jjagyechi+"원 입니다.");
        la.setText("현재 "+money+"원 입니다.");
    }
}
