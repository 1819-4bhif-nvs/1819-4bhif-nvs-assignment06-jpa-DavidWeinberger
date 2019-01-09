import javax.persistence.Entity;
import java.io.Serializable;
import java.time.LocalDate;

@Entity
public class Laptop extends Geraet implements Serializable {
    private int bildschirmGröße;

    public Laptop(String sn, String TB, LocalDate al, int diagonale){
        super(sn, TB, al);
        bildschirmGröße =diagonale;
    }
}
