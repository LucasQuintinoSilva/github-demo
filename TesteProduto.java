import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.sql.*;
import javax.swing.*;

public class TesteProduto {

   public static void main(String[] args) {
      Connection conn = null;
      Produto pd;
     
   
      try {
      	// obtem conexao com o banco
         ConexaoPI bd = new ConexaoPI();
         conn = bd.conectar();
         
      
      	// *** IMPORTANTE ***: Força o uso de transação.
         conn.setAutoCommit(false);
      	// *** Inclusao do Primeiro Cliente ***
         pd = new Produto(32, 3, "Tenis", "Nike", 23);
         pd.incluir(conn);
               
      	// *** Carregar o cliente 1003 a partir do bd ***
         pd = new Produto(32);
         System.out.println("\nLista o 32 antes de carregar os dados");
         System.out.println(pd);
         pd.carregar(conn);
         System.out.println("\nLista o 32 depois de carregar os dados");
         System.out.println(pd);
         
      	} 
      
      catch (Exception e) {
         e.printStackTrace();
         if (conn != null) {
            try {
               conn.rollback();
            } 
            catch (SQLException e1) {
               System.out.print(e1.getStackTrace());
            }
         }
      } 
      finally {
         if (conn != null) {
            try {
               conn.close();
            } 
            catch (SQLException e1) {
               System.out.print(e1.getStackTrace());
            }
         }
      }
   }
}