package com.fuswx.heimashopping.Controller;

import com.fuswx.heimashopping.Bean.Swiper;
import com.fuswx.heimashopping.Service.IndexService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.HashMap;


@Controller
@RequestMapping("/index")
public class IndexController {

    @Autowired
    private IndexService indexService;

    @RequestMapping("/getSwiperData")
    public @ResponseBody Swiper getSwiperData(){
        return indexService.getSwiperData();
    }

    @RequestMapping("/getClassified")
    public @ResponseBody ArrayList<HashMap<Object, Object>> getClassified(){
        return indexService.getClass("classified");
    }

    @RequestMapping("/getFloorList")
    public @ResponseBody ArrayList<HashMap<Object, Object>> getFloorList(){
        return indexService.getClass("floordata");
    }
}
