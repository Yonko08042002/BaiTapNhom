/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

import Connect.NhanVienDAO_312;
import Connect.TaiKhoanDAO_101;
import model.nhanVien_312;
import java.util.List;
import model.taiKhoan_118_101;
/**
 *
 * @author ASUS
 */
public class Service {
    private NhanVienDAO_312 qlnv;
    private TaiKhoanDAO_101 qltk;
    public Service() {
        qlnv = new NhanVienDAO_312();
        
    }
    
    public List<nhanVien_312> getAllUsers(){
        return qlnv.getAllUsers();
    }
    
    public void add(nhanVien_312 tl){
        qlnv.add(tl);
    }
    
    public void delete(String id){
        qlnv.delete(id);
    }
    public void addTaiKhoan(taiKhoan_118_101 tk){
        qltk.addTaiKhoan(tk);
    }
    /*public users getUserByID(int id){
       return userLink.getUserByID(id);
    }*/  
}
