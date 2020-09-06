package com.mybatis.mybatisproject.api.srv01.dto;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.Date;

@Getter
@Setter
public class Srv01DTO implements Serializable {
    private static final long serialVersionUID = 6691176852116980758L;

    private String ID;
    private String TITLE;
    private String CONTENT;
    private String USER_ID;
    private Date CREATE_DATE;
    private Date UPDATE_DATE;
}
