package puzzle8;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.awt.event.FocusAdapter;

public class puzzle_final extends JPanel{
	public JTextField tf0,tf1,tf2,tf3,tf4,tf5,tf6,tf7,tf8;
	private JLabel lf0,lf1,lf2,lf3,lf4,lf5,lf6,lf7,lf8;
	public puzzle_final(){
		setPreferredSize(new Dimension(270, 120));
		setLayout(null);
		setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), "Puzzle Final"));
		
		tf0=new JTextField("1");
		tf1=new JTextField("2");
		tf2=new JTextField("3");
		tf3=new JTextField("8");
		tf4=new JTextField("0");
		tf5=new JTextField("4");
		tf6=new JTextField("7");
		tf7=new JTextField("6");
		tf8=new JTextField("5");		
		
		lf0=new JLabel("1:");
		lf1=new JLabel("2:");
		lf2=new JLabel("3:");
		lf3=new JLabel("4:");
		lf4=new JLabel("5:");
		lf5=new JLabel("6:");
		lf6=new JLabel("7:");
		lf7=new JLabel("8:");
		lf8=new JLabel("9:");
		
				
		tf0.setBounds(50, 30, 30, 20);				
		tf1.setBounds(130, 30, 30, 20);
		tf2.setBounds(210, 30, 30, 20);
		tf3.setBounds(50, 60, 30, 20);
		tf4.setBounds(130, 60, 30, 20);				
		tf5.setBounds(210, 60, 30, 20);
		tf6.setBounds(50, 90, 30, 20);
		tf7.setBounds(130, 90, 30, 20);
		tf8.setBounds(210, 90, 30, 20);				
						
		lf0.setBounds(10, 30, 30, 20);
		lf1.setBounds(90, 30, 30, 20);
		lf2.setBounds(170, 30, 30, 20);
		lf3.setBounds(10, 60, 30, 20);
		lf4.setBounds(90, 60, 30, 20);
		lf5.setBounds(170, 60, 30, 20);
		lf6.setBounds(10, 90, 30, 20);
		lf7.setBounds(90, 90, 30, 20);
		lf8.setBounds(170, 90, 30, 20);
						
		tf0.addKeyListener(new numeros());
		tf1.addKeyListener(new numeros());
		tf2.addKeyListener(new numeros());
		tf3.addKeyListener(new numeros());
		tf4.addKeyListener(new numeros());
		tf5.addKeyListener(new numeros());
		tf6.addKeyListener(new numeros());
		tf7.addKeyListener(new numeros());
		tf8.addKeyListener(new numeros());
		
		
		
		add(lf0);add(lf1);add(lf2);add(lf3);add(lf4);add(lf5);add(lf6);add(lf7);
		add(lf8);
		add(tf0);add(tf1);add(tf2);add(tf3);add(tf4);add(tf5);add(tf6);add(tf7);
		add(tf8);
	}
}
