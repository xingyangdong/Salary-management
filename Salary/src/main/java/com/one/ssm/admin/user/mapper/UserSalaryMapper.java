package com.one.ssm.admin.user.mapper;

import com.one.ssm.admin.user.model.UserSalary;
import com.one.ssm.admin.user.model.UserSalaryExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface UserSalaryMapper {
    long countByExample(UserSalaryExample example);

    int deleteByExample(UserSalaryExample example);

    int deleteByPrimaryKey(Long saId);

    int insert(UserSalary record);

    int insertSelective(UserSalary record);

    List<UserSalary> selectByExample(UserSalaryExample example);

    UserSalary selectByPrimaryKey(Long saId);

    int updateByExampleSelective(@Param("record") UserSalary record, @Param("example") UserSalaryExample example);

    int updateByExample(@Param("record") UserSalary record, @Param("example") UserSalaryExample example);

    int updateByPrimaryKeySelective(UserSalary record);

    int updateByPrimaryKey(UserSalary record);
}