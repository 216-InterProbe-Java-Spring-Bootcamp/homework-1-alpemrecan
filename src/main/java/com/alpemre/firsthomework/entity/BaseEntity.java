package com.alpemre.firsthomework.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.MappedSuperclass;
import java.io.Serializable;
import java.util.Date;

@MappedSuperclass
@Setter
@Getter
@ToString

public class BaseEntity implements Serializable {

    private Date createDate;
    private String creatBy;
    private Date uprateDate;
    private String uprateBy;


}
