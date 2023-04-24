package facade;

public class Material {

    private float pret;

    private int cantitate;

    private String denumire;

    public Material(float pret, int cantitate, String denumire) {
        this.pret = pret;
        this.cantitate = cantitate;
        this.denumire = denumire;
    }

    @Override
    public String toString() {
        return "Material{" +
                "pret=" + pret +
                ", cantitate=" + cantitate +
                ", denumire='" + denumire + '\'' +
                '}';
    }
}
