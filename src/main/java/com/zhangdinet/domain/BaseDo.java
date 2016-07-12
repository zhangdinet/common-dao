package com.zhangdinet.domain;

import java.io.Serializable;
import java.util.Date;

/**
 * 领域基础类
 *
 * User: zhangdi
 * Date: 2016-07-12 19:20
 */
public class BaseDo implements Serializable {

    private static final long serialVersionUID = 8922632691897618482L;

    private Long id;
    private Date gmtCreate;
    private Date gmtModified;

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

    public Date getGmtModified() {
        return gmtModified;
    }

    public void setGmtModified(Date gmtModified) {
        this.gmtModified = gmtModified;
    }

    @Override
    public String toString() {
        return "BaseDo{" +
                "id=" + id +
                ", gmtCreate=" + gmtCreate +
                ", gmtModified=" + gmtModified +
                '}';
    }
}
