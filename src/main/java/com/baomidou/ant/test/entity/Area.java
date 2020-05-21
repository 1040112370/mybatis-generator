package com.baomidou.ant.test.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import java.io.Serializable;
import java.util.Date;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 省市区表
 * </p>
 *
 * @author jobob
 * @since 2020-05-21
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class Area implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 自增主键
     */
    @TableId(value = "area_id", type = IdType.AUTO)
    private Long areaId;

    /**
     * 地区编号
     */
    private String areaCode;

    /**
     * 父地区ID
     */
    private Long pAreaId;

    /**
     * 地区级别（1:省份province,2:市city,3:区县district,4:街道street）
     */
    private Integer areaLevel;

    /**
     * 地区名称(简体中文)
     */
    private String areaNameHans;

    /**
     * 地区名称(繁体中文)
     */
    private String areaNameHant;

    /**
     * 地区名称(英文)
     */
    private String areaNameEn;

    /**
     * 路径
     */
    private String path;

    /**
     * 排序NO, 越小越在前
     */
    private Integer sortNo;

    /**
     * 记录状态 0-无效 1-有效
     */
    private Integer recordStatus;

    /**
     * 版本号
     */
    private Integer lockVersion;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 最后修改时间
     */
    private Date updateTime;


}
