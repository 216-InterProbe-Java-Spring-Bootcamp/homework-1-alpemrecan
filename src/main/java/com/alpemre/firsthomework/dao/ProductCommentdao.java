package com.alpemre.firsthomework.dao;

import com.alpemre.firsthomework.entity.ProductComment;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Date;
import java.util.List;


public interface ProductCommentdao extends JpaRepository<ProductComment,Long> {

    List<ProductComment> findAllByProduct_Id(Long productId);

    List<ProductComment> findAllByCustomer_Id(Long customerId);


    List<ProductComment>findAllByProduct_IdAndCommentDateBetween(Long productId, Date dateStart,Date dateEnd);


    List<ProductComment> findAllByCustomer_IdAndCommentDateBetween(Long customerId,Date dateStart,Date dateEnd);

}
