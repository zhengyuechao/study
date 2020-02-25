package com.study.entity;

/**
 * 
* @ClassName: User 
* @Description: 
* @Author z
* @DateTime 2020年2月25日 下午2:51:03
 */
public class User {
    private Long id;
    private String username;
    private String address;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
