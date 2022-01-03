package com.one.ssm.admin.user.service;

import com.one.ssm.admin.user.model.Bumen;
import com.one.ssm.admin.user.model.BumenExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BumenService {
    long countByExample(BumenExample example);

    int deleteByExample(BumenExample example);

    int deleteByPrimaryKey(Integer bumenId);

    int insert(Bumen record);

    List<String> select();

    int insertSelective(Bumen record);

    List<Bumen> selectByExample(BumenExample example);

    Bumen selectByPrimaryKey(Integer bumenId);

    int updateByExampleSelective(@Param("record") Bumen record, @Param("example") BumenExample example);

    int updateByExample(@Param("record") Bumen record, @Param("example") BumenExample example);

    int updateByPrimaryKeySelective(Bumen record);

    int updateByPrimaryKey(Bumen record);


}
