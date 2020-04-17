package gerenciador_gabriel;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class MercadoLivreFrame extends JFrame{

	JFrame mercadolivreFrame = new JFrame("Gerenciador e-commerce > Calculadora de Taxas > Mercado Livre");

	private MercadoLivrePanel mercadoLivrePanel;

	private JButton quitAppButton;
	private JButton homeAppButton;
	private JButton pagebackAppButton;

	public MercadoLivreFrame() {
		gui();
	}

	public void gui() {
		Image icon = Toolkit.getDefaultToolkit()
				.getImage("C:\\Users\\iMont\\Documents\\workspaces\\eclipse\\gerenciador_ecommerce\\wayne3.jpg");
		mercadolivreFrame.setIconImage(icon);

		mercadolivreFrame.setLayout(new BorderLayout());

		//mercadolivreFrame = new MercadoLivrePanel(mercadolivreFrame);

		///// Início Toolbar /////
		JToolBar tb = new JToolBar();
		tb = new JToolBar();
		tb.setFloatable(false);

		homeAppButton = new JButton("Home");
		tb.add(homeAppButton);
		homeAppButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mercadolivreFrame.dispose();
				new MainFrame();
			}
		});

		pagebackAppButton = new JButton("Voltar");
		tb.add(pagebackAppButton);
		pagebackAppButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mercadolivreFrame.dispose();
				new CalcularTaxasFrame();
			}
		});

		quitAppButton = new JButton("Fechar");
		tb.add(quitAppButton);
		quitAppButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});

		//mercadolivreFrame.add(mercadoLivrePanel, BorderLayout.CENTER);
		mercadolivreFrame.add(tb, BorderLayout.NORTH);

		mercadolivreFrame.setSize(900, 550);
		mercadolivreFrame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		mercadolivreFrame.setResizable(false);
		mercadolivreFrame.setLocationRelativeTo(null);
		mercadolivreFrame.setVisible(true);
	}
}
