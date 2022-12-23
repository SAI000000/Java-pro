import java.awt.*;
class Menublack extends Frame{
    Menublack(){
    MenuBar mb=new MenuBar();
    setMenuBar(mb);
    Menu m1=new Menu("Colours");
    MenuItem mn1=new MenuItem("Red");
    MenuItem mn2=new MenuItem("Blue");
    MenuItem mn3=new MenuItem("Black");
    MenuItem mn4=new MenuItem("Orange");
    m1.add(mn1);
    m1.add(mn2);
    m1.add(mn3);    
    m1.add(mn4);
    mb.add(m1);
    mn3.setEnabled(false);
    }

public static void main(String args[]){
    Menublack m=new Menublack();
    m.setTitle("Blackdis");
    m.setSize(500,500);
    m.setVisible(true);
     
}
}