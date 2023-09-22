package org.etiya;

import java.util.List;
import java.util.logging.Logger;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Brand brand1 = new Brand(1, "BMW");
        //brand1.setId(1);
        //brand1.setName("BMW");

        Brand brand2 = new Brand(2, "AUDİ");
        //brand2.setId(2);
        //brand2.setName("AUDİ");
        Brand brand3 = new Brand(3, "AUDİ");


        JDBCBrandDao jdbcBrandDao = new JDBCBrandDao();

       BaseLogger[] loggers = {new FileLogger(),new DatabaseLogger(),new MailLogger()};

        //HibernateBrandDao hibernateBrandDao = new HibernateBrandDao();
        //array de olabilir.
        BrandManager brandManager = new BrandManager(jdbcBrandDao, List.of(loggers[1]));

        brandManager.add(brand1);
        brandManager.add(brand2);
        brandManager.add(brand3);
        brandManager.delete(1);
        brandManager.update(brand2);
        brandManager.getById(2);
        brandManager.getAll();

    }
}