/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package perpustakaan;

import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.sql.PreparedStatement;

public class MainView extends javax.swing.JFrame {

    Connector connector = new Connector();
    String selectedJudul = null;
    int selectedId = -1;

    public MainView() {
        initComponents();
        CBkategori.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{"judul", "genre", "penulis", "penerbit"}));
        loadTableData();
    }


    @SuppressWarnings("unchecked")
    private void loadTableData(){
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Id_buku");
        model.addColumn("Judul");
        model.addColumn("Genre");
        model.addColumn("Penulis");
        model.addColumn("Penerbit");
        model.addColumn("Lokasi");
        model.addColumn("Stock");
    try{
        String query = "Select * from buku";
        connector.statement = connector.koneksi.createStatement();
        ResultSet rs = connector.statement.executeQuery(query);
        
        while(rs.next()){
            model.addRow(new Object[]{
            rs.getInt("id_buku"),
            rs.getString("judul"),
            rs.getString("genre"),
            rs.getString("penulis"),
            rs.getString("penerbit"),
            rs.getString("lokasi"),
            rs.getString("stock")
            });
        }
        tabeldata.setModel(model);
        
    }catch(SQLException e){
        JOptionPane.showMessageDialog(this, "gagal memuat data" + e.getMessage());
    }
    
    }
    
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tabeldata = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        Fid = new javax.swing.JTextField();
        Fjudul = new javax.swing.JTextField();
        Fgenre = new javax.swing.JTextField();
        Fpenulis = new javax.swing.JTextField();
        Fpenerbit = new javax.swing.JTextField();
        Flokasi = new javax.swing.JTextField();
        Fstock = new javax.swing.JTextField();
        btnsimpan = new javax.swing.JButton();
        btnedit = new javax.swing.JButton();
        btnhapus = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        Fsearch = new javax.swing.JTextField();
        btnsearch = new javax.swing.JButton();
        CBkategori = new javax.swing.JComboBox<>();
        btntampilkan = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tabeldata.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "JUDUL", "GENRE", "PENULIS", "PENERBIT", "LOKASI", "STOCK"
            }
        ));
        tabeldata.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabeldataMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabeldata);

        jLabel1.setText("ID");

        jLabel2.setText("JUDUL");

        jLabel3.setText("GENRE");

        jLabel4.setText("PENULIS");

        jLabel5.setText("PENERBIT");

        jLabel6.setText("STOCK");

        jLabel7.setText("LOKASI");

        Fid.setEditable(false);
        Fid.setEnabled(false);
        Fid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FidActionPerformed(evt);
            }
        });

        Fgenre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FgenreActionPerformed(evt);
            }
        });

        btnsimpan.setText("SIMPAN");
        btnsimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsimpanActionPerformed(evt);
            }
        });

        btnedit.setText("EDIT");
        btnedit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneditActionPerformed(evt);
            }
        });

        btnhapus.setText("HAPUS");
        btnhapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnhapusActionPerformed(evt);
            }
        });

        jLabel8.setText("CARI BUKU");

        Fsearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FsearchActionPerformed(evt);
            }
        });

        btnsearch.setText("CARI");
        btnsearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsearchActionPerformed(evt);
            }
        });

        CBkategori.setEditable(true);
        CBkategori.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        CBkategori.setAutoscrolls(true);
        CBkategori.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                CBkategoriItemStateChanged(evt);
            }
        });
        CBkategori.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CBkategoriActionPerformed(evt);
            }
        });

        btntampilkan.setText("TAMPILKAN");
        btntampilkan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btntampilkanActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 24)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("PERPUSTAKAAN UMUM YOGYAKARTA");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel7)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Fjudul, javax.swing.GroupLayout.DEFAULT_SIZE, 189, Short.MAX_VALUE)
                    .addComponent(Fid)
                    .addComponent(Fgenre)
                    .addComponent(Fpenulis)
                    .addComponent(Fpenerbit)
                    .addComponent(Flokasi)
                    .addComponent(Fstock))
                .addGap(58, 58, 58)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnhapus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnedit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnsimpan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btntampilkan, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addComponent(jScrollPane1)
                .addGap(17, 17, 17))
            .addGroup(layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 542, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Fsearch, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(CBkategori, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnsearch)
                .addContainerGap(123, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(13, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel8)
                        .addComponent(Fsearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnsearch)
                        .addComponent(CBkategori, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(Fid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(Fjudul, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2))
                                .addGap(23, 23, 23)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(Fgenre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel4)
                                    .addComponent(Fpenulis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(23, 23, 23)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel5)
                                    .addComponent(Fpenerbit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(25, 25, 25)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel7)
                                    .addComponent(Flokasi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(21, 21, 21))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(13, 13, 13)
                                .addComponent(btnsimpan, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(35, 35, 35)
                                .addComponent(btnedit, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnhapus, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(42, 42, 42)
                                .addComponent(btntampilkan, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Fstock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addGap(89, 89, 89))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnsimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsimpanActionPerformed
        if (!isInputValid()) {
            return;
        }
        try {
            String query = "INSERT INTO buku (judul, genre, penulis, penerbit, lokasi, stock) VALUES ('" + Fjudul.getText() + "', '" + Fgenre.getText() + "', '" + Fpenulis.getText() + "', '" + Fpenerbit.getText() + "', '" + Flokasi.getText() + "', '" + Fstock.getText() + "')";
            connector.statement = connector.koneksi.createStatement();
            connector.statement.executeUpdate(query);
            System.out.println("Input Berhasil");
            JOptionPane.showMessageDialog(null, "Input Sukses");
            
            loadTableData();
            clearField();
        } catch(Exception ex){
            System.out.println(ex.getMessage());
        }
    
    }//GEN-LAST:event_btnsimpanActionPerformed

    private void FgenreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FgenreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FgenreActionPerformed

    private void FidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FidActionPerformed

    
    private void btneditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneditActionPerformed
       if(selectedId == -1){
            JOptionPane.showMessageDialog(this, "pilih data yg mau di edit!");
        }
       if (!isInputValid()) {
        return;
        }
        try{
            String query = "UPDATE buku SET judul = ?," + "genre = ?," + "penulis = ?," + "penerbit = ?," + "lokasi = ?," + "stock = ? WHERE id_buku = ?";
            PreparedStatement ps = connector.koneksi.prepareStatement(query);
            ps.setString(1, Fjudul.getText());
            ps.setString(2, Fgenre.getText());
            ps.setString(3, Fpenulis.getText());
            ps.setString(4, Fpenerbit.getText());
            ps.setString(5, Flokasi.getText());
            ps.setString(6, Fstock.getText());
            ps.setInt(7, selectedId);
            
            int update = ps.executeUpdate();
            if(update > 0){
                JOptionPane.showMessageDialog(this, "data berhasil di edit");
                
                loadTableData();
                clearField();
            }
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(this, "data gagal di edit" + ex.getMessage());
       }
    }//GEN-LAST:event_btneditActionPerformed

    private void btnhapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnhapusActionPerformed
        if(selectedId == -1){
            JOptionPane.showMessageDialog(this, "pilih data yg mau di hapus!");
        }
        
        int confirm = JOptionPane.showConfirmDialog(this, "Yakin ingin menghapus data ini?");
        if(confirm == JOptionPane.YES_OPTION){
            try{
            String query = "DELETE FROM buku WHERE id_buku = ?";
            PreparedStatement ps = connector.koneksi.prepareStatement(query);
            ps.setInt(1, selectedId);
            
            int deleted = ps.executeUpdate();
            if(deleted > 0){
                JOptionPane.showMessageDialog(this, "data berhasil di hapus");
                
                loadTableData();
                clearField();
            }
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(this, "data gagal di hapus" + ex.getMessage());
        }
        }
    }//GEN-LAST:event_btnhapusActionPerformed

    private void tabeldataMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabeldataMouseClicked
         int row = tabeldata.getSelectedRow();
         selectedId = Integer.parseInt(tabeldata.getValueAt(row, 0).toString()); // Ubah dulu!
        Fid.setText(tabeldata.getValueAt(row, 0).toString()); // Baru tampilkan
        Fjudul.setText(tabeldata.getValueAt(row, 1).toString());
        Fgenre.setText(tabeldata.getValueAt(row, 2).toString());
        Fpenulis.setText(tabeldata.getValueAt(row, 3).toString());
        Fpenerbit.setText(tabeldata.getValueAt(row, 4).toString());
        Flokasi.setText(tabeldata.getValueAt(row, 5).toString());
        Fstock.setText(tabeldata.getValueAt(row, 6).toString());
    }//GEN-LAST:event_tabeldataMouseClicked

    private void CBkategoriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CBkategoriActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CBkategoriActionPerformed

    private void FsearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FsearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FsearchActionPerformed

    private void btnsearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsearchActionPerformed

        String kategori = CBkategori.getSelectedItem().toString(); // Ambil kategori pencarian
        String keyword = Fsearch.getText(); // Ambil keyword pencarian

    DefaultTableModel tbl = new DefaultTableModel();
    tbl.addColumn("ID");
    tbl.addColumn("Judul");
    tbl.addColumn("Genre");
    tbl.addColumn("Penulis");
    tbl.addColumn("Penerbit");
    tbl.addColumn("Lokasi");
    tbl.addColumn("Stock");

    try {
        // Query menggunakan prepared statement dengan parameter untuk mencegah SQL Injection  
        String sql = "SELECT * FROM buku WHERE " + kategori + " LIKE ?";
        PreparedStatement ps = connector.koneksi.prepareStatement(sql);
        ps.setString(1, "%" + keyword + "%");
        ResultSet res = ps.executeQuery();

        // Loop untuk memasukkan hasil query ke tabel model  
        while (res.next()) {
            tbl.addRow(new Object[]{
                res.getInt("id_buku"),
                res.getString("judul"),
                res.getString("genre"),
                res.getString("penulis"),
                res.getString("penerbit"),
                res.getString("lokasi"),
                res.getString("stock")
            });
        }

        // Set model tabel data dengan hasil pencarian  
        tabeldata.setModel(tbl);
        clearField();

    } catch (SQLException e) {
        JOptionPane.showMessageDialog(this, "Gagal mencari data: " + e.getMessage());
    }
    }//GEN-LAST:event_btnsearchActionPerformed

    private void btntampilkanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btntampilkanActionPerformed
       loadTableData();
    }//GEN-LAST:event_btntampilkanActionPerformed

    private void CBkategoriItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_CBkategoriItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_CBkategoriItemStateChanged

    private void clearField(){
        Fjudul.setText("");
        Fgenre.setText("");
        Fpenulis.setText("");
        Fpenerbit.setText("");
        Flokasi.setText("");
        Fstock.setText("");
        Fsearch.setText("");
        selectedId = -1;
        selectedJudul = null;
    }

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainView().setVisible(true);
            }
        });
    }
    
    private boolean isInputValid() {
    if (Fjudul.getText().isEmpty() || 
        Fgenre.getText().isEmpty() || 
        Fpenulis.getText().isEmpty() || 
        Fpenerbit.getText().isEmpty() || 
        Flokasi.getText().isEmpty() || 
        Fstock.getText().isEmpty()){
        JOptionPane.showMessageDialog(this, "Semua field harus diisi!", "Input Tidak Valid", JOptionPane.WARNING_MESSAGE);
        return false;
    }
    return true;
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> CBkategori;
    private javax.swing.JTextField Fgenre;
    private javax.swing.JTextField Fid;
    private javax.swing.JTextField Fjudul;
    private javax.swing.JTextField Flokasi;
    private javax.swing.JTextField Fpenerbit;
    private javax.swing.JTextField Fpenulis;
    private javax.swing.JTextField Fsearch;
    private javax.swing.JTextField Fstock;
    private javax.swing.JButton btnedit;
    private javax.swing.JButton btnhapus;
    private javax.swing.JButton btnsearch;
    private javax.swing.JButton btnsimpan;
    private javax.swing.JButton btntampilkan;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabeldata;
    // End of variables declaration//GEN-END:variables
}
