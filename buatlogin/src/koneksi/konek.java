/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package koneksi;
import com.mysql.jdbc.Driver;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
/**
 *
 * @author zakcy
 */
public class konek {
    public ResultSet rs;
    private static Connection koneksi;
    public static Connection GetConnection()throws SQLException{
        if (koneksi==null){
            Driver driver = new Driver();
            koneksi = DriverManager.getConnection("jdbc:mysql://localhost:3306/user_db","root","");
        }
        return koneksi;
    }
}
