package com.maik.springboot.carregistration.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.maik.springboot.carregistration.domain.Brand;

@Repository
public interface BrandRepository extends JpaRepository<Brand, Long> {

}
