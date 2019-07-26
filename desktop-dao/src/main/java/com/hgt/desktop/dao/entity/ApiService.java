package com.hgt.desktop.dao.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.time.LocalDate;

/**
 * <p>
 * 服务类型与服务表，树形结构。
 * </p>
 *
 * @author xavier
 * @since 2019-07-26
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class ApiService implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 节点值
     */
    @TableId(value = "node_id", type = IdType.INPUT)
    private Integer nodeId;

    /**
     * 服务类型code值
     */
    private String code;

    /**
     * 服务类型展示名称
     */
    private String name;

    /**
     * 判断是类型还是服务，0是类型，1是服务
     */
    private Integer type;

    /**
     * 左值
     */
    private Integer leftId;

    /**
     * 右值
     */
    private Integer rightId;

    /**
     * 创建时间
     */
    private LocalDate createTime;

    /**
     * 创建人
     */
    private String createId;

    /**
     * 更新时间
     */
    private LocalDate updateTime;

    /**
     * 更新人
     */
    private String updateId;


}
