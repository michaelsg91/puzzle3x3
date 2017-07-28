package vista;
import java.awt.*;
import javax.swing.*;

public class panel_auto_pasos extends JPanel{
	public JTextArea area;
	public  JScrollPane barras;
	public panel_auto_pasos(){
		setPreferredSize(new Dimension(240, 190));
		setLayout(null);
		setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), "Pasos"));
		
		area=new JTextArea(220,165);
		barras=new JScrollPane(area);
		area.setLineWrap(true);
		area.setEditable(false);
		
		area.setFont(new Font("SansSerif", Font.PLAIN, 25));
		barras.setBounds(10, 20, 220, 165);
		
		add(barras);
	}
}
