package com.basic.backend.user.domain;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class User {

    private Long userSeq;

    private String id;

    private String password;

    private String name;

    private String phone;

    private String email;

    private Date createDate;

}
