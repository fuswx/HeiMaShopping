package com.fuswx.heimashopping.Mapper;

import com.fuswx.heimashopping.Bean.SwiperData;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.ArrayList;
import java.util.HashMap;

@Mapper
public interface IndexMapper {

    @Select("select * from swiperdata")
    ArrayList<SwiperData> getSwiperData();

    @Select("select * from ${formName}")
    ArrayList<HashMap<Object, Object>> getClass(String formName);
}
