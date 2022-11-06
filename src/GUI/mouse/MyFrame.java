package GUI.mouse;

import javax.swing.*;
import java.awt.*;

// JFrame -> 화면창
public class MyFrame extends JFrame {

    private Container cp;

    MyFrame(){

        // contentpane
        this.cp = getContentPane();
        this.cp.setBackground(Color.WHITE);
        cp.setLayout(new FlowLayout(FlowLayout.LEFT,30,40));

        JLabel jl = new JLabel("현재 좌표는 X: Y: 입니다.");
        cp.addMouseListener(new MyMouse(jl));
        cp.add(jl);



//        cp.setLayout(new BorderLayout());
//        JButton dong = new JButton("동");
//        dong.addActionListener(new MyListener("동"));
//        cp.add(dong,BorderLayout.EAST);
//        JButton sa = new JButton("서");
//        sa.addActionListener(new MyListener("서"));
//        cp.add(sa,BorderLayout.WEST);
//        JButton ram = new JButton("남");
//        ram.addActionListener(new MyListener("남"));
//        cp.add(ram,BorderLayout.SOUTH);
//        JButton qe = new JButton("북");
//        qe.addActionListener(new MyListener("북"));
//        cp.add(qe,BorderLayout.NORTH);
//        JButton h = new JButton("중");
//        h.addActionListener(new MyListener("중"));
//        cp.add(h,BorderLayout.CENTER);

        this.setDefault();
    }

    void setDefault(){
        // Jframe
        setTitle("헤헿 프로그램");
        setSize(300,300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);   // 화면을 띄울 것인가 O/X
    }

    void addComponent(Component comp){
        this.cp.addMouseListener(new MyMouse((JLabel) comp));
        this.cp.add(comp);
    }

}
