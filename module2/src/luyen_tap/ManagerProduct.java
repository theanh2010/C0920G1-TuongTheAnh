package luyen_tap;

import case_study.models.customer.Customer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ManagerProduct {

    private static List<ProductImport> productImportList = new ArrayList<>();
    private static List<ProductExport> productExportList = new ArrayList<>();
    public static void addXuatKhau(){
        ProductExport productExport = new ProductExport(
                inputId(),inputIdProduct(),inputNameProduct(),inputPriceProduct(),inputAmountProduct(),inputProducer(),inputcountryExport(),inputpriceExport());
        productExportList.add(productExport);
        FileUtils.fileWritterExport(productExportList);
    }
    public static void addNhapKhau(){
        ProductImport productImport = new ProductImport(
                inputId(),inputIdProduct(),inputNameProduct(),inputPriceProduct(),inputAmountProduct(),inputProducer(),inputPriceImport(),inputProvinceImport(),inputTaxImport());
        productImportList.add(productImport);
        FileUtils.fileWritterImport(productImportList);
    }
    public static void searchXuatKhau() {
        productExportList = FileUtils.readFileProductExport();
        if (productExportList.isEmpty()) {
            System.out.println("Không có thông tin sản phẩm");
        } else {
            System.out.println("nhập tên sản phẩm bạn muốn tìm");
            String search = MainControl.input.nextLine();
            boolean isCheck = false;
            for (ProductExport productExport : productExportList) {
                if (productExport.getNameProduct().contains(search)) {
                    isCheck = true;
                    System.out.println(productExport);
                }
            }
            if (!isCheck) {
                System.out.println("Vui lòng nhập lại");
            }
        }
    }
    public static void searchNhapKhau() {
        productImportList = FileUtils.readFileProductImport();
        if (productImportList.isEmpty()) {
            System.out.println("Không có thông tin sản phẩm");
        } else {
            System.out.println("nhập tên sản phẩm bạn muốn tìm");
            String search = MainControl.input.nextLine();
            boolean isCheck = false;
            for (ProductImport productImport : productImportList) {
                if (productImport.getNameProduct().contains(search)) {
                    isCheck = true;
                    System.out.println(productImport);
                }
            }
            if (!isCheck) {
                System.out.println("Vui lòng nhập lại");
            }
        }
    }
    public static void showNhapkhau(){
        productImportList = FileUtils.readFileProductImport();
        for (ProductImport productImport :productImportList){
            System.out.println(productImport.toString());
        }
    }
    public static void showXuatKhau(){
        productExportList = FileUtils.readFileProductExport();
        for (ProductExport productExport : productExportList){
            System.out.println(productExport.showInfo());
        }
    }
    public static void deleteXuatKhau(){
        productExportList = FileUtils.readFileProductExport();
        System.out.println("nhập id sản phẩm muốn xóa");
        String delete = MainControl.input.nextLine();
        ProductExport productExport = null;
        for (int i = 0 ; i <productExportList.size(); i++){
            if (delete.equals( productExportList.get(i).getIdProduct())){
                productExport = productExportList.get(i);
            }
        }
        if (productExport != null ){
            System.out.println("bạn có muốn xóa hay ko " + "\n"+
                                "chọn Yes or No");
            System.out.println("nhập lựa chọn của bạn");
            String choose = MainControl.input.nextLine();
            if (choose.equals("y")||choose.equals("Y")){
                productExportList.remove(productExport);
                FileUtils.removeFile("src/luyen_tap/ProductExport.csv");
                FileUtils.fileWritterExport(productExportList);
            }else if (choose.equals("n")||choose.equals("N")){
                MainControl.deleteProduct();
            }
        }
    }
    public static void deleteNhapKhau(){
        productImportList = FileUtils.readFileProductImport();
        System.out.println("nhập id sản phẩm muốn xóa");
        String delete = MainControl.input.nextLine();
        ProductImport productImport = null;
        for (int i = 0 ; i <productImportList.size(); i++){
            if (delete.equals( productImportList.get(i).getIdProduct())){
                productImport = productImportList.get(i);
            }
        }
        if (productImport != null ){
            System.out.println("bạn có muốn xóa hay ko " + "\n"+
                    "chọn Yes or No");
            System.out.println("nhập lựa chọn của bạn");
            String choose = MainControl.input.nextLine();
            if (choose.equals("y")||choose.equals("Y")){
                productImportList.remove(productImport);
                FileUtils.removeFile("src/luyen_tap/ProductImport.csv");
                FileUtils.fileWritterImport(productImportList);
            }else if (choose.equals("n")||choose.equals("N")){
                MainControl.deleteProduct();
            }
        }
    }
    public static void editNhapKhau(){
        productImportList = FileUtils.readFileProductImport();
        System.out.println("nhập id  sản phẩm muốn sửa");
        String edit = MainControl.input.nextLine();
        boolean check = false;
        for (int i =0 ; i<productImportList.size();i++){
            if (edit.equals(productImportList.get(i).getIdProduct())){
               productImportList.get(i).setId(inputId());
               productImportList.get(i).setIdProduct(inputIdProduct());
               productImportList.get(i).setNameProduct(inputNameProduct());
               productImportList.get(i).setPriceProduct(inputPriceProduct());
               productImportList.get(i).setAmountProduct(inputAmountProduct());
               productImportList.get(i).setProducer(inputProducer());
               productImportList.get(i).setPriceImport(inputPriceImport());
               productImportList.get(i).setProvinceImport(inputProvinceImport());
               productImportList.get(i).setTaxImport(inputTaxImport());
               check = true;
               break;
            }

        }
        if (check){
            System.out.println("nhập lại id ko đúng");
        }
        FileUtils.removeFile("src/luyen_tap/ProductImport.csv");
        FileUtils.fileWritterImport(productImportList);
    }
    public static void editXuatKhau(){
      productExportList = FileUtils.readFileProductExport();
        System.out.println("nhập id sản phẩm muốn sửa");
        String edit = MainControl.input.nextLine();
        boolean check = false;
        for (int i =0 ; i<productExportList.size();i++){
            if (edit.equals(productExportList.get(i).getIdProduct())){
                productExportList.get(i).setId(inputId());
                productExportList.get(i).setIdProduct(inputIdProduct());
                productExportList.get(i).setNameProduct(inputNameProduct());
                productExportList.get(i).setPriceProduct(inputPriceProduct());
                productExportList.get(i).setAmountProduct(inputAmountProduct());
                productExportList.get(i).setProducer(inputProducer());
                productExportList.get(i).setCountryExport(inputcountryExport());
                productExportList.get(i).setPriceExport(inputpriceExport());
                check = true;
                break;
            }

        }
        if (!check){
            System.out.println("nhập lại id ko đúng");
        }
        FileUtils.removeFile("src/luyen_tap/ProductExport.csv");
        FileUtils.fileWritterExport(productExportList);
    }
    private static int inputId(){
        System.out.println("nhập id sản phẩm");
        return MainControl.input.nextInt();
    }
    private static String inputIdProduct(){
        MainControl.input.nextLine();
        System.out.println("nhập mã sản phẩm");
        return MainControl.input.nextLine();
    }
    private static String inputNameProduct(){
        System.out.println("nhập tên sản phẩm");
        return MainControl.input.nextLine();
    }
    private static String inputPriceProduct(){
        System.out.println("nhập giá sản phẩm");
        return MainControl.input.nextLine();
    }
    private static String inputAmountProduct(){
        System.out.println("nhập số lượng sản phẩm");
        return MainControl.input.nextLine();
    }
    private static String inputProducer(){
        System.out.println("nhập nhà sản xuất sản phẩm");
        return MainControl.input.nextLine();
    }
    private static String inputcountryExport(){
        System.out.println("nhập nước xuất khẩu sản phẩm");
        return MainControl.input.nextLine();
    }
    private static String inputpriceExport(){
        System.out.println("nhập giá xuất khẩu sản phẩm");
        return MainControl.input.nextLine();
    }
    private static String inputPriceImport(){
        System.out.println("nhập giá nhập khẩu sản phẩm");
        return MainControl.input.nextLine();
    }
    private static String inputProvinceImport(){
        System.out.println("nhập tỉnh nhập khẩu sản phẩm");
        return MainControl.input.nextLine();
    }
    private static String inputTaxImport(){
        System.out.println("nhập thuế nhập khẩu sản phẩm");
        return MainControl.input.nextLine();
    }

}
