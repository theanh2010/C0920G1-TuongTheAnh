package com.codegym.service.contract;

import com.codegym.model.contract.Contract;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public interface ContractService {
    Contract findByCode(String code);

    void save(Contract contract);

    Page<Contract> findAll(Pageable pageable);

    Contract findById(Long idContract);
}
