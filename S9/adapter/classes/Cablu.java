package adapter.classes;

public class Cablu implements ICablu {

    private String tipFir;
    private int lungimeFir;

    public Cablu(String tipFir, int lungimeFir) {
        this.tipFir = tipFir;
        this.lungimeFir = lungimeFir;
    }

    @Override
    public void transmiteSemnal() {
        System.out.println("Cablul de tip "+tipFir+" de lungime "+lungimeFir+" m ce transmite un semnal");
    }
}
