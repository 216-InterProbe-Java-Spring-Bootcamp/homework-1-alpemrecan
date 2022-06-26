package com.alpemre.firsthomework.controller;


import com.alpemre.firsthomework.dao.Productdao;
import com.alpemre.firsthomework.entity.Product;
import lombok.RequiredArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/products")
public class ProductController {
    private final Productdao productdao;

    @PostMapping
    public Product save(@RequestBody Product product) {
        return productdao.save(product);
    }

    @GetMapping
    public List<Product> findAll() {
        return productdao.findAll();
    }

    @GetMapping("/expirationDates")
    public List<Product>findAllByExpirationDateLessThan(@RequestParam @DateTimeFormat(pattern = "yyyy-MM-dd") Date date) {
        return productdao.findAllByExpirationDateLessThan(date);

    }

    @GetMapping("/ExpirationDatesGreaterThanEqual")

    public List<Product>ExpirationDateGreaterThanEqual(@RequestParam @DateTimeFormat(pattern = "yyyy-MM-dd")Date date){
        return productdao.findAllByExpirationDateIsGreaterThanEqualOrExpirationDateIsNull(date);
    }

}
