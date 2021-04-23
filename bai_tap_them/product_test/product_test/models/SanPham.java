package _00_test.product_test.models;

public abstract class SanPham {
     protected int idSP;
     protected String maSP;
     protected String tenSP;
     protected String giaSP;
     protected String soLuongSP;
     protected String hangSX;

    public SanPham() {
    }

    public SanPham(int idSP, String maSP, String tenSP, String giaSP, String soLuongSP, String hangSX) {
        this.idSP = idSP;
        this.maSP = maSP;
        this.tenSP = tenSP;
        this.giaSP = giaSP;
        this.soLuongSP = soLuongSP;
        this.hangSX = hangSX;
    }

    public int getIdSP() {
        return idSP;
    }

    public void setIdSP(int idSP) {
        this.idSP = idSP;
    }

    public String getMaSP() {
        return maSP;
    }

    public void setMaSP(String maSP) {
        this.maSP = maSP;
    }

    public String getTenSP() {
        return tenSP;
    }

    public void setTenSP(String tenSP) {
        this.tenSP = tenSP;
    }

    public String getGiaSP() {
        return giaSP;
    }

    public void setGiaSP(String giaSP) {
        this.giaSP = giaSP;
    }

    public String getSoLuongSP() {
        return soLuongSP;
    }

    public void setSoLuongSP(String soLuongSP) {
        this.soLuongSP = soLuongSP;
    }

    public String getHangSX() {
        return hangSX;
    }

    public void setHangSX(String hangSX) {
        this.hangSX = hangSX;
    }

    @Override
    public String toString() {
        return "SanPham{" +
                "idSP=" + idSP +
                ", maSP='" + maSP + '\'' +
                ", tenSP='" + tenSP + '\'' +
                ", giaSP='" + giaSP + '\'' +
                ", soLuongSP='" + soLuongSP + '\'' +
                ", hangSX='" + hangSX + '\'' +
                '}';
    }

    public abstract String hienThiThongTin();

    public abstract int getId();
}
