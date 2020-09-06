package com.mybatis.mybatisproject.api.srv01.mapper;

import com.mybatis.mybatisproject.api.srv01.dto.Srv01DTO;
import com.mybatis.mybatisproject.api.srv01.vo.Srv01VO;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface Srv01Mapper {
    List<Srv01DTO> selectSrv01List();
    List<Srv01DTO> selectSrv01ListUseVo(Srv01VO vo);
}
