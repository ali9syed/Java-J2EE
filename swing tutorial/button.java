import java.awt.Color;

import javax.swing.*;  
public class button {  
public static void main(String[] args) {  
JFrame f=new JFrame("HELLO SWINGS");//creating instance of JFrame  
JLabel l1=new JLabel("FIRST LABEL");   
JButton b=new JButton("click");//creating instance of JButton  
b.setBackground(Color.CYAN);
b.setBounds(130,100,100, 40);//x axis, y axis, width, height  
JTextField t1=new JTextField("20");
//t1.setBounds(130,10,100,40);
JPanel panel = new JPanel();
panel.setBounds(130,30,250,250);
panel.setBackground(Color.darkGray);
t1.setBackground((Color.white));
l1.setForeground((Color.white));
panel.add(b);
panel.add(l1);
panel.add(t1);
f.add(panel);
//f.add(t1);       
//f.add(b);//adding button in JFrame  
//l1.setBounds(130,150,100,40);
//f.add(l1);  
f.setSize(400,500);//400 width and 500 height  
f.setLayout(null);//using no layout managers  
f.setVisible(true);//making the frame visible  
}  
}  