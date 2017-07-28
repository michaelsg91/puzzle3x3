package controlador;
import java.awt.event.*;
import vista.*;

public class accionBotones implements ActionListener{
	frame_puzzle frame;
	public accionBotones(frame_puzzle frame){
		this.frame=frame;
	}
	
	public void actionPerformed(ActionEvent e){
		if(e.getSource().equals(frame.bi.auto)){
		frame.puz.matrices();
		frame.puz.comprueba();
		frame.mov.tmov.setText(""+frame.puz.cant);
		frame.ti.parar();
		}
		
		if(e.getSource().equals(frame.bi.iniciar)){
			frame.ti.reiniciar();
			frame.puz.con=0;
			frame.mov.tmov.setText("0");
		}
	}
}
