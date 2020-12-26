/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.teater;

/**
 *
 * @author adima
 */
import java.sql.*;
public class koneksiDB {
    
public Connection conn;
public Statement st;
public ResultSet rs;
public PreparedStatement pst;

public void koneksi() //fungsi koneksi
{
konek(); //memanggil fungsi konek() untuk melakukan koneksi
}

public void konek() //program untuk melakukan koneksi
{
System.out.println("Keterangan");

try//memanggil driver
{
Class.forName("com.mysql.jdbc.Driver");
}
catch (ClassNotFoundException e)
{
System.out.println(
"Ada kesalahan Driver JDBC tidak berhasil Load");
return;
}

System.out.println("Mysql JDBC Driver berhasil di Load");
conn = null;

try {
conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/datateater","root","");
}
catch (SQLException e) {
System.out.println("tidak bisa koneksi ke database");
return;
}

if (conn != null)
{
System.out.println("berhasil koneksi!");
}
else
{
System.out.println("koneksi gagal");
}
}

}
