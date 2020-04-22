package gerenciador_gabriel.copy;

import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.JFrame;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class FormPanel extends JPanel implements ActionListener{

	private JLabel testVersion;
	private JLabel taxasLabel;
	private JLabel estoqueLabel;
	private JLabel vendasLabel;
	
	private JButton calcularTaxasButton;
	private JButton consultarTaxasButton;
	
	private JButton cadastrarProdutoButton;
	private JButton consultarEstoqueButton;
	
	private JButton pedidosButton;
	private JButton financeiroButton;

	public FormPanel() {

		Dimension dim = getPreferredSize();
		dim.width = 885;
		setPreferredSize(dim);

		Border innerBorder = BorderFactory.createTitledBorder("MENU");
		Border outerBorder = BorderFactory.createEmptyBorder(5, 5, 5, 5);
		setBorder(BorderFactory.createCompoundBorder(outerBorder, innerBorder));
		
		setLayout(null);
		
//		Definindo Labels

		taxasLabel = new JLabel("TAXAS");
		taxasLabel.setBounds(200, 200, 110, 35);
		add(taxasLabel);//	  x    y    w    h           (w = largura) (h = altura)
		
		estoqueLabel = new JLabel("ESTOQUE");
		estoqueLabel.setBounds(400,200,110,35);
		add(estoqueLabel);
		
		vendasLabel = new JLabel("VENDAS");
		vendasLabel.setBounds(600,200,110,35);
		add(vendasLabel);
		
		testVersion = new JLabel("version - 0.0.1 alpha");
		testVersion.setBounds(15, 435, 200, 35);
		add(testVersion);
		
/*		Definindo Botões
 		" x " deve ser 30 px menor que o respectivo de sua Label
		" y " deve ter 50 px em relação ao anterior		*/
		
		calcularTaxasButton = new JButton("Calcular");
		calcularTaxasButton.setBounds(170, 250, 110, 40);
		calcularTaxasButton.addActionListener(this);
		add(calcularTaxasButton);
		
		consultarTaxasButton = new JButton("Consultar");
		consultarTaxasButton.setBounds(170, 300, 110, 40);
		consultarTaxasButton.addActionListener(this);
		add(consultarTaxasButton);
		
		cadastrarProdutoButton = new JButton("<html> Cadastrar <br> Produto </html>");
		cadastrarProdutoButton.setBounds(370, 250, 110, 40);
		cadastrarProdutoButton.addActionListener(this);
		add(cadastrarProdutoButton);
		
		consultarEstoqueButton = new JButton("Consultar");
		consultarEstoqueButton.setBounds(370, 300, 110, 40);
		consultarEstoqueButton.addActionListener(this);
		add(consultarEstoqueButton);
		
		pedidosButton = new JButton("Pedidos");
		pedidosButton.setBounds(570, 250, 110, 35);
		pedidosButton.addActionListener(this);
		add(pedidosButton);
		
		financeiroButton = new JButton("Financeiro");
		financeiroButton.setBounds(570, 300, 110, 35);
		financeiroButton.addActionListener(this);
		add(financeiroButton);
	}

	public void actionPerformed(ActionEvent e) {
		JButton clicked = (JButton) e.getSource();
		
		if (clicked == calcularTaxasButton) {
			new CalcularTaxasFrame();
			// abre frame de calcular taxas
			
		} else if (clicked == consultarTaxasButton) {
			System.out.println("teste");
			// abre frame de consultar taxas
			
		} else if (clicked == cadastrarProdutoButton) {
			System.out.println("teste");
			// abre frame de cadastrar produto
			
		} else if (clicked == consultarEstoqueButton) {
			System.out.println("teste");
			// abre frame de consultar estoque
			
		} else if (clicked == pedidosButton) {
			System.out.println("teste");
			// abre frame de pedidos
			
		} else if (clicked == financeiroButton) {
			System.out.println("teste");
			// abre frame do financeiro
			
		}
	}
}
