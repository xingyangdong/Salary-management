package com.one.ssm.admin.user.mapper;

import com.one.ssm.admin.user.model.Jixiao;
import com.one.ssm.admin.user.model.JixiaoExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface JixiaoMapper {
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