package serivice.benh_an;

import model.BenhAn;
import reponsitory.benh_an.BenhAnRepository;

import java.util.List;

public class BanhAnService implements IBenhAnService {
        BenhAnRepository benhAnRepository = new BenhAnRepository();

    @Override
    public List<BenhAn> selectAllBenhAn() {
        return benhAnRepository.selectAllBenhAn();
    }

    @Override
    public void insertBenhAn(BenhAn benhAn) {
        benhAnRepository.insertBenhAnh(benhAn);

    }

    @Override
    public void deleteBenhAn(String id) {
        benhAnRepository.deleteBenhAn(id);
    }

    @Override
    public void updateBenhAn(BenhAn benhAn) {
        benhAnRepository.updateBenhAn(benhAn);
    }
}
