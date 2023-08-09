package com.example.entities;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.List;

@Entity
public class FinancialAdvisor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String workingHours;

    // One-to-Many relationship with clients
    // Add appropriate annotations here

    // Constructor
    public FinancialAdvisor(String name, String workingHours) {
        this.name = name;
        this.workingHours = workingHours;
    }

    // Getters and setters (including id getter)
}
