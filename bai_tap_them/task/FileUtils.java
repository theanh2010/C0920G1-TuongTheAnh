package task;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileUtils {
    public static final String FILE = "D:\\c0720g1_voduyphuoc\\module2\\src\\task\\ProductImport.csv";
    public static final String FILE_1 = "D:\\c0720g1_voduyphuoc\\module2\\src\\task\\ProductExport.csv";
    public static final String COMMA = ",";

    public static void write(List<Product> productList,String pathFile) {
        BufferedWriter bufferedWriter = null;
        try {
            FileWriter fileWriter = new FileWriter(pathFile);
            bufferedWriter = new BufferedWriter(fileWriter);
            for (Product product : productList) {
                String line = product.getIdProduct() + COMMA + product.getCodeProduct() + COMMA + product.getNameProduct() + COMMA +
                        product.getPriceProduct() + COMMA + product.getAmountProduct() + COMMA + product.getProducer() + COMMA;
                if (product instanceof ProductImport) {
                    line += ((ProductImport) product).getPriceImport() + COMMA + ((ProductImport) product).getProvince() + COMMA +
                            ((ProductImport) product).getTax();
                } else if (product instanceof ProductExport) {
                    line += ((ProductExport) product).getPriceExport() + COMMA + ((ProductExport) product).getCountry();
                }
                bufferedWriter.write(line);
                bufferedWriter.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                bufferedWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    public static List<Product> read(String pathFile){
        List<Product> productList = new ArrayList<>();
        BufferedReader bufferedReader = null;
        try {
            FileReader fileReader = new FileReader(pathFile);
            bufferedReader = new BufferedReader(fileReader);
            String line = null;
            while ((line = bufferedReader.readLine())!= null){
                String[] temp = line.split(",");
                int idProduct = Integer.parseInt(temp[0]);
                String codeProduct = temp[1];
                String nameProduct = temp[2];
                double priceProduct = Double.parseDouble(temp[3]);
                int amountProduct = Integer.parseInt(temp[4]);
                String producer = temp[5];
                if (temp.length == 9){
                    double priceImport = Double.parseDouble(temp[6]);
                    String province = temp[7];
                    double tax = Double.parseDouble(temp[8]);
                    ProductImport productImport = new ProductImport(idProduct,codeProduct,nameProduct,priceProduct,amountProduct,
                            producer,priceImport,province,tax);
                    productList.add(productImport);
                }else if (temp.length == 8){
                    double priceExport = Double.parseDouble(temp[6]);
                    String country = temp[7];
                    ProductExport productExport = new ProductExport(idProduct,codeProduct,nameProduct,priceProduct,amountProduct,
                            producer,priceExport,country);
                    productList.add(productExport);
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                bufferedReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return productList;
    }
}
