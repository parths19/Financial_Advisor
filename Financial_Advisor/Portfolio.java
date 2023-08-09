public class Portfolio {
}
package com.example.entities;

        import javax.persistence.Entity;
        import javax.persistence.GeneratedValue;
        import javax.persistence.GenerationType;
        import javax.persistence.Id;
        import javax.persistence.OneToOne;
        import javax.persistence.OneToMany;
        import java.util.List;

@Entity
public class Portfolio {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    private Client client;

    // One-to-Many relationship with securities
    // Add appropriate annotations here

    // Constructor
    public Portfolio(Client client) {
        this.client = client;
    }

    // Getters and setters (including id getter)
}
