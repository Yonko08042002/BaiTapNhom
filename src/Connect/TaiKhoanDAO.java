/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Connect;
import model.nhanVien;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.taiKhoan;

public class TaiKhoanDAO {
    public List<taiKhoan> getAllUsers() {
        List<taiKhoan> ltl = new ArrayList<taiKhoan>();

        Connection connection = JDBCConnection.JDBCConnection();
        String sql = "select * from TaiKhoan";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                taiKhoan tl = new taiKhoan();
                tl.setName(rs.getString("ten"));
                tl.setUsername(rs.getString("username"));
                tl.setPassword(rs.getString("pass"));
                tl.setConfirmpassword(rs.getString("confirmpassword"));
                tl.setAddress(rs.getString("diachi"));
                tl.setPhone(rs.getString("sdt"));
                tl.setEmail(rs.getString("email"));
                
                ltl.add(tl);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ltl;
    }

    //
    public void addTaiKhoan(taiKhoan tk){
     Connection connection = JDBCConnection.JDBCConnection();          
            String sql = "INSERT INTO TaiKhoan (ten, username, pass, confirmpassword, diachi, sdt,email) "
                    + "values (?,?,?,?,?,?,?) ";            
            try {
                PreparedStatement preparedStatement = connection.prepareStatement(sql);
                preparedStatement.setString(1, tk.getName());
                preparedStatement.setString(2, tk.getUsername());
                preparedStatement.setString(3, tk.getPassword());
                preparedStatement.setString(4, tk.getConfirmpassword());
                preparedStatement.setString(5, tk.getAddress());
                preparedStatement.setString(6, tk.getPhone());
                preparedStatement.setString(7, tk.getEmail());
                
//                int rs = preparedStatement.executeUpdate();
//                System.out.println(rs);
                preparedStatement.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    //
 
}
