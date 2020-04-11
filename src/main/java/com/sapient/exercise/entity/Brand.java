package com.sapient.exercise.entity;

import javax.persistence.*;

@Entity
@Table(name="brand")
public class Brand {

    public Long getBrandId() {
        return brandId;
    }

    public void setBrandId(Long brandId) {
        this.brandId = brandId;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public String getBrandDescription() {
        return brandDescription;
    }

    public void setBrandDescription(String brandDescription) {
        this.brandDescription = brandDescription;
    }

    @Id
    @GeneratedValue
    @Column(name="brand_id")
    private Long brandId;

    @Column(name="brand_Name")
    private String brandName;
    @Column(name="brand_Description")
    private String brandDescription;


}
