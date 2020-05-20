package com.baomidou.ant.test.service.impl;

import com.baomidou.ant.test.entity.Area;
import com.baomidou.ant.test.mapper.AreaMapper;
import com.baomidou.ant.test.service.IAreaService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 省市区表 服务实现类
 * </p>
 *
 * @author jobob
 * @since 2020-05-20
 */
@Service
public class AreaServiceImpl extends ServiceImpl<AreaMapper, Area> implements IAreaService {

}
