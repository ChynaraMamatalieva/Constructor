package com.company;

public class Strudent {
    private int dateOfbirth;
    private String stName;
    private String stSurname;
    private byte age;

    public Strudent(int dateOfbirth, String stName, String stSurname, byte age) {
        this.dateOfbirth = dateOfbirth;
        this.stName = stName;
        this.stSurname = stSurname;
        this.age = age;
    }

    public int getDateOfbirth() {
        return dateOfbirth;
    }

    public void setDateOfbirth(int dateOfbirth) {
        this.dateOfbirth = dateOfbirth;
    }

    public String getStName() {
        return stName;
    }

    public void setStName(String stName) {
        this.stName = stName;
    }

    public String getStSurname() {
        return stSurname;
    }

    public void setStSurname(String stSurname) {
        this.stSurname = stSurname;
    }

    public byte getAge() {
        return age;
    }

    public void setAge(byte age) {
        if (age > 0) {
            this.age = age;
        } else {
            System.out.println("error! age cannot be less than 0");

        }
    }
}
