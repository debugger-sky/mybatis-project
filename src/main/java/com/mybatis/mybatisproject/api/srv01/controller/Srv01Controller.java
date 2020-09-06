package com.mybatis.mybatisproject.api.srv01.controller;

import com.mybatis.mybatisproject.api.srv01.service.Srv01Service;
import com.mybatis.mybatisproject.api.srv01.dto.Srv01DTO;
import com.mybatis.mybatisproject.api.srv01.vo.Srv01VO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class Srv01Controller {

    @Resource(name = "com.mybatis.mybatisproject.api.srv01.service.impl.Srv01ServiceImpl")
    Srv01Service srv01Service;

    @GetMapping("/srv01list")
    public ResponseEntity<List<Srv01DTO>> srv01List() {
        return new ResponseEntity<>(srv01Service.getSrv01List(), HttpStatus.OK);
    }

    @PostMapping("/srv01listusevo")
    public ResponseEntity<List<Srv01DTO>> srv01ListUseVo(Srv01VO srv01VO) {
        return new ResponseEntity<>(srv01Service.getSrv01ListSearch(srv01VO), HttpStatus.OK);
    }
}
