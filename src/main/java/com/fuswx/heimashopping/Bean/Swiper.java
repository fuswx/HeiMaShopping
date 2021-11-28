package com.fuswx.heimashopping.Bean;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.ArrayList;

@Data
@AllArgsConstructor
public class Swiper {
    private Integer code;
    private ArrayList<SwiperData> data;
}
