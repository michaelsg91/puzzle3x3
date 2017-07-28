package vista;
import java.awt.*;
import java.text.*;
import javax.swing.*;

public class tiempo extends JPanel implements Runnable{
	public Thread hilo;
	public JLabel nseg,nmin,nhor,tseg,tmin,thor,pun1,pun2;
	public byte seg,min,hor;
	private boolean b=false;
	public tiempo(){
		setPreferredSize(new Dimension(170, 90));
		setLayout(null);
		
		nseg=new JLabel("S");
		nmin=new JLabel("M");
		nhor=new JLabel("H");
		tseg=new JLabel("00");
		tmin=new JLabel("00");
		thor=new JLabel("00");
		pun1=new JLabel(":");
		pun2=new JLabel(":");
		
		
		
		nhor.setBounds(35, 20, 30, 30);		
		nmin.setBounds(65, 20, 30, 30);
		nseg.setBounds(95, 20, 30, 30);
		thor.setBounds(35, 50, 30, 30);		
		tmin.setBounds(65, 50, 30, 30);
		tseg.setBounds(95, 50, 30, 30);
		pun1.setBounds(65, 50, 5, 30);
		pun2.setBounds(95, 50, 5, 30);
		
		nhor.setHorizontalAlignment(JLabel.CENTER);
		nmin.setHorizontalAlignment(JLabel.CENTER);
		nseg.setHorizontalAlignment(JLabel.CENTER);
		thor.setHorizontalAlignment(JLabel.CENTER);
		tmin.setHorizontalAlignment(JLabel.CENTER);
		tseg.setHorizontalAlignment(JLabel.CENTER);
		
			
		hilo=new Thread(this);
		hilo.start();
		add(nseg);add(tseg);add(nmin);add(tmin);add(nhor);add(thor);add(pun1);add(pun2);
	}
	
	public void iniciar(){
		if(b){
			seg++;
			if(seg==60){
				seg=0;
				min++;
			}
			if(min==60){
				min=0;
				hor++;
			}
		}
		
		thor.setText(""+hor);
		tmin.setText(""+min);
		tseg.setText(""+seg);
	}
	public void reiniciar(){
		seg=0;
		min=0;
		hor=0;
		b=true;
		
	}
	public void parar(){
		b=false;
	}
	public void run(){
		Thread ct=Thread.currentThread();
		while(ct==hilo){
			iniciar();
			try{
				Thread.sleep(1000);
			}catch(InterruptedException e){
				e.printStackTrace();
			}
		}
	}
	
}
