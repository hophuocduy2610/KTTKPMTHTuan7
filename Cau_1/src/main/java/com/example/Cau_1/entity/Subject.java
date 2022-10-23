package com.example.Cau_1.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Data
@Table(name = "subjects")
public class Subject implements Serializable {
    @Id
    @Column(name = "subid")
    private String subId;
    @Column(name = "namesub")
    private String name;
    @Column(name = "creditsub")
    private int credit;
}
