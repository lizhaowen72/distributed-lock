package com.suzhuo.distributed.lock.mysql.model;
/**
 * 
 **/
public class MethodLock {
	private static final long serialVersionUID = -1L;
    /** 主键 **/
    private Long methodId;
    /** 方法名称 **/
    private String methodName;
    /** 方法描述 **/
    private String methodDesc;
    /** 创建时间 **/
    private java.util.Date createTime;
    /** 更新时间 **/
    private java.util.Date updateTime;
    public Long getMethodId(){
        return methodId;
    }
    public void setMethodId(Long methodId){
        this.methodId = methodId;
    }
    public String getMethodName(){
        return methodName;
    }
    public void setMethodName(String methodName){
        this.methodName = methodName;
    }
    public String getMethodDesc(){
        return methodDesc;
    }
    public void setMethodDesc(String methodDesc){
        this.methodDesc = methodDesc;
    }
    public java.util.Date getCreateTime(){
        return createTime;
    }
    public void setCreateTime(java.util.Date createTime){
        this.createTime = createTime;
    }
    public java.util.Date getUpdateTime(){
        return updateTime;
    }
    public void setUpdateTime(java.util.Date updateTime){
        this.updateTime = updateTime;
    }
}