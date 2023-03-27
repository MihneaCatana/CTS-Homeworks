package abstractFactory;

public class Main {

    public static void main(String[] args) {

        MacGUIFactory macGUI = new MacGUIFactory();

        GUIFactory<MacButton, MacMenu> GUI = new MacGUIFactory();
        MacButton btnMAC = macGUI.createButton();
        MacMenu menuMAC  = macGUI.createMenu();
    }
}
