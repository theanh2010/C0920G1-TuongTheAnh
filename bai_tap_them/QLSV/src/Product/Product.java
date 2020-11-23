package Product;

public  abstract class Product {
    private int id;
    private String idProduct;
    private String nameProduct;
    private String priceProduct;
    private String amoutProduct;
    private String producter;

    public Product(int id, String idProduct, String nameProduct, String priceProduct, String amoutProduct, String producter) {
        this.id = id;
        this.idProduct = idProduct;
        this.nameProduct = nameProduct;
        this.priceProduct = priceProduct;
        this.amoutProduct = amoutProduct;
        this.producter = producter;
    }

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

    public String getAmoutProduct() {
        return amoutProduct;
    }

    public void setAmoutProduct(String amoutProduct) {
        this.amoutProduct = amoutProduct;
    }

    public String getProducter() {
        return producter;
    }

    public void setProducter(String producter) {
        this.producter = producter;
    }
    public String showProduct(){
        return this.toString();
    }
    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", idProduct='" + idProduct + '\'' +
                ", nameProduct='" + nameProduct + '\'' +
                ", priceProduct='" + priceProduct + '\'' +
                ", amoutProduct='" + amoutProduct + '\'' +
                ", producter='" + producter + '\'' +
                '}';
    }
}
