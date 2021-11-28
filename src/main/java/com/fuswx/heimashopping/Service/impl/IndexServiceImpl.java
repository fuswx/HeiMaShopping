package com.fuswx.heimashopping.Service.impl;

import com.fuswx.heimashopping.Bean.Swiper;
import com.fuswx.heimashopping.Bean.SwiperData;
import com.fuswx.heimashopping.Mapper.IndexMapper;
import com.fuswx.heimashopping.Service.IndexService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class IndexServiceImpl implements IndexService {

    @Autowired
    private IndexMapper indexMapper;

    @Override
    public Swiper getSwiperData() {
        return new Swiper(0,indexMapper.getSwiperData());
    }
}
