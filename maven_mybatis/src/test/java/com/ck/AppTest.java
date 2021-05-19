package com.ck;

import static org.junit.Assert.assertTrue;

import com.ck.dao.IAaaDao;
import com.ck.dao.IAaaDaoImpl;
import com.ck.entity.Aaa;
import org.junit.Test;

import java.util.List;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }

    @Test
    public void Test01(){
        IAaaDao dao = new IAaaDaoImpl();
        List<Aaa> list = dao.queryAaa();
        System.out.println(list);
    }
}
