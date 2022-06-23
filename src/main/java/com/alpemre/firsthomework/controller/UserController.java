package com.alpemre.firsthomework.controller;


import com.alpemre.firsthomework.dao.Userdao;
import com.alpemre.firsthomework.entity.Customer;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/users")

public class UserController {
    private final Userdao userdao;

    @PostMapping
    public Customer save(@RequestBody Customer customer) {
        return userdao.save(customer);
    }

    @GetMapping
    public List<Customer> findAll(){
        return userdao.findAll();
    }





}
