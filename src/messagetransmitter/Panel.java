package messagetransmitter;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;


@SuppressWarnings("serial")
public class Panel extends JPanel{

	private JButton rst;
	private VentanaTablero win;
	public Panel(VentanaTablero win){
		super();
		this.win=win;
		this.setLayout(new GridBagLayout());
		this.setPreferredSize(new Dimension(750, 750));
		rst = new JButton("Reiniciar");
		rst.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		
		

	}
	public void paintComponent(Graphics g){
		
	}

}
