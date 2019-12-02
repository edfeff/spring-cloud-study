package com.wpp.cloud.client.pojo;

public class HouseInfo {
    private Integer id;
    private String addr1;
    private String addr2;
    private String addr3;

    public HouseInfo(Integer id, String addr1, String addr2, String addr3) {
        this.id = id;
        this.addr1 = addr1;
        this.addr2 = addr2;
        this.addr3 = addr3;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAddr1() {
        return addr1;
    }

    public void setAddr1(String addr1) {
        this.addr1 = addr1;
    }

    public String getAddr2() {
        return addr2;
    }

    public void setAddr2(String addr2) {
        this.addr2 = addr2;
    }

    public String getAddr3() {
        return addr3;
    }

    public void setAddr3(String addr3) {
        this.addr3 = addr3;
    }
}

