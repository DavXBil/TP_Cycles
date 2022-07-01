package bo;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
public class Velo extends Cycle {

    private int vitesse;

    private static final float tarifHoraire = 4.90f;

    public Velo() {
    }

    public Velo(String marque, String modele, LocalDate dateAchat, int vitesse) {
        super(marque, modele, dateAchat);
        this.vitesse = vitesse;
    }

    public int getVitesse() {
        return vitesse;
    }

    public void setVitesse(int vitesse) {
        this.vitesse = vitesse;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Velo{");
        sb.append(super.toString());
        sb.append("vitesse=").append(vitesse);
        sb.append('}');
        return sb.toString();
    }
}
