package com.ibranco.mybatis.join.vo;

import com.ibranco.mybatis.join.domain.User;

public class UserRole extends User {
    private int roid;
    private String rname;
    private String desc;

    public int getRoid() {
        return roid;
    }

    public void setRoid(int roid) {
        this.roid = roid;
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
                "roid=" + roid +
                ", rname='" + rname + '\'' +
                ", desc='" + desc + '\'' +
                '}';
    }
}
