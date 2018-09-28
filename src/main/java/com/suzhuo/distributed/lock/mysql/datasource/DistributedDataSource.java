package com.suzhuo.distributed.lock.mysql.datasource;

import com.zaxxer.hikari.HikariDataSource;

import javax.sql.DataSource;

/**
 * 一句话描述这个类是做什么的
 *
 * @Author:suzhuo
 * @Date : 2018/9/28 14:29
 * @Version 1.0
 */
public class DistributedDataSource extends HikariDataSource {
    public DistributedDataSource() {
        super();
    }

    @Override
    public DataSource getDataSource() {
        return  null;
    }
}
