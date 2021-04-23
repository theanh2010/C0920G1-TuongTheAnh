package reponsitory.benh_an;

import model.BenhAn;
import reponsitory.connection.DBconnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class BenhAnRepository implements IBenhAnRepository {
    private static final String SELECT_ALL_BENH_AN = "SELECT * FROM benh_an JOIN benh_nhan ON (benh_an.id_benh_nhan = benh_nhan.id_benh_nhan);";

    private static final String INSERT_BENH_AN = "INSERT INTO benh_an (id_benh_an," +
            " id_benh_nhan," +
            " ngay_nhap_vien," +
            " ngay_ra_vien," +
            " bac_si_dieu_tri," +
            " ly_do," +
            " VALUE(?, ?, ?, ?, ?, ?);";
    private static final String UPDATE_BENH_AN = "UPDATE benh_an SET ngay_nhap_vien = ?,"+
            " ngay_ra_vien = ?," +
            " bac_si_dieu_tri = ?," +
            " ly_do = ?;";

    private static final String DELETE_BENH_AN = "DELETE FROM benh_an WHERE id_benh_an = ?";


    @Override
    public List<BenhAn> selectAllBenhAn() {
        Connection connection = DBconnection.getConnection();
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        List<BenhAn> benhAnList = new ArrayList<>();

        try {

            preparedStatement = connection.prepareStatement(SELECT_ALL_BENH_AN);

            resultSet = preparedStatement.executeQuery();

            while (resultSet.next()){
                String id_benh_an = "BA-" + resultSet.getString("id_benh_an");
                String id_benh_nhan = "BN-" +resultSet.getString("id_benh_nhan");
                String ngay_nhap_vien = resultSet.getString("ngay_nhap_vien");
                String ngay_ra_vien = resultSet.getString("ngay_ra_vien");
                String bac_si_dieu_tri = resultSet.getString("bac_si_dieu_tri");

                String ly_do = resultSet.getString("ly_do");
                String ten_benh_nhan = resultSet.getString("ten_benh_nhan");
                benhAnList.add(new BenhAn(id_benh_an,id_benh_nhan,ngay_nhap_vien,ngay_ra_vien,bac_si_dieu_tri,ly_do,ten_benh_nhan));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            try {
                assert preparedStatement != null;
                preparedStatement.close();
                resultSet.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
            DBconnection.close();
        }
        return benhAnList;
    }

    @Override
    public BenhAn selectBenhAnhById() {
        return null;
    }

    @Override
    public void insertBenhAnh(BenhAn benhAn) {
        Connection connection = DBconnection.getConnection();
        PreparedStatement preparedStatement = null;

        try {
            preparedStatement= connection.prepareStatement(INSERT_BENH_AN);
            preparedStatement.setInt(1,Integer.parseInt(benhAn.getId_benh_an().substring(3)));
            preparedStatement.setInt(1,Integer.parseInt(benhAn.getId_benh_nhan().substring(3)));
            preparedStatement.setString(3,benhAn.getNgay_ra_vien());
            preparedStatement.setString(4,benhAn.getNgay_nhap_vien());
            preparedStatement.setString(5,benhAn.getBac_si_dieu_tri());
            preparedStatement.setString(6,benhAn.getLy_do());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            try {
                preparedStatement.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
            DBconnection.close();
        }
    }

    @Override
    public void deleteBenhAn(String id) {
        Connection connection = DBconnection.getConnection();
        PreparedStatement preparedStatement = null;

        try {
            preparedStatement = connection.prepareStatement(DELETE_BENH_AN);

            preparedStatement.setInt(1,Integer.parseInt(id.substring(3)));

            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            try {
                preparedStatement.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
            DBconnection.close();
        }
    }

    @Override
    public void updateBenhAn(BenhAn benhAn) {
        Connection connection = DBconnection.getConnection();
        PreparedStatement preparedStatement = null;
        try {
            preparedStatement = connection.prepareStatement(UPDATE_BENH_AN);
            preparedStatement.setString(1,benhAn.getNgay_nhap_vien());
            preparedStatement.setString(2,benhAn.getNgay_ra_vien());
            preparedStatement.setString(3,benhAn.getBac_si_dieu_tri());
            preparedStatement.setString(4,benhAn.getLy_do());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            try {
                preparedStatement.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
            DBconnection.close();
        }

    }

    @Override
    public List<BenhAn> selectCustomerByName(String name) {
        return null;
    }
}
