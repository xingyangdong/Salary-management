package com.one.ssm.admin.user.service.impl;

import com.one.ssm.admin.user.mapper.JixiaoMapper;
import com.one.ssm.admin.user.model.Jixiao;
import com.one.ssm.admin.user.model.JixiaoExample;
import com.one.ssm.admin.user.service.JixiaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JixiaoServiceImpl implements JixiaoService {
    @Autowired
    JixiaoMapper mapper;

    @Override
    public long countByExample(JixiaoExample example) {
        return mapper.countByExample(example);
    }

    @Override
    public int deleteByExample(JixiaoExample example) {
        return mapper.deleteByExample(example);
    }

    @Override
    public int deleteByPrimaryKey(Integer xuhao) {
        return mapper.deleteByPrimaryKey(xuhao);
    }

    @Override
    public int insert(Jixiao record) {
        return mapper.insert(record);
    }

    @Override
    public int insertSelective(Jixiao record) {
        return mapper.insertSelective(record);
    }

    @Override
    public List<Jixiao> selectByExample(JixiaoExample example) {
        return mapper.selectByExample(example);
    }

    @Override
    public Jixiao selectByPrimaryKey(Integer xuhao) {
        return mapper.selectByPrimaryKey(xuhao);
    }

    @Override
    public int updateByExampleSelective(Jixiao record, JixiaoExample example) {
        return mapper.updateByExampleSelective(record, example);
    }

    @Override
    public int updateByExample(Jixiao record, JixiaoExample example) {
        return mapper.updateByExample( record,  example);
    }

    @Override
    public int updateByPrimaryKeySelective(Jixiao record) {
        return mapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Jixiao record) {
        return mapper.updateByPrimaryKey(record);
    }
}
