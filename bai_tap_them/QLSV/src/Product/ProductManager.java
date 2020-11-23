package Product;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductManager {
    public static final String COMA = ",";
    public static String line;
    public static Scanner input = new Scanner(System.in);
    public void  addXuatKhau(){
        List<SanPhamXuatKhau> oldListCustomer = readXuatKhau();
        System.out.println(oldListCustomer.size());
        int id = 1;
        if (oldListCustomer.size() != 0) {
            id = oldListCustomer.get(oldListCustomer.size() - 1).getId() + 1;
        }
        List<SanPhamXuatKhau> listXuatKhau= new ArrayList<>();
        System.out.println("Customer Id = " + id);
        SanPhamXuatKhau xuatKhau = new SanPhamXuatKhau(id,
                inputIdProduct(),
                inputNameProduct(),
                inputPriceProduct(),
                inputAmoutProduct(),
                inputProducter(),
                inputGiaXuatKhau(),
                inputQuocGiaNhapSanPham());
        listXuatKhau.add(xuatKhau);
        line = id + COMA +
               xuatKhau.getIdProduct() + COMA +
               xuatKhau.getNameProduct() + COMA +
               xuatKhau.getPriceProduct() + COMA +
               xuatKhau.getAmoutProduct() + COMA +
               xuatKhau.getProducter() + COMA +
               xuatKhau.getGiaXuatKhau() + COMA +
               xuatKhau.getQuocGiaNhapSanPham();
        FileUtils.fileWriter("src/Product/SanPhamXuatKhau.csv",line,true);
    }
    public List<SanPhamXuatKhau> readXuatKhau(){
        List<SanPhamXuatKhau> listXuatKhau =new ArrayList<>();
        File file;
        file = new File("src/Product/SanPhamXuatKhau.csv");
        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String[] countLine;
                countLine = line.split(",");

                SanPhamXuatKhau xuatKhau = new SanPhamXuatKhau(
                        Integer.parseInt(countLine[0]),
                        countLine[1],
                        countLine[2],
                        countLine[3],
                        countLine[4],
                        countLine[5],
                        countLine[6],
                        countLine[7]);
                listXuatKhau.add(xuatKhau);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return listXuatKhau ;
    }
    public void  addNhapKhau(){
        List<SanPhamNhapKhau> oldListCustomer = readNhapKhau();
        int id = 1;
        if (oldListCustomer.size() != 0) {
            id = oldListCustomer.get(oldListCustomer.size() - 1).getId() + 1;
        }
        List<SanPhamNhapKhau> listNhapKhau= new ArrayList<>();
        System.out.println("Customer Id = " + id);
        SanPhamNhapKhau nhapKhau = new SanPhamNhapKhau(id,
                inputIdProduct(),
                inputNameProduct(),
                inputPriceProduct(),
                inputAmoutProduct(),
                inputProducter(),
                inputGiaNhapKhau(),
                inputTinhThanhNhapSanPham(),
                inputThue());
        listNhapKhau.add(nhapKhau);
        line = id + COMA +
                nhapKhau.getIdProduct() + COMA +
                nhapKhau.getNameProduct() + COMA +
                nhapKhau.getPriceProduct() + COMA +
                nhapKhau.getAmoutProduct() + COMA +
                nhapKhau.getProducter() + COMA +
                nhapKhau.getGiaNhapKhau() + COMA +
                nhapKhau.getTinhThanhNhapKhau() + COMA +
                nhapKhau.getThueNhapKhau();
        FileUtils.fileWriter("src/Product/SanPhamNhapKhau.csv",line,true);
    }
    public List<SanPhamNhapKhau> readNhapKhau(){
        List<SanPhamNhapKhau> listNhapKhau =new ArrayList<>();
        File file;
        file = new File("src/Product/SanPhamNhapKhau.csv");
        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String[] countLine;
                countLine = line.split(",");

                SanPhamNhapKhau nhapKhau = new SanPhamNhapKhau(
                        Integer.parseInt(countLine[0]),
                        countLine[1],
                        countLine[2],
                        countLine[3],
                        countLine[4],
                        countLine[5],
                        countLine[6],
                        countLine[7],
                        countLine[8]);
                listNhapKhau.add(nhapKhau);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return listNhapKhau ;
    }
    public String inputIdProduct(){
        System.out.println("nhap id");
        return input.nextLine();
    }
    public String inputNameProduct(){
        System.out.println("nhap ten");
        return input.nextLine();
    }
    public String inputPriceProduct(){
        System.out.println("nhap giá");
        return input.nextLine();
    }
    public String inputAmoutProduct(){
        System.out.println("nhap số luong");
        return input.nextLine();
    }
    public String inputProducter(){
        System.out.println("nhap ten sản xuât");
        return input.nextLine();
    }
    public String inputGiaXuatKhau(){
        System.out.println("nhap giá xuất khẩu");
        return input.nextLine();
    }
    public String inputThue(){
        System.out.println("nhap thuế");
        return input.nextLine();
    }
    public String inputTinhThanhNhapSanPham(){
        System.out.println("nhap tỉnh thành");
        return input.nextLine();
    }
    public String inputGiaNhapKhau(){
        System.out.println("nhap quốc gia");
        return input.nextLine();
    }
    public String inputQuocGiaNhapSanPham(){
        System.out.println("nhap quốc gia");
        return input.nextLine();
    }
    public  void deleteXuatKhau(){
        List<SanPhamXuatKhau> listXuatKhau = readXuatKhau();
        System.out.println("nhap id san pham muon xoa");
        String idXuatKhau = input.nextLine();
        for ( int i =0 ;  i <listXuatKhau.size(); i++){
            if (listXuatKhau.get(i).getIdProduct().equals(idXuatKhau)){
                listXuatKhau.remove(i);
            }
        }
        for (SanPhamXuatKhau xuatKhau : listXuatKhau){
            line = xuatKhau.getId() + COMA +
                    xuatKhau.getIdProduct() + COMA +
                    xuatKhau.getNameProduct() + COMA +
                    xuatKhau.getPriceProduct() + COMA +
                    xuatKhau.getAmoutProduct() + COMA +
                    xuatKhau.getProducter() + COMA +
                    xuatKhau.getGiaXuatKhau() + COMA +
                    xuatKhau.getQuocGiaNhapSanPham();
        }
        FileUtils.fileWriter("src/Product/SanPhamXuatKhau.csv",line,false);
    }
    public  void deleteNhapKhau() {
        List<SanPhamNhapKhau> listNhapKhau = readNhapKhau();
        System.out.println("nhap id san pham muon xoa");
        String idNhapKhau = input.nextLine();
        for (int i = 0; i < listNhapKhau.size(); i++) {
            if (listNhapKhau.get(i).getIdProduct().equals(idNhapKhau)) {
                listNhapKhau.remove(i);
            }
        }
        for (SanPhamNhapKhau nhapKhau : listNhapKhau) {
            line = nhapKhau.getId() + COMA +
                    nhapKhau.getIdProduct() + COMA +
                    nhapKhau.getNameProduct() + COMA +
                    nhapKhau.getPriceProduct() + COMA +
                    nhapKhau.getAmoutProduct() + COMA +
                    nhapKhau.getProducter() + COMA +
                    nhapKhau.getGiaNhapKhau() + COMA +
                    nhapKhau.getTinhThanhNhapKhau() + COMA +
                    nhapKhau.getThueNhapKhau();
        }
        FileUtils.fileWriter("src/Product/SanPhamNhapKhau.csv", line, false);

    }

}
