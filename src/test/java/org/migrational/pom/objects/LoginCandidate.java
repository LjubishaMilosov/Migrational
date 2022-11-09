package org.migrational.pom.objects;

public class LoginCandidate {

    private String email;
    private String password;
    private String firstName;

    public LoginCandidate(){

    }
    public LoginCandidate(String email, String password){
        this.email = email;
        this.password = password;
    }




    public String getEmail() {
        return email;
    }

    public LoginCandidate setEmail(String email) {
        this.email = email;
        return this;
    }

    public String getPassword() {
        return password;
    }

    public LoginCandidate setPassword(String password) {
        this.password = password;
        return this;
    }

    public String getFirstName() {
        return firstName;
    }

    public LoginCandidate setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }








}
