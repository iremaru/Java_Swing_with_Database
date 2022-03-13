package com.company.model;

public class Persona {
    private String id;
    private String nif;
    private String name;
    private String firstSurname;
    private String secondSurname;
    private String city;
    private String address;
    private String phoneNumber;
    private String Birthdate;
    private String genre;
    private String type;

    public Persona(String id, String nif, String name, String firstSurname, String secondSurname, String city, String address, String phoneNumber, String birthdate, String genre, String type) {
        this.id = id;
        this.nif = nif;
        this.name = name;
        this.firstSurname = firstSurname;
        this.secondSurname = secondSurname;
        this.city = city;
        this.address = address;
        this.phoneNumber = phoneNumber;
        Birthdate = birthdate;
        this.genre = genre;
        this.type = type;
    }

    public String getId() {
        return id;
    }

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFirstSurname() {
        return firstSurname;
    }

    public void setFirstSurname(String firstSurname) {
        this.firstSurname = firstSurname;
    }

    public String getSecondSurname() {
        return secondSurname;
    }

    public void setSecondSurname(String secondSurname) {
        this.secondSurname = secondSurname;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
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

    public String getBirthdate() {
        return Birthdate;
    }

    public void setBirthdate(String birthdate) {
        Birthdate = birthdate;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
