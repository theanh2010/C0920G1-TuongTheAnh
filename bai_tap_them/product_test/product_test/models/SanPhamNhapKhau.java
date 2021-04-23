package _00_test.product_test.models;

public class SanPhamNhapKhau extends SanPham {
    private String giaNhapKhau;
    private String tinhNhapKhau;
    private String thueNhapKhau;

    public SanPhamNhapKhau(String giaNhapKhau, String tinhNhapKhau, String thueNhapKhau) {
        this.giaNhapKhau = giaNhapKhau;
        this.tinhNhapKhau = tinhNhapKhau;
        this.thueNhapKhau = thueNhapKhau;
    }

    public SanPhamNhapKhau(int idSP, String maSP, String tenSP, String giaSP, String soLuongSP, String hangSX,
                           String giaNhapKhau, String tinhNhapKhau, String thueNhapKhau) {
        super(idSP, maSP, tenSP, giaSP, soLuongSP, hangSX);
        this.giaNhapKhau = giaNhapKhau;
        this.tinhNhapKhau = tinhNhapKhau;
        this.thueNhapKhau = thueNhapKhau;
    }

    public String getGiaNhapKhau() {
        return giaNhapKhau;
    }

    public void setGiaNhapKhau(String giaNhapKhau) {
        this.giaNhapKhau = giaNhapKhau;
    }

    public String getTinhNhapKhau() {
        return tinhNhapKhau;
    }

    public void setTinhNhapKhau(String tinhNhapKhau) {
        this.tinhNhapKhau = tinhNhapKhau;
    }

    public String getThueNhapKhau() {
        return thueNhapKhau;
    }

    public void setThueNhapKhau(String thueNhapKhau) {
        this.thueNhapKhau = thueNhapKhau;
    }

    @Override
    public String toString() {
        return "SanPhamNhapKhau{" +
                "idSP=" + idSP +
                ", maSP='" + maSP + '\'' +
                ", tenSP='" + tenSP + '\'' +
                ", giaSP='" + giaSP + '\'' +
                ", soLuongSP='" + soLuongSP + '\'' +
                ", hangSX='" + hangSX + '\'' +
                "giaNhapKhau='" + giaNhapKhau + '\'' +
                ", tinhNhapKhau='" + tinhNhapKhau + '\'' +
                ", thueNhapKhau='" + thueNhapKhau + '\'' +
                '}';
    }

    @Override
    public String hienThiThongTin() {
        return idSP+","+maSP+","+tenSP+","+giaSP+","+soLuongSP+","+hangSX+","+giaNhapKhau+"," +
                ""+tinhNhapKhau+","+thueNhapKhau;
    }

    @Override
    public int getId() {
        return 0;
    }
}
