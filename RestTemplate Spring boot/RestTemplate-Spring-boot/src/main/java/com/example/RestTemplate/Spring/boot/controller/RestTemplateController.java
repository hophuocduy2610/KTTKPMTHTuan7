package com.example.RestTemplate.Spring.boot.controller;

import com.example.RestTemplate.Spring.boot.entity.Subject;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/resttemplate")
public class RestTemplateController {
    RestTemplate restTemplate = new RestTemplate();
    public void addSubject(){

    }
    @GetMapping("/getSubject/{subId}")
    public String getSubjectById(@PathVariable("subId") String subId){
        HttpHeaders headers = new HttpHeaders();
        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
        HttpEntity<String> entity = new HttpEntity<String>(headers);

        return restTemplate.exchange("http://localhost:8080/api/getSubject/"+subId, HttpMethod.GET, entity, String.class).getBody();
    }

    @PostMapping(value = "/addSubject")
    public String createProducts(@RequestBody Subject subject) {
        HttpHeaders headers = new HttpHeaders();
        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
        HttpEntity<Subject> entity = new HttpEntity<Subject>(subject, headers);

        return restTemplate.exchange("http://localhost:8080/api/add", HttpMethod.POST, entity, String.class).getBody();
    }
}
