package vista;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class botones extends JPanel{
	public JButton iniciar,salir,auto;
	public botones(){
		setPreferredSize(new Dimension(170,130));
		setLayout(null);
		
		iniciar=new JButton("Empezar Juego");
		salir=new JButton("Salir");
		auto=new JButton("Automático");
		
		auto.setBounds(10, 10, 150, 30);		
		iniciar.setBounds(10, 50, 150, 30);
		salir.setBounds(10, 90, 150, 30);
		
		salir.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				System.exit(0);
			}
		});	
		
		add(iniciar);add(salir);
		add(auto);
	}
	
	
}
