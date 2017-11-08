package com.lanou.mapper;

import com.lanou.bean.ReclamationOrder;

public interface ReclamationOrderMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ReclamationOrder record);

    int insertSelective(ReclamationOrder record);

    ReclamationOrder selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ReclamationOrder record);

    int updateByPrimaryKey(ReclamationOrder record);
}