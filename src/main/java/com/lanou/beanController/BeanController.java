package com.lanou.beanController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by yugege on 17/11/9.
 */
@Controller
public class BeanController {

    @RequestMapping(value = "/index")
    public String index(){
        return "/index";
    }

    @RequestMapping(value = "/login")
    public String login(){
        return "/login";
    }

    @RequestMapping(value = "/welcome")
    public String welcome(){
        return "/welcome";
    }

    /**
     * 产品管理跳转
     */
    //品牌管理
    @RequestMapping(value = "/product-brand")
    public String produceB(){
        return "/product-brand";
    }
    //分类管理
    @RequestMapping(value = "/product-category")
    public String produceC(){
        return "/product-category";
    }

    //分类管理-add
    @RequestMapping(value = "/product-category-add")
    public String produceCA(){
        return "/product-category-add";
    }

    //产品管理
    @RequestMapping(value = "/product-list")
    public String produceL(){
        return "/product-list";
    }



}
