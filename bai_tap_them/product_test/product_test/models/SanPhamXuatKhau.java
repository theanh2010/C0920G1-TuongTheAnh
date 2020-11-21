package _00_test.product_test.models;

public class SanPhamXuatKhau extends SanPham {
    private String giaXuatKhau;
    private String nuocNhapKhau;

    public SanPhamXuatKhau(String giaXuatKhau, String nuocNhapKhau) {
        this.giaXuatKhau = giaXuatKhau;
        this.nuocNhapKhau = nuocNhapKhau;
    }

    public SanPhamXuatKhau(int idSP, String maSP, String tenSP, String giaSP, String soLuongSP, String hangSX, String giaXuatKhau, String nuocNhapKhau) {
        super(idSP, maSP, tenSP, giaSP, soLuongSP, hangSX);
        this.giaXuatKhau = giaXuatKhau;
        this.nuocNhapKhau = nuocNhapKhau;
    }

    public String getGiaXuatKhau() {
        return giaXuatKhau;
    }

    public void setGiaXuatKhau(String giaXuatKhau) {
        this.giaXuatKhau = giaXuatKhau;
    }

    public String getNuocNhapKhau() {
        return nuocNhapKhau;
    }

    public void setNuocNhapKhau(String nuocNhapKhau) {
        this.nuocNhapKhau = nuocNhapKhau;
    }

    @Override
    public String toString() {
        return "SanPhamXuatKhau{" +
                ", idSP=" + idSP +
                ", maSP='" + maSP + '\'' +
                ", tenSP='" + tenSP + '\'' +
                ", giaSP='" + giaSP + '\'' +
                ", soLuongSP='" + soLuongSP + '\'' +
                ", hangSX='" + hangSX + '\'' +
                "giaXuatKhau='" + giaXuatKhau + '\'' +
                ", nuocNhapKhau='" + nuocNhapKhau + '\'' +
                '}';
    }

    @Override
    public String hienThiThongTin() {
        return idSP+","+maSP+","+tenSP+","+giaSP+","+soLuongSP+","+hangSX+","+giaXuatKhau+","+nuocNhapKhau;
    }

    @Override
    public int getId() {
        return 0;
    }
}
