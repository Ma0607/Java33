package com.accp.domain;

import java.util.List;

public class User {
    private String userid;

    private String username;

    private String phonename;

    private String data;

    private String phone;

    private String fuze;

    private String num;
    
    private List<Address> list;
    
    

    public List<Address> getList() {
		return list;
	}

	public void setList(List<Address> list) {
		this.list = list;
	}

	public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPhonename() {
        return phonename;
    }

    public void setPhonename(String phonename) {
        this.phonename = phonename;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getFuze() {
        return fuze;
    }

    public void setFuze(String fuze) {
        this.fuze = fuze;
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }
}