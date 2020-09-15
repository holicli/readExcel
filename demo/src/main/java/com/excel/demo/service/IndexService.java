package com.excel.demo.service;

import com.excel.demo.mapper.IndexMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class IndexService {
    @Autowired
    private IndexMapper indexMapper;

    public int setvalue(List<Map<String,Object>> list ){
        return indexMapper.setvalue(list);
    }
}
