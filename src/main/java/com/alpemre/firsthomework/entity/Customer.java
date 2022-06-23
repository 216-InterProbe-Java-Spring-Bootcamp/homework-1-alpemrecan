package com.alpemre.firsthomework.entity;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "User")
@Getter
@Setter

public class Customer extends BaseEntity {

    @Id
    @GeneratedValue(generator = "User")
    @SequenceGenerator(name = "User", sequenceName = "USER_ID_SEQ")

    private Long id;


    @Column(name = "NAME", length = 50, nullable = false)

    private String Name;

    @Column(name = "SURNAME", length = 50, nullable = false)

    private String Surname;

    @Column(name = "EMAİL", length = 50, nullable = false)

    private String Email;

    @Column(name = "PHONE_NUMBER", length = 15, nullable = false)

    private String PhoneNumber;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "customer")
    private List<ProductComment> productComments;


}
