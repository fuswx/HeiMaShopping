package com.fuswx.heimashopping.Controller;

import com.fuswx.heimashopping.Bean.Swiper;
import com.fuswx.heimashopping.Service.IndexService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
@RequestMapping("/index")
public class IndexController {

    @Autowired
    private IndexService indexService;

    @RequestMapping("/getSwiperData")
    public @ResponseBody Swiper getSwiperData(){
        return indexService.getSwiperData();
    }
}
