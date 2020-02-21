package com.maik.springboot.carregistration.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;

import com.maik.springboot.carregistration.domain.Brand;
import com.maik.springboot.carregistration.service.BrandService;

@RestController
public class BrandController {
    
    private BrandService brandService;

    @Autowired
    private BrandController(BrandService brandService) {
        this.brandService = brandService;
    }
    
    @GetMapping(value = "/brand", produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.OK)
    public List<Brand> getAllBrands(){
        return brandService.getAllBrands();
    }

    @GetMapping("/brand/{name}")
    public List<Brand> findByTitle(@PathVariable String name) {
        return brandService.findByName(name);
    }

}
