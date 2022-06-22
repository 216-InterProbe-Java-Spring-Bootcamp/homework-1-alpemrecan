package com.alpemre.firsthomework.entity;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "PRODUCTCOMMENT")
@Getter
@Setter

public class ProductComment {

    @Id
    @GeneratedValue(generator = "ProductComment")
    @SequenceGenerator(name = "ProductComment",sequenceName = "PRODUCTCOMMENT_ID_SEQ")

    private Long id;

@Column(name = "COMMENT",length = 500)

    private String comment;

@Column(name = "COMMENT_DATE")

    private Date commentDate;

@Column(name = "PRODUCT_ID")

    private Long productID;

@Column(name = "USER_ID")

    private Long userID;


}
