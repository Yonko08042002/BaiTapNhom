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
	gioitinh bit,
	diachi nvarchar(50),
	sdt varchar(11),
	email nvarchar(50),
	ngaysinh nvarchar(50),
	chucVu nvarchar (20),
	luongCoBan money,
	luongThuong money

)
insert into AddNhanVien 
values	
('NV0001',N'Nguyễn Đức tín',1,N'794 Nguyễn Du','012345676','tin@gmail.com','2002-02-02',N'Giám đốc',1000000,111110),
('NV0002',N'Nguyễn Đức tín',1,N'794 Phan Chu Trinh','012345676','tin@gmail.com','2002-02-02',N'Phó Giám đốc',1000000,111110),
('NV0003',N'Đặng Thị Thùy Dung',0,N'123 Cao Thắng','012345676','tin@gmail.com','2002-02-02',N'Chủ Tịch',1000000,-9000000),
('NV0004',N'Lê Thuận Diệu',1,N'596 Hoàng Diệu','012345676','tin@gmail.com','2002-02-02',N'Nhân Viên',1000000,0),
('NV0005',N'Trần Anh Tuấn',1,N'78 Phan Đăng Lưu','012345676','tin@gmail.com','2002-02-02',N'Nhân Viên',1000000,0),
('NV0006',N'Nguyễn Tiến An',1,N'89','012345676','tin@gmail.com','2002-02-02',N'Chủ Tịch',1000000,0),
('NV0007',N'Phan Thị Hoài Anh',0,N'79 Cao Thắng','012345676','tin@gmail.com','2002-02-02',N'Nhân Viên',1000000,0),
('NV0008',N'Nguyễn Trí Đức',1,N'794 Phan Chu Trinh','012345676','tin@gmail.com','2002-02-02',N'Nhân Viên',1000000,0),
('NV0009',N'Lê Văn Tài',1,N'794 Phan Chu Trinh','012345676','tin@gmail.com','2002-02-02',N'Nhân Viên',1000000,0),
('NV0010',N'Mai Em Đi',0,N'794 Phan Chu Trinh','012345676','tin@gmail.com','2002-02-02',N'Nhân Viên',1000000,0),
('NV0011',N'Mốt Anh Về',0,N'794 Phan Chu Trinh','012345676','tin@gmail.com','2002-02-02',N'Nhân viên',1000000,0),
('NV0012',N'Người Yêu Cũ',0,N'794 Phan Chu Trinh','012345676','tin@gmail.com','2002-02-02',N'Nhân Viên',1000000,0),
('NV0013',N'Tiến Đạt',1,N'794 Phan Chu Trinh','012345676','tin@gmail.com','2002-02-02',N'Nhân Viên',1000000,0),
('NV0014',N'Huỳnh Phương Khuê',0,N'794 Phan Chu Trinh','012345676','tin@gmail.com','2002-02-02',N'Nhân Viên',1000000,0),
('NV0015',N'Nguyễn Thị Hải Hà',0,N'794 Phan Chu Trinh','012345676','tin@gmail.com','2002-02-02',N'Nhân Viên',1000000,0),
('NV0016',N'Trần thị Thùy Trang',0,N'794 Phan Chu Trinh','012345676','tin@gmail.com','2002-02-02',N'Nhân Viên',1000000,123330),
('NV0017',N'Nguyễn Lê Anh Thư',0,N'794 Phan Chu Trinh','012345676','tin@gmail.com','2002-02-02',N'Nhân Viên',1000000,-11110),
('NV0018',N'Phan Thị Hy',0,N'794 Phan Chu Trinh','012345676','tin@gmail.com','2002-02-02',N'Nhân Viên',1000000,0),
('NV0019',N'Nguyễn Thị Quỳnh Như',0,N'794 Phan Chu Trinh','012345676','tin@gmail.com','2002-02-02',N'Nhân Viên',1000000,0),
('NV0020',N'Trần Nguyễn Gia Hân',0,N'794 Phan Chu Trinh','012345676','tin@gmail.com','2002-02-02',N'Nhân Viên',1000000,0),
('NV0021',N'Mai Phương Thúy',0,N'794 Phan Chu Trinh','012345676','tin@gmail.com','2002-02-02',N'Nhân Viên',1000000,0),
('NV0022',N'Lê Thị Thúy Hằng',0,N'794 Phan Chu Trinh','012345676','tin@gmail.com','2002-02-02',N'Nhân Viên',1000000,0),
('NV0023',N'Trần Bảo Trâm',0,N'794 Phan Chu Trinh','012345676','tin@gmail.com','2002-02-02',N'Nhân Viên',1000000,0),
('NV0024',N'Phạm Ngọc Quyên',0,N'794 Phan Chu Trinh','012345676','tin@gmail.com','2002-02-02',N'Nhân Viên',1000000,0),
('NV0025',N'Phạm Văn Tài',1,N'794 Phan Chu Trinh','012345676','tin@gmail.com','2002-02-02',N'Nhân Viên',1000000,0),
('NV0026',N'Nguyễn Trần Tiến',1,N'794 Phan Chu Trinh','012345676','tin@gmail.com','2002-02-02',N'Nhân Viên',1000000,0),
('NV0027',N'Trần Kim Vũ',1,N'794 Phan Chu Trinh','012345676','tin@gmail.com','2002-02-02',N'Nhân Viên',1000000,0),
('NV0028',N'Bùi Viết Trường',1,N'794 Phan Chu Trinh','012345676','tin@gmail.com','2002-02-02',N'Nhân Viên',1000000,0),
('NV0029',N'Lê Đức Duy',1,N'794 Phan Chu Trinh','012345676','tin@gmail.com','2002-02-02',N'Nhân Viên',1000000,0),
('NV0030',N'Phía Sau Em',1,N'794 Phan Chu Trinh','012345676','tin@gmail.com','2002-02-02',N'Nhân Viên',1000000,0)


select * ,luongCoBan+luongThuong as luongNhan
from AddNhanVien
