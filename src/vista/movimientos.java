package vista;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.*;

public class movimientos extends JPanel{
	public JLabel nmov,tmov;
	public movimientos(){
		setPreferredSize(new Dimension(260, 140));
		setLayout(null);
		setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), "Movimientos"));
		
		nmov=new JLabel("Cantidad de movimientos:");
		tmov=new JLabel("0");
		
		nmov.setBounds(30, 20, 200, 30);
		tmov.setBounds(30, 70, 200, 60);
		
		tmov.setFont(new Font("SansSerif", Font.PLAIN, 70));
		
		nmov.setHorizontalAlignment(JLabel.CENTER);
		tmov.setHorizontalAlignment(JLabel.CENTER);
		
		add(nmov);add(tmov);
				
		
	}
}
