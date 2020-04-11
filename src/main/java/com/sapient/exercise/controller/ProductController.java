package com.sapient.exercise.controller;


import com.sapient.exercise.dao.BrandRepository;
import com.sapient.exercise.dao.ProductRepository;
import com.sapient.exercise.entity.Brand;
import com.sapient.exercise.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    ProductRepository productRepository;

    @Autowired
    BrandRepository brandRepository;


    @RequestMapping(value = "/type/{type}", method = RequestMethod.GET,produces = "application/json")
    public List<Product> getProductByType(@PathVariable String type) {

        return productRepository.findAllByType(type);

    }

    @RequestMapping(value = "/brand/{brandName}", method = RequestMethod.GET,produces = "application/json")
    public List<Product> getProductByBrand(@PathVariable String brandName) {

        Brand brand = brandRepository.findByBrandName(brandName).get();
        return productRepository.findAllByBrand(brand);

    }

    @RequestMapping(value = "/color/{color}", method = RequestMethod.GET,produces = "application/json")
    public List<Product> getProductByColor(@PathVariable String color) {

        return productRepository.findAllByColor(color);

    }

    @RequestMapping(value = "/addProduct", method = RequestMethod.POST,produces = "application/json", consumes = "application/json")
    public Product addProduct(@RequestBody Product product) {

        return productRepository.save(product);

    }


    @RequestMapping(value = "/addBrand", method = RequestMethod.POST,produces = "application/json", consumes = "application/json")
    public Brand addNewBrand(@RequestBody Brand brand) {
        Brand savedBrand = brandRepository.save(brand);
        productRepository.deleteAll();
        return savedBrand;

    }


}
