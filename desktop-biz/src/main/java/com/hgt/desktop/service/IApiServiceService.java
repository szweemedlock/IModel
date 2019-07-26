package com.hgt.desktop.service;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.toolkit.Constants;
import com.baomidou.mybatisplus.extension.service.IService;
import com.hgt.desktop.dao.entity.ApiService;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * <p>
 * 服务类型与服务表，树形结构。 服务类
 * </p>
 *
 * @author xavier
 * @since 2019-07-26
 */
public interface IApiServiceService extends IService<ApiService> {

    List<ApiService> testWrapper(@Param(Constants.WRAPPER) Wrapper<ApiService> wrapper);
}
