package puzzle8;
import javax.swing.*;
import java.awt.event.*;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.awt.*;

public class botones extends JPanel{
	public JLabel nniv,tniv;
	public JButton iniciar,aleatorio,salir,auto;
	public JCheckBox in,fi;
	public botones(){
		setPreferredSize(new Dimension(270,150));
		setLayout(null);
		
		iniciar=new JButton("Empezar Juego");
		aleatorio=new JButton("Barajar");
		salir=new JButton("Salir");
		auto=new JButton("Automático");
		nniv=new JLabel("Nivel");
		tniv=new JLabel("Difícil");
		in=new JCheckBox("I",true);
		fi=new JCheckBox("F",true);
		
		nniv.setBounds(10, 40, 50, 20);
		tniv.setBounds(10, 60, 100, 20);
		
		auto.setBounds(10, 115, 120, 25);
		
		in.setBounds(145, 5, 35, 30);
		fi.setBounds(185, 5, 35, 30);			
		
		aleatorio.setBounds(135, 35, 90, 25);
		iniciar.setBounds(110, 80, 140, 25);
		salir.setBounds(145, 115, 70, 25);
		
		salir.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				System.exit(0);
			}
		});	
		
		add(iniciar);add(aleatorio);add(salir);add(nniv);add(tniv);
		add(in);add(fi);add(auto);
	}
	
	
}
