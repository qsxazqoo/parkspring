package com.spring.testspring;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spring.testspring.bean.ParkBean;

@Repository
public interface ParkRepository extends JpaRepository<ParkBean, String> {

}
