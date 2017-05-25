package puzzle8;
import java.awt.Dimension;
import java.awt.event.*;
import java.awt.Font;
import javax.swing.*;

public class panel_auto_mov extends JPanel{
	public JButton eje,com;
	public JLabel nmov,tmov;
	
	public panel_auto_mov(){
		setPreferredSize(new Dimension(240, 190));
		setLayout(null);
		setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), "Lanzar"));
		
		eje=new JButton("Ejecutar");
		com=new JButton("Buscar");
		nmov=new JLabel("Movimientos");
		tmov=new JLabel("0");
		
		eje.setBounds(120, 20, 100, 25);
		com.setBounds(10, 20, 100, 25);
		nmov.setBounds(70, 60, 100, 30);
		tmov.setBounds(70, 100, 100, 60);
		
		tmov.setFont(new Font("SansSerif", Font.PLAIN, 70));
		
		eje.setEnabled(false);
		
		nmov.setHorizontalAlignment(JLabel.CENTER);
		tmov.setHorizontalAlignment(JLabel.CENTER);
		
		add(eje);add(nmov);add(tmov);add(com);
		
	}
	
}
