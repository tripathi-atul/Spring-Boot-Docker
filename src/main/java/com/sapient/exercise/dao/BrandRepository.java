package com.sapient.exercise.dao;

import com.sapient.exercise.entity.Brand;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;


@Repository
public interface BrandRepository extends CrudRepository<Brand,Long> {

    public Optional<Brand> findByBrandName(String brandName);
}
