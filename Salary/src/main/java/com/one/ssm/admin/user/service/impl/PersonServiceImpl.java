package com.one.ssm.admin.user.service.impl;

import com.one.ssm.admin.user.mapper.PersonMapper;
import com.one.ssm.admin.user.model.Person;
import com.one.ssm.admin.user.model.PersonExample;
import com.one.ssm.admin.user.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonServiceImpl implements PersonService {
    @Autowired
    private PersonMapper mapper;

    @Override
    public long countByExample(PersonExample example) {
        return mapper.countByExample(example);
    }

    @Override
    public int deleteByExample(PersonExample example) {
        return mapper.deleteByExample(example);
    }

    @Override
    public int deleteByPrimaryKey(Integer personId) {
        return mapper.deleteByPrimaryKey(personId);
    }

    @Override
    public int insert(Person record) {
        return mapper.insert(record);
    }

    @Override
    public int insertSelective(Person record) {
        return mapper.insertSelective(record);
    }

    @Override
    public List<Person> selectByExample(PersonExample example) {
        return mapper.selectByExample(example);
    }

    @Override
    public Person selectByPrimaryKey(Integer personId) {
        return mapper.selectByPrimaryKey(personId);
    }

    @Override
    public int updateByExampleSelective(Person record, PersonExample example) {
        return mapper.updateByExampleSelective(record, example);
    }

    @Override
    public int updateByExample(Person record, PersonExample example) {
        return mapper.updateByExample( record,  example);
    }

    @Override
    public int updateByPrimaryKeySelective(Person record) {
        return mapper.updateByPrimaryKeySelective( record);
    }

    @Override
    public int updateByPrimaryKey(Person record) {
        return mapper.updateByPrimaryKey(record);
    }


}
