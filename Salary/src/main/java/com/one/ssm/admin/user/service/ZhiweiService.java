package com.one.ssm.admin.user.service;

import com.one.ssm.admin.user.model.Zhiwei;
import com.one.ssm.admin.user.model.ZhiweiExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ZhiweiService {
    long countByExample(ZhiweiExample example);

    int deleteByExample(ZhiweiExample example);

    int deleteByPrimaryKey(Integer zhiweiId);

    int insert(Zhiwei record);

    int insertSelective(Zhiwei record);

    List<Zhiwei> selectByExample(ZhiweiExample example);

    Zhiwei selectByPrimaryKey(Integer zhiweiId);

    int updateByExampleSelective(@Param("record") Zhiwei record, @Param("example") ZhiweiExample example);

    int updateByExample(@Param("record") Zhiwei record, @Param("example") ZhiweiExample example);

    int updateByPrimaryKeySelective(Zhiwei record);

    int updateByPrimaryKey(Zhiwei record);
}
