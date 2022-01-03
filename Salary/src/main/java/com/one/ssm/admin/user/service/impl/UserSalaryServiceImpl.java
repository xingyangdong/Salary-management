package com.one.ssm.admin.user.service.impl;

import com.one.ssm.admin.user.mapper.UserSalaryMapper;
import com.one.ssm.admin.user.model.UserSalary;
import com.one.ssm.admin.user.model.UserSalaryExample;
import com.one.ssm.admin.user.service.UserSalaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserSalaryServiceImpl implements UserSalaryService {

    @Autowired
    private UserSalaryMapper mapper;

    @Override
    public long countByExample(UserSalaryExample example) {
        return mapper.countByExample(example);
    }

    @Override
    public int deleteByExample(UserSalaryExample example) {
        return mapper.deleteByExample(example);
    }

    @Override
    public int deleteByPrimaryKey(Long saId) {
        return mapper.deleteByPrimaryKey(saId);
    }

    @Override
    public int insert(UserSalary record) {
        return mapper.insert(record);
    }

    @Override
    public int insertSelective(UserSalary record) {
        return mapper.insertSelective(record);
    }

    @Override
    public List<UserSalary> selectByExample(UserSalaryExample example) {
        return mapper.selectByExample(example);
    }

    @Override
    public UserSalary selectByPrimaryKey(Long saId) {
        return mapper.selectByPrimaryKey(saId);
    }

    @Override
    public int updateByExampleSelective(UserSalary record, UserSalaryExample example) {
        return mapper.updateByExampleSelective(record, example);
    }

    @Override
    public int updateByExample(UserSalary record, UserSalaryExample example) {
        return mapper.updateByExample( record,  example);
    }

    @Override
    public int updateByPrimaryKeySelective(UserSalary record) {
        return mapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(UserSalary record) {
        return mapper.updateByPrimaryKey(record);
    }
}
