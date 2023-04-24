package facade.problema;

public class Main {

    public static void main(String[] args) {
        DealerAuto dealerAuto = new DealerAuto();
        dealerAuto.descriereMasinaSport(new MasinaSport("BMW X6"));
        dealerAuto.descriereMasinaElectrica(new MasinaElectrica("Tesla"));
        dealerAuto.descriereMasinaFamilie(new MasinaFamilie("Renault Austral"));
    }
}
