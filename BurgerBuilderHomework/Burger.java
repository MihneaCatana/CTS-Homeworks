public class Burger {

    private  String tipChifla;

    private String tipCarne;

    private String tipSos;

    private String legume;

    private String condimente;

    public Burger(String tipChifla, String tipCarne, String tipSos, String legume, String condimente) {
        this.tipChifla = tipChifla;
        this.tipCarne = tipCarne;
        this.tipSos = tipSos;
        this.legume = legume;
        this.condimente = condimente;
    }

    public String getTipChifla() {
        return tipChifla;
    }

    public void setTipChifla(String tipChifla) {
        this.tipChifla = tipChifla;
    }

    public String getTipCarne() {
        return tipCarne;
    }

    public void setTipCarne(String tipCarne) {
        this.tipCarne = tipCarne;
    }

    public String getTipSos() {
        return tipSos;
    }

    public void setTipSos(String tipSos) {
        this.tipSos = tipSos;
    }

    public String getLegume() {
        return legume;
    }

    public void setLegume(String legume) {
        this.legume = legume;
    }

    public String getCondimente() {
        return condimente;
    }

    public void setCondimente(String condimente) {
        this.condimente = condimente;
    }

    @Override
    public String toString() {
        return "Burger{" +
                "tipChifla='" + tipChifla + '\'' +
                ", tipCarne='" + tipCarne + '\'' +
                ", tipSos='" + tipSos + '\'' +
                ", legume='" + legume + '\'' +
                ", condimente='" + condimente + '\'' +
                '}';
    }
}
