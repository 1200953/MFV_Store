import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;


public class Example1 extends JFrame {
    String name;

    public void CreateJFrame(String title) { // 定义一个CreateJFrame()方法
        JFrame jf = new JFrame(title); // 实例化一个JFrame对象
        final Container c = jf.getContentPane(); // 获取一个容器
        c.setLayout(null);
        c.setBackground(Color.white);//设置容器的背景颜色
        jf.setVisible(true); // 使窗体可视
        jf.setSize(800, 600); // 设置窗体大小

//////////////////////////////////////////////////////////////////////////

        final JButton bl=new JButton("点击");
        bl.setBounds(0, 0, 200, 25);
        bl.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                bl.setText("你点击了按钮");
                c.repaint();//重绘
            }
        });
        c.add(bl);


    }
    public static void main(String args[]){//在主方法中调用createJFrame()方法
        new Example1().CreateJFrame("创建一个JFrame窗体");
    }
}
