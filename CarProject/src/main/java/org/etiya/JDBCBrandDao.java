package org.etiya;
import java.util.ArrayList;
import java.util.List;

public class JDBCBrandDao implements BrandDao {

    List<Brand> brands;

    public JDBCBrandDao() {
        this.brands = new ArrayList<>();
    }

    @Override
    public void add(Brand brand) {
        brands.add(brand);
        System.out.println("Added to JDBC");
    }

    @Override
    public void update(Brand brand) {
        System.out.println("Updated to JDBC");
    }

    @Override
    public void delete(int id) {
        System.out.println("Deleted to JDBC");
    }

    @Override
    public Brand getById(int id) {
        for (Brand brand : brands) {
            if (brand.getId() == id) {
                System.out.println(brand.getName() + " Brand Listed with JDBC");
                return brand;
            }
        }
        System.out.println("Brand not found");
        return null;
    }

    @Override
    public List<Brand> getAll() {
        for (Brand brand : brands) {
            System.out.println(brand.getName() + " Brand Listed with JDBC");
        }
        return brands;
    }
}
