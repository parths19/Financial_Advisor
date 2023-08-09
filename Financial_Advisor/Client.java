package com.example.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.util.List;

@Entity
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String contactInfo;

    @ManyToOne
    private FinancialAdvisor financialAdvisor;

    // One-to-One relationship with portfolio
    // Add appropriate annotations here

    // Constructor
    public Client(String name, String contactInfo, FinancialAdvisor financialAdvisor) {
        this.name = name;
        this.contactInfo = contactInfo;
        this.financialAdvisor = financialAdvisor;
    }

    // Getters and setters (including id getter)
}
