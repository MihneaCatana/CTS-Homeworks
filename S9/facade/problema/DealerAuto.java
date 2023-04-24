package facade.problema;

public class DealerAuto {

    public DealerAuto() {
    }

    public String  descriereMasinaSport(MasinaSport masinaSport){
      return masinaSport.toString();
    }

    public String  descriereMasinaFamilie(MasinaFamilie masinaFamilie){
        return masinaFamilie.toString();
    }

    public String  descriereMasinaElectrica(MasinaElectrica masinaElectrica){
        return masinaElectrica.toString();
    }
}
