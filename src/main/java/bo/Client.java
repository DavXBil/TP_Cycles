package bo;

import javax.persistence.*;
import java.util.LinkedHashSet;
import java.util.Set;

@Entity
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    private String nom;
    private String prenom;
    private int taille;
    private double portefeuille;

    @OneToMany(mappedBy = "client", orphanRemoval = true)
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

    public Client() {
    }

    public Client(String nom, String prenom, int taille, int portefeuille) {
        this.nom = nom;
        this.prenom = prenom;
        this.taille = taille;
        this.portefeuille = portefeuille;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public int getTaille() {
        return taille;
    }

    public void setTaille(int taille) {
        this.taille = taille;
    }

    public double getPortefeuille() {
        return portefeuille;
    }

    public void setPortefeuille(double portefeuille) {
        this.portefeuille = portefeuille;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Client{");
        sb.append("nom='").append(nom).append('\'');
        sb.append(", prenom='").append(prenom).append('\'');
        sb.append(", taille=").append(taille);
        sb.append(", portefeuille=").append(portefeuille);
        sb.append('}');
        return sb.toString();
    }
}
