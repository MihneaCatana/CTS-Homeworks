package factoryMethod;

public class CowFactory implements AnimalFactory{

    @Override
    public Animal createAnimal() {
        return new Cow();
    }
}
