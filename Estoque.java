import javax.swing.JFrame;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.GridLayout;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class Estoque extends JFrame 
{
    JPanel painelFundo;
    JTable tabela;
    JScrollPane barraRolagem;
        
    Object [][] dados = {
        {"Ana Monteiro", "48 9923-7898", "ana.monteiro@gmail.com"},
        {"João da Silva", "48 8890-3345", "joaosilva@hotmail.com"},
        {"Pedro Cascaes", "48 9870-5634", "pedrinho@gmail.com"}
    };
     
    String [] colunas = {"SKU", "Nome do produto", "QUa"}; 

   JLabel titulo = new JLabel("Gerenciador de estoque");

      public Estoque()
      {
         setLayout(null);
         
         painelFundo = new JPanel();
        painelFundo.setLayout(new GridLayout(1, 1));
        tabela = new JTable(dados, colunas);
        barraRolagem = new JScrollPane(tabela);
        painelFundo.add(barraRolagem); 
         
         barraRolagem.setBounds(30, 250, 500, 90);
         add(barraRolagem);
         tabela.setBounds(30, 150, 500, 90);
         add(tabela);
         titulo.setBounds(30, 1, 500, 90);
         add(titulo);

      
         setTitle("Estoque");
         setSize(600, 400);
         setDefaultCloseOperation(EXIT_ON_CLOSE);
         setLocationRelativeTo(null);
         setVisible(true);
         setResizable(false);
         
      }
   
   public static void main (String [] args)
   {
  
   new Estoque();
   }

}