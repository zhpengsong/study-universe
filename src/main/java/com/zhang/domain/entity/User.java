package com.zhang.domain.entity;

import lombok.Data;

import java.util.Date;

@Data
public class User {
    private Long id;

    private String userLogin;

    private String userPass;

    private String userNicename;

    private String userEmail;

    private String userUrl;

    private String avatar;

    private Short sex;

    private Date birthday;

    private String signature;

    private String lastLoginIp;

    private Date lastLoginTime;

    private Date createTime;

    private String userActivationKey;

    private Integer userStatus;

    private Integer score;

    private Short userType;

    private Integer coin;

    private String mobile;

    private String payPwd;

    private String qq;

    private String linkman;

    private Integer ownerId;

    private Integer memId;

    private Integer cpId;

}