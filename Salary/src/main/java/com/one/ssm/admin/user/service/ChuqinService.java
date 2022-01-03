package com.one.ssm.admin.user.service;

import com.one.ssm.admin.user.model.Chuqin;
import com.one.ssm.admin.user.model.ChuqinExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ChuqinService {
    long countByExample(ChuqinExample example);

    int deleteByExample(ChuqinExample example);

    int deleteByPrimaryKey(Integer chuqinId);

    int insert(Chuqin record);

    int insertSelective(Chuqin record);

    List<Chuqin> selectByExample(ChuqinExample example);

    Chuqin selectByPrimaryKey(Integer chuqinId);

    int updateByExampleSelective(@Param("record") Chuqin record, @Param("example") ChuqinExample example);

    int updateByExample(@Param("record") Chuqin record, @Param("example") ChuqinExample example);

    int updateByPrimaryKeySelective(Chuqin record);

    int updateByPrimaryKey(Chuqin record);

}
