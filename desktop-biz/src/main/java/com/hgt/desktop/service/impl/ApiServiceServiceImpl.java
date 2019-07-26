package com.hgt.desktop.service.impl;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.toolkit.Constants;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.hgt.desktop.dao.entity.ApiService;
import com.hgt.desktop.dao.mapper.ApiServiceMapper;
import com.hgt.desktop.service.IApiServiceService;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 * 服务类型与服务表，树形结构。 服务实现类
 * </p>
 *
 * @author xavier
 * @since 2019-07-26
 */
@Service
public class ApiServiceServiceImpl extends ServiceImpl<ApiServiceMapper, ApiService> implements IApiServiceService {

    public List<ApiService> testWrapper(@Param(Constants.WRAPPER) Wrapper<ApiService> wrapper) {
        return this.list(wrapper);
    }
}
