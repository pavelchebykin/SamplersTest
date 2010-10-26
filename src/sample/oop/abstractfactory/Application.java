package sample.oop.abstractfactory;

public class Application {

    public Application(GUIFactory factory){
        Button button = factory.createButton();
        button.paint();
    }

}
