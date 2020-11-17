package session_10_tree_map.bai_tap.quan_li_san_pham;


import java.util.*;

public class ProductManager extends Product {
    public static Scanner input = new Scanner(System.in);
    public static List<Product> productList = new ArrayList<>();
    public ProductManager(){}

    public ProductManager(int id, String name, double price) {
        super(id, name, price);
    }

    public void add(){
        int id = (productList.size() > 0 ) ? (productList.size() + 1) : 1;
        System.out.println("Product Id = " + id);
        String name = inputName();
        double price = inputPrice();
        Product product = new Product(id,name,price);
        productList.add(product);

    }

    public void edit(int id) {
        boolean isExisted = false ;
        int size = productList.size();
        for ( int i = 0 ; i < size ; i++){
            if (productList.get(i).getId() == id){
                isExisted = true;
                productList.get(i).setName(inputName());
                productList.get(i).setPrice(inputPrice());
                break;
            }
        }
        if (!isExisted){
            System.out.printf("id = %d not existed.\n", id);
        }

    }
    public void delete(int id){
        Product product = null;
        int size = productList.size();
        for (int i = 0 ; i < size ; i++){
            if (productList.get(i).getId() == id){
                product = productList.get(i);
                break;
            }
        }
        if (product != null) {
            productList.remove(product);
        }else {
            System.out.printf("id = %d not existed.\n", id);
        }
    }
    public void sortProductByName(){
        productList.sort(new SortProductByName());
    }
    public void sortProductByPrice(){
        productList.sort(new SortProductByPrice());
    }
    public void show(){
        for (Product product : productList){
            System.out.println("ID :" + product.getId());
            System.out.print("   Name :" + product.getName());
            System.out.println("   Price :" + product.getPrice());
        }
    }
    public int inputId() {
        System.out.print("Input product ID  :");
        while (true){
            try {
                int id =  Integer.parseInt(input.nextLine());
                return id;
            }catch (NumberFormatException e) {
                input.nextLine();
                System.out.print("Please , Input product ID again :");
            }
        }
    }

    private String inputName(){
        input.nextLine();
        System.out.print("Input product name :  ");
        return input.nextLine();
    }
    private double inputPrice(){
        input.nextLine();
        System.out.print("Input product price:  ");
        return input.nextDouble();
    }
    public List<Product> getProductList(){
        return productList;
    }
    public void setProductList(List<Product> productList){
        this.productList = productList;
    }

}




