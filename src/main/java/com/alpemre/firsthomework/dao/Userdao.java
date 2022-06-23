package com.alpemre.firsthomework.dao;

import com.alpemre.firsthomework.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Userdao extends JpaRepository<Customer,Long> {




}
