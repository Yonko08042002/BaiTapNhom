/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author DELL
 */
public class taiKhoan {
    private String Name;
    private String Username;
    private String Password;
    private String Confirmpassword;
    private String Address;
    private String Phone;
    private String Email;

    public taiKhoan() {
    }

    public taiKhoan(String Name, String Username, String Password, String Confirmpassword, String Address, String Phone, String Email) {
        this.Name = Name;
        this.Username = Username;
        this.Password = Password;
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
        return Password;
    }

    public void setPassword(String Passwork) {
        this.Password = Password;
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
