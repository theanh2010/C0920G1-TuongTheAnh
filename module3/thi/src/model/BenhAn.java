package model;

public class BenhAn {
    String id_benh_an;
    String id_benh_nhan;
    String ngay_nhap_vien;
    String ngay_ra_vien;
    String bac_si_dieu_tri;
    String ly_do;
    String ten_benh_nhan;

    public BenhAn() {
    }

    public BenhAn(String id_benh_an, String id_benh_nhan, String ngay_nhap_vien, String ngay_ra_vien, String bac_si_dieu_tri, String ly_do,String ten_benh_nhan) {
        this.id_benh_an = id_benh_an;
        this.id_benh_nhan = id_benh_nhan;
        this.ngay_nhap_vien = ngay_nhap_vien;
        this.ngay_ra_vien = ngay_ra_vien;
        this.bac_si_dieu_tri = bac_si_dieu_tri;
        this.ly_do = ly_do;
        this.ten_benh_nhan = ten_benh_nhan;
    }

    public BenhAn(String id_benh_nhan, String ngay_nhap_vien, String ngay_ra_vien, String bac_si_dieu_tri, String ly_do, String ten_benh_nhan) {
        this.id_benh_nhan = id_benh_nhan;
        this.ngay_nhap_vien = ngay_nhap_vien;
        this.ngay_ra_vien = ngay_ra_vien;
        this.bac_si_dieu_tri = bac_si_dieu_tri;
        this.ly_do = ly_do;
        this.ten_benh_nhan = ten_benh_nhan;
    }

    public String getId_benh_an() {
        return id_benh_an;
    }

    public void setId_benh_an(String id_benh_an) {
        this.id_benh_an = id_benh_an;
    }

    public String getId_benh_nhan() {
        return id_benh_nhan;
    }

    public void setId_benh_nhan(String id_benh_nhan) {
        this.id_benh_nhan = id_benh_nhan;
    }

    public String getNgay_nhap_vien() {
        return ngay_nhap_vien;
    }

    public void setNgay_nhap_vien(String ngay_nhap_vien) {
        this.ngay_nhap_vien = ngay_nhap_vien;
    }

    public String getNgay_ra_vien() {
        return ngay_ra_vien;
    }

    public void setNgay_ra_vien(String ngay_ra_vien) {
        this.ngay_ra_vien = ngay_ra_vien;
    }

    public String getBac_si_dieu_tri() {
        return bac_si_dieu_tri;
    }

    public void setBac_si_dieu_tri(String bac_si_dieu_tri) {
        this.bac_si_dieu_tri = bac_si_dieu_tri;
    }

    public String getLy_do() {
        return ly_do;
    }

    public void setLy_do(String ly_do) {
        this.ly_do = ly_do;
    }

    public String getTen_benh_nhan() {
        return ten_benh_nhan;
    }

    public void setTen_benh_nhan(String ten_benh_nhan) {
        this.ten_benh_nhan = ten_benh_nhan;
    }
}
