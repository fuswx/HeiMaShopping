package com.fuswx.heimashopping.Service;

import com.fuswx.heimashopping.Bean.Swiper;
import com.fuswx.heimashopping.Bean.SwiperData;

import java.util.ArrayList;
import java.util.HashMap;

public interface IndexService {
    Swiper getSwiperData();

    ArrayList<HashMap<Object, Object>> getClass(String formName);
}
