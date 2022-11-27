import java.awt.*;
import java.awt.event.*;
public class LabelExample2 extends Frame implements ActionListener{
TextField tf;
Label l;
Button b;
LabelExample2(){
tf=new TextField();
tf.setBounds(50,50,150,20);
l=new Label();
l.setBounds(50,100,250,20);
b=new Button("Find IP");
b.setBounds(50,150,60,30);
b.addActionListener(this);

add(b);
add(tf);
add(l);

setSize(400,400);
setLayout(null);
setvisible(true);
}
public void actionperformed(ActionEvent e){
try{
 string host=tf.getText();
 String ip=java.net.lnetAddress.getByName(host).getHostAddress();
 l.setText("IP of"+host+"is:"+ip);
 }
 catch(Exception ex){
 System.out.println(ex);
 }
 }
 public static void maion(String args[]){
 new LabelExample2();
 }
 }