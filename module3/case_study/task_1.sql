drop database if exists case_study;
create database case_study;
use case_study;
create table ViTri(
IDViTri int primary key,
TenViTri varchar(45));

create table TrinhDo(
IDTrinhDo int primary key,
TrinhDo varchar(45));

create table BoPhan(
IDBoPhan int primary key,
TenBoPhan varchar(45));

create table NhanVien(
IDNhanVien int primary key,
HoTen varchar(45),
IDViTri int,
IDTrinhDo int,
IDBoPhan int,
NgaySinh date,
SoCMND varchar(45),
Luong varchar(45),
SDT varchar(45),
Email varchar(45),
DiaChi varchar(45),
FOREIGN	KEY (IDViTri) REFERENCES ViTri(IDViTri),
FOREIGN	KEY (IDTrinhDo) REFERENCES TrinhDo(IDTrinhDo),
FOREIGN	KEY (IDBoPhan) REFERENCES BoPhan(IDBoPhan)
);

create table LoaiKhach(
IDLoaiKhach int primary key,
TenLoaiKhach varchar(45));

create table KhachHang(
IDKhachHang int primary key,
IDLoaiKhach int,
HoTen varchar(45),
NgaySinh date,
SoCMND varchar(45),
SDT varchar(45),
Email varchar(45),
DiaChi varchar(45),
FOREIGN	KEY (IDLoaiKhach) REFERENCES LoaiKhach(IDLoaiKhach)
);

create table KieuThue(
IDKieuThue int primary key,
TenKieuThue varchar(45),
Gia int
);

create table LoaiDichVu(
IDLoaiDichVu int primary key,
TenLoaiDichVu varchar(45)
);

create table DichVu(
IDDichVu int primary key,
TenDichVu varchar(45),
DienTich int,
SoTang int,
SoNguoiToiDa varchar(45),
IDKieuThue int,
IDLoaiDichVu int,
TrangThai varchar(45),
FOREIGN	KEY (IDKieuThue) REFERENCES KieuThue(IDKieuThue),
FOREIGN	KEY (IDLoaiDichVu) REFERENCES LoaiDichVu(IDLoaiDichVu)
);
create table HopDong(
IDHopDong int primary key,
IDNhanVien int,
IDKhachHang int,
IDDichVu int,
NgayLamHopDong date,
NgayKetThucHopDong date,
TienDatCoc int,
TongTien int,
FOREIGN	KEY (IDNhanVien) REFERENCES NhanVien(IDNhanVien),
FOREIGN	KEY (IDKhachHang) REFERENCES KhachHang(IDKhachHang),
FOREIGN	KEY (IDDichVu) REFERENCES DichVu(IDDichVu)
 );

create table DichVuDiKem(
IDDichVuDiKem int primary key,
TenDichVuDiKem varchar(45),
Gia int,
DonVi int,
TrangThaiKhaDung varchar(45));

create table HopDongChiTiet(
IDHopDongChiTiet int,
IDHopDong int,
IDDichVuDiKem int,
so_luong int,
FOREIGN	KEY (IDHopDong) REFERENCES HopDong(IDHopDong),
FOREIGN	KEY (IDDichVuDiKem) REFERENCES DichVuDiKem(IDDichVuDiKem)
);

insert into bophan (IDBoPhan, TenBoPhan)
values (1,'Điều Hành'),(2,'Lễ Tân');

insert into dichvu (IDDichVu, TenDichVu, DienTich, SoTang, SoNguoiToiDa, IDKieuThue, IDLoaiDichVu, TrangThai)
values (1,'Villa',300,4,12,1,1,"ok"),
		(2,'House',100,2,3,2,2,'ok'),
        (3,'Room',50,1,2,3,3,'ok');

insert into dichvudikem(IDDichVuDiKem, TenDichVuDiKem, Gia, DonVi, TrangThaiKhaDung)
values (3,'hồ bơi',1000,10,'hồ cao 1m2');


insert into hopdong(IDHopDong, IDNhanVien, IDKhachHang, IDDichVu, NgayLamHopDong, NgayKetThucHopDong, TienDatCoc)
values(1,1,1,1,8/3/2020,12/3/2020,200),
(2,2,2,2,12/12/2020,24/12/2020,500),
(3,3,3,3,10/12/2020,27/12/2020,1000);

insert into hopdongchitiet(IDHopDongChiTiet, IDHopDong, IDDichVuDiKem, so_luong)
values(1,1,1,10),(2,2,2,11),(3,3,3,12);

insert into khachhang(IDKhachHang, IDLoaiKhach, HoTen, NgaySinh, SoCMND, SDT, Email, DiaChi)
values (1,1,'Tưởng Thế Anh',20/10/1997,'123456789','0977555444','anh@gmail.com','Đà Nẵng'),
 (2,2,'Nguyễn Minh Chiến',12/12/1997,'123456789','0977666444','chien@gmail.com','Quảng Bình'),
 (3,3,'Nguyễn Đình Phúc',11/11/1997,'123456789','0977335444','anh@gmail.com','Đà Nẵng');

insert into kieuthue(IDKieuThue, TenKieuThue, Gia)
values (1,'giờ',50),(2,'ngày',300),(3,'tháng',1000);

insert into loaidichvu(IDLoaiDichVu, TenLoaiDichVu)
values (1,'Villa'),(2,'Room'),(3,'House');

insert into loaikhach (IDLoaiKhach, TenLoaiKhach)
values (1,'Sliver'),(2,'Gold'),(3,'Diamond');

INSERT INTO nhanvien (IDNhanVien, HoTen, IDvitri, IDTrinhDo, IDBoPhan, NgaySinh, SoCMND, Luong, SDT, Email, DiaChi)
VALUES (1,'Tưởng Thế Anh',1,1,1,20/10/1997,'111111111',500,'0966950741','abc@abc','Đà Nẵng'),
 (2,'Mai Nam Khánh',1,1,1,20/10/2008,'222222222',500,'0966950741','abc@abc','Đà Nẵng'),
 (3,'Phúc Khang',1,1,1,20/10/1997,'333333333',500,'0966950741','abc@abc','Đà Nẵng'),
 (4,'Minh Chiến',1,1,1,20/10/1993,'444444444',500,'0966950741','abc@abc','Đà Nẵng'),
 (5,'Đình phúc',1,1,1,20/10/1992,'5555555',500,'0966950741','abc@abc','Đà Nẵng');
 
insert into trinhdo (IDTrinhDo, TrinhDo)
values (3,'Trung Cấp');
update trinhdo
set TrinhDo = 'Cao Đẳng'
where IDTrinhDo = 2;

insert into vitri(IDViTri, TenViTri)
values (1,'Giám Đốc'),(2,'Trưởng Phòng'),(3,'Nhân viên');