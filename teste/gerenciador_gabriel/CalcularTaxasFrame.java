package gerenciador_gabriel;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class CalcularTaxasFrame extends JFrame{
	
	JFrame calculartaxasFrame = new JFrame("Gerenciador e-commerce > Calculadora de Taxas");
	
	private CalcularTaxasPanel calcularTaxasPanel;
	
	private JButton quitAppButton;
	private JButton homeAppButton;
	private JButton pagebackAppButton;
	
	public CalcularTaxasFrame() {
		gui();
	}

	public void gui() {
		
		Image icon = Toolkit.getDefaultToolkit().getImage("C:\\Users\\Lucas\\Documents\\Facul\\teste\\wayne3.jpg");
		calculartaxasFrame.setIconImage(icon);
		
		calculartaxasFrame.setLayout(new BorderLayout());
		
		calcularTaxasPanel = new CalcularTaxasPanel(calculartaxasFrame);
		
	///// Início Toolbar /////
			JToolBar tb = new JToolBar();
			tb = new JToolBar();
			tb.setFloatable(false);
			
			homeAppButton = new JButton("Home");
			tb.add(homeAppButton);
			homeAppButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					calculartaxasFrame.dispose();
					new MainFrame();
				}
			});
			
			pagebackAppButton = new JButton("Voltar");
			tb.add(pagebackAppButton);
			pagebackAppButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					calculartaxasFrame.dispose();
					new MainFrame();
				}
			});
			
			quitAppButton = new JButton("Fechar");
			tb.add(quitAppButton);
			quitAppButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					System.exit(0);
				}
			});
		
		calculartaxasFrame.add(calcularTaxasPanel, BorderLayout.CENTER);
		calculartaxasFrame.add(tb, BorderLayout.NORTH);
		
		calculartaxasFrame.setSize(900, 550);
		calculartaxasFrame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		calculartaxasFrame.setResizable(false);
		calculartaxasFrame.setLocationRelativeTo(null);
		calculartaxasFrame.setVisible(true);

	}
}
