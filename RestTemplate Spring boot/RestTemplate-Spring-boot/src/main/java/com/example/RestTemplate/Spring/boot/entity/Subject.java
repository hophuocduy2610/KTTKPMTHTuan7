package com.example.RestTemplate.Spring.boot.entity;

import lombok.AllArgsConstructor;
import lombok.Data;


@Data
@AllArgsConstructor
public class Subject {
    private String subId;
    private String name;
    private int credit;
}
