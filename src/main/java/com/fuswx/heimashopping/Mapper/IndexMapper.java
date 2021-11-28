package com.fuswx.heimashopping.Mapper;

import com.fuswx.heimashopping.Bean.SwiperData;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.ArrayList;

@Mapper
public interface IndexMapper {

    @Select("select * from swiperdata")
    ArrayList<SwiperData> getSwiperData();
}
