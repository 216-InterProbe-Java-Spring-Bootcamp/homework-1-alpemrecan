package com.alpemre.firsthomework.dao;

import com.alpemre.firsthomework.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Productdao extends JpaRepository<Product,Long> {




}
