package com.ibranco.mybatis.join.vo;

import com.ibranco.mybatis.join.domain.User;

public class UserRole extends User {
    private int id;
    private String rname;
    private String desc;

    @Override
    public int getId() {
        return id;
    }

    @Override
    public void setId(int id) {
        this.id = id;
    }

    public String getRname() {
        return rname;
    }

    public void setRname(String rname) {
        this.rname = rname;
    }


    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    @Override
    public String toString() {
        return "UserRole{" +
                "id=" + id +
                ", rname='" + rname + '\'' +
                ", desc='" + desc + '\'' +
                '}';
    }
}
