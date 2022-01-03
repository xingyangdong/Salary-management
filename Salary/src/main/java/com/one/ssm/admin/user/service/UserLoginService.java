package com.one.ssm.admin.user.service;

import com.one.ssm.admin.user.model.UserLogin;
import com.one.ssm.admin.user.model.UserLoginExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserLoginService {
    //查询符合条件的记录数量
    long countByExample(UserLoginExample example);
    //根据条件删除
    int deleteByExample(UserLoginExample example);

    int deleteByPrimaryKey(Integer userId);

    int insert(UserLogin record);
    //有选择的添加数据
    int insertSelective(UserLogin record);
    //根据条件查询
    List<UserLogin> selectByExample(UserLoginExample example);

    UserLogin selectByPrimaryKey(Integer userId);
    //根据条件有选择的更新
    int updateByExampleSelective(@Param("record") UserLogin record, @Param("example") UserLoginExample example);
    //根据条件全字段更新
    int updateByExample(@Param("record") UserLogin record, @Param("example") UserLoginExample example);
    //根据主键选择性的更新
    int updateByPrimaryKeySelective(UserLogin record);

    int updateByPrimaryKey(UserLogin record);

}
