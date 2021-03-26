package com.theoldzheng.jdbcTemplate.entity;

/**
 * Description:
 *
 * @author theoldzheng@163.com  @ZYD
 * @create 2021.3.25 21:09
 */
public class book {
    private String id;
    private String name;
    private String bstatus;

    public book() {
    }

    public book(String id, String name, String bstatus) {
        this.id = id;
        this.name = name;
        this.bstatus = bstatus;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBstatus() {
        return bstatus;
    }

    public void setBstatus(String bstatus) {
        this.bstatus = bstatus;
    }

    @Override
    public String toString() {
        return "user{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", ustatus='" + bstatus + '\'' +
                '}';
    }
}
