package bo;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Cycle{


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    private String marque;

    private String modele;

    private LocalDate dateAchat;

    public Cycle() {
    }

    public Cycle(String marque, String modele, LocalDate dateAchat) {
        this.marque = marque;
        this.modele = modele;
        this.dateAchat = dateAchat;
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
