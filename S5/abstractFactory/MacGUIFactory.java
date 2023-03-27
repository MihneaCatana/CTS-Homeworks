package abstractFactory;

public class MacGUIFactory implements  GUIFactory<MacButton,MacMenu>{

    @Override
    public MacButton createButton() {
        return new MacButton();
    }

    @Override
    public MacMenu createMenu() {
        return new MacMenu();
    }
}
