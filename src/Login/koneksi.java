/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package login;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;


/**
 *
 * @author Dimas Aulia
 */
public class koneksi {

    Connection koneksi = null;

    public static Connection koneksiDb() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection koneksi
                    = DriverManager.getConnection("jdbc:mysql://localhost/crudjava", "root", "");
            return koneksi;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
    }
}

/**
 *
 * @author Dimas Aulia
 */

