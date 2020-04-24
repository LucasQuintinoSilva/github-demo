package gerenciador_gabriel;

import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;
import java.awt.event.*;

public class CalcularTaxasPanel extends JPanel implements ActionListener {

	private JLabel selecionePlataformaLabel;

	private JButton mercadoLivreButton;
	private JButton amazonButton;
	private JButton submarinoButton;
	private JButton americanasButton;
	private JButton todosEcommerceButton;
	
	private JFrame calculartaxasFrame;

	public CalcularTaxasPanel(JFrame calculartaxasFrame) {
		
		this.calculartaxasFrame = calculartaxasFrame;

		Dimension dim = getPreferredSize();
		dim.width = 885;
		setPreferredSize(dim);

		Border innerBorder = BorderFactory.createTitledBorder("calculadora de taxas");
		Border outerBorder = BorderFactory.createEmptyBorder(5, 5, 5, 5);
		setBorder(BorderFactory.createCompoundBorder(outerBorder, innerBorder));

		setLayout(null);

//		Definindo Labels
		selecionePlataformaLabel = new JLabel("- selecione a plataforma:");
		selecionePlataformaLabel.setBounds(200, 200, 150, 35);
		add(selecionePlataformaLabel);// x y w h (w = largura) (h = altura)

//		Definindo Buttons

		mercadoLivreButton = new JButton(new ImageIcon("mercadolivre_button_image.png"));
		mercadoLivreButton.setBounds(200, 250, 110, 40);
		mercadoLivreButton.addActionListener(this);
		add(mercadoLivreButton);

		amazonButton = new JButton(new ImageIcon("amazon_button_image.png"));
		amazonButton.setBounds(320, 250, 110, 40);
		amazonButton.addActionListener(this);
		add(amazonButton);

		submarinoButton = new JButton(new ImageIcon("submarino_button_image.png"));
		submarinoButton.setBounds(440, 250, 110, 40);
		submarinoButton.addActionListener(this);
		add(submarinoButton);

		americanasButton = new JButton(new ImageIcon("americanas_button_image.png"));
		americanasButton.setBounds(560, 250, 110, 40);
		americanasButton.addActionListener(this);
		add(americanasButton);

		todosEcommerceButton = new JButton(new ImageIcon("todos_button_image.png"));
		todosEcommerceButton.setBounds(380, 300, 110, 40);
		todosEcommerceButton.addActionListener(this);
		add(todosEcommerceButton);

	}

	public void actionPerformed(ActionEvent e) {
		JButton clicked = (JButton) e.getSource();

		if (clicked == mercadoLivreButton) {
			calculartaxasFrame.dispose();
			new MercadoLivreFrame();
			// abre frame de calcular taxas

		} else if (clicked == amazonButton) {
			System.out.println("teste");
			// abre frame de consultar taxas

		} else if (clicked == submarinoButton) {
			System.out.println("teste");
			// abre frame de cadastrar produto

		} else if (clicked == americanasButton) {
			System.out.println("teste");
			// abre frame de consultar estoque

		} else if (clicked == todosEcommerceButton) {
			System.out.println("teste");
			// abre frame de pedidos

		}
	}
}
