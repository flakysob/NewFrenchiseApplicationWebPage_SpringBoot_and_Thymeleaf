package com.myinternship.application.model;

public class ModelOfApplication {
    private Integer id;
    private String name;
    private String identityNumber;
    private String address;

    public ModelOfApplication(Integer id, String name, String identityNumber, String address) {
        this.id = id;
        this.name = name;
        this.identityNumber = identityNumber;
        this.address = address;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIdentityNumber() {
        return identityNumber;
    }

    public void setIdentityNumber(String identityNumber) {
        this.identityNumber = identityNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
