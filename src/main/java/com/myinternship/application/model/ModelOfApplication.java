package com.myinternship.application.model;

public class ModelOfApplication {
    private Integer id;
    private String name;
    private String identityNumber;
    private String address;
    private String phoneNumber;
    private String email;
    private String birthDate;
    private Boolean hasExperience;
    private String choosingReason;
    private String selectedLocation;
    private String amount;
    private String additionalNotes;

    public ModelOfApplication(Integer id, String name, String identityNumber, String address, String phoneNumber, String email, String birthDate, Boolean hasExperience, String choosingReason, String selectedLocation, String amount, String additionalNotes) {
        this.id = id;
        this.name = name;
        this.identityNumber = identityNumber;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.birthDate = birthDate;
        this.hasExperience = hasExperience;
        this.choosingReason = choosingReason;
        this.selectedLocation = selectedLocation;
        this.amount = amount;
        this.additionalNotes = additionalNotes;
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

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public Boolean getHasExperience() {
        return hasExperience;
    }

    public void setHasExperience(Boolean hasExperience) {
        this.hasExperience = hasExperience;
    }

    public String getChoosingReason() {
        return choosingReason;
    }

    public void setChoosingReason(String choosingReason) {
        this.choosingReason = choosingReason;
    }

    public String getSelectedLocation() {
        return selectedLocation;
    }

    public void setSelectedLocation(String selectedLocation) {
        this.selectedLocation = selectedLocation;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getAdditionalNotes() {
        return additionalNotes;
    }

    public void setAdditionalNotes(String additionalNotes) {
        this.additionalNotes = additionalNotes;
    }
}
