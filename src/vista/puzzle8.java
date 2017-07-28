package vista;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;
 
public class puzzle8 extends JPanel implements Runnable{
	public final static byte num_cajas = 8;
	public final static byte lado = 3;
    public int con=0,fo=0;
 
    public int[] cajas = new int[num_cajas+ 1];
    public int[] gana = new int[num_cajas+ 1];
    public int[] inicial = new int[num_cajas+ 1];
    public int tam_caja, pos_vacia, tam_cua,pos_gan;
    
    public Thread hilo;
    public int cont=0,cant;
	public int[][] matriz_ini;
	public int[][] matriz_sol;
	public nodo inicia,sol,copia;
	public int[][] matriz=new int[3][3];
    LinkedList<int[][]> matr=new LinkedList<int[][]>();
    LinkedList<int[][]> matr_copia=new LinkedList<int[][]>();
    public int[] num;
    public boolean b,c;
    
 
    public puzzle8() {
    	   	
        tam_caja=390/lado;
        tam_cua=tam_caja*lado;
 
        setPreferredSize(new Dimension(390, 390));
        setBackground(new Color(0x909c95));
        setForeground(new Color(0x356248)); 
        setFont(new Font("SansSerif", Font.BOLD, 60));
        
        
        matriz_ini=new int[3][3];
        matriz_sol=new int[3][3];
        
        
        ganar();
        
        inicial[0]=1;
        inicial[1]=2;
        inicial[2]=3;
        inicial[3]=4;
        inicial[4]=5;
        inicial[5]=0;
        inicial[6]=7;
        inicial[7]=8;
        inicial[8]=6;
        
        
        barajar(inicial);
        
        hilo=new Thread(this);
        hilo.start();
        
    }
     
    final void barajar(int[] arrini) {        
    	
		for(int i=0;i<cajas.length;i++){
			cajas[i]=arrini[i];
			if(arrini[i]==0){
				pos_vacia=i;
			}
		}
		repaint();
		con=0;		        
    }

    public void ganar(){
    	for(int i=0;i<gana.length;i++){
    		gana[i]=i+1;
    	}
    	gana[8]=pos_vacia;
    	
		matriz_sol[0][0]=gana[0];
		matriz_sol[0][1]=gana[1];
		matriz_sol[0][2]=gana[2];
		matriz_sol[1][0]=gana[3];
		matriz_sol[1][1]=gana[4];
		matriz_sol[1][2]=gana[5];
		matriz_sol[2][0]=gana[6];
		matriz_sol[2][1]=gana[7];
		matriz_sol[2][2]=gana[8];
    }
 
	
		public void run(){
			Thread ct=Thread.currentThread();
			while(ct==hilo){
				cambia();			
				try{				
					Thread.sleep(1000);				
				}catch(InterruptedException e){
					e.printStackTrace();
				}
			}		
		}

    
    
    void drawGrid(Graphics2D g) {
        for (int i = 0; i < cajas.length; i++) {
            if (cajas[i] == 0)
                continue;
 
            int r=i/ lado;
            int c=i%lado;
            int x=c*tam_caja;
            int y=r*tam_caja;
 
            g.setColor(getForeground());
            g.fillRoundRect(x, y, tam_caja, tam_caja, 25, 25);
            g.setColor(Color.black);
            g.drawRoundRect(x, y, tam_caja, tam_caja, 25, 25);
            g.setColor(Color.white);
 
           drawCenteredString(g, String.valueOf(cajas[i]), x, y);
        }
    }
 
    void drawCenteredString(Graphics2D g, String s, int x, int y) {
        FontMetrics fm = g.getFontMetrics();
        int asc = fm.getAscent();
        int dec = fm.getDescent();
 
        x = x + (tam_caja - fm.stringWidth(s)) / 2;
        y = y + (asc + (tam_caja - (asc + dec)) / 2);
 
        g.drawString(s, x, y);
    }
 
    public void paintComponent(Graphics gg) {
        super.paintComponent(gg);
        Graphics2D g = (Graphics2D) gg;
        g.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                RenderingHints.VALUE_ANTIALIAS_ON);
 
        drawGrid(g);
    }
    
     
    
	public void cambia(){
		
		if(b){
		matriz=matr.pollLast();
		cajas[0]=matriz[0][0];
		cajas[1]=matriz[0][1];
		cajas[2]=matriz[0][2];
		cajas[3]=matriz[1][0];
		cajas[4]=matriz[1][1];
		cajas[5]=matriz[1][2];
		cajas[6]=matriz[2][0];
		cajas[7]=matriz[2][1];
		cajas[8]=matriz[2][2];
		
		cont++;
		
		repaint();
		
		System.out.println("hilo");
		
		if(matr.isEmpty()){
			b=false;
			cont=0;
			System.out.println("terminado");
			barajar(cajas);
		}
		}
	}
    

    
    
    public void matrices(){
		matriz_ini[0][0]=cajas[0];
		matriz_ini[0][1]=cajas[1];
		matriz_ini[0][2]=cajas[2];
		matriz_ini[1][0]=cajas[3];
		matriz_ini[1][1]=cajas[4];
		matriz_ini[1][2]=cajas[5];
		matriz_ini[2][0]=cajas[6];
		matriz_ini[2][1]=cajas[7];
		matriz_ini[2][2]=cajas[8];
		
		
	}
	
	public void comprueba(){
		inicia=new nodo(matriz_ini);		
		sol=buscar_solucion(inicia, matriz_sol);
		copia=sol;
		ejecuta();
					
	}
	public void ejecuta(){
		sol=copia;
		while(sol.padre!=null){
			matr.add(sol.get_estado());
			matr_copia.add(sol.get_estado());
			sol=sol.padre;
			cant++;
		}
		matr.add(matriz_ini);
		matr_copia.add(matriz_ini);
		num_cambia(matr_copia);
		b=true;
	}
	
	public void num_cambia(LinkedList<int[][]> matr_copia){
		int[][] matr1=new int[3][3];
		int[][] matr2=new int[3][3];
		num=new int[matr_copia.size()-1];
		matr1=matr_copia.pollLast();
					
		for(int k=0;k<num.length;k++){
		matr2=matr_copia.pollLast();	
		for(int i=0;i<3;i++){
			for(int j=0;j<3;j++){
				if(matr1[i][j]!=matr2[i][j]){
					if(matr1[i][j]!=0){
						num[k]=matr1[i][j];
						continue;
					}else if(matr2[i][j]!=0){
						num[k]=matr2[i][j];
						continue;
					}
				}
			}			
		}
		matr1=matr2;
		}
		
		
	}
	
		
	public nodo buscar_solucion(nodo inicio,int[][] solucion){
		ArrayList<nodo> expandidos=new ArrayList<nodo>();
		ArrayList<nodo> visitados=new ArrayList<nodo>();
		expandidos.add(inicio);
		b=false;
		c=false;
		cont=0;
		while(expandidos.size()!=0){
			nodo revisar=expandidos.remove(0);
			imprimir_estado(revisar.get_estado());
			int[] pcero=ubicar_pcero(revisar.get_estado());
			
			//area.append(" Iteración número: "+ (cont++) +"\n");
			
			if(Arrays.deepEquals(revisar.get_estado(),solucion)){
				System.out.println(" ******Solución encotrada*******");
				c=true;
				return revisar;
			}
			
			ArrayList<nodo> hijos=new ArrayList<nodo>();
			visitados.add(revisar);
			
			//cambia verticalmente
			if(pcero[0]!=0){
				nodo hijo=new nodo(clonar(revisar.get_estado()));
				int arriba=hijo.get_estado()[pcero[0]-1][pcero[1]];
				hijo.get_estado()[pcero[0]][pcero[1]]=arriba;
				hijo.get_estado()[pcero[0]-1][pcero[1]]=0;
				
				if(!esta_visitados(visitados,hijo)){				
				expandidos.add(hijo);
				hijos.add(hijo);
				}
			}
			if(pcero[0]!=2){
				nodo hijo=new nodo(clonar(revisar.get_estado()));
				int abajo=hijo.get_estado()[pcero[0]+1][pcero[1]];
				hijo.get_estado()[pcero[0]][pcero[1]]=abajo;
				hijo.get_estado()[pcero[0]+1][pcero[1]]=0;
				
				if(!esta_visitados(visitados,hijo)){				
					expandidos.add(hijo);
					hijos.add(hijo);
				}	
			}
			//cambia horizontalmente
			if(pcero[1]!=0){
				nodo hijo=new nodo(clonar(revisar.get_estado()));
				int izquierda=hijo.get_estado()[pcero[0]][pcero[1]-1];
				hijo.get_estado()[pcero[0]][pcero[1]]=izquierda;
				hijo.get_estado()[pcero[0]][pcero[1]-1]=0;
				
				if(!esta_visitados(visitados,hijo)){				
					expandidos.add(hijo);
					hijos.add(hijo);
				}	
			}
			if(pcero[1]!=2){
				nodo hijo=new nodo(clonar(revisar.get_estado()));
				int derecha=hijo.get_estado()[pcero[0]][pcero[1]+1];
				hijo.get_estado()[pcero[0]][pcero[1]]=derecha;
				hijo.get_estado()[pcero[0]][pcero[1]+1]=0;
				
				if(!esta_visitados(visitados,hijo)){				
					expandidos.add(hijo);
					hijos.add(hijo);
				}	
			}
			
			revisar.set_hijos(hijos);
		}
		return null;
	}
	
	private static boolean esta_visitados(ArrayList<nodo> visitados,nodo hijo){
		for(nodo v: visitados){
			if(Arrays.deepEquals(v.get_estado(), hijo.get_estado())){
				return true;
			}
		}
		return false;
	
	}
	
	private static int[][] clonar(int[][] estado){
		int[][] clon=new int[estado.length][estado.length];
		
		for(int i=0;i<estado.length;i++){
			for(int j=0;j<estado.length;j++){
				clon[i][j]=estado[i][j];
			}			
		}
		return clon;
	}
	
	private static int[] ubicar_pcero(int[][] estado){
		int[] posicion=new int[2];
		for(int i=0;i<estado.length;i++){
			for(int j=0;j<estado.length;j++){
				if(estado[i][j]==0){
					posicion[0]=i;
					posicion[1]=j;
				}
			}
		
		}
		return posicion;
	}		
	public void imprimir_estado(int[][] estado){
		for(int i=0;i<estado.length;i++){
			for(int j=0;j<estado.length;j++){
				//area.append(" ["+estado[i][j]+"]");					
			}
	//		area.append("\n");				
		}
	}
    
    
    
    
 
}