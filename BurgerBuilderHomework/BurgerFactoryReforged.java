public class BurgerFactoryReforged implements Builder {

    private  String tipChifla;

    private String tipCarne;

    private String tipSos;

    private String legume;

    private String condimente;

    public BurgerFactoryReforged(){
        this.tipChifla="-";
        this.tipCarne="-";
        this.tipSos="-";
        this.legume="-";
        this.condimente="-";
    }

    public BurgerFactoryReforged setChifla(String tipChifla) {
        this.tipChifla = tipChifla;
        return this;
    }

    public BurgerFactoryReforged setCarne(String tipCarne) {
        this.tipCarne = tipCarne;
        return this;
    }

    public BurgerFactoryReforged setSos(String tipSos) {
        this.tipSos = tipSos;
        return this;
    }

    public BurgerFactoryReforged setLegume(String legume) {
        this.legume = legume;
        return this;
    }

    public BurgerFactoryReforged setCondimente(String condimente) {
        this.condimente = condimente;
        return this;
    }


    @Override
    public Burger build() {
        return new Burger(tipChifla,tipCarne,tipSos,legume,condimente);
    }


}
