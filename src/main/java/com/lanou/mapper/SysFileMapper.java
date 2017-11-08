package com.lanou.mapper;

import com.lanou.bean.SysFile;

public interface SysFileMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(SysFile record);

    int insertSelective(SysFile record);

    SysFile selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SysFile record);

    int updateByPrimaryKey(SysFile record);
}