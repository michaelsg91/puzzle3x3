package controlador;
import javax.swing.*;

import vista.frame_puzzle;

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
	
	}
}