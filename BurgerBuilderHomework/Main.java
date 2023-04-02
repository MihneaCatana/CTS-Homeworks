public class Main {

    public static void main(String[] args) {

        /**
         *
         *    BurgerFactory se foloseste de un singur obiect Burger, astfel vom crea un shallow copy care va mentine anumite proprietati
         *
         * */
            BurgerFactory shallowFactory = new BurgerFactory();
            Burger burgerShallow = shallowFactory.setCarne("VITA").setChifla("CLASICA").setLegume("ROSIE,SALATA,CEAPA").build();
            System.out.println(burgerShallow);
            Burger secondBurgerShallow = shallowFactory.setCarne("PUI").setCondimente("PIPER").build();
            System.out.println(secondBurgerShallow);

        /**
         *
         *    BurgerFactoryReforged de foloseste de campurile din cadrul obiectului Burger, rezolvand problema cu shallow copy,
         *    dar incalca principiul "Don't repeat yourself"
         *
         * **/

        BurgerFactoryReforged deepFactory = new BurgerFactoryReforged();
        Burger burgerDeep = deepFactory.setCarne("VITA").setChifla("CLASICA").setLegume("ROSIE,SALATA,CEAPA").build();
        System.out.println(burgerDeep);
        Burger secondBurgerDeep = deepFactory.setCarne("PUI").setCondimente("PIPER").build();
        System.out.println(secondBurgerDeep);

    }
}
