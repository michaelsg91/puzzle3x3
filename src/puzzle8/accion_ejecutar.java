package puzzle8;
import java.awt.event.*;

public class accion_ejecutar implements ActionListener,Runnable{
	frame_puzzle frame;
	private Thread hilo;
	public accion_ejecutar(frame_puzzle frame){
		this.frame=frame;
		hilo=new Thread(this);
        hilo.start();
	}
	
	public void actionPerformed(ActionEvent e){
		if(e.getSource().equals(frame.fa.pm.com)){
		frame.fa.pa.area.setText("");
		frame.fa.pa.comprueba();	
		
		if(frame.fa.pa.c){
			frame.fa.pm.eje.setEnabled(true);
		}
		}
		if(e.getSource().equals(frame.fa.pm.eje)){
			frame.fa.pp.area.setText("");
			frame.fa.pa.cant=-1;
			frame.fa.pa.cont=-1;
			frame.fa.pa.ejecuta();
			
		}
	}
	
	public void run(){
		Thread ct=Thread.currentThread();
		while(ct==hilo){
			frame.fa.pm.tmov.setText(""+frame.fa.pa.cant);
			if(frame.fa.pa.b){
			frame.fa.pp.area.append("--"+frame.fa.pa.num[frame.fa.pa.cont]+"--");
			}
			try{				
				Thread.sleep(1000);				
			}catch(InterruptedException e){
				e.printStackTrace();
			}
		}
	}

}
