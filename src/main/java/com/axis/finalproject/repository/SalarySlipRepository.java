package com.axis.finalproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.axis.finalproject.entity.SalarySlip;
@Repository
public interface SalarySlipRepository extends JpaRepository<SalarySlip, String> {
	SalarySlip findByEmpId(int id);
}
