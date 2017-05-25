package puzzle8;
import java.awt.BorderLayout;

import javax.swing.*;

public class frame_auto extends JFrame{
	panel_auto pa;
	panel_auto_mov pm;
	panel_auto_pasos pp;
	public frame_auto(){
		setTitle("Automático");
        setResizable(false);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		pa=new panel_auto();
		pm=new panel_auto_mov();
		pp=new panel_auto_pasos();
		
		JPanel izq=new JPanel();
		izq.setLayout(new BoxLayout(izq, BoxLayout.Y_AXIS));
		izq.add(pm);
		izq.add(pp);
		
		
		add(pa,BorderLayout.CENTER);
		pack();	
		add(izq,BorderLayout.WEST);
		pack();
	}
}
