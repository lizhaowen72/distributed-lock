package com.suzhuo.distributed.lock.mysql.service;


import com.suzhuo.distributed.lock.mysql.model.MethodLock;
import com.suzhuo.distributed.lock.mysql.persistence.MethodLockMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 *
 **/
@Service
public class MethodLockService {
    @Autowired
    private MethodLockMapper mapper;

    public Long insert(MethodLock obj) {
        mapper.insert(obj);
        return obj.getMethodId();
    }

    public void update(MethodLock obj) {
        mapper.update(obj);
    }

    public List<MethodLock> findAll() {
        return mapper.findAll();
    }

    private List<MethodLock> find(MethodLock obj) {
        return mapper.find(obj);
    }

    public void delete(Long id){
        mapper.delete(id);
    }
}