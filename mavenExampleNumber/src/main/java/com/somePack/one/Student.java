package com.somePack.one;

import java.time.LocalDate;

public class Student {

    private String name;

    private String lName;

    private boolean sex;

    private String birthday;

    private int GPA;

    public Student(String name, String lName, boolean sex, String birthday, int GPA) {
        this.name = name;
        this.lName = lName;
        this.sex = sex;
        this.birthday = birthday;
        this.GPA = GPA;
    }

    public Student () {}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public boolean isSex() {
        return sex;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public int getGPA() {
        return GPA;
    }

    public void setGPA(int GPA) {
        this.GPA = GPA;
    }


}
