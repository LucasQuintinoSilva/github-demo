import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.sql.*;
import javax.swing.*;

public class Produto
{

private int sku;
private String nome_produto;
private int quantidade;
private String fornecedor;
private float custo_unitario; 

   public Produto (int sku)
   {
   this.sku = sku;
   }
  
   public Produto (int sku, int quantidade, String nome_produto, String fornecedor, float custo_unitario)
   {
   this.sku = sku;
   this.quantidade = quantidade;
   this.nome_produto = nome_produto;
   this.fornecedor = fornecedor;
   this.custo_unitario = custo_unitario;
   }
   
   public int getSku() 
   {
      return sku;
   }
   public int getQuantidade() 
   {
      return quantidade;
   }
   public String getNome_produto() 
   {
      return nome_produto;
   }
   public String getFornecedor() 
   {
      return fornecedor;
   }
   public float getCusto_unitario() 
   {
      return custo_unitario;
   }
   public void setSku(int sku) 
   {
      this.sku = sku;
   }
   public void setQuantidade(int quantidade) 
   {
      this.quantidade = quantidade;
   }
   public void setNome_produto(String nome_produto) 
   {
      this.nome_produto = nome_produto;
   }
   public void setFornecedor(String fornecedor) 
   {
      this.fornecedor = fornecedor;
   }
   public void setCusto_unitario(float custo_unitario) 
   {
      this.custo_unitario = custo_unitario;
   }

      public void incluir(Connection conn) {
      String sqlInsert = 
         "INSERT INTO Produto (Sku, Quantidade, Nome_produto, Fornecedor, Custo_unitario) VALUES (?, ?, ?, ?, ?)";
   
      try (PreparedStatement stm = conn.prepareStatement(sqlInsert);) 
      {
         stm.setInt(1, getSku());
         stm.setString(3, getNome_produto());
         stm.setInt(2, getQuantidade());
         stm.setString(4, getFornecedor());
         stm.setFloat(5, getCusto_unitario());
         stm.execute();
      } 
      catch (Exception e) {
         e.printStackTrace();
         try {
            conn.rollback();
         } 
         catch (SQLException e1) {
            System.out.print(e1.getStackTrace());
         }
      } 
   }
      public void excluir(Connection conn) {
      String sqlDelete = "DELETE FROM Produto WHERE SKU = ?";
      try (PreparedStatement stm = conn.prepareStatement(sqlDelete);) {
         stm.setInt(1, getSku());      
         stm.execute();
      } 
      catch (Exception e) {
         e.printStackTrace();
         try {
            conn.rollback();
         } 
         catch (SQLException e1) {
            System.out.print(e1.getStackTrace());
         }
      } 
   }
  
  public void carregar(Connection conn) {
      String sqlSelect = 
         "SELECT * FROM Produto WHERE produto.sku = ?";
   
      try (PreparedStatement stm = conn.prepareStatement(sqlSelect);){
         stm.setInt(1, getSku());   
         try (ResultSet rs = stm.executeQuery();){
         /*este outro try e' necessario pois nao da' para abrir o resultset
          *no anterior uma vez que antes era preciso configurar o parametro
          *via setInt; se nao fosse, poderia se fazer tudo no mesmo try
          */
            if (rs.next()) {    
              // this.setSku(rs.getInt(1));          
               this.setNome_produto(rs.getString(3));
               this.setQuantidade(rs.getInt(2));
               this.setFornecedor(rs.getString(4));
               this.setCusto_unitario(rs.getFloat(5));
            }
         
         } 
         catch (Exception e) {
            e.printStackTrace();
         }
      }
      catch (SQLException e1) {
         System.out.print(e1.getStackTrace());
      }
   } 
   
   public String toString() {
      return "Produto [SKU = " + sku + ", Quantidade = " + quantidade + ", Nome do produto = "
         	+ nome_produto + ", Fornecedor = " + fornecedor + ", Custo Unitario = " + custo_unitario + "]";
   }

}