package com.alpemre.firsthomework.entity;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "User")
@Getter
@Setter

public class Customer {

    @Id
    @GeneratedValue (generator = "User")
    @SequenceGenerator (name = "User", sequenceName = "USER_ID_SEQ")

    private Long id;
@Column(name = "NAME",length = 50,nullable = false)

    private String Name;

@Column(name = "SURNAME",length = 50,nullable = false)

    private String Surname;

@Column(name = "EMAİL",length = 50,nullable = false)

    private String Email;

@Column(name = "PHONE_NUMBER",length = 15,nullable = false)

    private String PhoneNumber;



}
