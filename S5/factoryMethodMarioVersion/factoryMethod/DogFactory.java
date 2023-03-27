package factoryMethodMarioVersion.factoryMethod;

public class DogFactory implements AnimalFactory<Dog> {
    @Override
    public Dog createAnimal() {
        return new Dog();
    }
}
