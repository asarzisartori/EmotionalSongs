package playlists;

import utilities.Utilities;
import java.util.ArrayList;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author andre
 */
public class PlaylistsDetails extends javax.swing.JFrame {

    Utilities utilities = new Utilities();
    private int idPlaylist;
    private String currentSongId = null;
    
    /**
     * Creates new form PlaylistsDetails
     */
    public PlaylistsDetails() {
        initComponents();
        Utilities.setLogo(this);
    }
    
    public PlaylistsDetails(int value) {
        initComponents();
        Utilities.setLogo(this);
        
        this.idPlaylist = value;
        
        ArrayList<Object[]> playlistlist = utilities.getSongsByPlaylist(value);
        listbox.removeColumn(listbox.getColumnModel().getColumn(0));
        
        listbox.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                currentSongId = listbox.getModel().getValueAt(listbox.getSelectedRow(), 0).toString();
            }
        });

        if (playlistlist != null) {

            DefaultTableModel listModel = (DefaultTableModel)listbox.getModel();
            listModel.setRowCount(0);

            for (Object[] item : playlistlist)
            {
                listModel.addRow(item);
            }       
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
        jScrollPane3 = new javax.swing.JScrollPane();
        listbox = new javax.swing.JTable();
        btn_deleteSong = new javax.swing.JButton();
        btn_deletePlaylist = new javax.swing.JButton();
        btn_back = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Dettaglio playlist");

        listbox.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Titolo", "Autore", "Anno"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        listbox.getTableHeader().setReorderingAllowed(false);
        jScrollPane3.setViewportView(listbox);

        btn_deleteSong.setText("Elimina Canzone");
        btn_deleteSong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_deleteSongActionPerformed(evt);
            }
        });

        btn_deletePlaylist.setText("Elimina Playlist");
        btn_deletePlaylist.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_deletePlaylistActionPerformed(evt);
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
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(315, 315, 315)
                .addComponent(btn_deleteSong)
                .addGap(101, 101, 101)
                .addComponent(btn_deletePlaylist)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(256, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(233, 233, 233))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btn_back)
                        .addGap(418, 418, 418))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(53, 124, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_deleteSong)
                            .addComponent(btn_deletePlaylist))
                        .addGap(44, 44, 44)))
                .addComponent(btn_back)
                .addGap(31, 31, 31))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_deleteSongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_deleteSongActionPerformed
        if (currentSongId != null) {
            utilities.deleteSinglePlaylistSong(currentSongId, idPlaylist);
            currentSongId = null;
            
            ArrayList<Object[]> updated_playlistlist = utilities.getSongsByPlaylist(idPlaylist);
            DefaultTableModel listModel = (DefaultTableModel)listbox.getModel();    
            
            if (updated_playlistlist != null) {    
               
                listModel.setRowCount(0);

                for (Object[] item : updated_playlistlist)
                {
                    listModel.addRow(item);
                }       
            } else {
                listModel.removeRow(0);
            }
        }
    }//GEN-LAST:event_btn_deleteSongActionPerformed

    private void btn_deletePlaylistActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_deletePlaylistActionPerformed
        
        JTextField delete_tf = new JTextField();
        final JComponent[] inputs = new JComponent[] {
                new JLabel("Scrivi 'DELETE' per confermare la cancellazione"),
                delete_tf,
        };
        int result = JOptionPane.showConfirmDialog(null, inputs, "Eliminazione playlist", JOptionPane.PLAIN_MESSAGE);
       
        if (result == JOptionPane.OK_OPTION) {
            if ("delete".equals(delete_tf.getText().toLowerCase())) {
                utilities.deletePlaylist(idPlaylist);
                dispose();
                Playlists playlist = new Playlists();
                playlist.setVisible(true);
                
            } else {
                javax.swing.JOptionPane.showMessageDialog(getContentPane(), "Non è stata inserita la parola corretta!", "Attenzione", javax.swing.JOptionPane.WARNING_MESSAGE);
            }
        }
    }//GEN-LAST:event_btn_deletePlaylistActionPerformed

    private void btn_backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_backActionPerformed
        dispose();
        Playlists playlist = new Playlists();
        playlist.setVisible(true);
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
            java.util.logging.Logger.getLogger(PlaylistsDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PlaylistsDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PlaylistsDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PlaylistsDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PlaylistsDetails().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_back;
    private javax.swing.JButton btn_deletePlaylist;
    private javax.swing.JButton btn_deleteSong;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable listbox;
    // End of variables declaration//GEN-END:variables
}
