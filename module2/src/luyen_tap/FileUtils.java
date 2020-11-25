package luyen_tap;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileUtils {
    private static final String PRODUCT_IMPORT="src/luyen_tap/ProductImport.csv";
    private static final String PRODUCT_EXPORT="src/luyen_tap/ProductExport.csv";
    private static final String COMMA=",";

    public static void fileWritterImport(List<ProductImport> productImportList){
        File file = new File(PRODUCT_IMPORT);
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        try {
            fileWriter = new FileWriter(file);
            bufferedWriter = new BufferedWriter(fileWriter);
            for (ProductImport productImport :productImportList) {
                String line = productImport.getId() + COMMA +
                        productImport.getIdProduct() + COMMA +
                        productImport.getNameProduct() + COMMA +
                        productImport.getPriceProduct() + COMMA +
                        productImport.getAmountProduct() + COMMA +
                        productImport.getProducer() + COMMA +
                        productImport.getPriceImport() + COMMA +
                        productImport.getProvinceImport() + COMMA +
                        productImport.getTaxImport() + COMMA;
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
    public static void fileWritterExport(List<ProductExport> productExportList) {
        File file = new File(PRODUCT_EXPORT);
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        try {
            fileWriter = new FileWriter(file);
            bufferedWriter = new BufferedWriter(fileWriter);

            for (ProductExport productExport : productExportList) {
                String line = productExport.getId() + COMMA +
                        productExport.getIdProduct() + COMMA +
                        productExport.getNameProduct() + COMMA +
                        productExport.getPriceProduct() + COMMA +
                        productExport.getAmountProduct() + COMMA +
                        productExport.getProducer() + COMMA +
                        productExport.getPriceExport() + COMMA +
                        productExport.getCountryExport();
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
    public static List<ProductImport> readFileProductImport(){
        List<ProductImport> productImportList = new ArrayList<>();
        File file = new File(PRODUCT_IMPORT);
        if (file.isFile()) {
            FileReader fileReader = null;
            BufferedReader bufferedReader = null;
            try {
                fileReader = new FileReader(file);
                bufferedReader = new BufferedReader(fileReader);
                ProductImport productImport;
                String[] str;
                String line;
                while ((line = bufferedReader.readLine()) != null) {
                    str = line.split(COMMA);
                    productImport = new ProductImport(Integer.parseInt(str[0]), str[1], str[2], str[3],
                            str[4],str[5],str[6],str[7],str[8]);
                    productImportList.add(productImport);
                }
            } catch (FileNotFoundException e) {
                System.out.print(e.getMessage());
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                try {
                    if (fileReader != null) {
                        if (bufferedReader != null) bufferedReader.close();
                        fileReader.close();
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        } else {
            try {
                if (file.createNewFile()) {
                    System.out.println("File đang trống");
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return productImportList;
    }
    public static List<ProductExport> readFileProductExport(){
        List<ProductExport> productExportList = new ArrayList<>();
        File file = new File(PRODUCT_EXPORT);
        if (file.isFile()) {
            FileReader fileReader = null;
            BufferedReader bufferedReader = null;
            try {
                fileReader = new FileReader(file);
                bufferedReader = new BufferedReader(fileReader);
                ProductExport productExport;
                String[] str;
                String line;
                while ((line = bufferedReader.readLine()) != null) {
                    str = line.split(COMMA);
                    productExport = new ProductExport(Integer.parseInt(str[0]), str[1], str[2], str[3],
                            str[4],str[5],str[6],str[7]);
                    productExportList.add(productExport);
                }
            } catch (FileNotFoundException e) {
                System.out.print(e.getMessage());
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                try {
                    if (fileReader != null) {
                        if (bufferedReader != null) bufferedReader.close();
                        fileReader.close();
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        } else {
            try {
                if (file.createNewFile()) {
                    System.out.println("File đang trống");
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return productExportList;
    }
    public static void removeFile(String filePath){
        try {
            new FileWriter(filePath,false).close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
