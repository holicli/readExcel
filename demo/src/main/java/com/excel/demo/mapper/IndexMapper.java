package com.excel.demo.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

@Mapper
@Component
public interface IndexMapper {
    int setvalue(List<Map<String,Object>> list );
}
