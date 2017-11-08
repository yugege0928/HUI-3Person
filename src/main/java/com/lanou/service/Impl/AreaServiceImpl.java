package com.lanou.service.Impl;

import com.lanou.bean.Area;
import com.lanou.mapper.AreaMapper;
import com.lanou.service.AreaService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by yugege on 17/11/8.
 */
@Service
public class AreaServiceImpl implements AreaService {

    @Resource
    private AreaMapper mapper;
    @Override
    public List<Area> findAllArea() {
        return mapper.findAllArea();
    }
}
