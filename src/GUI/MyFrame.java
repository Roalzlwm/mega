package GUI;

import javax.swing.*;
import java.awt.*;
import java.lang.management.BufferPoolMXBean;

// JFrame -> 화면창
public class MyFrame extends JFrame {

    MyFrame(){
        setTitle("헤헿 프로그램");
        setSize(300,300);

        Container contentPan = getContentPane();
        contentPan.setBackground(Color.WHITE);
        MyMouse mm = new MyMouse(new JLabel());

        Container cp = getContentPane();
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

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);   // 화면을 띄울 것인가 O/X
    }

}
