import javax.swing.*;      
public class buttonexample1{    
buttonexample1(){    
JFrame f=new JFrame("Button Example");            
JButton b=new JButton(new ImageIcon("download.jpeg"));    
b.setBounds(100,100,250, 240);    
f.add(b);    
f.setSize(300,400);    
f.setLayout(null);    
f.setVisible(true);    
f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    
    }         
public static void main(String[] args) {    
    new buttonexample1();    
}    
}  