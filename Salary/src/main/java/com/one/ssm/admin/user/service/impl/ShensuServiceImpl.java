package com.one.ssm.admin.user.service.impl;

import com.one.ssm.admin.user.mapper.ShensuMapper;
import com.one.ssm.admin.user.model.Shensu;
import com.one.ssm.admin.user.model.ShensuExample;
import com.one.ssm.admin.user.service.ShensuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ShensuServiceImpl implements ShensuService {
    @Autowired
    private ShensuMapper mapper;

    @Override
    public long countByExample(ShensuExample example) {
        return mapper.countByExample(example);
    }

    @Override
    public int deleteByExample(ShensuExample example) {
        return mapper.deleteByExample(example);
    }

    @Override
    public int deleteByPrimaryKey(Integer shensuId) {
        return mapper.deleteByPrimaryKey(shensuId);
    }

    @Override
    public int insert(Shensu record) {
        return mapper.insert(record);
    }

    @Override
    public int insertSelective(Shensu record) {
        return mapper.insertSelective(record);
    }

    @Override
    public List<Shensu> selectByExample(ShensuExample example) {
        return mapper.selectByExample(example);
    }

    @Override
    public Shensu selectByPrimaryKey(Integer shensuId) {
        return mapper.selectByPrimaryKey(shensuId);
    }

    @Override
    public int updateByExampleSelective(Shensu record, ShensuExample example) {
        return mapper.updateByExampleSelective(record, example);
    }

    @Override
    public int updateByExample(Shensu record, ShensuExample example) {
        return mapper.updateByExample( record,  example);
    }

    @Override
    public int updateByPrimaryKeySelective(Shensu record) {
        return mapper.updateByPrimaryKeySelective( record);
    }

    @Override
    public int updateByPrimaryKey(Shensu record) {
        return mapper.updateByPrimaryKey(record);
    }

}
