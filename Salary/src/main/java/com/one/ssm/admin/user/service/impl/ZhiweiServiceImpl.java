package com.one.ssm.admin.user.service.impl;

import com.one.ssm.admin.user.mapper.ZhiweiMapper;
import com.one.ssm.admin.user.model.Zhiwei;
import com.one.ssm.admin.user.model.ZhiweiExample;
import com.one.ssm.admin.user.service.ZhiweiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ZhiweiServiceImpl implements ZhiweiService {
    @Autowired
    ZhiweiMapper mapper;

    @Override
    public long countByExample(ZhiweiExample example) {
        return mapper.countByExample(example);
    }

    @Override
    public int deleteByExample(ZhiweiExample example) {
        return mapper.deleteByExample(example);
    }

    @Override
    public int deleteByPrimaryKey(Integer zhiweiId) {
        return mapper.deleteByPrimaryKey(zhiweiId);
    }

    @Override
    public int insert(Zhiwei record) {
        return mapper.insert(record);
    }

    @Override
    public int insertSelective(Zhiwei record) {
        return mapper.insertSelective(record);
    }

    @Override
    public List<Zhiwei> selectByExample(ZhiweiExample example) {
        return mapper.selectByExample(example);
    }

    @Override
    public Zhiwei selectByPrimaryKey(Integer zhiweiId) {
        return mapper.selectByPrimaryKey(zhiweiId);
    }

    @Override
    public int updateByExampleSelective(Zhiwei record, ZhiweiExample example) {
        return mapper.updateByExampleSelective(record, example);
    }

    @Override
    public int updateByExample(Zhiwei record, ZhiweiExample example) {
        return mapper.updateByExample( record,  example);
    }

    @Override
    public int updateByPrimaryKeySelective(Zhiwei record) {
        return mapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Zhiwei record) {
        return mapper.updateByPrimaryKey(record);
    }
}
