package com.mybatis.mybatisproject.api.srv01.service.impl;

import com.mybatis.mybatisproject.api.srv01.mapper.Srv01Mapper;
import com.mybatis.mybatisproject.api.srv01.service.Srv01Service;
import com.mybatis.mybatisproject.api.srv01.dto.Srv01DTO;
import com.mybatis.mybatisproject.api.srv01.vo.Srv01VO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service("com.mybatis.mybatisproject.api.srv01.service.impl.Srv01ServiceImpl")
public class Srv01ServiceImpl implements Srv01Service {

    @Autowired
    Srv01Mapper srv01Mapper;

    @Override
    public List<Srv01DTO> getSrv01List() {
        return srv01Mapper.selectSrv01List();
    }

    @Override
    public List<Srv01DTO> getSrv01ListSearch(Srv01VO vo) {
        log.info("title = {}", vo.getTitle());
        log.info("userId = {}", vo.getUserId());
        return srv01Mapper.selectSrv01ListUseVo(vo);
    }
}
