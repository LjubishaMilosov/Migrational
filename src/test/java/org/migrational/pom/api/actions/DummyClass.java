package org.migrational.pom.api.actions;

import org.migrational.pom.objects.RegisterCandidate;
import org.migrational.pom.utils.FakerUtils;

public class DummyClass {

    public static void main(String[] args){
       // new SignUpApi().getAccount();
       // System.out.println(new SignUpApi().fetchRegisterValueUsingGroovy());
       // System.out.println(new SignUpApi().fetchRegisterValueUsingJsoup());
       String userNameCandidate = "testuser" + new FakerUtils().genericRandomNumber();
        RegisterCandidate registerCandidate = new RegisterCandidate().
                setFirstName(userNameCandidate).
                setLastName("test").
                setDayOfBirth("19").
                setMonthOfBirth("May").
                setYearOfBirth("1985").
                setCountryOfBirth("Macedonia").
                setCityOfBirth("Skopje").
                setPhoneNumber("1234567809876").
                setEmail(userNameCandidate + "@gmail.com").
                setPassword(userNameCandidate + "1234").
                setRepeatPassword(userNameCandidate + "1234");
        SignUpApi signUpApi = new SignUpApi();
        System.out.println(signUpApi.registerCandidate(registerCandidate));
        System.out.println(signUpApi.getCookies());
    }
}
