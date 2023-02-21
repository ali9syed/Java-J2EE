import javax.swing.*;

import java.awt.Color;
import java.awt.FlowLayout;
public class MenuProg{
    MenuProg() {
        JFrame f=new JFrame("Menu Program");
        JMenu m = new JMenu("FILE");
        JMenuBar mb=new JMenuBar();
        JLabel l = new JLabel("Select NAME");
        l.setBounds(130 , 100 , 60 , 60);
        l.setBackground(Color.red);
        JMenuItem a1=new JMenuItem("NOW");
        JMenuItem a2=new JMenuItem("OPEN");
        String n[]={"Reehan","Snehal","Zeeshan"};
        DefaultListModel<String> l1 = new DefaultListModel<>();  
        l1.addElement("Item1");  
        l1.addElement("Item2");  
        l1.addElement("Item3");   
        //JList<String> list=new JList<>(n);
        JPanel p=new JPanel();
        JList<String> list=new JList<>(l1);
        list.setBounds(130,100,60,60);
        m.add(a1);
        m.add(a2);
        mb.add(m);
        p.setBackground(Color.orange);
        f.setJMenuBar(mb);
        f.add(list);
        f.add(p);
        list.setSelectedIndex(0);
        f.setLayout(new FlowLayout());
        f.setSize(400,500);
      //  f.setLayout(null);
        f.setVisible(true);
    }
    public static void main(String [] args){
         new MenuProg();
    }
}
