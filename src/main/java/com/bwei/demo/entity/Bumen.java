package com.bwei.demo.entity;

/**
 * Created by 田森林 on 2019/3/18.
 */
public class Bumen {
    private int pid;
    private String bname;

    public Bumen() {
    }

    public Bumen(int pid, String bname) {
        this.pid = pid;
        this.bname = bname;
    }

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public String getBname() {
        return bname;
    }

    public void setBname(String bname) {
        this.bname = bname;
    }

    @Override
    public String toString() {
        return "Bumen{" +
                "pid=" + pid +
                ", bname='" + bname + '\'' +
                '}';
    }
}
