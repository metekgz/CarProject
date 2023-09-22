package org.etiya;

import java.util.List;
import java.util.Objects;

public class BrandManager {

    List<BaseLogger> loggers;
    private BrandDao brandDao;

    public BrandManager(BrandDao brandDao, List<BaseLogger> loggers) {
        this.loggers = loggers;
        this.brandDao = brandDao;
    }

    public void add(Brand brand) {
        List<Brand> brands = brandDao.getAll();
        for (Brand br : brands) {
            if (Objects.equals(br.getName(), brand.getName())) {
                System.out.println("Dont add to same brand name");
                return;
            }
        }
        brandDao.add(brand);
        runLoggers(brand);
    }

    public void update(Brand brand) {
        brandDao.update(brand);
        runLoggers(brand);
    }

    public void delete(int id) {
        brandDao.delete(id);
    }

    public Brand getById(int id) {
        return brandDao.getById(id);
    }

    public List<Brand> getAll() {
        return brandDao.getAll();
    }

    public void runLoggers(Brand brand) {
        for (BaseLogger baseLogger : loggers) {
            baseLogger.Log("Brand added to " + brand.getName());
        }
    }
}
