package InterfaceDentista;


import Persistencia.BancoDentista;
import Persistencia.ConexaoBD;
import Negocio.ModeloDentista;
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
public class TelaDentista extends javax.swing.JFrame {
    
    ModeloDentista dent = new ModeloDentista();
    BancoDentista banco = new BancoDentista();
    ConexaoBD conec = new ConexaoBD();
    int flag=0;
    
    
    public TelaDentista() {
        initComponents();
        preencherTabela("select *from bddentista order by codigo");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cancelardentista = new javax.swing.JButton();
        fechateladentista = new javax.swing.JButton();
        salvardentista = new javax.swing.JButton();
        alterardentista = new javax.swing.JButton();
        excluirdentista = new javax.swing.JButton();
        novodentista = new javax.swing.JButton();
        pesquisardentista = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        especialidadedentista = new javax.swing.JComboBox<>();
        cro = new javax.swing.JTextField();
        nomedentista = new javax.swing.JTextField();
        codigodentista = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        pesquisadentista = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabeladentista = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Tela Dentista");
        setResizable(false);
        getContentPane().setLayout(null);

        cancelardentista.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        cancelardentista.setText("Cancelar");
        cancelardentista.setEnabled(false);
        cancelardentista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelardentistaActionPerformed(evt);
            }
        });
        getContentPane().add(cancelardentista);
        cancelardentista.setBounds(230, 380, 100, 30);

        fechateladentista.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        fechateladentista.setText("Fechar");
        fechateladentista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fechateladentistaActionPerformed(evt);
            }
        });
        getContentPane().add(fechateladentista);
        fechateladentista.setBounds(560, 380, 100, 30);

        salvardentista.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        salvardentista.setText("Salvar");
        salvardentista.setEnabled(false);
        salvardentista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salvardentistaActionPerformed(evt);
            }
        });
        getContentPane().add(salvardentista);
        salvardentista.setBounds(120, 380, 100, 30);

        alterardentista.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        alterardentista.setText("Alterar");
        alterardentista.setEnabled(false);
        alterardentista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alterardentistaActionPerformed(evt);
            }
        });
        getContentPane().add(alterardentista);
        alterardentista.setBounds(340, 380, 100, 30);

        excluirdentista.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        excluirdentista.setText("Excluir");
        excluirdentista.setEnabled(false);
        excluirdentista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                excluirdentistaActionPerformed(evt);
            }
        });
        getContentPane().add(excluirdentista);
        excluirdentista.setBounds(450, 380, 100, 30);

        novodentista.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        novodentista.setText("Novo");
        novodentista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                novodentistaActionPerformed(evt);
            }
        });
        getContentPane().add(novodentista);
        novodentista.setBounds(10, 380, 100, 30);

        pesquisardentista.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        pesquisardentista.setText("Pesquisar");
        pesquisardentista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pesquisardentistaActionPerformed(evt);
            }
        });
        getContentPane().add(pesquisardentista);
        pesquisardentista.setBounds(10, 160, 87, 30);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("Codigo:");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(300, 30, 60, 40);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Especialidade:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(300, 80, 90, 30);

        especialidadedentista.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "CIRURGIA E TRAUMATOLOGIA BUCO-MAXILO-FACIAL", "DENTÍSTICA", "DISFUNÇÃO TÊMPORO-MANDIBULAR E DOR-OROFACIAL", "ENDODONTIA", "ESTOMATOLOGIA", "RADIOLOGIA ODONTOLÓGICA E IMAGINOLOGIA", "IMPLANTODONTIA", "ODONTOLOGIA LEGAL", "ODONTOGERIATRIA", "ODONTOPEDIATRIA", "ODONTOLOGIA DO TRABALHO", "ODONTOLOGIA PARA PACIENTES COM NECESSIDADES ESPECIAIS", "ORTODONTIA", "ORTOPEDIA FUNCIONAL DOS MAXILARES", "PATOLOGIA BUCAL", "PERIODONTIA", "PRÓTESE BUCO-MAXILO-FACIAL", "PRÓTESE DENTÁRIA", "SAÚDE COLETIVA" }));
        especialidadedentista.setEnabled(false);
        getContentPane().add(especialidadedentista);
        especialidadedentista.setBounds(390, 80, 130, 30);

        cro.setEnabled(false);
        getContentPane().add(cro);
        cro.setBounds(60, 80, 210, 30);

        nomedentista.setEnabled(false);
        getContentPane().add(nomedentista);
        nomedentista.setBounds(60, 40, 210, 30);

        codigodentista.setEnabled(false);
        getContentPane().add(codigodentista);
        codigodentista.setBounds(360, 40, 70, 30);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("C.R.O:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(10, 80, 50, 30);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("Nome:");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(10, 40, 50, 30);
        getContentPane().add(pesquisadentista);
        pesquisadentista.setBounds(100, 160, 290, 30);

        tabeladentista.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Codigo", "Nome", "CRO", "Especialidade"
            }
        ));
        tabeladentista.getTableHeader().setReorderingAllowed(false);
        tabeladentista.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabeladentistaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabeladentista);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(10, 200, 650, 170);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/fundo_vida_1.jpg"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 110, 670, 310);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/fundo_vida_1.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 670, 320);

        setSize(new java.awt.Dimension(676, 446));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void fechateladentistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fechateladentistaActionPerformed
        this.dispose();
    }//GEN-LAST:event_fechateladentistaActionPerformed

    private void alterardentistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alterardentistaActionPerformed
        flag=2;
        nomedentista.setEnabled(true);
        cro.setEnabled(true);
        especialidadedentista.setEnabled(true);
        salvardentista.setEnabled(true);
        cancelardentista.setEnabled(true);
        alterardentista.setEnabled(false);
        excluirdentista.setEnabled(false);
        pesquisadentista.setEnabled(false);
        pesquisardentista.setEnabled(false);
        novodentista.setEnabled(false);
        preencherTabela("select *from bddentista order by codigo");
    }//GEN-LAST:event_alterardentistaActionPerformed

    private void excluirdentistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_excluirdentistaActionPerformed
       int resposta = 0;
       resposta = JOptionPane.showConfirmDialog(rootPane, "Deseja realmente excluir cadastro?");
       if(resposta==JOptionPane.YES_OPTION){
           dent.setCodigo(Integer.parseInt(codigodentista.getText()));
           banco.Excluir(dent);
           codigodentista.setText("");
           nomedentista.setText("");
           cro.setText("");
           pesquisadentista.setText("");
           nomedentista.setEnabled(false);
           cro.setEnabled(false);
           especialidadedentista.setEnabled(false);
           salvardentista.setEnabled(false);
           pesquisadentista.setEnabled(true);
           pesquisardentista.setEnabled(true);
           alterardentista.setEnabled(false);
           excluirdentista.setEnabled(false);
           preencherTabela("select *from bddentista order by codigo");
           
       }
    }//GEN-LAST:event_excluirdentistaActionPerformed

    private void salvardentistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salvardentistaActionPerformed
       if(nomedentista.getText().isEmpty()){
           JOptionPane.showMessageDialog(null, "Nome do dentista é obrigatório!!!");
           nomedentista.requestFocus();
       }else if(cro.getText().isEmpty()){
          JOptionPane.showMessageDialog(null, "Cro do dentista é obrigatório!!!");
          cro.requestFocus();
       }
           
       else
                
        if(flag==1){
       dent.setNome(nomedentista.getText());
       dent.setCro(Integer.parseInt(cro.getText()));
       dent.setEspecialidade((String)especialidadedentista.getSelectedItem());
       banco.salvar(dent);
       nomedentista.setText("");
       cro.setText("");
       especialidadedentista.setSelectedItem("");
       nomedentista.setEnabled(false);
       cro.setEnabled(false);
       especialidadedentista.setEnabled(false);
       salvardentista.setEnabled(false);
       pesquisadentista.setEnabled(true);
       pesquisardentista.setEnabled(true);
       cancelardentista.setEnabled(false);
       preencherTabela("select *from bddentista order by codigo");
       }else{
       dent.setCodigo((Integer.parseInt(codigodentista.getText())));
       dent.setNome(nomedentista.getText());
       dent.setCro(Integer.parseInt(cro.getText()));
       dent.setEspecialidade((String)especialidadedentista.getSelectedItem());
       banco.Editar(dent);
       codigodentista.setText("");
       nomedentista.setText("");
       cro.setText("");
       especialidadedentista.setSelectedItem("");
       nomedentista.setEnabled(false);
       cro.setEnabled(false);
       especialidadedentista.setEnabled(false);
       salvardentista.setEnabled(false);
       novodentista.setEnabled(true);
       cancelardentista.setEnabled(false);
       pesquisardentista.setEnabled(true);
       pesquisadentista.setEnabled(true);
       preencherTabela("select *from bddentista order by codigo");
      
      }
              
    }//GEN-LAST:event_salvardentistaActionPerformed

    private void novodentistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_novodentistaActionPerformed
        flag=1;
        nomedentista.setEnabled(true);
        cro.setEnabled(true);
        especialidadedentista.setEnabled(true);
        salvardentista.setEnabled(true);
        cancelardentista.setEnabled(true);
        pesquisadentista.setEnabled(false);
        pesquisardentista.setEnabled(false);
        codigodentista.setText("");
        nomedentista.setText("");
        cro.setText("");
    }//GEN-LAST:event_novodentistaActionPerformed

    private void pesquisardentistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pesquisardentistaActionPerformed
        dent.setPesquisa(pesquisadentista.getText());
        ModeloDentista modelo = banco.buscaDentista(dent);
        codigodentista.setText(String.valueOf(modelo.getCodigo()));
        nomedentista.setText(modelo.getNome());
        cro.setText(String.valueOf(modelo.getCro()));
        especialidadedentista.setSelectedItem(modelo.getEspecialidade());
        alterardentista.setEnabled(true);
        excluirdentista.setEnabled(true);
        alterardentista.setEnabled(false);
        excluirdentista.setEnabled(false);
        preencherTabela("select * from bddentista where nome like'%"+dent.getPesquisa()+"%'");
        
    }//GEN-LAST:event_pesquisardentistaActionPerformed

    private void cancelardentistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelardentistaActionPerformed
       nomedentista.setEnabled(!true);
       cro.setEnabled(!true);
       especialidadedentista.setEnabled(!true);
       salvardentista.setEnabled(!true);
       cancelardentista.setEnabled(!true);
       novodentista.setEnabled(true);
       alterardentista.setEnabled(false);
       excluirdentista.setEnabled(false);
       pesquisadentista.setEnabled(true);
       pesquisardentista.setEnabled(true);
    }//GEN-LAST:event_cancelardentistaActionPerformed

    private void tabeladentistaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabeladentistaMouseClicked
        String nome =""+tabeladentista.getValueAt(tabeladentista.getSelectedRow(), 1);
        conec.conexao();
        conec.executaSql("select * from bddentista where nome='"+nome+"'");
        try {
            conec.rs.first();
            codigodentista.setText(String.valueOf(conec.rs.getInt("codigo")));
            nomedentista.setText(conec.rs.getString("nome"));
            cro.setText(String.valueOf(conec.rs.getInt("cro")));
            especialidadedentista.setSelectedItem(conec.rs.getString("especialidade"));
            alterardentista.setEnabled(true);
            excluirdentista.setEnabled(true);
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Impossivel selecionar dados do Dentista!!!\n Erro"+ex.getMessage());
        }
        
        conec.desconectar();
    }//GEN-LAST:event_tabeladentistaMouseClicked

    public void preencherTabela(String Sql){
        ArrayList dados = new ArrayList();
        String [] colunas = new String []{"Codigo","Nome","CR0","Especialidade"};
        conec.conexao();
        conec.executaSql(Sql);
        
        try{
         conec.rs.first();
         do{
             
          dados.add(new Object[]{conec.rs.getInt("codigo"),conec.rs.getString("nome"),conec.rs.getInt("cro"),conec.rs.getString("especialidade")});
         
         }while(conec.rs.next());
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(rootPane,"Tabela de Dentista sem registro");
        }
            ModeloTabeladen tabela = new ModeloTabeladen(dados,colunas);
            
            tabeladentista.setModel(tabela);
            tabeladentista.getColumnModel().getColumn(0).setPreferredWidth(70);
            tabeladentista.getColumnModel().getColumn(0).setResizable(false);
            tabeladentista.getColumnModel().getColumn(1).setPreferredWidth(260);
            tabeladentista.getColumnModel().getColumn(1).setResizable(false);
            tabeladentista.getColumnModel().getColumn(2).setPreferredWidth(100);
            tabeladentista.getColumnModel().getColumn(2).setResizable(false);
            tabeladentista.getColumnModel().getColumn(3).setPreferredWidth(230);
            tabeladentista.getColumnModel().getColumn(3).setResizable(false);
            tabeladentista.getTableHeader().setReorderingAllowed(false);
            tabeladentista.setAutoResizeMode(tabeladentista.AUTO_RESIZE_OFF);
            tabeladentista.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
            
        conec.desconectar();
        
    }
   
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
            java.util.logging.Logger.getLogger(TelaDentista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaDentista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaDentista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaDentista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaDentista().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton alterardentista;
    private javax.swing.JButton cancelardentista;
    private javax.swing.JTextField codigodentista;
    private javax.swing.JTextField cro;
    private javax.swing.JComboBox<String> especialidadedentista;
    private javax.swing.JButton excluirdentista;
    private javax.swing.JButton fechateladentista;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nomedentista;
    private javax.swing.JButton novodentista;
    private javax.swing.JTextField pesquisadentista;
    private javax.swing.JButton pesquisardentista;
    private javax.swing.JButton salvardentista;
    private javax.swing.JTable tabeladentista;
    // End of variables declaration//GEN-END:variables
}
