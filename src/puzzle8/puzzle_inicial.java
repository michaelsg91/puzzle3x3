package puzzle8;
import javax.swing.*;

import java.awt.*;

public class puzzle_inicial extends JPanel{
	public JTextField t0,t1,t2,t3,t4,t5,t6,t7,t8;
	private JLabel l0,l1,l2,l3,l4,l5,l6,l7,l8;
	public puzzle_inicial(){
		setPreferredSize(new Dimension(270, 120));
		setLayout(null);
		setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), "Puzzle Inicial"));
		
		t0=new JTextField("2");
		t1=new JTextField("8");
		t2=new JTextField("3");
		t3=new JTextField("1");
		t4=new JTextField("6");
		t5=new JTextField("4");
		t6=new JTextField("7");
		t7=new JTextField("0");
		t8=new JTextField("5");
		
				
		l0=new JLabel("1:");
		l1=new JLabel("2:");
		l2=new JLabel("3:");
		l3=new JLabel("4:");
		l4=new JLabel("5:");
		l5=new JLabel("6:");
		l6=new JLabel("7:");
		l7=new JLabel("8:");
		l8=new JLabel("9:");
		
		
		
		t0.setBounds(50, 30, 30, 20);				
		t1.setBounds(130, 30, 30, 20);
		t2.setBounds(210, 30, 30, 20);
		t3.setBounds(50, 60, 30, 20);
		t4.setBounds(130, 60, 30, 20);				
		t5.setBounds(210, 60, 30, 20);
		t6.setBounds(50, 90, 30, 20);
		t7.setBounds(130, 90, 30, 20);
		t8.setBounds(210, 90, 30, 20);				
		
				
		l0.setBounds(10, 30, 30, 20);
		l1.setBounds(90, 30, 30, 20);
		l2.setBounds(170, 30, 30, 20);
		l3.setBounds(10, 60, 30, 20);
		l4.setBounds(90, 60, 30, 20);
		l5.setBounds(170, 60, 30, 20);
		l6.setBounds(10, 90, 30, 20);
		l7.setBounds(90, 90, 30, 20);
		l8.setBounds(170, 90, 30, 20);
		
				
		t0.addKeyListener(new numeros());
		t1.addKeyListener(new numeros());
		t2.addKeyListener(new numeros());
		t3.addKeyListener(new numeros());
		t4.addKeyListener(new numeros());
		t5.addKeyListener(new numeros());
		t6.addKeyListener(new numeros());
		t7.addKeyListener(new numeros());
		t8.addKeyListener(new numeros());
		
				
		add(t0);add(t1);add(t2);add(t3);add(t4);add(t5);add(t6);add(t7);
		add(t8);
		add(l0);add(l1);add(l2);add(l3);add(l4);add(l5);add(l6);add(l7);
		add(l8);
		
	}
}
