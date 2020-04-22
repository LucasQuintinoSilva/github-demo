package gerenciador_gabriel.copy;

import java.awt.*;
import javax.swing.*;

public class CalcularTaxasFrame extends JFrame{
	
	JFrame calculartaxasFrame = new JFrame("Gerenciador e-commerce > Calculadora de Taxas");
	
	private Toolbar toolbar;
	private CalcularTaxasPanel calcularTaxasPanel;
	
	public CalcularTaxasFrame() {
		gui();
	}

	public void gui() {
		
		Image icon = Toolkit.getDefaultToolkit().getImage("C:\\Users\\iMont\\Documents\\workspaces\\eclipse\\gerenciador_ecommerce\\wayne3.jpg");
		calculartaxasFrame.setIconImage(icon);
		
		calculartaxasFrame.setLayout(new BorderLayout());
		
		toolbar = new Toolbar();
		calcularTaxasPanel = new CalcularTaxasPanel();
		
		calculartaxasFrame.add(toolbar, BorderLayout.NORTH);
		calculartaxasFrame.add(calcularTaxasPanel, BorderLayout.CENTER);
		
		calculartaxasFrame.setSize(900, 550);
		calculartaxasFrame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		calculartaxasFrame.setResizable(false);
		calculartaxasFrame.setLocationRelativeTo(null);
		calculartaxasFrame.setVisible(true);

	}
}
