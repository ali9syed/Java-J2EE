import javax.swing.*;
public class ComboBox {
    public static void main(String args[]){
    JFrame f = new JFrame("ComboBox");
    String courses[]={"Reehan","Snehal","Zeeshan"};
    JComboBox jc=new JComboBox<>(courses);
    jc.setBounds(130,100,100,50);
    f.add(jc);
    f.setLayout(null);
    f.setSize(400,500);
    f.setVisible(true);
}
}
