create database QuanLyLuongNv
go
use QuanLyLuongNv
go
create table TaiKhoan
(
	id nvarchar(10) primary key,
	ten nvarchar(50),
	username nvarchar(50),
	pass nvarchar(50),
	confirmpassword nvarchar(50),
	gioitinh nvarchar(50),
	ngaysinh date,
	diachi nvarchar(50),
	sdt nvarchar(50),
	email nvarchar(50)
)
