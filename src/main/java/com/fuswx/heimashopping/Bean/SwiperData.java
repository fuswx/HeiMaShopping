package com.fuswx.heimashopping.Bean;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Date;

@Data
@AllArgsConstructor
public class SwiperData {
    private Integer id;
    private Integer bussinessId;
    private Date dateAdd;
    private Integer paixv;
    private String picUrl;
    private Integer status;
    private String statusStr;
    private String title;
    private String type;
    private Integer userId;
}
