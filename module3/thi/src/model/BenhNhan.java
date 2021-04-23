package model;

public class BenhNhan {
     int id_benh_nhan;
     String ten_benh_nhan;

    public BenhNhan(int id_benh_nhan, String ten_benh_nhan) {
        this.id_benh_nhan = id_benh_nhan;
        this.ten_benh_nhan = ten_benh_nhan;
    }

    public BenhNhan() {
    }

    public BenhNhan(String ten_benh_nhan) {
        this.ten_benh_nhan = ten_benh_nhan;
    }

    public int getId_benh_nhan() {
        return id_benh_nhan;
    }

    public void setId_benh_nhan(int id_benh_nhan) {
        this.id_benh_nhan = id_benh_nhan;
    }

    public String getTen_benh_nhan() {
        return ten_benh_nhan;
    }

    public void setTen_benh_nhan(String ten_benh_nhan) {
        this.ten_benh_nhan = ten_benh_nhan;
    }
}
