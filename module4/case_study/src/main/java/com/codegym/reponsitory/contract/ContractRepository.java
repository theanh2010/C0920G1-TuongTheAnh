package com.codegym.reponsitory.contract;

import com.codegym.model.contract.Contract;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContractRepository extends JpaRepository<Contract, Long> {
    Contract findByCode(String code);
}
