package com.zhangdinet.domain;

import java.io.Serializable;
import java.util.Date;

/**
 * 通用领域基础类
 *
 * User: zhangdi
 * Date: 2016-07-12 19:20
 */
public class BaseDO implements Serializable {

    private static final long serialVersionUID = 8922632691897618482L;

    private Long id;
    private Date gmtCreate;
    private Date gmtUpdate;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getGmtCreate() {
        return gmtCreate;
    }

    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    public Date getGmtUpdate() {
        return gmtUpdate;
    }

    public void setGmtUpdate(Date gmtUpdate) {
        this.gmtUpdate = gmtUpdate;
    }

    @Override
    public String toString() {
        return "BaseDO{" +
                "id=" + id +
                ", gmtCreate=" + gmtCreate +
                ", gmtUpdate=" + gmtUpdate +
                '}';
    }
}
