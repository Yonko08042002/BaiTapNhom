/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;


/**
 *
 * @author ASUS
 */
public class nhanVien {
    private String ID;
    private String Name;
    private Boolean Sex;
    private String Address;
    private String Phone;
    private String Email;
    private String DateOfBirth;
    private String Position;

    public nhanVien() {
    }

    public nhanVien(String ID, String Name, Boolean Sex, String Address, String Phone, String Email, String DateOfBirth, String Position) {
        this.ID = ID;
        this.Name = Name;
        this.Sex = Sex;
        this.Address = Address;
        this.Phone = Phone;
        this.Email = Email;
        this.DateOfBirth = DateOfBirth;
        this.Position = Position;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public Boolean getSex() {
        return Sex;
    }

    public void setSex(Boolean Sex) {
        this.Sex = Sex;
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

    public String getDateOfBirth() {
        return DateOfBirth;
    }

    public void setDateOfBirth(String DateOfBirth) {
        this.DateOfBirth = DateOfBirth;
    }

    public String getPosition() {
        return Position;
    }

    public void setPosition(String Position) {
        this.Position = Position;
    }
    
}
