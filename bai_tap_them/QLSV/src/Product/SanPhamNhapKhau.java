package Product;

public class SanPhamNhapKhau extends Product {
    String giaNhapKhau;
    String tinhThanhNhapKhau;
    String thueNhapKhau;

    public SanPhamNhapKhau(int id, String idProduct, String nameProduct, String priceProduct, String amoutProduct, String producter, String giaNhapKhau, String tinhThanhNhapKhau, String thueNhapKhau) {
        super(id, idProduct, nameProduct, priceProduct, amoutProduct, producter);
        this.giaNhapKhau = giaNhapKhau;
        this.tinhThanhNhapKhau = tinhThanhNhapKhau;
        this.thueNhapKhau = thueNhapKhau;
    }

    public String getGiaNhapKhau() {
        return giaNhapKhau;
    }

    public void setGiaNhapKhau(String giaNhapKhau) {
        this.giaNhapKhau = giaNhapKhau;
    }

    public String getTinhThanhNhapKhau() {
        return tinhThanhNhapKhau;
    }

    public void setTinhThanhNhapKhau(String tinhThanhNhapKhau) {
        this.tinhThanhNhapKhau = tinhThanhNhapKhau;
    }

    public String getThueNhapKhau() {
        return thueNhapKhau;
    }

    public void setThueNhapKhau(String thueNhapKhau) {
        this.thueNhapKhau = thueNhapKhau;
    }
    public String showProduct(){
        return this.toString();
    }

    @Override
    public String toString() {
        return  super.toString() +
                "SanPhamNhapKhau{" +
                "giaNhapKhau='" + giaNhapKhau + '\'' +
                ", tinhThanhNhapKhau='" + tinhThanhNhapKhau + '\'' +
                ", thueNhapKhau='" + thueNhapKhau + '\'' +
                '}';
    }
}
