package com.ck.dao;

import com.ck.entity.Aaa;
import com.ck.util.MybatisUtil;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class IAaaDaoImpl implements IAaaDao {
    @Override
    public List<Aaa> queryAaa() {
        SqlSession sqlSession = MybatisUtil.openSession(false);
        IAaaDao dao = sqlSession.getMapper(IAaaDao.class);
        List<Aaa> list = dao.queryAaa();
        return list;
    }
}
