import javax.persistence.Entity;
import java.io.Serializable;
import java.time.LocalDate;

@Entity
public class StandPc extends Geraet implements Serializable {
    private int benchmarkLeistung;

    public StandPc(String sn, String TB, LocalDate al, int bench){
        super(sn, TB, al);
        benchmarkLeistung =bench;
    }
}
