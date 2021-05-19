package com.ck.service.impl;

import com.ck.dao.IAaaDao;
import com.ck.entity.Aaa;
import com.ck.service.IAaaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class IAaaServiceImpl implements IAaaService {
    @Autowired
    private IAaaDao dao;

    @Override
    public List<Aaa> queryAaa() {
        return dao.queryAaa();
    }
}
