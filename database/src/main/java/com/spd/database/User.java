package com.spd.database;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Property;
import org.greenrobot.greendao.annotation.Unique;
import org.greenrobot.greendao.annotation.Generated;

/**
 * @author :Reginer in  2017/11/6 10:28.
 *         联系方式:QQ:282921012
 *         功能描述:
 */
@Entity
public class User {
    //不能用int
    @Id
    private Long id;
    @Property(nameInDb = "name")
    private String name;
    @Unique
    private String qq;
    private int age;
    private String address;
    @Generated(hash = 2027384967)
    public User(Long id, String name, String qq, int age, String address) {
        this.id = id;
        this.name = name;
        this.qq = qq;
        this.age = age;
        this.address = address;
    }
    @Generated(hash = 586692638)
    public User() {
    }
    public Long getId() {
        return this.id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getQq() {
        return this.qq;
    }
    public void setQq(String qq) {
        this.qq = qq;
    }
    public int getAge() {
        return this.age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getAddress() {
        return this.address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
}
