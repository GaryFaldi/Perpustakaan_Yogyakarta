/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package perpustakaan;

import java.sql.*;
import javax.swing.*;

public class ViewOutput {
    Connector connector = new Connector();
    
    String data[][] = new String[500][2];
    
    JFrame window = new JFrame("PERPUSTAKAAN");
    JTable tabel;
    JScrollPane scrollPane;
    
    //membuat kolom
    Object namaKolom[] = {"ID","JUDUL","GENRE","PENULIS","PENERBIT","LOKASI","STOCK"};
    public ViewOutput(){
        window.setLayout(null);
        window.setSize(550,600);
        window.setVisible(true);
        window.setLocationRelativeTo(null);
        window.setResizable(false);
        
        try{
            int jmlData = 0;
            String query = "Select * from buku";
            connector.statement = connector.koneksi.createStatement();
            ResultSet resultset = connector.statement.executeQuery(query);
            
            while(resultset.next()){
                data[jmlData][0] = resultset.getString("id");
                data[jmlData][1] = resultset.getString("judul");
                data[jmlData][2] = resultset.getString("genre");
                data[jmlData][3] = resultset.getString("penulis");
                data[jmlData][4] = resultset.getString("penerbit");
                data[jmlData][5] = resultset.getString("lokasi");
                data[jmlData][6] = resultset.getString("stock");
                
                jmlData++;
            }
            connector.statement.close();
        }catch(SQLException e){
            System.out.println(e.getMessage());
            System.out.println("SQL Error");
        }
        
        tabel = new JTable(data, namaKolom);
        scrollPane = new JScrollPane(tabel);
        window.add(scrollPane);
        
        scrollPane.setBounds(20, 35, 500, 300);
        scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
    }
}
