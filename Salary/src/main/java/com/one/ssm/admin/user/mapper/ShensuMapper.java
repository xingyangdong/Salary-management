package com.one.ssm.admin.user.mapper;

import com.one.ssm.admin.user.model.Shensu;
import com.one.ssm.admin.user.model.ShensuExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface ShensuMapper {
    long countByExample(ShensuExample example);

    int deleteByExample(ShensuExample example);

    int deleteByPrimaryKey(Integer shensuId);

    int insert(Shensu record);

    int insertSelective(Shensu record);

    List<Shensu> selectByExample(ShensuExample example);

    Shensu selectByPrimaryKey(Integer shensuId);

    int updateByExampleSelective(@Param("record") Shensu record, @Param("example") ShensuExample example);

    int updateByExample(@Param("record") Shensu record, @Param("example") ShensuExample example);

    int updateByPrimaryKeySelective(Shensu record);

    int updateByPrimaryKey(Shensu record);
}