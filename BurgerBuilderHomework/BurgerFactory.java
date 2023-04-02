public class BurgerFactory implements  Builder{

    private Burger burger;

    public BurgerFactory()
    {
        this.burger = new Burger("-", "-", "-", "-","-");
    }

    public BurgerFactory setChifla(String tipChifla) {
        this.burger.setTipChifla(tipChifla);
        return this;
    }

    public BurgerFactory setCarne(String tipCarne) {
        this.burger.setTipCarne(tipCarne);
        return this;
    }

    public BurgerFactory setSos(String tipSos) {
        this.burger.setTipSos(tipSos);
        return this;
    }

    public BurgerFactory setLegume(String legume) {
        this.burger.setLegume(legume);
        return this;
    }

    public BurgerFactory setCondimente(String condimente) {
        this.burger.setCondimente(condimente);
        return this;
    }

    @Override
    public Burger build() {
        return burger;
    }
}
