package bo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.LocalDate;

@Entity
public class Gyropode extends CycleElectrique{

    private int tailleMin;

    private static final float tarifHoraire = 4.90f;


    public Gyropode() {
    }

    public Gyropode(String marque, String modele, LocalDate dateAchat, int autonomie, int tailleMin) {
        super(marque, modele, dateAchat, autonomie);
        this.tailleMin = tailleMin;
    }

    public int getTailleMin() {
        return tailleMin;
    }

    public void setTailleMin(int tailleMin) {
        this.tailleMin = tailleMin;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Gyropode{");
        sb.append(super.toString());
        sb.append("tailleMin=").append(tailleMin);
        sb.append('}');
        return sb.toString();
    }
}
