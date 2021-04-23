package task;

public class ProductExport extends Product {
    private double priceExport;
    private String country;

    public ProductExport(double priceExport, String country) {
        this.priceExport = priceExport;
        this.country = country;
    }

    public ProductExport(int idProduct, String codeProduct, String nameProduct, double priceProduct, int amountProduct, String producer, double priceExport, String country) {
        super(idProduct, codeProduct, nameProduct, priceProduct, amountProduct, producer);
        this.priceExport = priceExport;
        this.country = country;
    }

    public double getPriceExport() {
        return priceExport;
    }

    public void setPriceExport(double priceExport) {
        this.priceExport = priceExport;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "ProductExport{" +
                "idProduct=" + idProduct +
                ", codeProduct='" + codeProduct + '\'' +
                ", nameProduct='" + nameProduct + '\'' +
                ", priceProduct=" + priceProduct +
                ", amountProduct=" + amountProduct +
                ", producer='" + producer + '\'' +
                "} " + super.toString();
    }
}
