package com.codegym.demo.reponsitory;

import com.codegym.demo.model.Province;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface ProvinceRepository extends PagingAndSortingRepository<Province , Long> {

}
