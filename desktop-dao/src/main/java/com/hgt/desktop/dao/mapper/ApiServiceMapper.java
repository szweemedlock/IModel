package com.hgt.desktop.dao.mapper;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.toolkit.Constants;
import com.hgt.desktop.dao.entity.ApiService;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * <p>
 * 服务类型与服务表，树形结构。 Mapper 接口
 * </p>
 *
 * @author xavier
 * @since 2019-07-26
 */
public interface ApiServiceMapper extends BaseMapper<ApiService> {

    List<ApiService> testWrapper(@Param(Constants.WRAPPER) Wrapper<ApiService> wrapper);
}
