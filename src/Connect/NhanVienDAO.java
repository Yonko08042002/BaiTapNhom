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
/**
 *
 * @author ASUS
 */
public class NhanVienDAO {
    public List<nhanVien> getAllUsers() {
        List<nhanVien> ltl = new ArrayList<nhanVien>();

        Connection connection = JDBCConnection.JDBCConnection();
        String sql = "select * from AddNhanVien";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                nhanVien tl = new nhanVien();
                tl.setID(rs.getString("id"));
                tl.setName(rs.getString("ten"));
                tl.setSex(rs.getString("gioitinh"));
                tl.setAddress(rs.getString("diachi"));
                tl.setPhone(rs.getString("sdt"));
                tl.setEmail(rs.getString("email"));
                tl.setDateOfBirth(rs.getString("ngaysinh"));
                tl.setPosition(rs.getString("chucvu"));
                ltl.add(tl);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ltl;
    }
    public List<String> getAllId() {
        List<String> ltl = new ArrayList<String>();

        Connection connection = JDBCConnection.JDBCConnection();
        String sql = "select * from AddNhanVien";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                ltl.add(rs.getString("id"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ltl;
    }
    public void add(nhanVien tl){
     Connection connection = JDBCConnection.JDBCConnection();          
            String sql = "INSERT INTO AddNhanVien (id, ten, gioitinh, diachi, sdt,email, ngaysinh, chucvu) "
                    + "values (?,?,?,?,?,?,?,?) ";            
            try {
                PreparedStatement preparedStatement = connection.prepareStatement(sql);
                preparedStatement.setString(1, tl.getID());
                preparedStatement.setString(2, tl.getName());
                preparedStatement.setString(3, tl.getSex());
                preparedStatement.setString(4, tl.getAddress());
                preparedStatement.setString(5, tl.getPhone());
                preparedStatement.setString(6, tl.getEmail());
                preparedStatement.setString(7, tl.getDateOfBirth());
                preparedStatement.setString(8, tl.getPosition());
                
//                int rs = preparedStatement.executeUpdate();
//                System.out.println(rs);
                preparedStatement.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    //
    //
    public int updateUser(nhanVien tl){
        Connection connection = JDBCConnection.JDBCConnection();
        String sql = "Update AddNhanVien set ten = ? , gioitinh = ? , diachi = ? , sdt = ? , email = ? ,ngaysinh=?,chucvu=? where id = ? ";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(8, tl.getID());
            preparedStatement.setString(1, tl.getName());
            preparedStatement.setString(2, tl.getSex());
            preparedStatement.setString(3, tl.getAddress());
            preparedStatement.setString(4, tl.getPhone());
            preparedStatement.setString(5, tl.getEmail());
            preparedStatement.setString(6, tl.getDateOfBirth());
            preparedStatement.setString(7, tl.getPosition());
            
            if(preparedStatement.executeUpdate()>0){
                System.out.println("Update thành công!");
                return 1;
            };
        } catch (Exception e) {
            e.printStackTrace();
        }
        return -1;
    }
    public void delete(String id){
       Connection connection = JDBCConnection.JDBCConnection();
        String sql = "delete from AddNhanVien where id = ?";
        
        try{
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, id);           
            int rs = preparedStatement.executeUpdate();
                System.out.println(rs);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public ArrayList<nhanVien> findTaiLieu(String id){
        ArrayList<nhanVien> ql = new ArrayList<nhanVien>();
        Connection connection = JDBCConnection.JDBCConnection();
        String sql = "select * from AddNhanVien where id like ?";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1,"%"+id+"%");
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                nhanVien tl = new nhanVien();
                tl.setID(rs.getString("id"));
                tl.setName(rs.getString("ten"));
                tl.setSex(rs.getString("gioitinh"));
                tl.setAddress(rs.getString("diachi"));
                tl.setEmail(rs.getString("sdt"));
                tl.setEmail(rs.getString("email"));
                tl.setDateOfBirth(rs.getString("ngaysinh"));
                tl.setPosition(rs.getString("chucvu"));
                ql.add(tl);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ql;
    }
    public nhanVien find1TaiLieu(String id){
        nhanVien tl = new nhanVien();
        Connection connection = JDBCConnection.JDBCConnection();
        String sql = "select * from AddNhanVien where id like ?";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1,"%"+id+"%");
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                tl.setID(rs.getString("id"));
                tl.setName(rs.getString("ten"));
                tl.setSex(rs.getString("gioitinh"));
                tl.setAddress(rs.getString("diachi"));
                tl.setEmail(rs.getString("sdt"));
                tl.setEmail(rs.getString("email"));
                tl.setDateOfBirth(rs.getString("ngaysinh"));
                tl.setPosition(rs.getString("chucvu"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return tl;
    }
}
