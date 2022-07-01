package bo;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.LinkedHashSet;
import java.util.Set;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Cycle{

    public Cycle() {
    }

    public Cycle(String marque, String modele, LocalDate dateAchat) {
        this.marque = marque;
        this.modele = modele;
        this.dateAchat = dateAchat;
    }


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    private String marque;

    private String modele;

    private LocalDate dateAchat;

    @OneToMany(mappedBy = "cycle", orphanRemoval = true)
    private Set<Location> locations = new LinkedHashSet<>();

    public Set<Location> getLocations() {
        return locations;
    }

    public void setLocations(Set<Location> locations) {
        this.locations = locations;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public String getModele() {
        return modele;
    }

    public void setModele(String modele) {
        this.modele = modele;
    }

    public LocalDate getDateAchat() {
        return dateAchat;
    }

    public void setDateAchat(LocalDate dateAchat) {
        this.dateAchat = dateAchat;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Cycle{");
        sb.append("marque='").append(marque).append('\'');
        sb.append(", modele='").append(modele).append('\'');
        sb.append(", dateAchat=").append(dateAchat);
        sb.append('}');
        return sb.toString();
    }
}
