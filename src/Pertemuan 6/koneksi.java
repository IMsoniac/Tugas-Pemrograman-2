/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pert6;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author User
 */
public class koneksi {
    private static Connection  mysqlconfig;
    public static Connection configDB(){
        try{
            String url="jdbc:mysql://localhost/penjualan_rumah";
            String user="root";
            String pass="";
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            mysqlconfig=DriverManager.getConnection(url, user, pass);
        }catch (Exception e){
            System.err.println("Koneksi gagal "+e.getMessage());
        }
        return mysqlconfig;
    }
}
