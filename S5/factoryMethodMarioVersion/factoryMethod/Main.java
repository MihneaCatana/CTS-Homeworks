package factoryMethodMarioVersion.factoryMethod;

public class Main {

    public static void main(String[] args) {

        AnimalFactory<Cat> catFactory  = new CatFactory();
        Animal cat = catFactory.createAnimal();
        cat.makeNoise();

        AnimalFactory<Dog> dogFactory = new DogFactory();
        Animal dog = dogFactory.createAnimal();
        dog.makeNoise();

        AnimalFactory<Dog> d1 = new DogFactory();
        Animal c1 = d1.createAnimal();
        c1.makeNoise();
    }
}
