package reponsitory.benh_an;

import model.BenhAn;

import java.util.List;

public interface IBenhAnRepository {
    List<BenhAn> selectAllBenhAn();

    BenhAn selectBenhAnhById();

    void insertBenhAnh(BenhAn benhAn);

    void deleteBenhAn(String id);

    void updateBenhAn(BenhAn benhAn);

    List<BenhAn> selectCustomerByName(String name);
}
