package com.zipcodewilmington.person;

/**
 * Created by leon on 2/12/18.
 */
public class Person {
    private String name;
    private int age;
    private String education;
    private boolean canSwim;
    private String address;
    private int numOfPets;
    private boolean ownPhone;

    public Person() {
        this.name = "";
        this.age = Integer.MAX_VALUE;
        this.education = "";
        this.canSwim = false;
        this.address = "";
        this.numOfPets = Integer.MAX_VALUE;
        this.ownPhone = false;

    }

    public Person(int age) {
        this.age = 5;
        this.numOfPets = 3;
    }

    public Person(boolean canSwim) {
        this.canSwim = true;
        this.ownPhone = true;
    }

    public Person(String education) {
        this.name = "Leon";
        this.education = "Associates";
        this.address = "1234 north philly";
    }



    public Person(String name, int age) {
        this.name = "Leon";
        this.age = 5;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public void setCanSwim(boolean canSwim){
        this.canSwim = canSwim;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setNumOfPets(int numOfPets){
        this.numOfPets = numOfPets;
    }

    public void setOwnPhone(boolean ownPhone){
        this.ownPhone = ownPhone;
    }

    public String getName() {
        return this.name;
    }

    public Integer getAge() {
        return this.age;
    }

    public String getEducation() { return this.education; }
    public String getAddress() { return this.address; }
    public boolean getCanSwim() { return this.canSwim; }
    public boolean getOwnPhone() { return this.ownPhone; }
    public int getNumOfPets() { return this.numOfPets; }
}
