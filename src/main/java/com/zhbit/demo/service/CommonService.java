package com.zhbit.demo.service;

import com.zhbit.demo.mapper.CommonMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CommonService {

    @Autowired
    CommonMapper commonMapper;

    public String Login(String sno) {
        return commonMapper.Login(sno);
    }
}
