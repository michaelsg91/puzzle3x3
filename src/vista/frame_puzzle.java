package vista;
import java.awt.*;
import javax.swing.*;

import controlador.*;

import java.awt.event.*;

public class frame_puzzle extends JFrame{
	public puzzle8 puz;
	public botones bi;
	public movimientos mov;
	public accion_clic ac;
	public tiempo ti;
	public accion_automatico accion_auto;
	public frame_puzzle(){
		puz=new puzzle8();
		bi=new botones();
		mov=new movimientos();
		ac=new accion_clic(this);
		ti=new tiempo();
		accion_auto=new accion_automatico(this);
		
		JPanel izq=new JPanel();
		izq.setLayout(new BoxLayout(izq, BoxLayout.Y_AXIS));
		izq.add(bi);
		JPanel der=new JPanel();
		der.setLayout(new BoxLayout(der, BoxLayout.Y_AXIS));
		der.add(mov);
		der.add(ti);
		
		setTitle("Puzzle 8");
        setResizable(false);
        add(puz,BorderLayout.CENTER);
        pack();
        add(izq,BorderLayout.WEST);
        pack();
        add(der,BorderLayout.EAST);
        pack();
        
        setLocationRelativeTo(null);
        puz.addMouseListener(ac);

                
        bi.auto.addActionListener(accion_auto);
        
        		
	}
}
