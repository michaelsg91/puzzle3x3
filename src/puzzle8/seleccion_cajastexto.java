package puzzle8;
import java.awt.event.*;

import javax.swing.JTextField;

public class seleccion_cajastexto extends FocusAdapter{
	frame_puzzle frame;
	JTextField text;
	public seleccion_cajastexto(frame_puzzle frame){
		this.frame=frame;
	}
	public void focusGained(FocusEvent e){
		Object o=e.getSource();
		text=(JTextField)o;
		text.selectAll();
	}
	public void focusLost(FocusEvent e){
		Object o=e.getSource();
		text=(JTextField)o;
		text.select(0, 0);
	}
}
