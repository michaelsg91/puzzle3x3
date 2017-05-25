package puzzle8;
import java.awt.event.*;

public class numeros extends KeyAdapter{
	public void keyTyped(KeyEvent e){
		char c=e.getKeyChar();
		if(c<'0' || c>'9')e.consume();		
	}
}
