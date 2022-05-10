/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

import Connect.NhanVienDAO;
import model.nhanVien;
import java.util.List;
/**
 *
 * @author ASUS
 */
public class Service {
    private NhanVienDAO qlnv;

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
    /*public users getUserByID(int id){
       return userLink.getUserByID(id);
    }*/  
}
