package Product;

public class SanPhamXuatKhau extends Product {
    private String giaXuatKhau;
    private String quocGiaNhapSanPham;

    public SanPhamXuatKhau(
            int id, String idProduct, String nameProduct, String priceProduct, String amoutProduct, String producter, String giaXuatKhau, String quocGiaNhapSanPham) {
        super(id, idProduct, nameProduct, priceProduct, amoutProduct, producter);
        this.giaXuatKhau = giaXuatKhau;
        this.quocGiaNhapSanPham = quocGiaNhapSanPham;
    }

    public SanPhamXuatKhau(int id, String idProduct, String nameProduct, String priceProduct, String amoutProduct, String producter) {
        super(id, idProduct, nameProduct, priceProduct, amoutProduct, producter);
    }

    public String getGiaXuatKhau() {
        return giaXuatKhau;
    }

    public void setGiaXuatKhau(String giaXuatKhau) {
        this.giaXuatKhau = giaXuatKhau;
    }

    public String getQuocGiaNhapSanPham() {
        return quocGiaNhapSanPham;
    }

    public void setQuocGiaNhapSanPham(String quocGiaNhapSanPham) {
        this.quocGiaNhapSanPham = quocGiaNhapSanPham;
    }
    public String showProduct(){
        return this.toString();
    }
    @Override
    public String toString() {
        return  super.toString()+
                "SanPhamXuatKhau{" +
                "giaXuatKhau='" + giaXuatKhau + '\'' +
                ", quocGiaNhapSanPham='" + quocGiaNhapSanPham + '\'' +
                '}';
    }
}
