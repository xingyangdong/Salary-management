package com.one.ssm.admin.user.service;

import com.one.ssm.admin.user.model.Bm;
import com.one.ssm.admin.user.model.BmExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface  BmService {
    long countByExample(BmExample example);

    int deleteByExample(BmExample example);

    int deleteByPrimaryKey(Integer bmId);

    int insert(Bm record);

    int insertSelective(Bm record);

    List<Bm> selectByExample(BmExample example);

    Bm selectByPrimaryKey(Integer bmId);

    int updateByExampleSelective(@Param("record") Bm record, @Param("example") BmExample example);

    int updateByExample(@Param("record") Bm record, @Param("example") BmExample example);

    int updateByPrimaryKeySelective(Bm record);

    int updateByPrimaryKey(Bm record);
}
