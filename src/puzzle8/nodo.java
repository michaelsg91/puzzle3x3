package puzzle8;

import java.util.ArrayList;

public class nodo {
	int[][] estado;
	ArrayList<nodo> hijos=new ArrayList<nodo>();
	nodo padre;
	
	public nodo(int[][] estado){
		this.estado=estado;
		hijos=null;
		padre=null;
	}

	public int[][] get_estado(){
		return estado;
	}
	public void set_estado(int [][] estado){
		this.estado=estado;
	}
	
	public ArrayList<nodo> get_hijos(){
		return hijos;
	}
	public void set_hijos(ArrayList<nodo> hijos){
		this.hijos=hijos;
		if(hijos!=null){
			for(nodo h: hijos){
				h.padre=this;
			}
		}
	}
	
	public nodo get_padre(){
		return padre;
	}
	public void set_padre(nodo padre){
		this.padre=padre;
	}
	
	
}
