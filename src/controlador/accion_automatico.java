package controlador;
import java.awt.event.*;
import vista.*;

public class accion_automatico implements ActionListener{
	frame_puzzle frame;
	public accion_automatico(frame_puzzle frame){
		this.frame=frame;
	}
	
	public void actionPerformed(ActionEvent e){
		frame.puz.matrices();
		frame.puz.comprueba();
		
	}
}
