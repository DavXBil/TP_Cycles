package bo;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.LinkedHashSet;
import java.util.Set;

@Entity
public class Location {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    private LocalDate debutLocation;
    private LocalDate finLocation;


    public LocalDate getDebutLocation() {
        return debutLocation;
    }

    public void setDebutLocation(LocalDate debutLocation) {
        this.debutLocation = debutLocation;
    }

    public LocalDate getFinLocation() {
        return finLocation;
    }

    public void setFinLocation(LocalDate finLocation) {
        this.finLocation = finLocation;
    }

    @ManyToOne
    @JoinColumn(name = "client_id")
    private Client client;

    @OneToMany(orphanRemoval = true)
    @JoinColumn(name = "location_id")
    private Set<Cycle> cycles = new LinkedHashSet<>();

    public Set<Cycle> getCycles() {
        return cycles;
    }

    public void setCycles(Set<Cycle> cycles) {
        this.cycles = cycles;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Location{");
        sb.append("debutLocation=").append(debutLocation);
        sb.append(", finLocation=").append(finLocation);
        sb.append(", client=").append(client);
        sb.append('}');
        return sb.toString();
    }


}
