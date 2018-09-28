package com.suzhuo.distributed.lock.mysql;

import com.suzhuo.distributed.lock.mysql.model.MethodLock;
import com.suzhuo.distributed.lock.mysql.service.MethodLockService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * 一句话描述这个类是做什么的
 *
 * @Author:suzhuo
 * @Date : 2018/9/28 17:11
 * @Version 1.0
 */
@ContextConfiguration(locations = {"classpath*:/spring/applicationContext.xml"})
@RunWith(SpringJUnit4ClassRunner.class)
public class MysqlTest {


    @Autowired
    private MethodLockService methodLockService;


    @Test
    public void insert() {
        MethodLock methodLock = new MethodLock();
        methodLock.setMethodName("insert4");
        methodLock.setMethodDesc("插入4");
        Long id = methodLockService.insert(methodLock);
        System.out.println(id);
        // methodLockService.delete(id);
    }

}