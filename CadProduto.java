import javax.swing.JFrame;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.event.ActionEvent; 
import java.awt.event.ActionListener;
import javax.swing.*;

public class CadProduto extends JFrame implements ActionListener
{
   JLabel titulo = new JLabel("Cadastramento de produto");
   
   JLabel Nproduto = new JLabel("Nome do produto: ");
   JTextField NomeProd = new JTextField();

   JLabel descricao = new JLabel("Breve descrição: ");
   JTextField txtdescricao = new JTextField();
   
   JLabel Sku = new JLabel("Sku: ");
   JTextField txtsku = new JTextField();
   
   JLabel categoria = new JLabel("Categoria: ");
   JTextField txtcategoria = new JTextField();
   
   JLabel quantidade = new JLabel("Quantidade: ");
   JTextField txtquantidade = new JTextField();

   JLabel fornecedor = new JLabel("Fornecedor: ");
   JTextField txtfornecedor = new JTextField();
   
   JLabel custototal = new JLabel("Custo total: ");
   JTextField txtcustototal = new JTextField();
   
   JButton confirma = new JButton("Confirmar"); // Botao pedidos 
   
   ImageIcon imagem = new ImageIcon(getClass().getResource("proximo.png"));
   JButton teste = new JButton(imagem);


      public CadProduto()
      {
         setLayout(null);
         
        teste.setBounds(480, 20, 32, 32);
        add(teste);
        teste.addActionListener(this);
        teste.setOpaque(false);
        teste.setContentAreaFilled(false);
        teste.setBorderPainted(false);

         titulo.setBounds(30, -20, 500, 90);
         add(titulo);
         
         Nproduto.setBounds(30, 35, 500, 90);
         add(Nproduto);
         NomeProd.setBounds(143, 72, 110, 20);
         add (NomeProd);
         
         descricao.setBounds(30, 70, 500, 90);
         add(descricao);
         txtdescricao.setBounds(143, 106, 110, 20);
         add (txtdescricao);

         Sku.setBounds(30, 105, 500, 90);
         add(Sku);
         txtsku.setBounds(143, 140, 110, 20);
         add(txtsku);

         categoria.setBounds(30, 140, 500, 90);
         add(categoria);
         txtcategoria.setBounds(143, 174, 110, 20);
         add(txtcategoria);

         quantidade.setBounds(30, 175, 500, 90);
         add(quantidade);
         txtquantidade.setBounds(143, 208, 110, 20);
         add(txtquantidade);

        fornecedor.setBounds(30, 210, 500, 90);
        add(fornecedor);
        txtfornecedor.setBounds(143, 242, 110, 20);
        add(txtfornecedor);
        
        custototal.setBounds(380, 35, 500, 90);
        add(custototal);
        txtcustototal.setBounds(357, 106, 110, 40);
        add (txtcustototal);
        
        confirma.setBounds(357, 221, 110, 40);
        add (confirma);
         
         setTitle("Cadastramento de produto");
         setSize(600, 400);
         //setDefaultCloseOperation(EXIT_ON_CLOSE);
         setLocationRelativeTo(null);
         setVisible(true);
         setResizable(false);
         
      }
   
   public static void main (String [] args)
   {
   new CadProduto();
   }
   
   public void actionPerformed(ActionEvent e)
   {
      if(e.getSource() == teste)
      {
         TelaPrincipal frame = new TelaPrincipal();  
         frame.setVisible(true);  
      }
   }
}