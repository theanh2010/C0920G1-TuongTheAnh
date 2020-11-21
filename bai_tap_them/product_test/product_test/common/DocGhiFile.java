package _00_test.product_test.common;


import _00_test.product_test.models.SanPhamNhapKhau;
import _00_test.product_test.models.SanPhamXuatKhau;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class DocGhiFile {
    private static final String SPNHAPKHAU="src/_00_test/product_test/data/SanPhamNK.csv";
    private static final String SPXUATKHAU="src/_00_test/product_test/data/SanPhamXK.csv";
    private static final String DAU_PHAY=",";

    public static void ghiFileNhapKhau(List<SanPhamNhapKhau> danhSachNK){
        File file = new File(SPNHAPKHAU);
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        try {
            fileWriter = new FileWriter(file);
            bufferedWriter = new BufferedWriter(fileWriter);

            for (SanPhamNhapKhau element : danhSachNK){
                bufferedWriter.append(element.hienThiThongTin());
                bufferedWriter.append("\n");
            }

            bufferedWriter.flush();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (fileWriter != null) {
                    if (bufferedWriter != null) bufferedWriter.close();
                    fileWriter.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static void ghiFileXuatKhau(List<SanPhamXuatKhau> danhSachXK){
        File file = new File(SPXUATKHAU);
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        try {
            fileWriter = new FileWriter(file);
            bufferedWriter = new BufferedWriter(fileWriter);

            for (SanPhamXuatKhau element : danhSachXK){
                bufferedWriter.append(element.hienThiThongTin());
                bufferedWriter.append("\n");
            }

            bufferedWriter.flush();
        } catch (IOException e) {
            e.printStackTrace();
        } finally{
            try {
                if (fileWriter != null) {
                    if (bufferedWriter != null) bufferedWriter.close();
                    fileWriter.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }

    public static List<SanPhamXuatKhau> docFileXK(){
        List<SanPhamXuatKhau> danhSachXK = new ArrayList<>();
        File file = new File(SPXUATKHAU);
        if (file.isFile()) {
            FileReader fileReader = null;
            BufferedReader bufferedReader = null;
            try {
                fileReader = new FileReader(file);
                bufferedReader = new BufferedReader(fileReader);
                SanPhamXuatKhau sanPhamXuatKhau;
                String[] mang;
                String dong;
                while ((dong = bufferedReader.readLine()) != null) {
                    mang = dong.split(DAU_PHAY);
                    sanPhamXuatKhau = new SanPhamXuatKhau(Integer.parseInt(mang[0]), mang[1], mang[2], mang[3],
                            mang[4],mang[5],mang[6],mang[7]);
                    danhSachXK.add(sanPhamXuatKhau);
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
        return danhSachXK;
    }

    public static List<SanPhamNhapKhau> docFileNK(){
        List<SanPhamNhapKhau> danhSachNK = new ArrayList<>();
        File file = new File(SPNHAPKHAU);
        if (file.isFile()) {
            FileReader fileReader = null;
            BufferedReader bufferedReader = null;
            try {
                fileReader = new FileReader(file);
                bufferedReader = new BufferedReader(fileReader);
                SanPhamNhapKhau sanPhamNhapKhau;
                String[] mang;
                String dong;
                while ((dong = bufferedReader.readLine()) != null) {
                    mang = dong.split(DAU_PHAY);
                    sanPhamNhapKhau = new SanPhamNhapKhau(Integer.parseInt(mang[0]), mang[1], mang[2], mang[3],
                            mang[4],mang[5],mang[6],mang[7],mang[8]);
                    danhSachNK.add(sanPhamNhapKhau);
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
        return danhSachNK;
    }
}
