create database QuanLyLuongNv
go
use QuanLyLuongNv
go
create table TaiKhoan
(
	ten nvarchar(50),
	username varchar(50),
	pass varchar(50),
	confirmpassword varchar(50),
	diachi nvarchar(50),
	sdt varchar(50),
	email nvarchar(50)
)

create table AddNhanVien
(
	id varchar(10) primary key,
	ten nvarchar(50),
	gioitinh nvarchar(4),
	diachi nvarchar(50),
	sdt varchar(11),
	email nvarchar(50),
	ngaysinh nvarchar(50),
	chucVu nvarchar (20),
	luongCoBan money,
	luongThuong money,
	tinhtrang bit
)
insert into AddNhanVien 
values	
('NV0001',N'Nguyễn Đức Tín','Nam',N'794 Nguyễn Du','012345676','tin@gmail.com','2002-02-02',N'Giám đốc',1000000,111110,1),
('NV0003',N'Đặng Thị Thùy Dung',N'Nữ',N'123 Cao Thắng','012345676','tin@gmail.com','2002-02-02',N'Chủ Tịch',1000000,-9000000,0),
('NV0004',N'Lê Thuận Diệu','Nam',N'596 Hoàng Diệu','012345676','tin@gmail.com','2002-02-02',N'Nhân Viên',1000000,0,0),
('NV0005',N'Trần Anh Tuấn','Nam',N'78 Phan Đăng Lưu','012345676','tin@gmail.com','2002-02-02',N'Nhân Viên',1000000,0,1),
('NV0006',N'Nguyễn Tiến An','Nam',N'89','012345676','tin@gmail.com','2002-02-02',N'Chủ Tịch',1000000,0,0),
('NV0007',N'Phan Thị Hoài Anh',N'Nữ',N'79 Cao Thắng','012345676','tin@gmail.com','2002-02-02',N'Nhân Viên',1000000,0,0),
('NV0008',N'Nguyễn Trí Đức','Nam',N'794 Phan Chu Trinh','012345676','tin@gmail.com','2002-02-02',N'Nhân Viên',1000000,0,1),
('NV0009',N'Lê Văn Tài','Nam',N'794 Phan Chu Trinh','012345676','tin@gmail.com','2002-02-02',N'Nhân Viên',1000000,0,1),
('NV0013',N'Tiến Đạt','Nam',N'794 Phan Chu Trinh','012345676','tin@gmail.com','2002-02-02',N'Nhân Viên',1000000,0,1),
('NV0014',N'Huỳnh Phương Khuê',N'Nữ',N'794 Phan Chu Trinh','012345676','tin@gmail.com','2002-02-02',N'Nhân Viên',1000000,0,1),
('NV0015',N'Nguyễn Thị Hải Hà',N'Nữ',N'794 Phan Chu Trinh','012345676','tin@gmail.com','2002-02-02',N'Nhân Viên',1000000,0,1),
('NV0016',N'Trần thị Thùy Trang',N'Nữ',N'794 Phan Chu Trinh','012345676','tin@gmail.com','2002-02-02',N'Nhân Viên',1000000,123330,1),
('NV0017',N'Nguyễn Lê Anh Thư',N'Nữ',N'794 Phan Chu Trinh','012345676','tin@gmail.com','2002-02-02',N'Nhân Viên',1000000,-11110,1),
('NV0018',N'Phan Thị Hy',N'Nữ',N'794 Phan Chu Trinh','012345676','tin@gmail.com','2002-02-02',N'Nhân Viên',1000000,0,1),
('NV0019',N'Nguyễn Thị Quỳnh Như',N'Nữ',N'794 Phan Chu Trinh','012345676','tin@gmail.com','2002-02-02',N'Nhân Viên',1000000,0,1),
('NV0020',N'Trần Nguyễn Gia Hân',N'Nữ',N'794 Phan Chu Trinh','012345676','tin@gmail.com','2002-02-02',N'Nhân Viên',1000000,0,1),
('NV0021',N'Mai Phương Thúy',N'Nữ',N'794 Phan Chu Trinh','012345676','tin@gmail.com','2002-02-02',N'Nhân Viên',1000000,0,1),
('NV0022',N'Lê Thị Thúy Hằng',N'Nữ',N'794 Phan Chu Trinh','012345676','tin@gmail.com','2002-02-02',N'Nhân Viên',1000000,0,1),
('NV0023',N'Trần Bảo Trâm',N'Nữ',N'794 Phan Chu Trinh','012345676','tin@gmail.com','2002-02-02',N'Nhân Viên',1000000,0,1),
('NV0024',N'Phạm Ngọc Quyên',N'Nữ',N'794 Phan Chu Trinh','012345676','tin@gmail.com','2002-02-02',N'Nhân Viên',1000000,0,1),
('NV0025',N'Phạm Văn Tài','Nam',N'794 Phan Chu Trinh','012345676','tin@gmail.com','2002-02-02',N'Nhân Viên',1000000,0,1),
('NV0026',N'Nguyễn Trần Tiến','Nam',N'794 Phan Chu Trinh','012345676','tin@gmail.com','2002-02-02',N'Nhân Viên',1000000,0,1),
('NV0027',N'Trần Kim Vũ','Nam',N'794 Phan Chu Trinh','012345676','tin@gmail.com','2002-02-02',N'Nhân Viên',1000000,0,1),
('NV0028',N'Bùi Viết Trường','Nam',N'794 Phan Chu Trinh','012345676','tin@gmail.com','2002-02-02',N'Nhân Viên',1000000,0,1),
('NV0029',N'Lê Đức Duy','Nam',N'794 Phan Chu Trinh','012345676','tin@gmail.com','2002-02-02',N'Nhân Viên',1000000,0,1)


select * ,luongCoBan+luongThuong as luongNhan
from AddNhanVien
