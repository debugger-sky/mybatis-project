package com.mybatis.mybatisproject.api.srv01.service;

import com.mybatis.mybatisproject.api.srv01.dto.Srv01DTO;
import com.mybatis.mybatisproject.api.srv01.vo.Srv01VO;

import java.util.List;

public interface Srv01Service {
    public List<Srv01DTO> getSrv01List();
    public List<Srv01DTO> getSrv01ListSearch(Srv01VO vo);
}
