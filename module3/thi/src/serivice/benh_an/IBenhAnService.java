package serivice.benh_an;

import model.BenhAn;

import java.util.List;

public interface IBenhAnService {
    List<BenhAn> selectAllBenhAn();

    void insertBenhAn(BenhAn benhAn);

    void deleteBenhAn(String id);

    void updateBenhAn(BenhAn benhAn);

}
