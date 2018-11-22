package InterfaceDentista;


import Persistencia.BancoConsulta;
import Persistencia.BancoPaciente;
import Persistencia.ConexaoBD;
import Negocio.ModeloConsulta;
import Negocio.ModeloPaciente;
import Negocio.ModeloTabeladen;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author NAILSON
 */
public class TelaConsulta extends javax.swing.JFrame {
    ModeloPaciente pac = new ModeloPaciente();
    BancoPaciente banco = new BancoPaciente();
    
    ConexaoBD conect = new ConexaoBD();
    ModeloConsulta consulta = new ModeloConsulta();
    BancoConsulta consul = new BancoConsulta();
    
    
    
    public TelaConsulta() {
        initComponents();
        preencherDentista();
        preencherTabela("select * from bdpaciente order by codigo");
        
    }

    
        
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jLabel10 = new javax.swing.JLabel();
        BuscarPaciente = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        marcar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        codigopacienteconsulta = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        nomepaciente = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        registroconsulta = new javax.swing.JTextField();
        jFormattedtelefonepaciente = new javax.swing.JFormattedTextField();
        jLabel17 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jComboBoxsexopaciente = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        pesquisapaciente = new javax.swing.JFormattedTextField();
        jLabel7 = new javax.swing.JLabel();
        jDateChooserconsulta = new com.toedter.calendar.JDateChooser();
        endpaciente = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jFormattedceppaciente = new javax.swing.JFormattedTextField();
        jLabel8 = new javax.swing.JLabel();
        cidadepaciente = new javax.swing.JTextField();
        jFormattedcpfpaciente = new javax.swing.JFormattedTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelapaciente = new javax.swing.JTable();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jComboBoxdentista = new javax.swing.JComboBox<>();
        jComboBoxufpaciente = new javax.swing.JComboBox<>();
        jLabel13 = new javax.swing.JLabel();
        jFormattedemailpaciente = new javax.swing.JFormattedTextField();
        jLabel9 = new javax.swing.JLabel();
        bairropaciente = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Tela de Marcação de Consulta ");
        setResizable(false);
        getContentPane().setLayout(null);

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setText("Digite o cpf do paciente:");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(20, 20, 180, 30);

        BuscarPaciente.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        BuscarPaciente.setText("Buscar");
        BuscarPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscarPacienteActionPerformed(evt);
            }
        });
        getContentPane().add(BuscarPaciente);
        BuscarPaciente.setBounds(330, 20, 110, 30);

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton3.setText("Cancelar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(120, 380, 110, 30);

        marcar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        marcar.setText("Marcar");
        marcar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                marcarActionPerformed(evt);
            }
        });
        getContentPane().add(marcar);
        marcar.setBounds(10, 380, 110, 30);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Codigo:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(10, 60, 50, 20);

        codigopacienteconsulta.setEnabled(false);
        getContentPane().add(codigopacienteconsulta);
        codigopacienteconsulta.setBounds(10, 80, 80, 30);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Nome:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(100, 50, 50, 40);

        nomepaciente.setEnabled(false);
        getContentPane().add(nomepaciente);
        nomepaciente.setBounds(100, 80, 350, 30);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("Registro:");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(510, 10, 70, 30);

        registroconsulta.setEnabled(false);
        getContentPane().add(registroconsulta);
        registroconsulta.setBounds(570, 10, 40, 30);

        try {
            jFormattedtelefonepaciente.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFormattedtelefonepaciente.setEnabled(false);
        getContentPane().add(jFormattedtelefonepaciente);
        jFormattedtelefonepaciente.setBounds(460, 80, 130, 30);

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel17.setText("Telefone:");
        getContentPane().add(jLabel17);
        jLabel17.setBounds(460, 60, 70, 20);

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel14.setText("Sexo:");
        getContentPane().add(jLabel14);
        jLabel14.setBounds(600, 50, 40, 40);

        jComboBoxsexopaciente.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jComboBoxsexopaciente.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "M", "F", " " }));
        jComboBoxsexopaciente.setEnabled(false);
        getContentPane().add(jComboBoxsexopaciente);
        jComboBoxsexopaciente.setBounds(600, 80, 60, 30);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("Cpf:");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(10, 110, 50, 20);

        try {
            pesquisapaciente.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        pesquisapaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pesquisapacienteActionPerformed(evt);
            }
        });
        getContentPane().add(pesquisapaciente);
        pesquisapaciente.setBounds(190, 20, 130, 30);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setText("Endereço:");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(150, 110, 90, 20);
        getContentPane().add(jDateChooserconsulta);
        jDateChooserconsulta.setBounds(200, 340, 130, 30);

        endpaciente.setEnabled(false);
        endpaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                endpacienteActionPerformed(evt);
            }
        });
        getContentPane().add(endpaciente);
        endpaciente.setBounds(150, 130, 300, 30);

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel11.setText("Dentista:");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(10, 320, 80, 20);

        try {
            jFormattedceppaciente.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFormattedceppaciente.setEnabled(false);
        jFormattedceppaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFormattedceppacienteActionPerformed(evt);
            }
        });
        getContentPane().add(jFormattedceppaciente);
        jFormattedceppaciente.setBounds(10, 180, 130, 30);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setText("Cidade:");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(150, 160, 80, 20);

        cidadepaciente.setEnabled(false);
        cidadepaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cidadepacienteActionPerformed(evt);
            }
        });
        getContentPane().add(cidadepaciente);
        cidadepaciente.setBounds(150, 180, 130, 30);

        try {
            jFormattedcpfpaciente.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFormattedcpfpaciente.setEnabled(false);
        jFormattedcpfpaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFormattedcpfpacienteActionPerformed(evt);
            }
        });
        getContentPane().add(jFormattedcpfpaciente);
        jFormattedcpfpaciente.setBounds(10, 130, 130, 30);

        tabelapaciente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Codigo", "Nome", "Cpf", "Telefone", "Endereço", "Sexo"
            }
        ));
        tabelapaciente.getTableHeader().setReorderingAllowed(false);
        tabelapaciente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelapacienteMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelapaciente);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(10, 210, 650, 110);

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel15.setText("Cep:");
        getContentPane().add(jLabel15);
        jLabel15.setBounds(10, 160, 50, 20);

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel16.setText("Data:");
        getContentPane().add(jLabel16);
        jLabel16.setBounds(200, 320, 50, 20);

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel12.setText("UF");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(290, 160, 50, 30);

        jComboBoxdentista.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(jComboBoxdentista);
        jComboBoxdentista.setBounds(10, 340, 180, 30);

        jComboBoxufpaciente.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jComboBoxufpaciente.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "UF", "AL", "AP", "AM", "BA", "CE", "DF", "ES", "GO", "MA", "MT", "MS", "MG", "PA", "PB", "PR", "PE", "PI", "RJ", "RN", "RS", "RO", "RR", "SC", "SP", "SE", "TO", " " }));
        jComboBoxufpaciente.setEnabled(false);
        getContentPane().add(jComboBoxufpaciente);
        jComboBoxufpaciente.setBounds(290, 180, 60, 30);

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel13.setText("E-mail:");
        getContentPane().add(jLabel13);
        jLabel13.setBounds(360, 160, 50, 20);

        jFormattedemailpaciente.setEnabled(false);
        jFormattedemailpaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFormattedemailpacienteActionPerformed(evt);
            }
        });
        getContentPane().add(jFormattedemailpaciente);
        jFormattedemailpaciente.setBounds(360, 180, 300, 30);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setText("Bairro:");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(460, 110, 80, 20);

        bairropaciente.setEnabled(false);
        bairropaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bairropacienteActionPerformed(evt);
            }
        });
        getContentPane().add(bairropaciente);
        bairropaciente.setBounds(460, 130, 200, 30);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/fundo_vida_1.jpg"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 110, 670, 310);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/fundo_vida_1.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 670, 320);

        setSize(new java.awt.Dimension(674, 450));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public void preencherDentista(){
        conect.conexao();
        conect.executaSql("select *from bddentista order by nome");
        try {
            conect.rs.first();
            jComboBoxdentista.removeAllItems();
            
            do{
             jComboBoxdentista.addItem(conect.rs.getString("nome"));
            }while(conect.rs.next());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao preencher dentista!!!"+ex);
        }
        
        conect.desconectar();
        
    }
    
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void pesquisapacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pesquisapacienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pesquisapacienteActionPerformed

    private void endpacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_endpacienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_endpacienteActionPerformed

    private void jFormattedceppacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFormattedceppacienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFormattedceppacienteActionPerformed

    private void cidadepacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cidadepacienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cidadepacienteActionPerformed

    private void jFormattedemailpacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFormattedemailpacienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFormattedemailpacienteActionPerformed

    private void bairropacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bairropacienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bairropacienteActionPerformed

    private void BuscarPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscarPacienteActionPerformed
        
        pac.setPesquisa(pesquisapaciente.getText());
        ModeloPaciente modelo = banco.buscaPaciente(pac);
        codigopacienteconsulta.setText(String.valueOf(modelo.getCodigo()));
        nomepaciente.setText(modelo.getNome());
        jFormattedtelefonepaciente.setText(modelo.getTelefone());
        jFormattedcpfpaciente.setText(modelo.getCpf());
        pesquisapaciente.setText(modelo.getCpf());
        endpaciente.setText(modelo.getEndereco());
        bairropaciente.setText(modelo.getBairro());
        cidadepaciente.setText(modelo.getCidade());
        jFormattedceppaciente.setText(modelo.getCep());
        jComboBoxufpaciente.setSelectedItem(modelo.getUf());
        jFormattedemailpaciente.setText(modelo.getEmail());
        jComboBoxsexopaciente.setSelectedItem(modelo.getSexo());
        
        preencherTabela("select * from bdpaciente where cpf like'%"+pac.getPesquisa()+"%'");
        pesquisapaciente.setText("");
    }//GEN-LAST:event_BuscarPacienteActionPerformed

    private void jFormattedcpfpacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFormattedcpfpacienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFormattedcpfpacienteActionPerformed

    private void tabelapacienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelapacienteMouseClicked
        String cpf =""+tabelapaciente.getValueAt(tabelapaciente.getSelectedRow(), 1);
        conect.conexao();
        conect.executaSql("select * from bdpaciente where nome='"+cpf+"'");
        try {
            conect.rs.first();
            codigopacienteconsulta.setText(String.valueOf(conect.rs.getInt("codigo")));
            nomepaciente.setText(conect.rs.getString("nome"));
            jFormattedtelefonepaciente.setText(conect.rs.getString("telefone"));
            jFormattedcpfpaciente.setText(conect.rs.getString("cpf"));
            endpaciente.setText(conect.rs.getString("endereco"));
            bairropaciente.setText(conect.rs.getString("bairro"));
            cidadepaciente.setText(conect.rs.getString("cidade"));
            jFormattedceppaciente.setText(conect.rs.getString("cep"));
            jComboBoxufpaciente.setSelectedItem(conect.rs.getString("uf"));
            jFormattedemailpaciente.setText(conect.rs.getString("email"));
            jComboBoxsexopaciente.setSelectedItem(conect.rs.getString("sexo"));
            

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Impossivel selecionar dados do Paciente!!!\n Erro"+ex.getMessage());
        }

        conect.desconectar();
    }//GEN-LAST:event_tabelapacienteMouseClicked

    private void marcarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_marcarActionPerformed
     
     consulta.setCodigo_paciente(Integer.parseInt(codigopacienteconsulta.getText()));
     consulta.setNome_paciente(nomepaciente.getText());
     consulta.setNome_dentista((String) jComboBoxdentista.getSelectedItem());
     consulta.setStatus("AGUARDANDO");
     consulta.setData(jDateChooserconsulta.getDate());
     consul.Salvar(consulta);
     preencherTabela("select * from bdpaciente inner join bdconsulta on codigo=codigo_paciente order by registro");
     this.dispose();
     
     
    }//GEN-LAST:event_marcarActionPerformed
 
    public void preencherTabela(String Sql){
        ArrayList dados = new ArrayList();
        String [] colunas = new String []{"Codigo","Nome","Telefone","Cpf","Endereço","Bairro"};
        conect.conexao();
        conect.executaSql(Sql);
        
        try{
         conect.rs.first();
         do{
             
          dados.add(new Object[]{conect.rs.getInt("codigo"),conect.rs.getString("nome"),conect.rs.getString("telefone"),conect.rs.getString("cpf"),conect.rs.getString("endereco"),conect.rs.getString("bairro")});
         
         }while(conect.rs.next());
        }catch(SQLException ex){
            //JOptionPane.showMessageDialog(rootPane,"Tabela de Paciente sem registro");
        }
            ModeloTabeladen tabela = new ModeloTabeladen(dados,colunas);
            
            tabelapaciente.setModel(tabela);
            tabelapaciente.getColumnModel().getColumn(0).setPreferredWidth(50);
            tabelapaciente.getColumnModel().getColumn(0).setResizable(false);
            tabelapaciente.getColumnModel().getColumn(1).setPreferredWidth(160);
            tabelapaciente.getColumnModel().getColumn(1).setResizable(false);
            tabelapaciente.getColumnModel().getColumn(2).setPreferredWidth(95);
            tabelapaciente.getColumnModel().getColumn(2).setResizable(false);
            tabelapaciente.getColumnModel().getColumn(3).setPreferredWidth(100);
            tabelapaciente.getColumnModel().getColumn(3).setResizable(false);
            tabelapaciente.getColumnModel().getColumn(4).setPreferredWidth(160);
            tabelapaciente.getColumnModel().getColumn(4).setResizable(false);
            tabelapaciente.getColumnModel().getColumn(5).setPreferredWidth(100);
            tabelapaciente.getColumnModel().getColumn(5).setResizable(false);
            tabelapaciente.getTableHeader().setReorderingAllowed(false);
            tabelapaciente.setAutoResizeMode(tabelapaciente.AUTO_RESIZE_OFF);
            tabelapaciente.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
            
        conect.desconectar();
        
    }
   
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaConsulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaConsulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaConsulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaConsulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaConsulta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BuscarPaciente;
    private javax.swing.JTextField bairropaciente;
    private javax.swing.JTextField cidadepaciente;
    private javax.swing.JTextField codigopacienteconsulta;
    private javax.swing.JTextField endpaciente;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox<String> jComboBoxdentista;
    private javax.swing.JComboBox<String> jComboBoxsexopaciente;
    private javax.swing.JComboBox<String> jComboBoxufpaciente;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private com.toedter.calendar.JDateChooser jDateChooserconsulta;
    private javax.swing.JFormattedTextField jFormattedceppaciente;
    private javax.swing.JFormattedTextField jFormattedcpfpaciente;
    private javax.swing.JFormattedTextField jFormattedemailpaciente;
    private javax.swing.JFormattedTextField jFormattedtelefonepaciente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton marcar;
    private javax.swing.JTextField nomepaciente;
    private javax.swing.JFormattedTextField pesquisapaciente;
    private javax.swing.JTextField registroconsulta;
    private javax.swing.JTable tabelapaciente;
    // End of variables declaration//GEN-END:variables

   
  }