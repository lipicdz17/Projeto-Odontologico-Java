/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistencia;

import Negocio.ModeloPaciente;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author NAILSON
 */
public class BancoPaciente {
    
    ConexaoBD conec = new ConexaoBD();
    ModeloPaciente pac = new ModeloPaciente();
    
    public void salvar(ModeloPaciente pac){
        conec.conexao();
        try {
            PreparedStatement pst = conec.con.prepareStatement("insert into bdpaciente (nome,telefone,cpf,endereco,bairro, cidade, cep, uf, email, sexo)values (upper(?),?,?,upper(?),upper(?),upper(?),?,upper(?),lower(?),upper(?))");
        pst.setString(1, pac.getNome());
        pst.setString(2, pac.getTelefone());
        pst.setString(3, pac.getCpf());
        pst.setString(4, pac.getEndereco());
        pst.setString(5, pac.getBairro());
        pst.setString(6, pac.getCidade());
        pst.setString(7, pac.getCep());
        pst.setString(8, pac.getUf());
        pst.setString(9, pac.getEmail());
        pst.setString(10, pac.getSexo());
        
        pst.execute();
        
         JOptionPane.showMessageDialog(null, "Paciente  *"+pac.getNome()+"*  cadastrado com sucesso!!!");
        
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Falha ao cadastrar Paciente \n Erro"+ex.getMessage());
        }
        
        conec.desconectar();
    }
    
    public void Editar(ModeloPaciente pac){
        conec.conexao();
        try {
            PreparedStatement pst = conec.con.prepareStatement("update bdpaciente set nome=upper(?),telefone=?, cpf=?, endereco=upper(?), bairro=upper(?), cidade=upper(?),cep=?,uf=upper(?),email=lower(?),sexo=? where codigo=?");
            pst.setString(1,pac.getNome());
            pst.setString(2,pac.getTelefone());
            pst.setString(3,pac.getCpf());
            pst.setString(4,pac.getEndereco());
            pst.setString(5, pac.getBairro());
            pst.setString(6, pac.getCidade());
            pst.setString(7, pac.getCep());
            pst.setString(8, pac.getUf());
            pst.setString(9, pac.getEmail());
            pst.setString(10, pac.getSexo());
            pst.setInt(11,pac.getCodigo());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Cadastro do Paciente *" +pac.getNome()+ "* alterado com sucesso!!!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Impossivel alterar cadastro do Paciente!!!\n Erro"+ex.getMessage());
        }
        
        conec.desconectar();
        
    }
    
    public void Excluir(ModeloPaciente pac){
        conec.conexao();
        try {
            PreparedStatement pst = conec.con.prepareStatement("delete from bdpaciente where codigo=?");
            pst.setInt(1, pac.getCodigo());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Cadastro do Paciente excluido com sucesso!!!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Impossivel excluir cadastro do Paciente!!!\n Erro"+ex.getMessage());
        }
        
        
        
        conec.desconectar();
    }
    
    public ModeloPaciente  buscaPaciente(ModeloPaciente pac){
       conec.conexao();
       conec.executaSql("select * from bdpaciente where nome like'%"+pac.getPesquisa()+"%'");
        try {
            conec.rs.first();
            pac.setCodigo(conec.rs.getInt("codigo"));
            pac.setNome(conec.rs.getString("nome"));
            pac.setTelefone(conec.rs.getString("telefone"));
            pac.setCpf(conec.rs.getString("cpf"));
            pac.setEndereco(conec.rs.getString("endereco"));
            pac.setBairro(conec.rs.getString("bairro"));
            pac.setCidade(conec.rs.getString("cidade"));
            pac.setCep(conec.rs.getString("cep"));
            pac.setUf(conec.rs.getString("uf"));
            pac.setEmail(conec.rs.getString("email"));
            pac.setSexo(conec.rs.getString("sexo"));
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Paciente não cadastrado!!!");
        }
       conec.desconectar();
       return pac;
    }
    
    
}
