package core;

import java.util.List;
import javax.swing.DefaultListModel;

/**
 * Classe che gestisce la pagina per l'inserimento, la visualizzazione dei giudizi e delle informazioni dei ristoranti
 * @author Cervini Samuele
 * @author Sarzi Sartori Andrea
 */
public class InfoSong extends javax.swing.JFrame {

    /**
     * Verifica se l'utente è entrato con login o accesso libero
     */
    public boolean accesso_libero = false;

    /**
     * Nome di chi è loggato in quel momento
     */
    public String nickname = null;

    /**
     * Ristorante di cui al momento si sta mostrando le informazioni
     */
    public Ristorante ristorante = null;
    /**
     * Viene creato il nuovo form della classe
     */
    public InfoSong() {
        initComponents();
    }
    
    /**
     * Metodo che costruisce la finestra per la visualizzazione e/o inserimento dei giudizi
     * @param ristorante       Ristorante di cui mostra le informazioni   
     * @param accesso_libero   Controllo se si è entrati con Accesso Libero o meno  
     * @param nickname         Nickname con la quale si è loggati
     */
    public InfoSong(Ristorante ristorante, boolean accesso_libero, String nickname) {
        this();
        this.ristorante = ristorante;
        this.accesso_libero = accesso_libero;
        this.nickname = nickname;
        lb_info.setText(ristorante.toString());
        
        DefaultListModel listModel = (DefaultListModel)list_giudizi.getModel();
        if(ristorante.giudizi.size() > 0) {
            for (int i = 0; i < ristorante.giudizi.size(); i++)
            {
                listModel.addElement(ristorante.giudizi.get(i).toString());
            }
        } else {
            listModel.addElement("Vuoto");
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lb_info = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        list_giudizi = new javax.swing.JList<>();
        txt_commento = new javax.swing.JTextField();
        btn_giudica = new javax.swing.JButton();
        sp_voto = new javax.swing.JSpinner();
        btn_back = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Informazioni");
        setResizable(false);

        lb_info.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lb_info.setText("...");

        list_giudizi.setModel(new DefaultListModel());
        jScrollPane1.setViewportView(list_giudizi);

        txt_commento.setToolTipText("Scrivi il tuo giudizio");

        btn_giudica.setText("INVIA");
        btn_giudica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_giudicaActionPerformed(evt);
            }
        });

        sp_voto.setModel(new javax.swing.SpinnerNumberModel(1, 1, 5, 1));
        sp_voto.setToolTipText("Seleziona il numero di stelle ");

        btn_back.setText("Indietro");
        btn_back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_backActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Ristorante selezionato:");

        jTextPane1.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 12)); // NOI18N
        jTextPane1.setText("Inserisci il tuo giudizio!\nScrivi una tua breve opinione e selezione dal\nmenù a tendina un voto in stelle compreso\nda 1 a 5, dove:\n\n1 ---> Terribile\n2 ---> Mediocre\n3 ---> Accettabile\n4 ---> Buono\n5 ---> Eccellente\n\nGrazie mille per il feedback!");
        jTextPane1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTextPane1.setFocusable(false);
        jScrollPane3.setViewportView(jTextPane1);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Giudizzi attualmente caricati:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(lb_info))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 143, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 493, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(21, 21, 21))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(sp_voto, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_commento, javax.swing.GroupLayout.PREFERRED_SIZE, 377, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_giudica)))
                        .addGap(22, 22, 22))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_back)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb_info))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sp_voto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_commento, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_giudica))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                .addComponent(btn_back)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_giudicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_giudicaActionPerformed
//        if(!accesso_libero && nickname != null) {   
//            Giudizio g = new Giudizio((int)sp_voto.getValue(), nickname, txt_commento.getText());
//            ristorante.giudizi.add(g);
//            List<Ristorante> list = Metodi.LeggiRistoranti();
//            for(int i = 0; i < list.size(); i++) {
//                if(list.get(i).nome.equals(ristorante.nome)) {
//                    list.set(i, ristorante);
//                    break;
//                }
//            }
//            Metodi.ScriviRistoranti(list);
//
//            DefaultListModel listModel = (DefaultListModel)list_giudizi.getModel();
//            listModel.removeAllElements();
//            if(ristorante.giudizi.size() > 0) {
//                for (int i = 0; i < ristorante.giudizi.size(); i++)
//                {
//                    listModel.addElement(ristorante.giudizi.get(i).toString());
//                }
//            } else {
//                listModel.addElement("Vuoto");
//            }
//        } else {
//            javax.swing.JOptionPane.showMessageDialog(getContentPane(), "Devi essere loggato per aggiungere un giudizio", "", javax.swing.JOptionPane.WARNING_MESSAGE);
//        }
    }//GEN-LAST:event_btn_giudicaActionPerformed

    private void btn_backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_backActionPerformed
        dispose();
    }//GEN-LAST:event_btn_backActionPerformed

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
            java.util.logging.Logger.getLogger(InfoSong.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InfoSong.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InfoSong.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InfoSong.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InfoSong().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_back;
    private javax.swing.JButton btn_giudica;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextPane jTextPane1;
    private javax.swing.JLabel lb_info;
    private javax.swing.JList<String> list_giudizi;
    private javax.swing.JSpinner sp_voto;
    private javax.swing.JTextField txt_commento;
    // End of variables declaration//GEN-END:variables
}