package org.migrational.pom.objects;

public class LoginEmployer {
    private String employerEmail;
    private String employerPassword;

    public LoginEmployer(){

    }
    public LoginEmployer(String employerEmail, String employerPassword){
        this.employerEmail = employerEmail;
        this.employerPassword = employerPassword;
    }

    public String getEmployerEmail() {
        return employerEmail;
    }

    public void setEmployerEmail(String employerEmail) {
        this.employerEmail = employerEmail;
    }

    public String getEmployerPassword() {
        return employerPassword;
    }

    public void setEmployerPassword(String employerPassword) {
        this.employerPassword = employerPassword;
    }



}
