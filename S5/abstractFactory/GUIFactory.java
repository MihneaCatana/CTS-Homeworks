package abstractFactory;

public interface GUIFactory <T extends Button, V extends Menu> {

    T createButton();
    V createMenu();
}
