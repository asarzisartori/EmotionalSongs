package core;

import utilities.Utilities;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 * Classe che gestisce la pagina per la ricerca delle canzoni
 * @author Cervini Samuele
 * @author Sarzi Sartori Andrea
 */
public class Search extends javax.swing.JFrame {

    Utilities utilities = new Utilities();
    
    /**
     * Viene creato il nuovo form della classe
     */
    public Search() {
        initComponents();
        
        //La ricerca è impostata di default su quella del Nome
        searchauthor_label.setVisible(false);
        authorsong_textfield.setVisible(false);
        searchyear_label.setVisible(false);
        yearsong_textfield.setVisible(false);
        btn_searchByAuthorYear.setVisible(false);
        
        listbox.removeColumn(listbox.getColumnModel().getColumn(0));
        
        listbox.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                String value = listbox.getModel().getValueAt(listbox.getSelectedRow(), 0).toString();
                dispose();
                SongsDetails loggedDetailedSong = new SongsDetails(value);
                loggedDetailedSong.setVisible(true);
            }
        });
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        jRadioButtonMenuItem1 = new javax.swing.JRadioButtonMenuItem();
        titlesong_textfield = new javax.swing.JTextField();
        btn_searchByName = new javax.swing.JButton();
        btn_back = new javax.swing.JButton();
        searchname_label = new javax.swing.JLabel();
        searchauthor_label = new javax.swing.JLabel();
        authorsong_textfield = new javax.swing.JTextField();
        searchyear_label = new javax.swing.JLabel();
        yearsong_textfield = new javax.swing.JTextField();
        btn_searchByAuthorYear = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        listbox = new javax.swing.JTable();
        jCheckBox1 = new javax.swing.JCheckBox();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable1);

        jRadioButtonMenuItem1.setSelected(true);
        jRadioButtonMenuItem1.setText("jRadioButtonMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Ricerca");

        titlesong_textfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                titlesong_textfieldActionPerformed(evt);
            }
        });

        btn_searchByName.setText("Ricerca");
        btn_searchByName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_searchByNameActionPerformed(evt);
            }
        });

        btn_back.setText("Indietro");
        btn_back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_backActionPerformed(evt);
            }
        });

        searchname_label.setText("TITOLO");

        searchauthor_label.setText("AUTORE");

        authorsong_textfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                authorsong_textfieldActionPerformed(evt);
            }
        });

        searchyear_label.setText("ANNO");

        yearsong_textfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yearsong_textfieldActionPerformed(evt);
            }
        });

        btn_searchByAuthorYear.setText("Ricerca");
        btn_searchByAuthorYear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_searchByAuthorYearActionPerformed(evt);
            }
        });

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
        if (listbox.getColumnModel().getColumnCount() > 0) {
            listbox.getColumnModel().getColumn(0).setResizable(false);
            listbox.getColumnModel().getColumn(1).setResizable(false);
            listbox.getColumnModel().getColumn(2).setResizable(false);
            listbox.getColumnModel().getColumn(3).setResizable(false);
        }

        jCheckBox1.setText("Autore/Anno");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(318, 318, 318)
                        .addComponent(jCheckBox1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(95, 95, 95)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(searchauthor_label)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(authorsong_textfield, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(searchyear_label)
                                        .addGap(18, 18, 18)
                                        .addComponent(yearsong_textfield, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(searchname_label)
                                        .addGap(18, 18, 18)
                                        .addComponent(titlesong_textfield, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btn_searchByAuthorYear, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btn_searchByName, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(339, 339, 339)
                        .addComponent(btn_back)))
                .addContainerGap(125, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(titlesong_textfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_searchByName)
                    .addComponent(searchname_label, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_searchByAuthorYear)
                    .addComponent(yearsong_textfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(authorsong_textfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchyear_label)
                    .addComponent(searchauthor_label, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addComponent(jCheckBox1)
                .addGap(31, 31, 31)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                .addComponent(btn_back)
                .addGap(20, 20, 20))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_searchByNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_searchByNameActionPerformed

        DefaultTableModel listModel = (DefaultTableModel)listbox.getModel();
         
        String searchedName = titlesong_textfield.getText();
        
        if (!searchedName.equals("")) {
            
            ArrayList<Object[]> results = utilities.getSongsByTitle(searchedName);        

            if (results != null) {

                listModel.setRowCount(0);

                for (Object[] item : results)
                {
                    listModel.addRow(item);
                }       
            }
            else
            {
                listModel.setRowCount(0);
                javax.swing.JOptionPane.showMessageDialog(getContentPane(), "La ricerca con " + searchedName + " non ha prodotto alcun risultato!", "Attenzione", javax.swing.JOptionPane.WARNING_MESSAGE);
            }       
        } else {
            listModel.setRowCount(0);
            javax.swing.JOptionPane.showMessageDialog(getContentPane(), "Popolare il campo del titolo per preseguire con la ricerca!", "Attenzione", javax.swing.JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btn_searchByNameActionPerformed

    private void btn_backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_backActionPerformed
        dispose();
        EmotionalSongs emotionalSongs = new EmotionalSongs();
        emotionalSongs.setVisible(true);
    }//GEN-LAST:event_btn_backActionPerformed

    private void yearsong_textfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yearsong_textfieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_yearsong_textfieldActionPerformed

    private void authorsong_textfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_authorsong_textfieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_authorsong_textfieldActionPerformed

    private void btn_searchByAuthorYearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_searchByAuthorYearActionPerformed
       
        DefaultTableModel listModel = (DefaultTableModel)listbox.getModel();
        
        String author = authorsong_textfield.getText();
        String year = yearsong_textfield.getText();
        
        Boolean yearIsNumeric;
        
        try {
            Integer.parseInt(year);
            yearIsNumeric = true;
        } catch (Exception e) {
            yearIsNumeric = false;
        }
        
        if (!author.equals("") && !year.equals("") && yearIsNumeric) {
            
            ArrayList<Object[]> results = utilities.GetSongsByAuthorsAndYears(author, year);        

            if (results != null) {

                listModel.setRowCount(0);

                for (Object[] item : results)
                {
                    listModel.addRow(item);
                }       
            }
            else
            {
                listModel.setRowCount(0);
                javax.swing.JOptionPane.showMessageDialog(getContentPane(), "La combinazione tra " + author + " e " + year + " non ha prodotto alcun risultato!", "Attenzione", javax.swing.JOptionPane.WARNING_MESSAGE);
            }       
        }
        else if ((author.equals("") && !year.equals("")))
        {
            if (yearIsNumeric) {
                listModel.setRowCount(0);
                javax.swing.JOptionPane.showMessageDialog(getContentPane(), "Popolare il campo dell'autore per preseguire con la ricerca!", "Attenzione", javax.swing.JOptionPane.WARNING_MESSAGE);
            } else {
                listModel.setRowCount(0);
                javax.swing.JOptionPane.showMessageDialog(getContentPane(), "Popolare il campo dell'autore e scegliere un numero nel campo dell'anno per preseguire con la ricerca!", "Attenzione", javax.swing.JOptionPane.WARNING_MESSAGE);
            }
        } else if ((!author.equals("") && year.equals("")))
        {
            listModel.setRowCount(0);
            javax.swing.JOptionPane.showMessageDialog(getContentPane(), "Popolare il campo dell'anno per preseguire con la ricerca!", "Attenzione", javax.swing.JOptionPane.WARNING_MESSAGE);
        } else if ((author.equals("") && year.equals("")))
        {
            listModel.setRowCount(0);
            javax.swing.JOptionPane.showMessageDialog(getContentPane(), "Popolare il campo dell'autore e dell'anno per preseguire con la ricerca!", "Attenzione", javax.swing.JOptionPane.WARNING_MESSAGE);
        } else if ((!author.equals("") && !year.equals("")) && !yearIsNumeric)
        {
            listModel.setRowCount(0);
            javax.swing.JOptionPane.showMessageDialog(getContentPane(), "Scegliere un numero nel campo dell'anno per preseguire con la ricerca!", "Attenzione", javax.swing.JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btn_searchByAuthorYearActionPerformed

    private void titlesong_textfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_titlesong_textfieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_titlesong_textfieldActionPerformed

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        
        DefaultTableModel listModel = (DefaultTableModel)listbox.getModel();
        listModel.setRowCount(0);
        
        if (!jCheckBox1.isSelected()) {
            
            //Autore-Anno OFF
            searchauthor_label.setVisible(false);
            authorsong_textfield.setVisible(false);
            searchyear_label.setVisible(false);
            yearsong_textfield.setVisible(false);
            btn_searchByAuthorYear.setVisible(false);

            //Nome ON
            searchname_label.setVisible(true);
            titlesong_textfield.setVisible(true);
            btn_searchByName.setVisible(true);

        } else {

            //Autore-Anno ON
            searchauthor_label.setVisible(true);
            authorsong_textfield.setVisible(true);
            searchyear_label.setVisible(true);
            yearsong_textfield.setVisible(true);
            btn_searchByAuthorYear.setVisible(true);

            //Nome OFF
            searchname_label.setVisible(false);
            titlesong_textfield.setVisible(false);
            btn_searchByName.setVisible(false);
        }
    }//GEN-LAST:event_jCheckBox1ActionPerformed

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
            java.util.logging.Logger.getLogger(Search.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Search.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Search.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Search.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Search().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField authorsong_textfield;
    private javax.swing.JButton btn_back;
    private javax.swing.JButton btn_searchByAuthorYear;
    private javax.swing.JButton btn_searchByName;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable listbox;
    private javax.swing.JLabel searchauthor_label;
    private javax.swing.JLabel searchname_label;
    private javax.swing.JLabel searchyear_label;
    private javax.swing.JTextField titlesong_textfield;
    private javax.swing.JTextField yearsong_textfield;
    // End of variables declaration//GEN-END:variables
}
