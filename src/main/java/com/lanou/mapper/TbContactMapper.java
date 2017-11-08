package com.lanou.mapper;

import com.lanou.bean.TbContact;

public interface TbContactMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TbContact record);

    int insertSelective(TbContact record);

    TbContact selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TbContact record);

    int updateByPrimaryKey(TbContact record);
}