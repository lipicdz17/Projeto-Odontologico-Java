/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistencia;

import Negocio.ModeloConsulta;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class BancoConsulta {
    
    ConexaoBD conect = new ConexaoBD();
    ModeloConsulta consulta = new ModeloConsulta();
    
    public void Salvar(ModeloConsulta consulta){
        conect.conexao();
        try {
            PreparedStatement pst = conect.con.prepareStatement("insert into bdconsulta (codigo_paciente, nome_paciente, nome_dentista,status, data)value(?,upper(?), upper(?),upper(?),?)");
            pst.setInt(1, consulta.getCodigo_paciente());
            pst.setString(2, consulta.getNome_paciente());
            pst.setString(3, consulta.getNome_dentista());
            pst.setString(4, consulta.getStatus());
            pst.setDate(5, new java.sql.Date(consulta.getData().getTime()));
            pst.execute();
            
            JOptionPane.showMessageDialog(null, "Consulta cadastrada com sucesso");
        
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Falha ao cadastrar Consulta \n Erro"+ex.getMessage());
        }
        
        conect.desconectar();
        
    }
    public ModeloConsulta  buscaConsulta(ModeloConsulta consul){
       conect.conexao();
       conect.executaSql("select * from bdconsulta where data like'%"+consulta.getData()+"%'");
        try {
            conect.rs.first();
            consulta.setRegistro(conect.rs.getInt("registro"));
            consulta.setCodigo_paciente(conect.rs.getInt("codigo_paciente"));
            consulta.setNome_paciente(conect.rs.getString("nome_paciente"));
            consulta.setNome_dentista(conect.rs.getString("nome_dentista"));
            consulta.setData(conect.rs.getDate("data"));
                         
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Sem registro de consulta nesta data!!!");
        }
       conect.desconectar();
       return consulta;
    }
    
    public void Editar(ModeloConsulta consul){
        conect.conexao();
        try {
            PreparedStatement pst = conect.con.prepareStatement("update bdconsulta set status=? where registro=? ");
            pst.setString(1, consul.getStatus());
            pst.setInt(2, consul.getRegistro());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Consulta finalizada com sucesso!!!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Impossivel finalizar consulta!!!\n Erro"+ex.getMessage());
        }
        conect.desconectar();
    }
}
