package vista;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.*;

public class movimientos extends JPanel{
	public JLabel nmov,tmov;
	public movimientos(){
		setPreferredSize(new Dimension(170, 140));
		setLayout(null);
		
		nmov=new JLabel("Movimientos");
		tmov=new JLabel("0");
		
		nmov.setBounds(10, 20, 150, 30);
		tmov.setBounds(10, 70, 150, 60);
		
		tmov.setFont(new Font("SansSerif", Font.PLAIN, 70));
		
		nmov.setHorizontalAlignment(JLabel.CENTER);
		tmov.setHorizontalAlignment(JLabel.CENTER);
		
		add(nmov);add(tmov);
				
		
	}
}
