package luyen_tap;

public class ProductImport extends Product{
    String priceImport;
    String provinceImport;
    String taxImport;

    public ProductImport(int id, String idProduct, String nameProduct, String priceProduct, String amountProduct, String producer, String priceImport, String provinceImport, String taxImport) {
        super(id, idProduct, nameProduct, priceProduct, amountProduct, producer);
        this.priceImport = priceImport;
        this.provinceImport = provinceImport;
        this.taxImport = taxImport;
    }

    public ProductImport(String priceImport, String provinceImport, String taxImport) {
        this.priceImport = priceImport;
        this.provinceImport = provinceImport;
        this.taxImport = taxImport;
    }

    public String getPriceImport() {
        return priceImport;
    }

    public void setPriceImport(String priceImport) {
        this.priceImport = priceImport;
    }

    public String getProvinceImport() {
        return provinceImport;
    }

    public void setProvinceImport(String provinceImport) {
        this.provinceImport = provinceImport;
    }

    public String getTaxImport() {
        return taxImport;
    }

    public void setTaxImport(String taxImport) {
        this.taxImport = taxImport;
    }

    @Override
    public String showInfo() {
        return this.toString();
    }

    @Override
    public String toString() {
        return super.toString()+"ProductImport{" +
                "priceImport='" + priceImport + '\'' +
                ", provinceImport='" + provinceImport + '\'' +
                ", taxImport='" + taxImport + '\'' +
                '}';
    }
}
