package bo;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class CycleElectrique extends Cycle{
    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    private int autonomie;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public CycleElectrique() {
    }

    public CycleElectrique(String marque, String modele, LocalDate dateAchat, int autonomie) {
        super(marque, modele, dateAchat);
        this.autonomie = autonomie;
    }
}
