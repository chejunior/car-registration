package com.maik.springboot.carregistration.service;

import java.util.List;

import com.maik.springboot.carregistration.domain.Brand;

public interface BrandService {
    
    List<Brand> getAllBrands();

    List<Brand> findByName(String name);

}
