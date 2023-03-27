package factoryMethodMarioVersion.factoryMethod;

public class CatFactory implements AnimalFactory<Cat> {
    @Override
    public Cat createAnimal() {
        return new Cat();
    }
}
