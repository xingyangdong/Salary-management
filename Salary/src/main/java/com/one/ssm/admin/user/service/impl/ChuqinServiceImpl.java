package com.one.ssm.admin.user.service.impl;

import com.one.ssm.admin.user.mapper.ChuqinMapper;
import com.one.ssm.admin.user.model.Chuqin;
import com.one.ssm.admin.user.model.ChuqinExample;
import com.one.ssm.admin.user.service.ChuqinService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ChuqinServiceImpl implements ChuqinService {
    @Autowired
    private ChuqinMapper mapper;


    @Override
    public long countByExample(ChuqinExample example) {
        return mapper.countByExample(example);
    }

    @Override
    public int deleteByExample(ChuqinExample example) {
        return mapper.deleteByExample(example);
    }

    @Override
    public int deleteByPrimaryKey(Integer chuqinId) {
        return mapper.deleteByPrimaryKey(chuqinId);
    }

    @Override
    public int insert(Chuqin record) {
        return mapper.insert(record);
    }

    @Override
    public int insertSelective(Chuqin record) {
        return mapper.insertSelective(record);
    }

    @Override
    public List<Chuqin> selectByExample(ChuqinExample example) {
        return mapper.selectByExample(example);
    }

    @Override
    public Chuqin selectByPrimaryKey(Integer chuqinId) {
        return mapper.selectByPrimaryKey(chuqinId);
    }

    @Override
    public int updateByExampleSelective(Chuqin record, ChuqinExample example) {
        return mapper.updateByExampleSelective(record, example);
    }

    @Override
    public int updateByExample(Chuqin record, ChuqinExample example) {
        return mapper.updateByExample( record,  example);
    }

    @Override
    public int updateByPrimaryKeySelective(Chuqin record) {
        return mapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Chuqin record) {
        return mapper.updateByPrimaryKey(record);
    }


}