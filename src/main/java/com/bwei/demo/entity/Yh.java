package com.bwei.demo.entity;

/**
 * Created by 田森林 on 2019/3/18.
 */
public class Yh {
    private int yid;
    private String ypassword;
    private String yphone;
    private String zhuangtai;
    private String ytime;
    private int pid;
    private int jid;
    private Bumen bumen;
    private Jiaose jiaose;

    public Yh() {
    }

    public Yh(int yid, String ypassword, String yphone, String zhuangtai, String ytime, int pid, int jid, Bumen bumen, Jiaose jiaose) {
        this.yid = yid;
        this.ypassword = ypassword;
        this.yphone = yphone;
        this.zhuangtai = zhuangtai;
        this.ytime = ytime;
        this.pid = pid;
        this.jid = jid;
        this.bumen = bumen;
        this.jiaose = jiaose;
    }

    public int getYid() {
        return yid;
    }

    public void setYid(int yid) {
        this.yid = yid;
    }

    public String getYpassword() {
        return ypassword;
    }

    public void setYpassword(String ypassword) {
        this.ypassword = ypassword;
    }

    public String getYphone() {
        return yphone;
    }

    public void setYphone(String yphone) {
        this.yphone = yphone;
    }

    public String getZhuangtai() {
        return zhuangtai;
    }

    public void setZhuangtai(String zhuangtai) {
        this.zhuangtai = zhuangtai;
    }

    public String getYtime() {
        return ytime;
    }

    public void setYtime(String ytime) {
        this.ytime = ytime;
    }

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public int getJid() {
        return jid;
    }

    public void setJid(int jid) {
        this.jid = jid;
    }

    public Bumen getBumen() {
        return bumen;
    }

    public void setBumen(Bumen bumen) {
        this.bumen = bumen;
    }

    public Jiaose getJiaose() {
        return jiaose;
    }

    public void setJiaose(Jiaose jiaose) {
        this.jiaose = jiaose;
    }

    @Override
    public String toString() {
        return "Yh{" +
                "yid=" + yid +
                ", ypassword='" + ypassword + '\'' +
                ", yphone='" + yphone + '\'' +
                ", zhuangtai='" + zhuangtai + '\'' +
                ", ytime='" + ytime + '\'' +
                ", pid=" + pid +
                ", jid=" + jid +
                ", bumen=" + bumen +
                ", jiaose=" + jiaose +
                '}';
    }
}
