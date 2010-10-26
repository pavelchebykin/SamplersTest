package sample.oop.abstractfactory;

public class WinFactory implements GUIFactory {

	@Override
    public Button createButton() {
        return new WinButton();
    }

}
