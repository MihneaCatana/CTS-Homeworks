package adapter.classes;

public class Receptor implements IReceptor {

    private String tipReceptor;

    private int nrPorturiDisponibile;

    public Receptor(String tipReceptor, int nrPorturiDisponibile) {
        this.tipReceptor = tipReceptor;
        this.nrPorturiDisponibile = nrPorturiDisponibile;
    }

    @Override
    public void primesteSemnal() {
        System.out.println("Receptorul de tip " + tipReceptor + " are "+ nrPorturiDisponibile + " porturi disponibile");
    }
}
