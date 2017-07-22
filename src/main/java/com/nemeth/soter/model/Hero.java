package com.nemeth.soter.model;


import com.nemeth.soter.BasicVariable.Gender;
import com.nemeth.soter.BasicVariable.UniverseEnum;

public class Hero {

    private Integer id;
    private String name;
    private UniverseEnum universe;
    private Boolean villain;
    private int age;
    private Gender gender;

    @Override
    public String toString() {
        return "Hero{" +
                "id='" + id + '\''+
                "name='" + name + '\'' +
                ", universe='" + universe + '\'' +
                ", villain=" + villain +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", ability='" + ability + '\'' +
                '}';
    }

    public Hero(Integer id, String name, UniverseEnum universe, Boolean villain, int age, Gender gender, String ability) {
        this.id=id;
        this.name = name;
        this.universe = universe;
        this.villain = villain;
        this.age = age;
        this.gender = gender;
        this.ability = ability;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public UniverseEnum getUniverse() {
        return universe;
    }

    public void setUniverse(UniverseEnum universe) {
        this.universe = universe;
    }

    public Boolean getVillain() {
        return villain;
    }

    public void setVillain(Boolean villain) {
        this.villain = villain;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public String getAbility() {
        return ability;
    }

    public void setAbility(String ability) {
        this.ability = ability;
    }

    private String ability;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Hero() {
    }
}
