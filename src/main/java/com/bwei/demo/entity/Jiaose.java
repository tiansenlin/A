package com.bwei.demo.entity;

/**
 * Created by 田森林 on 2019/3/18.
 */
public class Jiaose {
    private int jid;
    private String jname;

    public Jiaose() {
    }

    public Jiaose(int jid, String jname) {
        this.jid = jid;
        this.jname = jname;
    }

    public String getJname() {
        return jname;
    }

    public void setJname(String jname) {
        this.jname = jname;
    }

    public int getJid() {
        return jid;
    }

    public void setJid(int jid) {
        this.jid = jid;
    }

    @Override
    public String toString() {
        return "Jiaose{" +
                "jid=" + jid +
                ", jname='" + jname + '\'' +
                '}';
    }
}
