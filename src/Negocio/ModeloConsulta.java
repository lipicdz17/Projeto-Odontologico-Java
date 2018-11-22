/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio;

import java.util.Date;


public class ModeloConsulta {
    
    private int registro;
    private String nome_paciente;
    private int codigo_dentista;
    private String nome_dentista;
    private Date data;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    private String status;
    
    private int codigo_paciente;

    public int getRegistro() {
        return registro;
    }

    public void setRegistro(int registro) {
        this.registro = registro;
    }

    public int getCodigo_paciente() {
        return codigo_paciente;
    }

    public void setCodigo_paciente(int codigo_paciente) {
        this.codigo_paciente = codigo_paciente;
    }

    public String getNome_paciente() {
        return nome_paciente;
    }

    public void setNome_paciente(String nome_paciente) {
        this.nome_paciente = nome_paciente;
    }

    public int getCodigo_dentista() {
        return codigo_dentista;
    }

    public void setCodigo_dentista(int codigo_dentista) {
        this.codigo_dentista = codigo_dentista;
    }

    public String getNome_dentista() {
        return nome_dentista;
    }

    public void setNome_dentista(String nome_dentista) {
        this.nome_dentista = nome_dentista;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }
    
}
