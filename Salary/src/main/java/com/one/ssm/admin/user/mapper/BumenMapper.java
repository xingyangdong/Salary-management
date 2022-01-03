package com.one.ssm.admin.user.mapper;

import com.one.ssm.admin.user.model.Bumen;
import com.one.ssm.admin.user.model.BumenExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface BumenMapper {
    long countByExample(BumenExample example);

    int deleteByExample(BumenExample example);

    int deleteByPrimaryKey(Integer bumenId);

    int insert(Bumen record);

    int insertSelective(Bumen record);

    List<Bumen> selectByExample(BumenExample example);

    List<String> select();

    Bumen selectByPrimaryKey(Integer bumenId);

    int updateByExampleSelective(@Param("record") Bumen record, @Param("example") BumenExample example);

    int updateByExample(@Param("record") Bumen record, @Param("example") BumenExample example);

    int updateByPrimaryKeySelective(Bumen record);

    int updateByPrimaryKey(Bumen record);
}