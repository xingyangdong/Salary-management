package com.one.ssm.admin.user.service.impl;

import com.one.ssm.admin.user.mapper.BmMapper;
import com.one.ssm.admin.user.model.Bm;
import com.one.ssm.admin.user.model.BmExample;
import com.one.ssm.admin.user.service.BmService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BmserviceImpl implements BmService {
    @Autowired
    BmMapper mapper;

    @Override
    public long countByExample(BmExample example) {
        return mapper.countByExample(example);
    }

    @Override
    public int deleteByExample(BmExample example) {
        return mapper.deleteByExample(example);
    }

    @Override
    public int deleteByPrimaryKey(Integer bmId) {
        return mapper.deleteByPrimaryKey(bmId);
    }

    @Override
    public int insert(Bm record) {
        return mapper.insert(record);
    }

    @Override
    public int insertSelective(Bm record) {
        return mapper.insertSelective(record);
    }

    @Override
    public List<Bm> selectByExample(BmExample example) {
        return mapper.selectByExample(example);
    }

    @Override
    public Bm selectByPrimaryKey(Integer bmId) {
        return mapper.selectByPrimaryKey(bmId);
    }

    @Override
    public int updateByExampleSelective(Bm record, BmExample example) {
        return mapper.updateByExampleSelective(record, example);
    }

    @Override
    public int updateByExample(Bm record, BmExample example) {
        return mapper.updateByExample( record,  example);
    }

    @Override
    public int updateByPrimaryKeySelective(Bm record) {
        return mapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Bm record) {
        return mapper.updateByPrimaryKey(record);
    }
}
