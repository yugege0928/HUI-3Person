package com.lanou.mapper;

import com.lanou.bean.Scrap;

public interface ScrapMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Scrap record);

    int insertSelective(Scrap record);

    Scrap selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Scrap record);

    int updateByPrimaryKey(Scrap record);
}