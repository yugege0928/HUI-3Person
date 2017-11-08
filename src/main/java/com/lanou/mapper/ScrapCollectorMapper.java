package com.lanou.mapper;

import com.lanou.bean.ScrapCollector;

public interface ScrapCollectorMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ScrapCollector record);

    int insertSelective(ScrapCollector record);

    ScrapCollector selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ScrapCollector record);

    int updateByPrimaryKey(ScrapCollector record);
}