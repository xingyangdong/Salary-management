package com.one.ssm.admin.user.service;

import com.one.ssm.admin.user.model.Jixiao;
import com.one.ssm.admin.user.model.JixiaoExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface JixiaoService {
    long countByExample(JixiaoExample example);

    int deleteByExample(JixiaoExample example);

    int deleteByPrimaryKey(Integer xuhao);

    int insert(Jixiao record);

    int insertSelective(Jixiao record);

    List<Jixiao> selectByExample(JixiaoExample example);

    Jixiao selectByPrimaryKey(Integer xuhao);

    int updateByExampleSelective(@Param("record") Jixiao record, @Param("example") JixiaoExample example);

    int updateByExample(@Param("record") Jixiao record, @Param("example") JixiaoExample example);

    int updateByPrimaryKeySelective(Jixiao record);

    int updateByPrimaryKey(Jixiao record);
}
