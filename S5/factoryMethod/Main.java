package factoryMethod;

public class Main {

    public static void main(String[] args) {

        CatFactory catFactory  = new CatFactory();
        Animal cat = catFactory.createAnimal();
        cat.makeNoise();

        DogFactory dogFactory = new DogFactory();
        Animal dog = dogFactory.createAnimal();
        dog.makeNoise();

        CowFactory cowFactory = new CowFactory();
        Animal cow = cowFactory.createAnimal();
        cow.makeNoise();
    }
}
