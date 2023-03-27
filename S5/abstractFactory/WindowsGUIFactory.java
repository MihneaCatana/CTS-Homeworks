package abstractFactory;

public class WindowsGUIFactory implements GUIFactory<WindowsButton,WindowsMenu>{

    @Override
    public WindowsButton createButton() {
        return new WindowsButton();
    }

    @Override
    public WindowsMenu createMenu() {
        return new WindowsMenu();
    }
}
