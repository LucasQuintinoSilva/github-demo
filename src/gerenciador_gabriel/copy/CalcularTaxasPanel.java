package gerenciador_gabriel.copy;

import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;
import java.awt.event.*;

public class CalcularTaxasPanel extends JPanel implements ActionListener{
	
	private JLabel selecionePlataformaLabel;
	
	private JButton mercadoLivreButton;
	private JButton amazonButton;
	private JButton submarinoButton;
	private JButton americanasButton;
	private JButton todosEcommerceButton;
	
	public CalcularTaxasPanel() {
		
		Dimension dim = getPreferredSize();
		dim.width = 885;
		setPreferredSize(dim);
		
		Border innerBorder = BorderFactory.createTitledBorder("calculadora de taxas");
		Border outerBorder = BorderFactory.createEmptyBorder(5, 5, 5, 5);
		setBorder(BorderFactory.createCompoundBorder(outerBorder, innerBorder));
		
		setLayout(null);
		
//		Definindo Labels
		selecionePlataformaLabel = new JLabel("- selecione a plataforma:");
		selecionePlataformaLabel.setBounds(  200, 200, 150, 35);
		add(selecionePlataformaLabel);//	  x    y    w    h           (w = largura) (h = altura)
		
//		Definindo Buttons
		
	}

	public void actionPerformed(ActionEvent e) {
		
	}
}
