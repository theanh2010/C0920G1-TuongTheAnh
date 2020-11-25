package luyen_tap;

public abstract class Product {
    protected int id;
    protected String idProduct;
    protected String nameProduct;
    protected String priceProduct;
    protected String amountProduct;
    protected String producer;

    public Product(
            int id, String idProduct, String nameProduct, String priceProduct, String amountProduct, String producer) {
        this.id = id;
        this.idProduct = idProduct;
        this.nameProduct = nameProduct;
        this.priceProduct = priceProduct;
        this.amountProduct = amountProduct;
        this.producer = producer;
    }
    public Product(){}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(String idProduct) {
        this.idProduct = idProduct;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public String getPriceProduct() {
        return priceProduct;
    }

    public void setPriceProduct(String priceProduct) {
        this.priceProduct = priceProduct;
    }

    public String getAmountProduct() {
        return amountProduct;
    }

    public void setAmountProduct(String amountProduct) {
        this.amountProduct = amountProduct;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }
    public abstract String showInfo();

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", idProduct='" + idProduct + '\'' +
                ", nameProduct='" + nameProduct + '\'' +
                ", priceProduct='" + priceProduct + '\'' +
                ", amountProduct='" + amountProduct + '\'' +
                ", producer='" + producer + '\'' +
                '}';
    }
}
