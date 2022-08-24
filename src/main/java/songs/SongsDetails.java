package songs;

import utilities.Utilities;
import java.awt.Font;
import java.util.ArrayList;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import utilities.GlobalUserLogin;
import models.Song;

/**
 *
 * @author andre
 */
public class SongsDetails extends javax.swing.JFrame {

    public String id;
    Utilities utilities = new Utilities();
    
    /**
     * Creates new form LoggedDetailedSong
     */
    public SongsDetails() {
        initComponents();
        Utilities.setLogo(this);
    }
    
    public SongsDetails(String id) {
        this.id = id;
        
        initComponents();
        Utilities.setLogo(this);
        
        if (GlobalUserLogin.isUserLogged == false) {
            btn_addEmotions.setVisible(false);
            btn_addToPlaylist.setVisible(false);
        }
        
        Song song = utilities.getSongsById(id);
        
        detailedsong_id.setText(song.getId());
        detailedsong_title.setText(song.getTitle());
        detailedsong_author.setText(song.getAuthor());
        detailedsong_year.setText(song.getYear());
        
        ArrayList<float[]> results = utilities.visualizzaEmozioneBrano(id);
        Font font = new Font("Segou UI", Font.ITALIC, 16);
        
        if (results.get(0)[0] == 0.0) {
            detailedsong_potere.setFont(font);
            detailedsong_potere.setText("Questa emozione non è stata ancora provata da nessun utente.");
        } else {
            detailedsong_potere.setText("Questa emozione è stata provata da " + Math.round(results.get(0)[0]) + " utenti ed ha totalizzato una media di intensità di " + String.format("%.2f", results.get(0)[1]) + ".");
        }
        
        if (results.get(1)[0] == 0.0) {
            detailedsong_gioia.setFont(font);
            detailedsong_gioia.setText("Questa emozione non è stata ancora provata da nessun utente.");
        } else {
            detailedsong_gioia.setText("Questa emozione è stata provata da " + Math.round(results.get(1)[0]) + " utenti ed ha totalizzato una media di intensità di " + String.format("%.2f", results.get(1)[1]) + ".");
        }
        
        if (results.get(2)[0] == 0.0) {
            detailedsong_tensione.setFont(font);
            detailedsong_tensione.setText("Questa emozione non è stata ancora provata da nessun utente.");
        } else {
            detailedsong_tensione.setText("Questa emozione è stata provata da " + Math.round(results.get(2)[0]) + " utenti ed ha totalizzato una media di intensità di " + String.format("%.2f", results.get(2)[1]) + ".");
        }
        
        if (results.get(3)[0] == 0.0) {
            detailedsong_nostalgia.setFont(font);
            detailedsong_nostalgia.setText("Questa emozione non è stata ancora provata da nessun utente.");
        } else {
            detailedsong_nostalgia.setText("Questa emozione è stata provata da " + Math.round(results.get(3)[0]) + " utenti ed ha totalizzato una media di intensità di " + String.format("%.2f", results.get(3)[1]) + ".");
        }
        
        if (results.get(4)[0] == 0.0) {
            detailedsong_tristezza.setFont(font);
            detailedsong_tristezza.setText("Questa emozione non è stata ancora provata da nessun utente.");
        } else {
            detailedsong_tristezza.setText("Questa emozione è stata provata da " + Math.round(results.get(4)[0]) + " utenti ed ha totalizzato una media di intensità di " + String.format("%.2f", results.get(4)[1]) + ".");
        }
        
        if (results.get(5)[0] == 0.0) {
            detailedsong_stupore.setFont(font);
            detailedsong_stupore.setText("Questa emozione non è stata ancora provata da nessun utente.");
        } else {
            detailedsong_stupore.setText("Questa emozione è stata provata da " + Math.round(results.get(5)[0]) + " utenti ed ha totalizzato una media di intensità di " + String.format("%.2f", results.get(5)[1])+ ".");
        }
        
        if (results.get(6)[0] == 0.0) {
            detailedsong_solennita.setFont(font);
            detailedsong_solennita.setText("Questa emozione non è stata ancora provata da nessun utente.");
        } else {
            detailedsong_solennita.setText("Questa emozione è stata provata da " + Math.round(results.get(6)[0]) + " utenti ed ha totalizzato una media di intensità di " + String.format("%.2f", results.get(6)[1]) + ".");
        }
        
        if (results.get(7)[0] == 0.0) {
            detailedsong_tenerezza.setFont(font);
            detailedsong_tenerezza.setText("Questa emozione non è stata ancora provata da nessun utente.");
        } else {
            detailedsong_tenerezza.setText("Questa emozione è stata provata da " + Math.round(results.get(7)[0]) + " utenti ed ha totalizzato una media di intensità di " + String.format("%.2f", results.get(7)[1]) + ".");
        }
        
        if (results.get(8)[0] == 0.0) {
            detailedsong_calma.setFont(font);
            detailedsong_calma.setText("Questa emozione non è stata ancora provata da nessun utente.");
        } else {
            detailedsong_calma.setText("Questa emozione è stata provata da " + Math.round(results.get(8)[0]) + " utenti ed ha totalizzato una media di intensità di " + String.format("%.2f", results.get(8)[1]) + ".");
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        detailedsong_id = new javax.swing.JLabel();
        detailedsong_title = new javax.swing.JLabel();
        detailedsong_author = new javax.swing.JLabel();
        detailedsong_year = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        detailedsong_potere = new javax.swing.JLabel();
        detailedsong_gioia = new javax.swing.JLabel();
        detailedsong_tensione = new javax.swing.JLabel();
        detailedsong_nostalgia = new javax.swing.JLabel();
        detailedsong_tristezza = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        detailedsong_stupore = new javax.swing.JLabel();
        detailedsong_solennita = new javax.swing.JLabel();
        detailedsong_tenerezza = new javax.swing.JLabel();
        detailedsong_calma = new javax.swing.JLabel();
        btn_addEmotions = new javax.swing.JButton();
        btn_addToPlaylist = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Dettaglio canzone");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("Canzone selezionata:");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
        jLabel2.setText("Id:");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
        jLabel3.setText("Titolo:");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
        jLabel4.setText("Autore:");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
        jLabel6.setText("Anno:");

        detailedsong_id.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        detailedsong_id.setText("id");

        detailedsong_title.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        detailedsong_title.setText("titolo");

        detailedsong_author.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        detailedsong_author.setText("autore");

        detailedsong_year.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        detailedsong_year.setText("anno");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel5.setText("Riassunto emozioni:");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
        jLabel7.setText("Potere:");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
        jLabel8.setText("Gioia:");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
        jLabel9.setText("Tensione");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
        jLabel10.setText("Nostalgia:");

        jLabel11.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
        jLabel11.setText("Tristezza:");

        detailedsong_potere.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        detailedsong_potere.setText("potere");

        detailedsong_gioia.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        detailedsong_gioia.setText("gioia");

        detailedsong_tensione.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        detailedsong_tensione.setText("tensione");

        detailedsong_nostalgia.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        detailedsong_nostalgia.setText("nostalgia");

        detailedsong_tristezza.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        detailedsong_tristezza.setText("tristezza");

        jButton2.setText("Indietro");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
        jLabel12.setText("Stupore:");

        jLabel13.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
        jLabel13.setText("Solennità:");

        jLabel14.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
        jLabel14.setText("Tenerezza:");

        jLabel15.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
        jLabel15.setText("Calma:");

        detailedsong_stupore.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        detailedsong_stupore.setText("stupore");

        detailedsong_solennita.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        detailedsong_solennita.setText("solennità");

        detailedsong_tenerezza.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        detailedsong_tenerezza.setText("tenerezza");

        detailedsong_calma.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        detailedsong_calma.setText("calma");

        btn_addEmotions.setText("Aggiungi Emozioni");
        btn_addEmotions.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_addEmotionsActionPerformed(evt);
            }
        });

        btn_addToPlaylist.setText("Aggiungi a Playlist");
        btn_addToPlaylist.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_addToPlaylistActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel6))
                                .addGap(28, 28, 28)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(detailedsong_id)
                                    .addComponent(detailedsong_title)
                                    .addComponent(detailedsong_author)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(detailedsong_year)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 458, Short.MAX_VALUE)
                                        .addComponent(btn_addEmotions))))
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel11))
                                .addGap(45, 45, 45)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(detailedsong_tensione)
                                    .addComponent(detailedsong_gioia)
                                    .addComponent(detailedsong_potere)
                                    .addComponent(detailedsong_nostalgia)
                                    .addComponent(detailedsong_tristezza)
                                    .addComponent(detailedsong_stupore)
                                    .addComponent(detailedsong_solennita)
                                    .addComponent(detailedsong_tenerezza)
                                    .addComponent(detailedsong_calma)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(386, 386, 386)
                        .addComponent(jButton2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel12))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel13))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel14))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel15)))
                .addGap(51, 51, 51)
                .addComponent(btn_addToPlaylist)
                .addGap(63, 63, 63))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(detailedsong_id))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(detailedsong_title))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(detailedsong_author))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(detailedsong_year)
                    .addComponent(btn_addEmotions)
                    .addComponent(btn_addToPlaylist))
                .addGap(35, 35, 35)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(detailedsong_potere))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(detailedsong_gioia))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(detailedsong_tensione))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(detailedsong_nostalgia))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(detailedsong_tristezza))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(detailedsong_stupore))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(detailedsong_solennita))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(detailedsong_tenerezza))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(detailedsong_calma))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 197, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addGap(42, 42, 42))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        dispose();
        Search search = new Search();
        search.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void btn_addEmotionsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_addEmotionsActionPerformed
        dispose();
        AddEmotions addEmotions = new AddEmotions(id);
        addEmotions.setVisible(true);
    }//GEN-LAST:event_btn_addEmotionsActionPerformed

    private void btn_addToPlaylistActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_addToPlaylistActionPerformed

        ArrayList<String> results = utilities.getAllUserPlaylist(GlobalUserLogin.currentUsername);
        
        if (results == null) {
            javax.swing.JOptionPane.showMessageDialog(getContentPane(), "Non è possibile effettuare questa operazione, nessuna playlist disponibile.", "Attenzione", javax.swing.JOptionPane.WARNING_MESSAGE);
        } else {
            JComboBox playlistList = new JComboBox();
        
            for (String playlistname : results) {
                playlistList.addItem(playlistname);
            }

            final JComponent[] inputs = new JComponent[] {
                new JLabel("Scegli fra una delle tue playlist:"), 
                playlistList,
            };

            int result = JOptionPane.showConfirmDialog(null, inputs, "Scelta playlist", JOptionPane.PLAIN_MESSAGE);
            if (result == JOptionPane.OK_OPTION) {
                
                String playlist_name = playlistList.getSelectedItem().toString();
                int playlist_id = utilities.getPlaylistIdByName(playlist_name);
                Boolean check = utilities.checkIfSongInPlaylist(id, playlist_id);
                
                if (check) {
                    javax.swing.JOptionPane.showMessageDialog(getContentPane(), "Non è possibile effettuare questa operazione, in questa playlist è già presente questa canzone!", "Attenzione", javax.swing.JOptionPane.WARNING_MESSAGE);
                } else {
                    utilities.insertSongInPlaylist(id, playlist_id);
                    javax.swing.JOptionPane.showMessageDialog(getContentPane(), "Inserimento della canzone nella playlist completato.", "Completato", javax.swing.JOptionPane.INFORMATION_MESSAGE);
                }
            }
        }
    }//GEN-LAST:event_btn_addToPlaylistActionPerformed

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
            java.util.logging.Logger.getLogger(SongsDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SongsDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SongsDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SongsDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SongsDetails().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_addEmotions;
    private javax.swing.JButton btn_addToPlaylist;
    private javax.swing.JLabel detailedsong_author;
    private javax.swing.JLabel detailedsong_calma;
    private javax.swing.JLabel detailedsong_gioia;
    private javax.swing.JLabel detailedsong_id;
    private javax.swing.JLabel detailedsong_nostalgia;
    private javax.swing.JLabel detailedsong_potere;
    private javax.swing.JLabel detailedsong_solennita;
    private javax.swing.JLabel detailedsong_stupore;
    private javax.swing.JLabel detailedsong_tenerezza;
    private javax.swing.JLabel detailedsong_tensione;
    private javax.swing.JLabel detailedsong_title;
    private javax.swing.JLabel detailedsong_tristezza;
    private javax.swing.JLabel detailedsong_year;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}

