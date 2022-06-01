/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author DELL
 */
public class taiKhoan_118_101 {
    private String Name;
    private String Username;
    private String Pass;
    private String Confirmpassword;
    private String Address;
    private String Phone;
    private String Email;

    public taiKhoan_118_101() {
    }

    public taiKhoan_118_101(String Name, String Username, String Pass, String Confirmpassword, String Address, String Phone, String Email) {
        this.Name = Name;
        this.Username = Username;
        this.Pass = Pass;
        this.Confirmpassword = Confirmpassword;
        this.Address = Address;
        this.Phone = Phone;
        this.Email = Email;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getUsername() {
        return Username;
    }

    public void setUsername(String Username) {
        this.Username = Username;
    }

    public String getPassword() {
        return Pass;
    }

    public void setPassword(String Pass) {
        this.Pass = Pass;
    }

    public String getConfirmpassword() {
        return Confirmpassword;
    }

    public void setConfirmpassword(String Confirmpassword) {
        this.Confirmpassword = Confirmpassword;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String Phone) {
        this.Phone = Phone;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }
    
    
}
