package org.migrational.pom.api.actions;

import io.restassured.http.Cookies;
import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.response.Response;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.migrational.pom.objects.RegisterCandidate;
import org.migrational.pom.utils.ConfigLoader;


import java.io.File;
import java.util.HashMap;

import static io.restassured.RestAssured.given;

public class SignUpApi {

    private Cookies cookies;

    public Cookies getCookies(){
        return cookies;
    }

    public String fetchRegisterValueUsingGroovy(){
        Response response = getAccount();
        return response.htmlPath().getString("**.findAll {it.@name == 'id' }.value");
    }
    public String fetchRegisterValueUsingJsoup(){
        Response response = getAccount();
        Document doc = Jsoup.parse(response.body().prettyPrint());
        Element element = doc.selectFirst("ne znam nesto e problem so register api-to");
        return element.attr("value");
    }

    public Response getAccount(){
        Cookies cookies = new Cookies();
        Response response =
        given().
                baseUri(ConfigLoader.getInstance().getBaseUrl()).
                cookies(cookies).
                log().all().
        when().
                get("/").
        then().
                log().all().
                extract().
                response();
        if(response.getStatusCode() != 200){
            throw new RuntimeException("Failed to fetch the account, HTTP Status Code: " + response.getStatusCode());
        }
        return response;
    }

    public Response registerCandidate(RegisterCandidate registerCandidate){
        File file = new File("src/main/resources/RegisterCandidatePayload.json");
        Cookies cookies = new Cookies();
        Header header = new Header("Content-Type", "application/json");
        Header header1 = new Header("Accept", "application/json, text/plain, */*");
        Header header2 = new Header("X-Requested-With", "XMLHttpRequest");
        Headers headers = new Headers(header, header1, header2);
       // HashMap<String, String> formParams = new HashMap<>();
        //formParams.put("firstname", registerCandidate.getFirstName());
        //formParams.put("lastname", registerCandidate.getLastName());
        //formParams.put("")
        Response response =
                given().
                        baseUri(ConfigLoader.getInstance().getBaseUrl()).
                        headers(headers).
                        body(file).

                        cookies(cookies).
                        log().all().
                when().
                        post("/api/register").
                        then().
                        log().all().
                        extract().
                        response();
        if(response.getStatusCode() != 201){
            throw new RuntimeException("Failed to register the account, HTTP Status Code: " + response.getStatusCode());
        }
        this.cookies = response.getDetailedCookies();
        return response;
    }
}
