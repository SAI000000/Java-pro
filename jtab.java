import java.awt.*;
import javax.swing.*;
public class jtab extends Frame{
    public jtab(){
        String data[][]={{"1","Amit","12"},{"2","Jai","11"},{"3","Sachin","38"}};
        String coloumn[]={"srno","Name","roll"};
        JTable t1=new JTable(data,coloumn);
        t1.setBounds(30,40,200,300);
        JScrollPane sp=new JScrollPane(t1);
        add(sp);
        setSize(500,500);
        setVisible(true);
    }
    public static void main(String args[]){
        new jtab();
        
    }
}