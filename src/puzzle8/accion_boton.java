package puzzle8;
import javax.swing.*;

import java.awt.Dimension;
import java.awt.event.*;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class accion_boton implements ActionListener{
	public int[] arrini=new int[9];
	public int[] arrfin=new int[9];
	boolean b;
	frame_puzzle panel;
	private int c;
	public accion_boton(frame_puzzle panel){
		this.panel=panel;
	}
	
	public void actionPerformed(ActionEvent e){
		if(!panel.puzi.t0.getText().isEmpty() && !panel.puzi.t1.getText().isEmpty() && !panel.puzi.t2.getText().isEmpty() && !panel.puzi.t3.getText().isEmpty() && 
				!panel.puzi.t4.getText().isEmpty() && !panel.puzi.t5.getText().isEmpty() && !panel.puzi.t6.getText().isEmpty() && !panel.puzi.t7.getText().isEmpty() && 
				!panel.puzi.t8.getText().isEmpty() && !panel.puzf.tf0.getText().isEmpty() && !panel.puzf.tf1.getText().isEmpty() && !panel.puzf.tf2.getText().isEmpty() && !panel.puzf.tf3.getText().isEmpty() && 
				!panel.puzf.tf4.getText().isEmpty() && !panel.puzf.tf5.getText().isEmpty() && !panel.puzf.tf6.getText().isEmpty() && !panel.puzf.tf7.getText().isEmpty() && 
				!panel.puzf.tf8.getText().isEmpty()){
			
			
			b=true;
			
			recoge();
			
			for(int i=0;i<arrini.length-1;i++){
				for(int j=i+1;j<arrini.length;j++){
					if(arrini[i]==arrini[j]){
						JOptionPane.showMessageDialog(null, "Existe un valor repetido en puzzle incial: \nPosiciones: "+ (i+1) +" y "+ (j+1),"ERROR",0 );
						b=false;
						continue;						
					}
				}
			}
			
			for(int i=0;i<arrini.length;i++){
				if(arrini[i]>panel.puz.num_cajas){
					JOptionPane.showMessageDialog(null, "No se admiten números mayores a "+panel.puz.num_cajas+"\nPuzzle inicial. Posición: "+(i+1),"ERROR",0);
					b=false;
					continue;
				}
			}
			
			
			for(int i=0;i<arrfin.length-1;i++){
				for(int j=i+1;j<arrfin.length;j++){
					if(arrfin[i]==arrfin[j]){
						JOptionPane.showMessageDialog(null, "Existe un valor repetido en puzzle final: \nPosiciones: "+ (i+1) +" y "+ (j+1),"ERROR",0 );
						b=false;
						continue;						
					}
				}
			}
			
			for(int i=0;i<arrfin.length;i++){
				if(arrfin[i]>panel.puz.num_cajas){
					JOptionPane.showMessageDialog(null, "No se admiten números mayores a "+panel.puz.num_cajas+"\nPuzzle final. Posición: "+(i+1),"ERROR",0);
					b=false;
					continue;
				}
			}
			for(int i=0;i<panel.puz.cajas.length;i++){
		        if(arrini[i]==arrfin[i]){
		        	c++;
		        	}
		        }
			if(c>=5){
	        	panel.bi.tniv.setText("Fácil");
	        }
	        if(c==4){
	        	panel.bi.tniv.setText("Medio");
	        }
	        if(c<=3){
	        	panel.bi.tniv.setText("Difícil");
	        }
		        if(c==16){
		        	JOptionPane.showMessageDialog(null, "Los puzzles no pueden ser idénticos","ERROR",0);
		        	b=false;
		        }
		        c=0;
			
			if(b){				
		        correcto();       
			}
			
		}else{			
			JOptionPane.showMessageDialog(null, "Rellene todos los campos","Aviso",1);			
		}
	
	}
	
	public void correcto(){
		panel.puz.barajar(arrini);
        panel.puz.ganar(arrfin);
        panel.ran.pinicial(arrini);
        panel.ran.pfinal(arrfin);
        panel.fa.pa.matrices(arrini, arrfin);      
        panel.mov.tmov.setText("0");		        
        panel.ac.ayuda();
        panel.ti.reiniciar();
	}
	
	public void recoge(){
		arrini[0]=Integer.parseInt(panel.puzi.t0.getText());
		arrini[1]=Integer.parseInt(panel.puzi.t1.getText());
		arrini[2]=Integer.parseInt(panel.puzi.t2.getText());
		arrini[3]=Integer.parseInt(panel.puzi.t3.getText());
		arrini[4]=Integer.parseInt(panel.puzi.t4.getText());
		arrini[5]=Integer.parseInt(panel.puzi.t5.getText());
		arrini[6]=Integer.parseInt(panel.puzi.t6.getText());
		arrini[7]=Integer.parseInt(panel.puzi.t7.getText());
		arrini[8]=Integer.parseInt(panel.puzi.t8.getText());				
		
		arrfin[0]=Integer.parseInt(panel.puzf.tf0.getText());
		arrfin[1]=Integer.parseInt(panel.puzf.tf1.getText());
		arrfin[2]=Integer.parseInt(panel.puzf.tf2.getText());
		arrfin[3]=Integer.parseInt(panel.puzf.tf3.getText());
		arrfin[4]=Integer.parseInt(panel.puzf.tf4.getText());
		arrfin[5]=Integer.parseInt(panel.puzf.tf5.getText());
		arrfin[6]=Integer.parseInt(panel.puzf.tf6.getText());
		arrfin[7]=Integer.parseInt(panel.puzf.tf7.getText());
		arrfin[8]=Integer.parseInt(panel.puzf.tf8.getText());
		
		
	}
}
