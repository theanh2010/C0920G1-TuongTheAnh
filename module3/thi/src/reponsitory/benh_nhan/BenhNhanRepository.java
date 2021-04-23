package reponsitory.benh_nhan;

import model.BenhNhan;
import reponsitory.connection.DBconnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class BenhNhanRepository implements IBenhNhanRepository {
    private static final String SELECT_ALL_BENH_NHAN = "SELECT * FROM benh_nhan";
    @Override
    public List<BenhNhan> selectAllBenhNhan() {
        Connection connection = DBconnection.getConnection();
        PreparedStatement preparedStatement =null;
        ResultSet resultSet = null;
        List<BenhNhan> benhNhanList = new ArrayList<>();

        try {
            preparedStatement = connection.prepareStatement(SELECT_ALL_BENH_NHAN);
            resultSet = preparedStatement.executeQuery();

            while (resultSet.next()){
                int id_benh_nhan = resultSet.getInt("id_benh_nhan");
                String ten_benh_nhan = resultSet.getString("ten_benh_nhan");

                benhNhanList.add(new BenhNhan(id_benh_nhan,ten_benh_nhan));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return benhNhanList;
    }

    @Override
    public BenhNhan selectBenhNhanById() {
        return null;
    }

    @Override
    public void insertBenhNhan(BenhNhan benhNhan) {

    }

    @Override
    public void deleteBenhNhan(String id) {

    }

    @Override
    public void updateBenhNhan(BenhNhan benhNhan) {

    }

    @Override
    public List<BenhNhan> selectBenhNhanByName(String name) {
        return null;
    }
}
