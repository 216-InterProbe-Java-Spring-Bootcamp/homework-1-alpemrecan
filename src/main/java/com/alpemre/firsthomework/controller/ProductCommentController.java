package com.alpemre.firsthomework.controller;

import com.alpemre.firsthomework.dao.ProductCommentdao;
import com.alpemre.firsthomework.entity.ProductComment;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/productcomment")

public class ProductCommentController {
    private final ProductCommentdao productCommentdao;

    @PostMapping
    public ProductComment save(@RequestBody ProductComment productComment) {
        return productCommentdao.save(productComment);
    }

    @GetMapping
    public List<ProductComment> findAll() {
        return productCommentdao.findAll();
    }


}
