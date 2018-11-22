/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistencia;


import Negocio.ModeloFuncionario;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author NAILSON
 */
public class BancoFuncionario {
    ConexaoBD conec = new ConexaoBD();
    ModeloFuncionario fun = new ModeloFuncionario();
    
    public void salvar(ModeloFuncionario fun){
        conec.conexao();
        try {
            PreparedStatement pst = conec.con.prepareStatement("insert into bdfuncionario (nome,telefone,cpf,endereco,bairro, cidade, cep, uf, sexo, email, funcao, usuario, senha)values (upper(?),?,?,upper(?),upper(?),upper(?),?,upper(?),upper(?),lower(?),upper(?),?,?)");
        pst.setString(1, fun.getNome());
        pst.setString(2, fun.getTelefone());
        pst.setString(3, fun.getCpf());
        pst.setString(4,fun.getEndereco());
        pst.setString(5, fun.getBairro());
        pst.setString(6,fun.getCidade());
        pst.setString(7,fun.getCep());
        pst.setString(8,fun.getUf());
        pst.setString(9, fun.getSexo());
        pst.setString(10,fun.getEmail());
        pst.setString(11,fun.getFuncao());
        pst.setString(12,fun.getUsuario());
        pst.setString(13,fun.getSenha());
        pst.execute();
        
         JOptionPane.showMessageDialog(null, "Funcionario  *"+fun.getNome()+"*  cadastrado com sucesso!!!");
        
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Falha ao cadastrar Funcionario \n Erro"+ex.getMessage());
        }
        
        conec.desconectar();
    }
    
    public void Editar(ModeloFuncionario fun){
        conec.conexao();
        try {
            PreparedStatement pst = conec.con.prepareStatement("update bdfuncionario set nome=upper(?),telefone=?, cpf=?, endereco=upper(?), bairro=upper(?), cidade=upper(?),cep=?,uf=upper(?), sexo=upper(?),email=lower(?),funcao=upper(?),usuario=?,senha=? where codigo=?");
            pst.setString(1,fun.getNome());
            pst.setString(2,fun.getTelefone());
            pst.setString(3,fun.getCpf());
            pst.setString(4,fun.getEndereco());
            pst.setString(5, fun.getBairro());
            pst.setString(6,fun.getCidade());
            pst.setString(7,fun.getCep());
            pst.setString(8,fun.getUf());
            pst.setString(9, fun.getSexo());
            pst.setString(10,fun.getEmail());
            pst.setString(11,fun.getFuncao());
            pst.setString(12,fun.getUsuario());
            pst.setString(13,fun.getSenha());
            pst.setInt(14,fun.getCodigo());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Cadastro do Funcionario *" +fun.getNome()+ "* alterado com sucesso!!!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Impossivel alterar cadastro do Funcionario!!!\n Erro"+ex.getMessage());
        }
        
        conec.desconectar();
        
    }
    
    public void Excluir(ModeloFuncionario fun){
        conec.conexao();
        try {
            PreparedStatement pst = conec.con.prepareStatement("delete from bdfuncionario where codigo=?");
            pst.setInt(1, fun.getCodigo());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Cadastro do Funcionario excluido com sucesso!!!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Impossivel excluir cadastro do Funcionario!!!\n Erro"+ex.getMessage());
        }
        
        
        
        conec.desconectar();
    }
    
    public ModeloFuncionario buscaFuncionario(ModeloFuncionario fun){
       conec.conexao();
       conec.executaSql("select * from bdfuncionario where nome like'%"+fun.getPesquisa()+"%'");
        try {
            conec.rs.first();
            fun.setCodigo(conec.rs.getInt("codigo"));
            fun.setNome(conec.rs.getString("nome"));
            fun.setTelefone(conec.rs.getString("telefone"));
            fun.setCpf(conec.rs.getString("cpf"));
            fun.setEndereco(conec.rs.getString("endereco"));
            fun.setBairro(conec.rs.getString("bairro"));
            fun.setCidade(conec.rs.getString("cidade"));
            fun.setCep(conec.rs.getString("cep"));
            fun.setUf(conec.rs.getString("uf"));
            fun.setUf(conec.rs.getString("sexo"));
            fun.setEmail(conec.rs.getString("email"));
            fun.setFuncao(conec.rs.getString("funcao"));
            fun.setUsuario(conec.rs.getString("usuario"));
            fun.setSenha(conec.rs.getString("senha"));
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Funcionario não cadastrado!!!");
        }
       conec.desconectar();
       return fun;
    }
    
}
