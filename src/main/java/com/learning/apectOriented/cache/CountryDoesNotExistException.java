package com.learning.apectOriented.cache;

public class CountryDoesNotExistException extends RuntimeException{
    private String countryCode;

    public CountryDoesNotExistException(String countryCode){
        this.countryCode = countryCode;
    }

    public String getCountryCode() {
        return countryCode;
    }
}
