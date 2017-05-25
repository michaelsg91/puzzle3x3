package puzzle8;
import java.awt.event.*;
import java.util.*;

import javax.swing.JOptionPane;

public class evento_random implements ActionListener{
	frame_puzzle frame;
	Random ran=new Random();
	private int[] arrini=new int[9];
	private int[] arrfin=new int[9];
	private int c=0,n;
	public evento_random(frame_puzzle frame){
		this.frame=frame;
	}
	public void actionPerformed(ActionEvent e){
		if(frame.bi.in.isSelected() || frame.bi.fi.isSelected()){
		random();
	    
		frame.puzi.t0.setText(""+arrini[0]);
		frame.puzi.t1.setText(""+arrini[1]);
		frame.puzi.t2.setText(""+arrini[2]);
		frame.puzi.t3.setText(""+arrini[3]);
		frame.puzi.t4.setText(""+arrini[4]);
		frame.puzi.t5.setText(""+arrini[5]);
		frame.puzi.t6.setText(""+arrini[6]);
		frame.puzi.t7.setText(""+arrini[7]);
		frame.puzi.t8.setText(""+arrini[8]);
						
		frame.puzf.tf0.setText(""+arrfin[0]);
		frame.puzf.tf1.setText(""+arrfin[1]);
		frame.puzf.tf2.setText(""+arrfin[2]);
		frame.puzf.tf3.setText(""+arrfin[3]);
		frame.puzf.tf4.setText(""+arrfin[4]);
		frame.puzf.tf5.setText(""+arrfin[5]);
		frame.puzf.tf6.setText(""+arrfin[6]);
		frame.puzf.tf7.setText(""+arrfin[7]);
		frame.puzf.tf8.setText(""+arrfin[8]);
				
		}else{
		JOptionPane.showMessageDialog(null, "Seleccione alguna de las dos opciones","Información",1);	
		}
		
	}
	public void pinicial(int[] arrini){
		this.arrini=arrini;
	}
	public void pfinal(int[] arrfin){
		this.arrfin=arrfin;
	}
	
	public void random(){
		c=0;
		
		if(frame.bi.in.isSelected() && frame.bi.fi.isSelected()){
			
		for(int i=0;i<frame.puz.cajas.length;i++){
			arrini[i]=i;
			arrfin[i]=i;
		}
		
		n=frame.puz.num_cajas;		
        while (n > 1) {
            int r=ran.nextInt(n--);
            int tmp = arrini[r];
            arrini[r] = arrini[n];
            arrini[	n] = tmp;
        }
        
        n=frame.puz.num_cajas;               
        while (n > 1) {
            int r2 = ran.nextInt(n--);
            int tmp2 = arrfin[r2];
            arrfin[r2] = arrfin[n];
            arrfin[n] = tmp2;
        }
		}
		
		if(frame.bi.in.isSelected() && !frame.bi.fi.isSelected()){
			for(int i=0;i<frame.puz.cajas.length;i++){
				arrini[i]=i;			
			}
			n=frame.puz.num_cajas;		
	        while (n > 1) {
	            int r=ran.nextInt(n--);
	            int tmp = arrini[r];
	            arrini[r] = arrini[n];
	            arrini[	n] = tmp;
	        }
		}
		if(!frame.bi.in.isSelected() && frame.bi.fi.isSelected()){
			for(int i=0;i<frame.puz.cajas.length;i++){
				arrfin[i]=i;
			}
			n=frame.puz.num_cajas;               
	        while (n > 1) {
	            int r2 = ran.nextInt(n--);
	            int tmp2 = arrfin[r2];
	            arrfin[r2] = arrfin[n];
	            arrfin[n] = tmp2;
	        }
		}
        
        for(int i=0;i<frame.puz.cajas.length;i++){
        if(arrini[i]==arrfin[i]){        	
        	c++;
        	}
        }
        
        if(c==frame.puz.num_cajas){
        	random();
        }
        if(c>=5){
        	frame.bi.tniv.setText("Fácil");
        }
        if(c==4){
        	frame.bi.tniv.setText("Medio");
        }
        if(c<=3){
        	frame.bi.tniv.setText("Difícil");
        }
		
	}
}
