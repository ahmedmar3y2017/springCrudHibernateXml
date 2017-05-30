package com.controller;

import org.springframework.web.client.RestTemplate;

import java.util.LinkedHashMap;
import java.util.List;

/**
 * Created by ahmed on 5/30/2017.
 */
public class main {
    public static final String REST_SERVICE_URI = "http://localhost:8080";


    public static void main(String[] args) {

        // ------------------- Test Rest Api ----------------------------------
        System.out.println("Testing listAllUsers API-----------");

        RestTemplate restTemplate = new RestTemplate();
        List<LinkedHashMap<String, Object>> usersMap = restTemplate.getForObject(REST_SERVICE_URI + "/students", List.class);

        if (usersMap != null) {
            for (LinkedHashMap<String, Object> map : usersMap) {
                System.out.println(map.get("username"));
            }
        } else {
            System.out.println("No user exist----------");
        }
    }


}
