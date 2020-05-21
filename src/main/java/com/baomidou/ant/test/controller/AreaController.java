package com.baomidou.ant.test.controller;


import com.baomidou.ant.test.entity.Area;
import com.baomidou.ant.test.service.IAreaService;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 * 省市区表 前端控制器
 * </p>
 *
 * @author jobob
 * @since 2020-05-21
 */
@RestController
public class AreaController {


    @Autowired
    private IAreaService areaService;

    @GetMapping("/test")
    public String test(){
        return "Hello World!";
    }

    @GetMapping("/getList")
    public List<Area> testList() {
        QueryWrapper<Area> queryWrapper = Wrappers.query();
        queryWrapper.lambda().eq(Area::getRecordStatus, 1);
        return areaService.list(queryWrapper);
    }


}
