package com.sapient.exercise.dao;

import com.sapient.exercise.entity.Brand;
import com.sapient.exercise.entity.Product;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends CrudRepository<Product,Long> {

    public List<Product> findAllByBrand(Brand brand);
    public List<Product> findAllByType(String type);
    public List<Product> findAllByColor(String color);


}
