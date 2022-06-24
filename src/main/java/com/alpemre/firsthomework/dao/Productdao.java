package com.alpemre.firsthomework.dao;

import com.alpemre.firsthomework.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Date;
import java.util.List;

public interface Productdao extends JpaRepository<Product,Long> {


    List<Product> findAllByExpirationDateLessThan(Date date);



    List<Product> findAllByExpirationDateAfter(Date date);


}
