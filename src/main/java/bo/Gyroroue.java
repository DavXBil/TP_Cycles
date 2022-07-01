package bo;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
public class Gyroroue extends CycleElectrique{

    private static final float tarifHoraire = 4.90f;

    public Gyroroue() {
    }

    public Gyroroue(String marque, String modele, LocalDate dateAchat, int autonomie) {
        super(marque, modele, dateAchat, autonomie);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
