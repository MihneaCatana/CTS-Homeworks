package factoryMethodMarioVersion.factoryMethod;

public interface AnimalFactory <T extends Animal>  {

    T createAnimal();
}
