package com.one.ssm.admin.user.service;

import com.one.ssm.admin.user.model.Person;
import com.one.ssm.admin.user.model.PersonExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface PersonService {
    long countByExample(PersonExample example);

    int deleteByExample(PersonExample example);

    int deleteByPrimaryKey(Integer personId);

    int insert(Person record);

    int insertSelective(Person record);

    List<Person> selectByExample(PersonExample example);

    Person selectByPrimaryKey(Integer personId);

    int updateByExampleSelective(@Param("record") Person record, @Param("example") PersonExample example);

    int updateByExample(@Param("record") Person record, @Param("example") PersonExample example);

    int updateByPrimaryKeySelective(Person record);

    int updateByPrimaryKey(Person record);
}
