package com.codegym.repository;


import com.codegym.model.BillDetail;
import com.codegym.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BillDetailRepository extends JpaRepository<BillDetail, Integer> {

    List<BillDetail> findAllByBillUser(User bill_user);
}
