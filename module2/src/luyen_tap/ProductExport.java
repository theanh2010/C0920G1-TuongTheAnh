package luyen_tap;

public class ProductExport extends Product {
    String countryExport;
    String priceExport;

    public ProductExport(int id, String idProduct, String nameProduct, String priceProduct, String amountProduct, String producter, String countryExport, String priceExport) {
        super(id, idProduct, nameProduct, priceProduct, amountProduct, producter);
        this.countryExport = countryExport;
        this.priceExport = priceExport;
    }

    public ProductExport(String countryExport, String tax) {
        this.countryExport = countryExport;
        this.priceExport = tax;
    }

    public String getCountryExport() {
        return countryExport;
    }

    public void setCountryExport(String countryExport) {
        this.countryExport = countryExport;
    }

    public String getPriceExport() {
        return priceExport;
    }

    public void setPriceExport(String priceExport) {
        this.priceExport = priceExport;
    }

    public String showInfo() {
        return this.toString();
    }

    @Override
    public String toString() {
        return super.toString() + "ProductExport{" +
                "countryExport='" + countryExport + '\'' +
                ", tax='" + priceExport + '\'' +
                '}';
    }

}
