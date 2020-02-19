package com.maik.springboot.carregistration.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.maik.springboot.carregistration.domain.Brand;
import com.maik.springboot.carregistration.repository.BrandRepository;

@Service
public class BrandServiceImpl implements BrandService {
    
    private BrandRepository brandRepository;
    
    @Autowired
    private BrandServiceImpl(BrandRepository brandRepository) {
        this.brandRepository = brandRepository;
    }

    @Override
    public List<Brand> getAllBrands() {
        return brandRepository.findAll();
    }

}
