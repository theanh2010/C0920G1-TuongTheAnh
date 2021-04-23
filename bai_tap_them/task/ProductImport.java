package task;

public class ProductImport extends Product {
    private double priceImport;
    private String province;
    private double tax;

    public ProductImport(double priceImport, String province, double tax) {
        this.priceImport = priceImport;
        this.province = province;
        this.tax = tax;
    }

    public ProductImport(int idProduct, String codeProduct, String nameProduct, double priceProduct, int amountProduct, String producer, double priceImport, String province, double tax) {
        super(idProduct, codeProduct, nameProduct, priceProduct, amountProduct, producer);
        this.priceImport = priceImport;
        this.province = province;
        this.tax = tax;
    }

    public double getPriceImport() {
        return priceImport;
    }

    public void setPriceImport(double priceImport) {
        this.priceImport = priceImport;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public double getTax() {
        return tax;
    }

    public void setTax(double tax) {
        this.tax = tax;
    }

    @Override
    public String toString() {
        return "ProductImport{" + super.toString() +
                "priceImport=" + priceImport +
                ", province='" + province + '\'' +
                ", tax=" + tax +
                "} ";
    }
}
