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
    private String Sex;
    private String Address;
    private String Phone;
    private String Email;
    private String DateOfBirth;
    private String Position;
    private double luongthuong;
    private double luongcb;
    private double luongnhan;

    public nhanVien() {
    }

    public nhanVien(String ID, String Name, String Sex, String Address, String Phone, String Email, String DateOfBirth, String Position, double luongthuong, double luongcb, double luongnhan) {
        this.ID = ID;
        this.Name = Name;
        this.Sex = Sex;
        this.Address = Address;
        this.Phone = Phone;
        this.Email = Email;
        this.DateOfBirth = DateOfBirth;
        this.Position = Position;
        this.luongcb = luongcb;
        this.luongnhan = luongnhan;
        this.luongthuong = luongthuong;
    }

    public double getLuongthuong() {
        return luongthuong;
    }

    public void setLuongthuong(double luongthuong) {
        this.luongthuong = luongthuong;
    }

    public double getLuongcb() {
        return luongcb;
    }

    public void setLuongcb(double luongcb) {
        this.luongcb = luongcb;
    }

    public double getLuongnhan() {
        return luongthuong+luongcb;
    }

    public void setLuongnhan(double luongnhan) {
        this.luongnhan = luongnhan;
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

    public String getSex() {
        return Sex;
    }

    public void setSex(String Sex) {
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
