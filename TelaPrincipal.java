import javax.swing.JFrame;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.event.ActionEvent; 
import java.awt.event.ActionListener;
import javax.swing.*;

public class TelaPrincipal extends JFrame  implements ActionListener 
{
   JLabel taxas = new JLabel("TAXAS"); //Titulo "Taxa" aparece acima dos botoes
   JButton calctaxas = new JButton("Calcular"); // Botao calcular 
   JButton constaxas = new JButton("Consultar"); // Botao Consultar 
      
   JLabel estoque = new JLabel("ESTOQUE"); //Titulo "Taxa" aparece acima dos botoes
   JButton cadastro = new JButton("Cadastar"); // Botao cadastrar 
   JButton Consestoque = new JButton("Consultar");// Botao Consultar 

   JLabel vendas = new JLabel("VENDAS"); //Titulo "Taxa" aparece acima dos botoes
   JButton pedidos = new JButton("Pedidos"); // Botao pedidos  
   JButton financeiro = new JButton("Financeiro"); // Botao financeiro 
   
   
   JLabel titulo = new JLabel("Gerenciador E-commerce"); //Titulo pricipal
   
   
   ImageIcon imagem = new ImageIcon(getClass().getResource("grafico.png"));
   JLabel grafico = new JLabel(imagem);



      public TelaPrincipal()
      {
      
         setLayout(null); // deixei 'null' para definir cada um na m�o, mas poderia definir um local padr�o aqui
         
        grafico.setBounds(272, 85, 64, 64);
        add(grafico);
         
         taxas.setBounds(138, 170, 110, 35); // Localiza��o do titulo "taxas" pensanso em grafico: 138 seria na linha x, 170 na linha y. 110 largura do titulo e 35 a altura
         add(taxas); //adicionando o titulo taxas
         calctaxas.setBounds(105, 210, 100, 30); //mesmo esquema do titulo 
         add(calctaxas);
         constaxas.setBounds(105, 250, 100, 30);
         add(constaxas);
         
         estoque.setBounds(280, 170, 110, 35);
         add(estoque);     
         cadastro.setBounds(255, 210, 100, 30);
         add(cadastro);
         cadastro.addActionListener(this);
         Consestoque.setBounds(255, 250, 100, 30);
         add(Consestoque);
         Consestoque.addActionListener(this);
               
         vendas.setBounds(430, 170, 110, 35);
         add(vendas);
         pedidos.setBounds(405, 210, 100, 30);
         add(pedidos);
         financeiro.setBounds(405, 250, 100, 30);
         add(financeiro);
         
         titulo.setBounds(230, 1, 500, 90);
         add(titulo);
               
         setTitle("Gerenciado E-commerce");
         setSize(600, 400);
         setDefaultCloseOperation(EXIT_ON_CLOSE);
         setLocationRelativeTo(null);
         setVisible(true);
         setResizable(false);
      
      }
      
   public void actionPerformed(ActionEvent e)
   {
      if(e.getSource() == cadastro)
      {
         CadProduto frame2 = new CadProduto();  
         frame2.setVisible(true);  
         dispose();
      }
     
      if(e.getSource() == Consestoque)
      {
         Estoque frame2 = new Estoque();  
         frame2.setVisible(true);  
      }
      
   }
   
    /*private void entrarButMouseClicked(java.awt.event.MouseEvent evt) 
    { 
    TelaPrincipal form21 = new TelaPrincipal(); 
    form21.setVisible(true); 
    dispose(); 
    }*/

   
      
   public static void main (String [] args)
   {
   new TelaPrincipal();
   }

}