/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Connect;
import java.sql.Connection;
import java.sql.DriverManager;
/**
 *
 * @author ASUS
 */
public class JDBCConnection {
    public static Connection JDBCConnection() {
        //Thày đổi theo máy của moin người
        final String Url = "jdbc:sqlserver://THUYDUNG\\SQLEXPRESS:1433;databaseName=QuanLyLuongNv";
        final String user = "sa";
        final String pass = "k2cr2o7.h2fsbf6";
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            return DriverManager.getConnection(Url, user, pass);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
      return null;
    }
    public static void main(String[] args){
    Connection connection = JDBCConnection();
       if (connection !=  null){
           System.out.println("thanh cong");
       }
       else 
            System.out.println("that bai");
    }
}