package Persistencia;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class ConexaoBD {
    
   public Statement stm;//responsavel por realizar pesquisa no banco de dados
   public ResultSet rs;//responsavel pelo armazenamento da pesquisa
   private String driver="com.mysql.jdbc.Driver";  // responsavel por identificar o serviço do banco de dados
   private String caminho="jdbc:mysql://localhost/clinicaodonto"; // responsavel por mostrar o caminho no banco de dados
   private final String usuario="root";
   private String senha="1234";
   public Connection con; //responsavel por realizar conexão com o banco de dados
   
   public void conexao(){
       
       try {
           System.setProperty("jdbc.Drivers", driver);
           con=DriverManager.getConnection(caminho,usuario, senha);
           // JOptionPane.showMessageDialog(null, "Conectado com sucesso!!!");
       } catch (SQLException ex) {
          JOptionPane.showMessageDialog(null, "Erro de conexão:\n "+ex.getMessage()); 
       }
   }
   
   public void executaSql(String sql){
       try {
           stm = con.createStatement(rs.TYPE_SCROLL_INSENSITIVE,rs.CONCUR_READ_ONLY);
           rs = stm.executeQuery(sql);
       } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, "Erro de conexão:\n "+ex.getMessage()); 
       }
   }
   
   public void desconectar(){
       try {
           con.close();
          // JOptionPane.showMessageDialog(null, "Desconectado com sucesso!!!");
       } catch (SQLException ex) {
          JOptionPane.showMessageDialog(null, "Erro ao desconectar:\n "+ex.getMessage());
       }
   }
}
