package gerenciador_gabriel;

import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;
import java.awt.event.*;

public class MercadoLivrePanel extends JPanel implements ActionListener {
	
	private JFrame mercadolivreFrame;
	
	public MercadoLivrePanel(JFrame mercadolivreFrame) {
		
		this.mercadolivreFrame = mercadolivreFrame;
		
		Dimension dim = getPreferredSize();
		dim.width = 885;
		setPreferredSize(dim);

		Border innerBorder = BorderFactory.createTitledBorder("calculadora de taxas");
		Border outerBorder = BorderFactory.createEmptyBorder(5, 5, 5, 5);
		setBorder(BorderFactory.createCompoundBorder(outerBorder, innerBorder));

		setLayout(null);
		
	}

	public void actionPerformed(ActionEvent e) {
		
	}

}
