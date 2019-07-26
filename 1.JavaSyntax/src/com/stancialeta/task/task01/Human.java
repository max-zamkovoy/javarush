package com.stancialeta.task.task01;

import java.util.Date;

public class Human {

    private String name;
    private Date birthday;

    public Human() {
    }

    public Human(String name, Date birthday) {
        this.name = name;
        this.birthday = birthday;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthday() {
        return this.birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }
}
