package puzzle8;
import java.awt.event.*;
public class accion_automatico implements ActionListener{
	frame_puzzle frame;
	public accion_automatico(frame_puzzle frame){
		this.frame=frame;
	}
	
	public void actionPerformed(ActionEvent e){
		frame.fa.setLocationRelativeTo(null);
		frame.fa.setVisible(true);
		frame.fa.pa.barajar(frame.bot.arrini);	
		
	}
}
