package com.hgt.desktop.web.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.hgt.desktop.dao.entity.ApiService;
import com.hgt.desktop.service.IApiServiceService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 * 服务类型与服务表，树形结构。 前端控制器
 * </p>
 *
 * @author xavier
 * @since 2019-07-26
 */
@RestController
@RequestMapping("/desktop/api-service")
public class ApiServiceController {

    private final IApiServiceService apiServiceService;

    public ApiServiceController(IApiServiceService apiServiceService) {
        this.apiServiceService = apiServiceService;
    }

    /**
     * 查询列表
     * @return 服务列表
     */
    @RequestMapping("/list")
    public List<com.hgt.desktop.dao.entity.ApiService> list() {
        return apiServiceService.list();
    }

    /**
     * 使用wrapper条件查询
     * @return 服务列表
     */
    @RequestMapping("/test")
    public List<com.hgt.desktop.dao.entity.ApiService> testWrapper() {
        QueryWrapper<ApiService> wrapper = new QueryWrapper<>();
        wrapper.ge("node_id", 2).isNotNull("left_id");
        return apiServiceService.testWrapper(wrapper);
    }

    /**
     * 使用wrapper条件查询一条记录
     * @param name 服务名称
     * @return 服务信息
     */
    @RequestMapping("/getOne")
    public com.hgt.desktop.dao.entity.ApiService selectOne(@RequestParam("name")String name) {
        QueryWrapper<ApiService> wrapper = new QueryWrapper<>();
        wrapper.eq("name", name);
        return apiServiceService.getOne(wrapper);
    }

    /**
     * 计数
     * @param name 服务名称
     * @return 计数
     */
    @RequestMapping("/count")
    public int selectCount(@RequestParam("name")String name) {
        QueryWrapper<ApiService> wrapper = new QueryWrapper<>();
        wrapper.eq("name", name);
        return apiServiceService.count(wrapper);
    }
}
