package puzzle8;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.*;

public class ayuda extends JPanel{
	public JLabel nayu,tayu;
	public ayuda(){
		setPreferredSize(new Dimension(260, 140));
		setLayout(null);
		setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), "Ayuda"));
		
		nayu=new JLabel("Puedes mover la ficha:");
		tayu=new JLabel("");
		
		nayu.setBounds(30, 20, 200, 30);
		tayu.setBounds(30, 70, 200, 60);
		
		tayu.setFont(new Font("SansSerif", Font.PLAIN, 70));
		
		nayu.setHorizontalAlignment(JLabel.CENTER);
		tayu.setHorizontalAlignment(JLabel.CENTER);
		
		add(nayu);add(tayu);
				
		
	}
}
