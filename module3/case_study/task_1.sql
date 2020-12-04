drop database if exists case_study;
create database case_study;
use case_study;
create table ViTri(
IDViTri int primary key auto_increment,
TenViTri varchar(45));
insert into vitri(IDViTri, TenViTri)
values (1,'Giám Đốc'),(2,'Trưởng Phòng'),(3,'Nhân viên');

create table TrinhDo(
IDTrinhDo int primary key auto_increment,
TrinhDo varchar(45));
insert into trinhdo (IDTrinhDo, TrinhDo)
values (IDTrinhDo,'Đại Học'),
(IDTrinhDo,'Cao Đẳng'), 
(IDTrinhDo,'Trung Cấp');

create table BoPhan(
IDBoPhan int primary key auto_increment,
TenBoPhan varchar(45));

insert into bophan (IDBoPhan, TenBoPhan)
values (IDBoPhan,'Điều Hành'),(IDBoPhan,'Lễ Tân'),(IDBoPhan,'Lao Công');

create table NhanVien(
IDNhanVien int primary key auto_increment,
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
INSERT INTO nhanvien (IDNhanVien, HoTen, IDvitri, IDTrinhDo, IDBoPhan, NgaySinh, SoCMND, Luong, SDT, Email, DiaChi)
VALUES (IDNhanVien,'Tưởng Thế Anh',1,1,1,'1997-12-12','111111111',500,'0966950741','abc@abc','Đà Nẵng'),
 (IDNhanVien,'Mai Nam Khánh',1,1,1,'2008-9-2','222222222',500,'0966950741','abc@abc','Đà Nẵng'),
 (IDNhanVien,'Phúc Khang',1,1,1,'1997-1-1','333333333',500,'0966950741','abc@abc','Quảng Nam'),
 (IDNhanVien,'Minh Chiến',1,1,1,'1998-5-5','444444444',500,'0966950741','abc@abc','Quảng Nam'),
 (IDNhanVien,'Đình phúc',1,1,1,'1945-6-6','5555555',500,'0966950741','abc@abc','Đà Nẵng');
 
create table LoaiKhach(
IDLoaiKhach int primary key auto_increment,
TenLoaiKhach varchar(45));
insert into loaikhach (IDLoaiKhach, TenLoaiKhach)
values (1,'Sliver'),(2,'Gold'),(3,'Diamond');

create table KhachHang(
IDKhachHang int primary key auto_increment,
IDLoaiKhach int,
HoTen varchar(45),
NgaySinh date,
SoCMND varchar(45),
SDT varchar(45),
Email varchar(45),
DiaChi varchar(45),
FOREIGN	KEY (IDLoaiKhach) REFERENCES LoaiKhach(IDLoaiKhach)
);
insert into khachhang(IDKhachHang, IDLoaiKhach, HoTen, NgaySinh, SoCMND, SDT, Email, DiaChi)
values (IDKhachHang,1,'Tưởng Thế Anh','1997-10-20','123456789','0977555444','anh@gmail.com','Đà Nẵng'),
 (IDKhachHang,2,'Nguyễn Minh Chiến','1997-11-11','123456789','0977666444','chien@gmail.com','Quảng Bình'),
 (IDKhachHang,3,'Nguyễn Đình Phúc','1997-8-8','123456789','0977335444','anh@gmail.com','Đà Nẵng');

create table KieuThue(
IDKieuThue int primary key auto_increment,
TenKieuThue varchar(45),
Gia int
);
insert into kieuthue(IDKieuThue, TenKieuThue, Gia)
values (IDKieuThue,'giờ',50),
(IDKieuThue,'ngày',300),
(IDKieuThue,'tháng',1000);

create table LoaiDichVu(
IDLoaiDichVu int primary key auto_increment,
TenLoaiDichVu varchar(45)
);
insert into loaidichvu(IDLoaiDichVu, TenLoaiDichVu)
values (1,'Villa'),(2,'Room'),(3,'House');

create table DichVu(
IDDichVu int primary key auto_increment,
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

insert into dichvu (IDDichVu, TenDichVu, DienTich, SoTang, SoNguoiToiDa, IDKieuThue, IDLoaiDichVu, TrangThai)
values (IDDichVu,'Villa',300,4,12,IDKieuThue,IDLoaiDichVu,"ok"),
		(IDDichVu,'House',100,2,3,IDKieuThue,IDLoaiDichVu,'ok'),
        (IDDichVu,'Room',50,1,2,IDKieuThue,IDLoaiDichVu,'ok');

create table HopDong(
IDHopDong int primary key auto_increment,
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
 
 insert into hopdong(IDHopDong, IDNhanVien, IDKhachHang, IDDichVu, NgayLamHopDong, NgayKetThucHopDong, TienDatCoc)
values(IDHopDong,1,1,1,'2020-08-03','2020-12-3',200),
(IDHopDong,2,2,2,'2020-12-12','2020-12-24',500),
(IDHopDong,3,3,3,'2020-12-7','2020-12-27',1000);


create table DichVuDiKem(
IDDichVuDiKem int primary key auto_increment,
TenDichVuDiKem varchar(45),
Gia int,
DonVi int,
TrangThaiKhaDung varchar(45));
insert into dichvudikem(IDDichVuDiKem, TenDichVuDiKem, Gia, DonVi, TrangThaiKhaDung)
values(IDDichVuDiKem,'karaoke',300,12,'chục em chân dài'),
(IDDichVuDiKem,'massage',100,2,'chục em tiếp viên'),
(IDDichVuDiKem,'hồ bơi',1000,10,'hồ cao 1m2');

create table HopDongChiTiet(
IDHopDongChiTiet int primary key auto_increment,
IDHopDong int,
IDDichVuDiKem int,
so_luong int,
FOREIGN	KEY (IDHopDong) REFERENCES HopDong(IDHopDong),
FOREIGN	KEY (IDDichVuDiKem) REFERENCES DichVuDiKem(IDDichVuDiKem)
);

insert into hopdongchitiet(IDHopDongChiTiet, IDHopDong, IDDichVuDiKem, so_luong)
values(IDHopDongChiTiet,1,1,10),
(IDHopDongChiTiet,2,2,11),
(IDHopDongChiTiet,3,3,12);
















select * from nhanvien
where (HoTen like '%H%' or HoTen like '%T%')
and length(HoTen) < 15;

select * from nhanvien
where year(curdate()) - year(NgaySinh) > 18 
and year(curdate()) - year(NgaySinh) < 50 
and DiaChi in ('Đà Nẵng', 'Quảng Nam');