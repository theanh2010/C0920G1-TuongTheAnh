package reponsitory.benh_nhan;

import model.BenhNhan;

import java.util.List;

public interface IBenhNhanRepository {
    List<BenhNhan> selectAllBenhNhan();

    BenhNhan selectBenhNhanById();

    void insertBenhNhan(BenhNhan benhNhan);

    void deleteBenhNhan(String id);

    void updateBenhNhan(BenhNhan benhNhan);

    List<BenhNhan> selectBenhNhanByName(String name);

}
