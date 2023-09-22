package org.etiya;

import java.util.List;

public interface BrandDao {
    public void add(Brand brand);

    public void update(Brand brand);

    public void delete(int id);

    public Brand getById(int id);

    public List<Brand> getAll();

}
