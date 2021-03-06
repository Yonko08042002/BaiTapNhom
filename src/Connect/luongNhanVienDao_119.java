/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Connect;

import model.nhanVien_312;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.taiKhoan_118_101;
/**
 *
 * @author dell
 */
public class luongNhanVienDao_119 {
    public List<nhanVien_312> getAllUsers() {
        List<nhanVien_312> ltl = new ArrayList<nhanVien_312>();

        Connection connection = JDBCConnection_101.JDBCConnection();
        String sql = "select *, luongCoBan+luongThuong as luongNhan from AddNhanVien";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                nhanVien_312 tl = new nhanVien_312();
                tl.setID(rs.getString("id"));
                tl.setName(rs.getString("ten"));
                tl.setPosition(rs.getString("chucVu"));
                tl.setEmail(rs.getString("email"));
                tl.setLuongcb(rs.getDouble("luongcoban"));
                tl.setLuongthuong(rs.getDouble("luongthuong"));
                tl.setTinhtrang(rs.getBoolean("tinhtrang"));
                tl.setLuongnhan(rs.getDouble("luongNhan"));
                ltl.add(tl);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ltl;
    }
    public List<String> getAllId() {
        List<String> ltl = new ArrayList<String>();

        Connection connection = JDBCConnection_101.JDBCConnection();
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
    public void add(nhanVien_312 tl){
     Connection connection = JDBCConnection_101.JDBCConnection();          
            String sql = "INSERT INTO AddNhanVien (id, ten, chucVu, email, luongcoban, luongthuong,tinhtrang) "
                    + "values (?,?,?,?,?,?,?) ";            
            try {
                PreparedStatement preparedStatement = connection.prepareStatement(sql);
                preparedStatement.setString(1, tl.getID());
                preparedStatement.setString(2, tl.getName());
                preparedStatement.setString(3, tl.getPosition());
                preparedStatement.setString(4, tl.getEmail());
                preparedStatement.setDouble(5, tl.getLuongcb());
                preparedStatement.setDouble(6, tl.getLuongthuong()); 
                preparedStatement.setBoolean(7, tl.getTinhtrang());
//                int rs = preparedStatement.executeUpdate();
//                System.out.println(rs);
                preparedStatement.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    //
    //
    public int updateUser(nhanVien_312 tl){
        Connection connection = JDBCConnection_101.JDBCConnection();
        String sql = "Update AddNhanVien set ten = ? , chucVu = ? , email = ? , luongcoban = ? , luongthuong = ? ,tinhtrang=? where id = ? ";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(7, tl.getID());
            preparedStatement.setString(1, tl.getName());
            preparedStatement.setString(2, tl.getPosition());
            preparedStatement.setString(3, tl.getEmail());
            preparedStatement.setDouble(4, tl.getLuongcb());
            preparedStatement.setDouble(5, tl.getLuongthuong());   
            preparedStatement.setBoolean(6, tl.getTinhtrang()); 
            if(preparedStatement.executeUpdate()>0){
                System.out.println("Update th??nh c??ng!");
                return 1;
            };
        } catch (Exception e) {
            e.printStackTrace();
        }
        return -1;
    }
    public void delete(String id){
       Connection connection = JDBCConnection_101.JDBCConnection();
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
    public ArrayList<nhanVien_312> findTaiLieu(String name){
        ArrayList<nhanVien_312> ql = new ArrayList<nhanVien_312>();
        Connection connection = JDBCConnection_101.JDBCConnection();
        String sql = "select *, luongCoBan+luongThuong as luongNhan from AddNhanVien where ten like ?";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1,"%"+name+"%");
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                nhanVien_312 tl = new nhanVien_312();
                tl.setID(rs.getString("id"));
                tl.setName(rs.getString("ten"));
                tl.setPosition(rs.getString("chucvu"));
                tl.setEmail(rs.getString("email"));
                tl.setLuongcb(rs.getDouble("luongcoban"));
                tl.setLuongthuong(rs.getDouble("luongthuong"));
                tl.setLuongnhan(rs.getDouble("luongNhan"));
                tl.setTinhtrang(rs.getBoolean("tinhtrang"));
                ql.add(tl);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ql;
    }
    public nhanVien_312 find1TaiLieu(String id){
        nhanVien_312 tl = new nhanVien_312();
        Connection connection = JDBCConnection_101.JDBCConnection();
        String sql = "select *, luongCoBan+luongThuong as luongNhan from AddNhanVien where id like ?";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1,"%"+id+"%");
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                tl.setID(rs.getString("id"));
                tl.setName(rs.getString("ten"));
                tl.setPosition(rs.getString("chucvu"));
                tl.setEmail(rs.getString("email"));
                tl.setLuongcb(rs.getDouble("luongcoban"));
                tl.setLuongthuong(rs.getDouble("luongthuong"));
                tl.setLuongnhan(rs.getDouble("luongNhan"));
                tl.setTinhtrang(rs.getBoolean("tinhtrang"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return tl;
    }
}
