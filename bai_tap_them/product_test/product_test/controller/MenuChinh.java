package _00_test.product_test.controller;


import _00_test.product_test.common.DocGhiFile;
import _00_test.product_test.models.SanPhamNhapKhau;
import _00_test.product_test.models.SanPhamXuatKhau;
import _00_test.product_test.validate.KiemTra;
import _00_test.product_test.validate.NotFoundDirectoryException;

import java.util.*;

public class MenuChinh {
    static Scanner input = new Scanner(System.in);

    public static List<SanPhamXuatKhau> danhSachXK = DocGhiFile.docFileXK();
    public static List<SanPhamNhapKhau> danhSachNK = DocGhiFile.docFileNK();

    public static void hienThiMenu() {
        int chon = 0;
        do {
            System.out.println("----------CHƯƠNG TRÌNH QUẢN LÝ SẢN PHẨM--------------\n" +
                    "Chọn chức năng theo số (để tiếp tục)\n" +
                    "1.\tThêm mới Sản Phẩm\n" +
                    "2.\tXóa Sản Phẩm\n" +
                    "3.\tXem Danh Sách Sản Phẩm\n" +
                    "4.\tTìm Kiếm Sản Phẩm\n" +
                    "5.\tThoát\n" +
                    "----------------------------------------------------");
            System.out.print("Chọn chức năng: ");
            String chonMenu = input.nextLine();
            if (KiemTra.kiemTraSoNguyen(chonMenu)) {
                chon = Integer.parseInt(chonMenu);
                switch (chon) {
                    case 1:
                        themMoiSanPham();
                        break;
                    case 2:
                        xoaSanPham();
                        break;
                    case 3:
                        hienThiSanPham();
                        break;
                    case 4:
                        timKiemSanPham();
                        break;
                    case 5:
                        System.exit(0);
                        break;
                    default:
                        System.out.println("sự lựa chọn không tồn tại");
                        hienThiMenu();
                }
            } else System.out.println("Lựa chọn không hợp lệ");
        } while (true);
    }

    private static void timKiemSanPham() {
        int chon;
        do {
            System.out.println("TÌM KIẾM SẢN PHẨM\n" +
                    "1.\tTim sản phẩm nhập khẩu\n" +
                    "2.\tTim sản phẩm xuất khẩu\n" +
                    "3.\tQuay lai menu chinh");
            System.out.print("Chọn chức năng: ");
            String chonMenu = input.nextLine();
            if (KiemTra.kiemTraSoNguyen(chonMenu)) {
                chon = Integer.parseInt(chonMenu);
                switch (chon) {
                    case 1:
                        timSPNhapKhau();
                        break;
                    case 2:
                        timSPXuatKhau();
                        break;
                    case 3:
                        hienThiMenu();
                        break;
                    default:
                        System.out.println("sự lựa chọn không tồn tại");
                        hienThiMenu();
                }

            } else System.out.println("Lựa chọn không hợp lệ");
        } while (true) ;
    }

    private static void timSPXuatKhau() {
        if (danhSachXK.isEmpty()) {
            System.out.println("Chưa có thông tin sp nào");
        }
        else {
            System.out.print("Nhập mã số sp hoặc họ tên bạn muốn tìm kiếm: ");
            String timKiem = input.nextLine();
            boolean kiemTra = true;
            int bienDem = 1;
            for (SanPhamXuatKhau element : danhSachXK) {
                if ( element.getTenSP().contains(timKiem)) {
                    kiemTra = false;
                    System.out.println(bienDem + ". " + element);
                    bienDem++;
                }

            }
            if (kiemTra) {
                System.out.println("Không có sp nào khớp với thông tin bạn nhập");
            }
        }
    }

    private static void timSPNhapKhau() {
        if (danhSachNK.isEmpty()) {
            System.out.println("Chưa có thông tin nào");
        }
        else {
            System.out.print("Nhập mã số sp hoặc  tên bạn muốn tìm kiếm: ");
            String timKiem = input.nextLine();
            boolean kiemTra = true;
            int bienDem = 1;
            for (SanPhamNhapKhau element : danhSachNK) {
                if ( element.getTenSP().contains(timKiem)) {
                    kiemTra = false;
                    System.out.println(bienDem + ". " + element);
                    bienDem++;
                }

            }
            if (kiemTra) {
                System.out.println("Không có nào khớp với thông tin bạn nhập");
            }
        }
    }

    private static void hienThiSanPham() {
        int chon;
        do {
            System.out.println("HIỂN THỊ SẢN PHẨM\n\n" +
                    "1.\tHien thị sản phẩm nhập khẩu\n" +
                    "2.\tHien thị sản phẩm xuất khẩu\n" +
                    "3.\tHien thị sản phẩm nhập khẩu không trùng lặp\n" +
                    "4.\tQuay lai menu chinh");
            System.out.print("Chọn chức năng: ");
            String chonMenu = input.nextLine();
            if (KiemTra.kiemTraSoNguyen(chonMenu)) {
                chon = Integer.parseInt(chonMenu);
                switch (chon) {
                    case 1:
                        hienthiSPNhapKhau();
                        break;
                    case 2:
                        hienthiSPXuatKhau();
                        break;
                    case 3:
                        hienThiMenu();
                        break;
                    default:
                        System.out.println("sự lựa chọn không tồn tại");
                        hienThiMenu();
                }
            } else System.out.println("Lựa chọn không hợp lệ");
        } while (true) ;

    }

    private static void hienthiSPXuatKhau() {
        List<SanPhamXuatKhau> danhSachXK = DocGhiFile.docFileXK();
        if (danhSachXK.isEmpty())
            System.out.println("Chưa có sản phẩm nào");
        else {
            System.out.println("Danh sách sản phẩm: ");
            int bienDem = 0;
            for (SanPhamXuatKhau element : danhSachXK) {
                System.out.println((bienDem + 1) + ". " + element.toString());
                bienDem++;
            }
        }
    }

    private static void hienthiSPNhapKhau() {
        List<SanPhamNhapKhau> danhSachNK = DocGhiFile.docFileNK();
        if (danhSachNK.isEmpty()) System.out.println("Chưa có thông tin sản phẩm nào");
        else {
            System.out.println("Danh sách sản phẩm: ");
            int bienDem = 0;
            for (SanPhamNhapKhau element : danhSachNK) {
                System.out.println((bienDem + 1) + ". " + element.toString());
                bienDem++;
            }
        }
    }

    private static void xoaSanPham() {
        int chon;
        do {
            System.out.println("Thêm sản Phẩm vui lòng chọn theo chức năng\n" +
                    "1.xoa sản phẩm nhập khẩu\n" +
                    "2. xoa sản phẩm xuất khẩu\n" +
                    "3.quay lai menu chinh");
            System.out.print("Chọn chức năng: ");
            String chonMenu = input.nextLine();
            if (KiemTra.kiemTraSoNguyen(chonMenu)) {
                chon = Integer.parseInt(chonMenu);
                switch (chon) {
                    case 1:
                        xoaSPNhapKhau();
                        break;
                    case 2:
                        xoaSPXuatKhau();
                        break;
                    case 3:
                        hienThiMenu();
                        break;
                    default:
                        System.out.println("sự lựa chọn không tồn tại");
                        hienThiMenu();
                }

            } else System.out.println("Lựa chọn không hợp lệ");
        } while (true) ;

    }

    private static void xoaSPXuatKhau() {
        if (danhSachXK.isEmpty()){
            System.out.println("Hiện tại chưa có thông tin nào");
        }
        else {
            do {
                try {
                    SanPhamXuatKhau sanPhamXuatKhau = null;
                    System.out.print("Nhập id san pham bạn cần xóa: ");
                    String nhap = input.nextLine();
                    for (int i = 0; i < danhSachXK.size(); i++) {
                        if (Integer.parseInt(nhap)  == (danhSachXK.get(i).getIdSP())) {
                            sanPhamXuatKhau = danhSachXK.get(i);
                            break;
                        }
                    }
                    if (sanPhamXuatKhau != null) {
                        do {
                            System.out.println("Bạn có thật sự muốn xóa sp này không?\n" +
                                    "====================================================\n" +
                                    "Nhập Y để xóa\n" +
                                    "Nếu không thì nhập N\n" +
                                    "====================================================");
                            String chon = input.nextLine();
                            if (chon.equals("Y")|chon.equals("y")) {
                                danhSachXK.remove(sanPhamXuatKhau);
                                DocGhiFile.ghiFileXuatKhau(danhSachXK);
                                hienthiSPXuatKhau();
                                System.out.println("đã xóa thành công ");
                                return;
                            }
                            if (chon.equals("N")|chon.equals("n")){
                                return;
                            }
                        } while (true);
                    } else throw new NotFoundDirectoryException();
                } catch (NotFoundDirectoryException e) {
                    e.thongBao();
                    System.out.println("====================================================\n" +
                            "Bạn có muốn quay về Menu chính không?\n" +
                            "Nhấn Enter để quay về\n" +
                            "Nhập N để xóa tiếp\n" +
                            "====================================================");
                    if (input.nextLine().equals("")) return;
                }
            } while (true);
        }
    }

    private static void xoaSPNhapKhau() {
        if (danhSachNK.isEmpty()){
            System.out.println("Hiện tại chưa có thông tin nào");
        }
        else {
            do {
                try {
                    SanPhamNhapKhau sanPhamNhapKhau = null;
                    System.out.print("Nhập mã số san pham bạn cần xóa: ");
                    String nhap = input.nextLine();
                    for (int i = 0; i < danhSachNK.size(); i++) {
                        if (Integer.parseInt(nhap)  == (danhSachNK.get(i).getIdSP())) {
                            sanPhamNhapKhau = danhSachNK.get(i);
                            break;
                        }
                    }
                    if (sanPhamNhapKhau != null) {
                        do {
                            System.out.println("Bạn có thật sự muốn xóa sp này không?\n" +
                                    "====================================================\n" +
                                    "Nhập Y để xóa\n" +
                                    "Nếu không thì nhập N\n" +
                                    "====================================================");
                            String chon = input.nextLine();
                            if (chon.equals("Y")|chon.equals("y")) {
                                danhSachNK.remove(sanPhamNhapKhau);
                                DocGhiFile.ghiFileNhapKhau(danhSachNK);
                                hienthiSPXuatKhau();
                                System.out.println("đã xóa thành công ");
                                return;
                            }
                            if (chon.equals("N")|chon.equals("n")){
                                return;
                            }
                        } while (true);
                    } else throw new NotFoundDirectoryException();
                } catch (NotFoundDirectoryException e) {
                    e.thongBao();
                    System.out.println("====================================================\n" +
                            "Bạn có muốn quay về Menu chính không?\n" +
                            "Nhấn Enter để quay về\n" +
                            "Nhập N để xóa tiếp\n" +
                            "====================================================");
                    if (input.nextLine().equals("")) return;
                }
            } while (true);
        }
    }

    private static void themMoiSanPham() {
        int chon;
        do {
            System.out.println("THÊM MỚI SẢN PHẨM\n" +
                    "1.\tThêm sản phẩm nhập khẩu\n" +
                    "2.\tThêm sản phẩm xuất khẩu\n" +
                    "3.\nQuay lai menu chinh");
            System.out.print("Chọn chức năng: ");
            String chonMenu = input.nextLine();
            if (KiemTra.kiemTraSoNguyen(chonMenu)) {
                chon = Integer.parseInt(chonMenu);
                switch (chon) {
                    case 1:
                        themSPNhapKhau();
                        break;
                    case 2:
                        themSPXuatKhau();
                        break;
                    case 3:
                        hienThiMenu();
                        break;
                    default:
                        System.out.println("sự lựa chọn không tồn tại");
                        hienThiMenu();
                }

            } else System.out.println("Lựa chọn không hợp lệ");
        } while (true) ;

    }

    private static void themSPXuatKhau() {
        List<SanPhamXuatKhau> danhSachXK=new ArrayList<>();
        int idSP=0;
        idSP = (danhSachXK.size() == 0) ? 1 : idSP + (danhSachXK.get(danhSachXK.size() - 1).getIdSP() + 1);
        System.out.println("id san pham"+idSP);
        System.out.println("nhap ma san pham");
        String maSP=input.nextLine();
        System.out.println("nhap ten san pham");
        String tenSp=input.nextLine();
        String giaSP;
        do{
            System.out.println("nhap gia san pham");
            giaSP=input.nextLine();
            if (KiemTra.kiemTraSoNguyen(giaSP)){
                break;
            }else {
                System.out.println("gia nhap phap la so duong");
            }
        }while (true);

        String soLuongSP ;
        do {
            System.out.println("nhap so luong san pham");
            soLuongSP=input.nextLine();
            if (KiemTra.kiemTraSoNguyen(soLuongSP)){
                break;
            }else {
                System.out.println("phai la so duong");
            }
        }while (true);

        System.out.println("nhap hang san xuat");
        String hangSX=input.nextLine();

        String giaXK;
        do {
            System.out.println("nhap gia xuat khau");
            giaXK=input.nextLine();
            if (KiemTra.kiemTraSoNguyen(giaXK)){
                break;
            }else {
                System.out.println("phai la so duong");
            }
        }while (true);

        System.out.println("nhap quoc gia nhap khau");
        String nuocNK=input.nextLine();

        SanPhamXuatKhau sanPhamXuatKhau = new SanPhamXuatKhau(idSP,maSP,tenSp,giaSP,soLuongSP,hangSX,giaXK,nuocNK);
        danhSachXK.add(sanPhamXuatKhau);
        DocGhiFile.ghiFileXuatKhau(danhSachXK);
        hienthiSPXuatKhau();
    }

    private static void themSPNhapKhau() {
        List<SanPhamNhapKhau> danhSachNK= DocGhiFile.docFileNK();
        int idSP=0;
        idSP = (danhSachNK.size() == 0) ? 1 : idSP + (danhSachNK.get(danhSachNK.size() - 1).getIdSP() + 1);
        System.out.println("id san pham"+idSP);
        System.out.println("nhap ma san pham");
        String maSP=input.nextLine();
        System.out.println("nhap ten san pham");
        String tenSp=input.nextLine();
        String giaSP;
        do{
            System.out.println("nhap gia san pham");
            giaSP=input.nextLine();
            if (KiemTra.kiemTraSoNguyen(giaSP)){
                break;
            }else {
                System.out.println("gia nhap phap la so duong");
            }
        }while (true);

        String soLuongSP;
        do {
            System.out.println("nhap so luong san pham");
            soLuongSP=input.nextLine();
            if (KiemTra.kiemTraSoNguyen(soLuongSP)){
                break;
            }else {
                System.out.println("phai la so duong");
            }
        }while (true);

        System.out.println("nhap hang san xuat");
        String hangSX=input.nextLine();

        String giaNhapKhau ;
        do {
            System.out.println("nhap gia nhap khau");
            giaNhapKhau=input.nextLine();
            if(KiemTra.kiemTraSoNguyen(giaNhapKhau)){
                break;
            }else {
                System.out.println("phai la so duong");
            }
        }while (true);

        System.out.println("nhap tinh nhap khau");
        String tinhNhapKhau=input.nextLine();

        String thueNhapKhau ;
        do{
            System.out.println("nhap thue nhap khau");
            thueNhapKhau=input.nextLine();
            if(KiemTra.kiemTraSoNguyen(thueNhapKhau)){
                break;
            }else {
                System.out.println("phai la so duong");
            }
        }while (true);

        SanPhamNhapKhau sanPhamNhapKhau=new SanPhamNhapKhau(idSP,maSP,tenSp,giaSP,soLuongSP,hangSX,giaNhapKhau,
                tinhNhapKhau,thueNhapKhau);
        danhSachNK.add(sanPhamNhapKhau);
        DocGhiFile.ghiFileNhapKhau(danhSachNK);
        hienthiSPNhapKhau();
    }

    public static void main(String[] args) {
        hienThiMenu();
    }
}
