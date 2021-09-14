import java.awt.*;
import java.awt.event.*;

class MenuGui1 implements ActionListener{
	Frame f1;
	Label l1,l2,l3,l4;
	TextField t1;
	Button b1,b2;
	Checkbox cb1,cb2,cb3,cb4,cb5;
	CheckboxGroup cbg1;
	
	public MenuGui1(){
		f1=new Frame();
		f1.setSize(500,500);
		
		l1=new Label("MY PIZZA CAFE ");
		cb1=new Checkbox("Burger",true);
		cb2=new Checkbox("Chowmein",true);
		cb3=new Checkbox("Pizza",true);
		cbg1=new CheckboxGroup();
		cb4=new Checkbox("Cash",cbg1,true);
		cb5=new Checkbox("Credit",cbg1,false);
		b1=new Button("Bill");
		b2=new Button("exit");
		t1=new TextField("WELCOME TO MY PIZZA CAFE  ");
		l2=new Label("..............60");
		l3=new Label(".............100");
		l4=new Label(".............200");
		
		
		f1.add(l1);
		f1.add(cb1);
		f1.add(cb2);
		f1.add(cb3);
		f1.add(cb4);
		f1.add(cb5);
		f1.add(b1);
		f1.add(b2);
		f1.add(t1);
		f1.add(l2);
		f1.add(l3);
		f1.add(l4);
		
		f1.setLayout(null);
		
		l1.setBounds(200,100,100,30);
		cb1.setBounds(100,150,100,30);
		cb2.setBounds(100,200,100,20);
		cb3.setBounds(100,240,100,30);
		cb4.setBounds(140,280,100,30);
		cb5.setBounds(250,280,100,30);
		b1.setBounds(100,330,100,30);
		b2.setBounds(220,330,100,30);
		t1.setBounds(150,400,200,30);
		l2.setBounds(200,150,100,30);
		l3.setBounds(200,200,100,30);
		l4.setBounds(200,250,100,30);
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		
		f1.setVisible(true);
	}
	public void actionPerformed(ActionEvent e){
		
		int bill=0;
		if(e.getSource()==b1)
		{	
			if(cb1.getState()==true){
				bill=bill+60;
			}
		 if(cb2.getState()==true)
			{
				bill=bill+100;
			}
		 if(cb3.getState()==true)
			{
				bill=bill+200;
			}
		if(cb4.getState()==true)
			t1.setText("YOUR CASH BILL IS "+bill);
		else
			t1.setText("YOUR CREDIT BILL IS "+bill);
		}
		else if(e.getSource()==b2)
		{
				System.exit(0);
		}
	}
}
class MyPizzaApp{
	public static void main(String ar[]){
		new MenuGui1();
	}
}