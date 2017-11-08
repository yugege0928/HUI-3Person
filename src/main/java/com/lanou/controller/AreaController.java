package com.lanou.controller;

import com.lanou.bean.Area;
import com.lanou.service.AreaService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by yugege on 17/11/8.
 */
@Controller
public class AreaController {

    @Resource
    private AreaService service;

    @RequestMapping(value = "/findAll")
    public List<Area> findAllArea(){

        System.out.println(service.findAllArea());

        System.out.println(1);
        System.out.println(2);

        System.out.println(3);
        System.out.println(4);

        System.out.println(5);
        System.out.println(6);

        System.out.println(7);
        System.out.println(8);

        return service.findAllArea();
    }

}
