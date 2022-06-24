package com.alpemre.firsthomework.entity;


import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "PRODUCT")
@Getter
@Setter

public class Product {

    @Id
    @GeneratedValue(generator = "Product")
    @SequenceGenerator(name = "Product", sequenceName = "PRODUCT_ID_SEQ")
    private Long id;

    @Column(name = "PRODUCT_NAME", length = 150, nullable = false)
    private String productName;

    @Column(name = "PRİCE", nullable = false, scale = 2)
    private BigDecimal price;

    @Column(name = "EXPİRATİON_DATE", nullable = true)
    @Temporal(TemporalType.DATE)
    private Date expirationDate;

    @JsonIgnore
    @OneToMany(cascade = CascadeType.ALL,fetch = FetchType.LAZY, mappedBy = "product")
    private List<ProductComment> productComments;


}
