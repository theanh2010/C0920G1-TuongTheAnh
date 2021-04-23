package serivice.benh_nhan;

import model.BenhNhan;
import reponsitory.benh_an.BenhAnRepository;
import reponsitory.benh_nhan.BenhNhanRepository;
import serivice.benh_an.IBenhAnService;

import java.util.List;

public class BenhNhanService implements IBenhNhanService {
    BenhNhanRepository benhNhanRepository = new BenhNhanRepository();
    @Override
    public List<BenhNhan> selectAllBenhNhan() {
        return benhNhanRepository.selectAllBenhNhan();
    }
}
