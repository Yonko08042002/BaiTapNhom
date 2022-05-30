/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

import Connect.NhanVienDAO;
import Connect.TaiKhoanDAO;
import model.nhanVien;
import java.util.List;
import model.taiKhoan;
/**
 *
 * @author ASUS
 */
public class Service {
    private NhanVienDAO qlnv;
    private TaiKhoanDAO qltk;
    public Service() {
        qlnv = new NhanVienDAO();
        
    }
    
    public List<nhanVien> getAllUsers(){
        return qlnv.getAllUsers();
    }
    
    public void add(nhanVien tl){
        qlnv.add(tl);
    }
    
    public void delete(String id){
        qlnv.delete(id);
    }
    public void addTaiKhoan(taiKhoan tk){
        qltk.addTaiKhoan(tk);
    }
    /*public users getUserByID(int id){
       return userLink.getUserByID(id);
    }*/  
}
