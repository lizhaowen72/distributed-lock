package com.suzhuo.distributed.lock.mysql.persistence;

import com.suzhuo.distributed.lock.mysql.model.MethodLock;

import java.util.List;

public interface MethodLockMapper {
    void insert(MethodLock obj);

    void update(MethodLock obj);

    List<MethodLock> findAll();

    List<MethodLock> find(MethodLock obj);

    MethodLock findById(Long id);

    void delete(Long id);
}
