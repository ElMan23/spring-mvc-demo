package com.luv2code.springdemo.mvc;

import java.util.ArrayList;
import java.util.LinkedHashMap;

public class Student {

    private String firstName;
    private String lastName;
    private String country;

    private String favoriteLanguage;

    private LinkedHashMap<String, String> favoriteLanguageOptions = new LinkedHashMap<>();

    private String[] operatingSystems;

    public Student() {

        // Populate favorite language options
        favoriteLanguageOptions = new LinkedHashMap<>();

        // Parameter order: value, display label
        favoriteLanguageOptions.put("Java", "Java");
        favoriteLanguageOptions.put("C#", "C#");
        favoriteLanguageOptions.put("PHP", "PHP");
        favoriteLanguageOptions.put("Ruby", "Ruby");
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getFavoriteLanguage() {
        return favoriteLanguage;
    }

    public void setFavoriteLanguage(String favoriteLanguage) {
        this.favoriteLanguage = favoriteLanguage;
    }

    public LinkedHashMap<String, String> getFavoriteLanguageOptions() {
        return favoriteLanguageOptions;
    }

    public void setFavoriteLanguageOptions(LinkedHashMap<String, String> favoriteLanguageOptions) {
        this.favoriteLanguageOptions = favoriteLanguageOptions;
    }

    public String[] getOperatingSystems() {
        return operatingSystems;
    }

    public void setOperatingSystems(String[] operatingSystems) {
        this.operatingSystems = operatingSystems;
    }
}
