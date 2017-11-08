package com.lanou.mapper;

import com.lanou.bean.TbError;
import com.lanou.bean.TbErrorWithBLOBs;

public interface TbErrorMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TbErrorWithBLOBs record);

    int insertSelective(TbErrorWithBLOBs record);

    TbErrorWithBLOBs selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TbErrorWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(TbErrorWithBLOBs record);

    int updateByPrimaryKey(TbError record);
}