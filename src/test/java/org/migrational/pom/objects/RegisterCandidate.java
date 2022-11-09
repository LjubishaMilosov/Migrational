package org.migrational.pom.objects;

public class RegisterCandidate {

    private String firstName;
    private String lastName;
    private String dayOfBirth;
    private String monthOfBirth;
    private String yearOfBirth;
    private String countryOfBirth;
    private String cityOfBirth;
    private String phoneNumber;
    private String email;
    private String password;
    private String repeatPassword;



    private String termsAndConditions;

    public RegisterCandidate() {

    }
    /*public RegisterCandidate(String firstName, String lastName, String dayOfBirth, String monthOfBirth, String yearOfBirth,
                                     String countryOfBirth, String cityOfBirth, String phoneNumber, String email,
                                     String password, String repeatPassword){
        this.firstName = firstName;
        this.lastName = lastName;
        this.dayOfBirth = dayOfBirth;
        this.monthOfBirth = monthOfBirth;
        this.yearOfBirth = yearOfBirth;
        this.countryOfBirth = countryOfBirth;
        this.cityOfBirth = cityOfBirth;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.password = password;
        this.repeatPassword =repeatPassword;
    }*/



    public String getFirstName() {
        return firstName;
    }

    public RegisterCandidate setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public String getLastName() {
        return lastName;
    }

    public RegisterCandidate setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public String getDayOfBirth() {
        return dayOfBirth;
    }

    public RegisterCandidate setDayOfBirth(String dayOfBirth) {
        this.dayOfBirth = dayOfBirth;
        return this;
    }

    public String getMonthOfBirth() {
        return monthOfBirth;
    }

    public RegisterCandidate setMonthOfBirth(String monthOfBirth) {
        this.monthOfBirth = monthOfBirth;
        return this;
    }

    public String getYearOfBirth() {
        return yearOfBirth;
    }

    public RegisterCandidate setYearOfBirth(String yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
        return this;
    }

    public String getCountryOfBirth() {
        return countryOfBirth;
    }

    public RegisterCandidate setCountryOfBirth(String countryOfBirth) {
        this.countryOfBirth = countryOfBirth;
        return this;
    }

    public String getCityOfBirth() {
        return cityOfBirth;
    }

    public RegisterCandidate setCityOfBirth(String cityOfBirth) {
        this.cityOfBirth = cityOfBirth;
        return this;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public RegisterCandidate setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public RegisterCandidate setEmail(String email) {
        this.email = email;
        return this;
    }

    public String getPassword() {
        return password;
    }

    public RegisterCandidate setPassword(String password) {
        this.password = password;
        return this;
    }

    public String getRepeatPassword() {
        return repeatPassword;
    }

    public RegisterCandidate setRepeatPassword(String repeatPassword) {
        this.repeatPassword = repeatPassword;
        return this;
    }
    public String getTermsAndConditions() {
        return termsAndConditions;
    }

    public RegisterCandidate setTermsAndConditions(String termsAndConditions) {
        this.termsAndConditions = termsAndConditions;
        return this;
    }






}

