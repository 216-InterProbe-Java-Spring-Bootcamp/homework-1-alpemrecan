package com.alpemre.firsthomework.controller;


import com.alpemre.firsthomework.dao.Productdao;
import com.alpemre.firsthomework.entity.Product;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

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
    public List<Product> findAll(){
        return productdao.findAll();
    }

}
