/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistencia;

import Negocio.ModeloDentista;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class BancoDentista {
  
    ConexaoBD conec = new ConexaoBD();
    ModeloDentista dent = new ModeloDentista();
    
    public void salvar(ModeloDentista dent){
        conec.conexao();
        try {
            PreparedStatement pst = conec.con.prepareStatement("insert into bddentista (nome,cro,especialidade)values (upper(?),?,upper(?))");
        pst.setString(1, dent.getNome());
        pst.setInt(2, dent.getCro());
        pst.setString(3, dent.getEspecialidade());
        pst.execute();
         JOptionPane.showMessageDialog(null, "Dentista  *"+dent.getNome()+"*  cadastrado com sucesso!!!");
        
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Falha ao cadastrar Dentista \n Erro"+ex.getMessage());
        }
        
        conec.desconectar();
    }
    
    public void Editar(ModeloDentista dent){
        conec.conexao();
        try {
            PreparedStatement pst = conec.con.prepareStatement("update bddentista set nome=upper(?),cro=?, especialidade=upper(?) where codigo=? ");
            pst.setString(1, dent.getNome());
            pst.setInt(2, dent.getCro());
            pst.setString(3, dent.getEspecialidade());
            pst.setInt(4, dent.getCodigo());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Cadastro do Dentista *" +dent.getNome()+ "* alterado com sucesso!!!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Impossivel alterar cadastro do Dentista!!!\n Erro"+ex.getMessage());
        }
        
        conec.desconectar();
        
    }
    
    public void Excluir(ModeloDentista dent){
        conec.conexao();
        try {
            PreparedStatement pst = conec.con.prepareStatement("delete from bddentista where codigo=?");
            pst.setInt(1, dent.getCodigo());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Cadastro do Dentista excluido com sucesso!!!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Impossivel excluir cadastro do Dentista!!!\n Erro"+ex.getMessage());
        }
        
        
        
        conec.desconectar();
    }
    
    public ModeloDentista buscaDentista(ModeloDentista dent){
       conec.conexao();
       conec.executaSql("select * from bddentista where nome like'%"+dent.getPesquisa()+"%'");
        try {
            conec.rs.first();
            dent.setCodigo(conec.rs.getInt("codigo"));
            dent.setNome(conec.rs.getString("nome"));
            dent.setCro(conec.rs.getInt("cro"));
            dent.setEspecialidade(conec.rs.getString("especialidade"));
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Dentista não cadastrado!!!");
        }
       conec.desconectar();
       return dent;
    }
}



