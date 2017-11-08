package com.lanou.mapper;

import com.lanou.bean.Owner;

public interface OwnerMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Owner record);

    int insertSelective(Owner record);

    Owner selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Owner record);

    int updateByPrimaryKey(Owner record);
}