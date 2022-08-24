package users;

import emotionalsongs.EmotionalSongs;
import songs.Search;
import playlists.Playlists;
import java.awt.Cursor;
import java.awt.Font;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import utilities.GlobalUserLogin;
import utilities.Utilities;

/**
 *
 * @author andre
 */
public class LoggedPanel extends javax.swing.JFrame {

    Utilities utilities = new Utilities();
    
    /**
     * Creates new form LoggedPanel
     */
    public LoggedPanel() {
        initComponents();
        
        label_welcome.setText("Benvenuto, " + GlobalUserLogin.currentUsername + "");
        label_personalinfo.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        label_personalinfo.setText("<HTML><U>Le mie info</U></HTML>");
        
        Utilities.setLogo(this);
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
        btn_findsong = new javax.swing.JButton();
        btn_playlist = new javax.swing.JButton();
        label_welcome = new javax.swing.JLabel();
        label_personalinfo = new javax.swing.JLabel();
        btn_back = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Pannello utente");

        btn_findsong.setText(" Cerca canzone");
        btn_findsong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_findsongActionPerformed(evt);
            }
        });

        btn_playlist.setText("Playlist");
        btn_playlist.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_playlistActionPerformed(evt);
            }
        });

        label_welcome.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        label_welcome.setText("bienvenido");

        label_personalinfo.setForeground(new java.awt.Color(102, 0, 153));
        label_personalinfo.setText("Le mie info");
        label_personalinfo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                label_personalinfoMouseClicked(evt);
            }
        });

        btn_back.setText("Indietro");
        btn_back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_backActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label_personalinfo)
                    .addComponent(btn_back))
                .addGap(304, 304, 304))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(146, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btn_findsong)
                        .addGap(79, 79, 79)
                        .addComponent(btn_playlist)
                        .addGap(225, 225, 225))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(label_welcome)
                        .addGap(292, 292, 292))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addComponent(label_welcome)
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_playlist)
                    .addComponent(btn_findsong))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addComponent(label_personalinfo)
                .addGap(44, 44, 44)
                .addComponent(btn_back)
                .addGap(32, 32, 32))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void label_personalinfoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label_personalinfoMouseClicked

        ArrayList<String> results = utilities.getAllUserInfo(GlobalUserLogin.currentUsername);
        Font font = new Font("Arial Black", Font.ITALIC, 12);
        
        JLabel nome = new JLabel("Nome:", SwingConstants.CENTER);
        nome.setFont(font);

        JLabel cognome = new JLabel("Cognome:", SwingConstants.CENTER);
        cognome.setFont(font);
        
        JLabel cf = new JLabel("CF:", SwingConstants.CENTER);
        cf.setFont(font);

        JLabel indirizzo = new JLabel("Indirizzo:", SwingConstants.CENTER);
        indirizzo.setFont(font);

        JLabel email = new JLabel("Email:", SwingConstants.CENTER);
        email.setFont(font);
        
        final JComponent[] inputs = new JComponent[] {
            nome,
            new JLabel(results.get(0), SwingConstants.CENTER),
            cognome,
            new JLabel(results.get(1), SwingConstants.CENTER),
            cf,
            new JLabel(results.get(2), SwingConstants.CENTER),
            indirizzo,
            new JLabel(results.get(3), SwingConstants.CENTER),
            email,
            new JLabel(results.get(4), SwingConstants.CENTER)
        };

        JOptionPane.showConfirmDialog(null, inputs, "Le mie info", JOptionPane.PLAIN_MESSAGE);
    }//GEN-LAST:event_label_personalinfoMouseClicked

    private void btn_backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_backActionPerformed
        GlobalUserLogin.isUserLogged = false;
        GlobalUserLogin.currentUsername = null;
        dispose();
        EmotionalSongs emotionalSongs = new EmotionalSongs();
        emotionalSongs.setVisible(true);
    }//GEN-LAST:event_btn_backActionPerformed

    private void btn_findsongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_findsongActionPerformed
        dispose();
        Search search = new Search();
        search.setVisible(true);
    }//GEN-LAST:event_btn_findsongActionPerformed

    private void btn_playlistActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_playlistActionPerformed
        dispose();
        Playlists playlists = new Playlists();
        playlists.setVisible(true);
    }//GEN-LAST:event_btn_playlistActionPerformed

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
            java.util.logging.Logger.getLogger(LoggedPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoggedPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoggedPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoggedPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoggedPanel().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_back;
    private javax.swing.JButton btn_findsong;
    private javax.swing.JButton btn_playlist;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel label_personalinfo;
    private javax.swing.JLabel label_welcome;
    // End of variables declaration//GEN-END:variables
}
