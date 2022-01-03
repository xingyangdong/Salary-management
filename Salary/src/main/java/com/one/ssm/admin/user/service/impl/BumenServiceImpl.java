package com.one.ssm.admin.user.service.impl;

import com.one.ssm.admin.user.mapper.BumenMapper;
import com.one.ssm.admin.user.model.Bumen;
import com.one.ssm.admin.user.model.BumenExample;
import com.one.ssm.admin.user.service.BumenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BumenServiceImpl implements BumenService {

    @Autowired
    private BumenMapper mapper;

    @Override
    public long countByExample(BumenExample example) {
        return mapper.countByExample(example);
    }

    @Override
    public int deleteByExample(BumenExample example) {
        return mapper.deleteByExample(example);
    }

    @Override
    public int deleteByPrimaryKey(Integer bumenId) {
        return mapper.deleteByPrimaryKey(bumenId);
    }

    @Override
    public int insert(Bumen record) {
        return mapper.insert(record);
    }

    @Override
    public List<String> select() {
        return mapper.select();
    }

    @Override
    public int insertSelective(Bumen record) {
        return mapper.insertSelective(record);
    }

    @Override
    public List<Bumen> selectByExample(BumenExample example) {
        return mapper.selectByExample(example);
    }

    @Override
    public Bumen selectByPrimaryKey(Integer bumenId) {
        return mapper.selectByPrimaryKey(bumenId);
    }

    @Override
    public int updateByExampleSelective(Bumen record, BumenExample example) {
        return mapper.updateByExampleSelective(record, example);
    }

    @Override
    public int updateByExample(Bumen record, BumenExample example) {
        return mapper.updateByExample( record,  example);
    }

    @Override
    public int updateByPrimaryKeySelective(Bumen record) {
        return mapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Bumen record) {
        return mapper.updateByPrimaryKey(record);
    }
}
