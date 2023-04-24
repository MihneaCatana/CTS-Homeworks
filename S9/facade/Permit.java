package facade;

import java.util.Date;

public class Permit {

    private Date dataEmitere;

    private String numeAutorizatie;

    private int pretTaxa;

    public Permit(Date dataEmitere, String numeAutorizatie, int pretTaxa) {
        this.dataEmitere = dataEmitere;
        this.numeAutorizatie = numeAutorizatie;
        this.pretTaxa = pretTaxa;
    }

    @Override
    public String toString() {
        return "Autorizatie{" +
                "dataEmitere=" + dataEmitere +
                ", numeAutorizatie='" + numeAutorizatie + '\'' +
                ", pretTaxa=" + pretTaxa +
                '}';
    }
}
