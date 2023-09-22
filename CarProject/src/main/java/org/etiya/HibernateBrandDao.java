package org.etiya;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class HibernateBrandDao implements BrandDao {
    List<Brand> brands;

    public HibernateBrandDao() {
        this.brands = new ArrayList<>();
    }

    @Override
    public void add(Brand brand) {
        brands.add(brand);
        System.out.println("Added to Hibernate");
    }

    @Override
    public void update(Brand brand) {
        System.out.println("Updated to Hibernate");
    }

    @Override
    public void delete(int id) {
        System.out.println("Deleted to Hibernate");
    }

    @Override
    public Brand getById(int id) {
        for (Brand brand : brands) {
            if (brand.getId() == id) {
                System.out.println(brand.getName() + " Brand Listed with hibernate");
                return brand;
            }
        }
        System.out.println("Brand not found");
        return null;
    }

    @Override
    public List<Brand> getAll() {
        for (Brand brand : brands) {
            System.out.println(brand.getName() + " Brand Listed with hibernate");
        }
        return brands;
    }
}
