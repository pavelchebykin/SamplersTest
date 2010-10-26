package sample.oop.abstractfactory;

public class OSXButton implements Button {

	@Override
    public void paint() {
        System.out.println("I'm an OSXButton");
    }

}
