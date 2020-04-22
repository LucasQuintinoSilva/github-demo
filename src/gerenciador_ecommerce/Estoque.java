package gerenciador_ecommerce;

import javax.swing.JFrame;
//import java.awt.FlowLayout;
//import javax.swing.JButton;
//import javax.swing.JTextField;
import javax.swing.JLabel;

public class Estoque extends JFrame {
	JLabel titulo = new JLabel("Gerenciador de estoque");

	public Estoque() {
		setLayout(null);

		titulo.setBounds(30, 1, 500, 90);
		add(titulo);

		setTitle("Estoque");
		setSize(600, 400);
		// setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setVisible(true);
		setResizable(false);

	}

	public static void main(String[] args) {
		new Estoque();
	}

}