package com.alpemre.firsthomework.controller;

import com.alpemre.firsthomework.dao.ProductCommentdao;
import com.alpemre.firsthomework.entity.ProductComment;
import lombok.RequiredArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
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

    @GetMapping("/productcomments")
    public List<ProductComment> findAllByProduct_Id(@RequestParam Long productid) {
        return productCommentdao.findAllByProduct_Id(productid);
    }

    @GetMapping("/customercomments")
    public List<ProductComment> findAllByCustomer_Id(@RequestParam Long customerid) {
        return productCommentdao.findAllByCustomer_Id(customerid);
    }


    @GetMapping("/productcommentdate")
    public List<ProductComment> findAllByProduct_IdAndCommentDateBetween(@RequestParam Long productid,
                                                                         @RequestParam @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) Date datestart,
                                                                         @RequestParam @DateTimeFormat(pattern = "yyyy-MM-dd") Date dateend) {

        return productCommentdao.findAllByProduct_IdAndCommentDateBetween(productid, datestart, dateend);
    }


}
